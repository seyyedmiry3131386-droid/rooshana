package com.j256.ormlite.table;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.IOUtils;
import com.j256.ormlite.stmt.StatementBuilder;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SchemaUtils {
    private static Logger logger = LoggerFactory.getLogger((Class<?>) SchemaUtils.class);
    private static final FieldType[] noFieldTypes = new FieldType[0];

    private SchemaUtils() {
    }

    private static <T, ID> void addCreateSchemaStatements(DatabaseType databaseType, String str, List<String> list, List<String> list2, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(256);
        if (z2) {
            logger.info("creating schema '{}'", str);
        }
        sb.append("CREATE SCHEMA ");
        if (z && databaseType.isCreateIfNotExistsSupported()) {
            sb.append("IF NOT EXISTS ");
        }
        databaseType.appendEscapedEntityName(sb, str);
        databaseType.appendCreateSchemaSuffix(sb);
        list.add(sb.toString());
    }

    private static <T, ID> void addDropSchemaStatements(DatabaseType databaseType, String str, List<String> list, boolean z) {
        StringBuilder sb = new StringBuilder(64);
        if (z) {
            logger.info("dropping schema '{}'", str);
        }
        sb.append("DROP SCHEMA ");
        databaseType.appendEscapedEntityName(sb, str);
        sb.append(' ');
        list.add(sb.toString());
    }

    public static <T> int createSchema(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        return doCreateSchema(connectionSource, DaoManager.createDao(connectionSource, cls).getTableInfo().getSchemaName(), false);
    }

    public static <T> int createSchemaIfNotExists(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        Dao daoCreateDao = DaoManager.createDao(connectionSource, cls);
        return doCreateSchema(daoCreateDao.getConnectionSource(), daoCreateDao.getTableInfo().getSchemaName(), true);
    }

    private static <T, ID> int doCreateSchema(ConnectionSource connectionSource, String str, boolean z) throws SQLException {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        addCreateSchemaStatements(databaseType, str, arrayList, arrayList2, z, true);
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection(str);
        try {
            return doStatements(readWriteConnection, "create", arrayList, false, databaseType.isCreateSchemaReturnsNegative(), databaseType.isCreateSchemaReturnsZero()) + doCreateTestQueries(readWriteConnection, databaseType, arrayList2);
        } finally {
            connectionSource.releaseConnection(readWriteConnection);
        }
    }

    private static int doCreateTestQueries(DatabaseConnection databaseConnection, DatabaseType databaseType, List<String> list) throws Throwable {
        Throwable th;
        SQLException sQLException;
        DatabaseConnection databaseConnection2;
        CompiledStatement compiledStatementCompileStatement;
        int i = 0;
        for (String str : list) {
            CompiledStatement compiledStatement = null;
            try {
                try {
                    databaseConnection2 = databaseConnection;
                    compiledStatementCompileStatement = databaseConnection2.compileStatement(str, StatementBuilder.StatementType.SELECT, noFieldTypes, -1, false);
                } catch (SQLException e) {
                    sQLException = e;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                DatabaseResults databaseResultsRunQuery = compiledStatementCompileStatement.runQuery(null);
                int i2 = 0;
                for (boolean zFirst = databaseResultsRunQuery.first(); zFirst; zFirst = databaseResultsRunQuery.next()) {
                    i2++;
                }
                logger.info("executing create schema after-query got {} results: {}", Integer.valueOf(i2), str);
                IOUtils.closeThrowSqlException(compiledStatementCompileStatement, "compiled statement");
                i++;
                databaseConnection = databaseConnection2;
            } catch (SQLException e2) {
                sQLException = e2;
                compiledStatement = compiledStatementCompileStatement;
                throw new SQLException("executing create schema after-query failed: " + str, sQLException);
            } catch (Throwable th3) {
                th = th3;
                compiledStatement = compiledStatementCompileStatement;
                IOUtils.closeThrowSqlException(compiledStatement, "compiled statement");
                throw th;
            }
        }
        return i;
    }

    private static <T, ID> int doDropSchema(DatabaseType databaseType, ConnectionSource connectionSource, String str, boolean z) throws SQLException {
        ArrayList arrayList = new ArrayList();
        addDropSchemaStatements(databaseType, str, arrayList, true);
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection(str);
        try {
            return doStatements(readWriteConnection, "drop", arrayList, z, databaseType.isCreateSchemaReturnsNegative(), false);
        } finally {
            connectionSource.releaseConnection(readWriteConnection);
        }
    }

    private static int doStatements(DatabaseConnection databaseConnection, String str, Collection<String> collection, boolean z, boolean z2, boolean z3) throws SQLException {
        int iRunExecute;
        int i = 0;
        for (String str2 : collection) {
            CompiledStatement compiledStatementCompileStatement = null;
            try {
                try {
                    compiledStatementCompileStatement = databaseConnection.compileStatement(str2, StatementBuilder.StatementType.EXECUTE, noFieldTypes, -1, false);
                    iRunExecute = compiledStatementCompileStatement.runExecute();
                    try {
                        logger.info("executed {} schema statement changed {} rows: {}", str, Integer.valueOf(iRunExecute), str2);
                    } catch (SQLException e) {
                        e = e;
                        if (!z) {
                            throw new SQLException("SQL statement failed: " + str2, e);
                        }
                        logger.info("ignoring {} error '{}' for statement: {}", str, e, str2);
                    }
                } catch (Throwable th) {
                    IOUtils.closeThrowSqlException(compiledStatementCompileStatement, "compiled statement");
                    throw th;
                }
            } catch (SQLException e2) {
                e = e2;
                iRunExecute = 0;
            }
            IOUtils.closeThrowSqlException(compiledStatementCompileStatement, "compiled statement");
            if (iRunExecute < 0) {
                if (!z2) {
                    throw new SQLException("SQL statement " + str2 + " updated " + iRunExecute + " rows, we were expecting >= 0");
                }
            } else if (iRunExecute > 0 && z3) {
                throw new SQLException("SQL statement updated " + iRunExecute + " rows, we were expecting == 0: " + str2);
            }
            i++;
        }
        return i;
    }

    public static <T, ID> int dropSchema(ConnectionSource connectionSource, Class<T> cls, boolean z) throws SQLException {
        Dao daoCreateDao = DaoManager.createDao(connectionSource, cls);
        return dropSchema(daoCreateDao.getConnectionSource(), daoCreateDao.getTableInfo().getSchemaName(), z);
    }

    public static <T> List<String> getCreateSchemaStatements(DatabaseType databaseType, String str) {
        ArrayList arrayList = new ArrayList();
        addCreateSchemaStatements(databaseType, str, arrayList, arrayList, false, false);
        return arrayList;
    }

    public static int createSchema(Dao<?, ?> dao) throws SQLException {
        return doCreateSchema(dao.getConnectionSource(), dao.getTableInfo().getSchemaName(), false);
    }

    public static <T> int createSchemaIfNotExists(ConnectionSource connectionSource, String str) throws SQLException {
        return doCreateSchema(connectionSource, str, true);
    }

    public static <T, ID> int dropSchema(ConnectionSource connectionSource, String str, boolean z) throws SQLException {
        return doDropSchema(connectionSource.getDatabaseType(), connectionSource, str, z);
    }

    public static <T> int createSchema(ConnectionSource connectionSource, String str) throws SQLException {
        return doCreateSchema(connectionSource, str, false);
    }
}
