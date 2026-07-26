package com.j256.ormlite.table;

import com.j256.ormlite.dao.BaseDaoImpl;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class TableUtils {
    private static Logger logger = LoggerFactory.getLogger((Class<?>) TableUtils.class);
    private static final FieldType[] noFieldTypes = new FieldType[0];

    private TableUtils() {
    }

    private static <T, ID> void addCreateIndexStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list, boolean z, boolean z2, boolean z3) {
        HashMap map = new HashMap();
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            String uniqueIndexName = z2 ? fieldType.getUniqueIndexName() : fieldType.getIndexName();
            if (uniqueIndexName != null) {
                List arrayList = (List) map.get(uniqueIndexName);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(uniqueIndexName, arrayList);
                }
                arrayList.add(fieldType.getColumnName());
            }
        }
        StringBuilder sb = new StringBuilder(128);
        for (Map.Entry entry : map.entrySet()) {
            if (z3) {
                logger.info("creating index '{}' for table '{}", entry.getKey(), tableInfo.getTableName());
            }
            sb.append("CREATE ");
            if (z2) {
                sb.append("UNIQUE ");
            }
            sb.append("INDEX ");
            if (z && databaseType.isCreateIndexIfNotExistsSupported()) {
                sb.append("IF NOT EXISTS ");
            }
            databaseType.appendEscapedEntityName(sb, (String) entry.getKey());
            sb.append(" ON ");
            databaseType.appendEscapedEntityName(sb, tableInfo.getTableName());
            sb.append(" ( ");
            boolean z4 = true;
            for (String str : (List) entry.getValue()) {
                if (z4) {
                    z4 = false;
                } else {
                    sb.append(", ");
                }
                databaseType.appendEscapedEntityName(sb, str);
            }
            sb.append(" )");
            list.add(sb.toString());
            sb.setLength(0);
        }
    }

    private static <T, ID> List<String> addCreateTableStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, boolean z, boolean z2) throws SQLException {
        ArrayList arrayList = new ArrayList();
        addCreateTableStatements(databaseType, tableInfo, arrayList, new ArrayList(), z, z2);
        return arrayList;
    }

    private static <T, ID> void addDropIndexStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list, boolean z) {
        HashSet<String> hashSet = new HashSet();
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            String indexName = fieldType.getIndexName();
            if (indexName != null) {
                hashSet.add(indexName);
            }
            String uniqueIndexName = fieldType.getUniqueIndexName();
            if (uniqueIndexName != null) {
                hashSet.add(uniqueIndexName);
            }
        }
        StringBuilder sb = new StringBuilder(48);
        for (String str : hashSet) {
            logger.info("dropping index '{}' for table '{}", str, tableInfo.getTableName());
            sb.append("DROP INDEX ");
            databaseType.appendEscapedEntityName(sb, str);
            list.add(sb.toString());
            sb.setLength(0);
        }
    }

    private static <T, ID> void addDropTableStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            databaseType.dropColumnArg(fieldType, arrayList, arrayList2);
        }
        StringBuilder sb = new StringBuilder(64);
        if (z) {
            logger.info("dropping table '{}'", tableInfo.getTableName());
        }
        sb.append("DROP TABLE ");
        if (tableInfo.getSchemaName() != null && tableInfo.getSchemaName().length() > 0) {
            databaseType.appendEscapedEntityName(sb, tableInfo.getSchemaName());
            sb.append('.');
        }
        databaseType.appendEscapedEntityName(sb, tableInfo.getTableName());
        sb.append(' ');
        list.addAll(arrayList);
        list.add(sb.toString());
        list.addAll(arrayList2);
    }

    public static <T> int clearTable(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        String strExtractTableName = DatabaseTableConfig.extractTableName(databaseType, cls);
        String strExtractSchemaName = DatabaseTableConfig.extractSchemaName(cls);
        if (databaseType.isEntityNamesMustBeUpCase()) {
            strExtractTableName = databaseType.upCaseEntityName(strExtractTableName);
        }
        return clearTable(connectionSource, strExtractSchemaName, strExtractTableName);
    }

    public static <T> int createTable(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        return doCreateTable(DaoManager.createDao(connectionSource, cls), false);
    }

    public static <T> int createTableIfNotExists(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        return doCreateTable(DaoManager.createDao(connectionSource, cls), true);
    }

    private static <T, ID> int doCreateTable(Dao<T, ID> dao, boolean z) throws SQLException {
        ConnectionSource connectionSource = dao.getConnectionSource();
        return dao instanceof BaseDaoImpl ? doCreateTable(connectionSource, ((BaseDaoImpl) dao).getTableInfo(), z) : doCreateTable(connectionSource, new TableInfo(connectionSource.getDatabaseType(), dao.getDataClass()), z);
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
                logger.info("executing create table after-query got {} results: {}", Integer.valueOf(i2), str);
                IOUtils.closeThrowSqlException(compiledStatementCompileStatement, "compiled statement");
                i++;
                databaseConnection = databaseConnection2;
            } catch (SQLException e2) {
                sQLException = e2;
                compiledStatement = compiledStatementCompileStatement;
                throw new SQLException("executing create table after-query failed: " + str, sQLException);
            } catch (Throwable th3) {
                th = th3;
                compiledStatement = compiledStatementCompileStatement;
                IOUtils.closeThrowSqlException(compiledStatement, "compiled statement");
                throw th;
            }
        }
        return i;
    }

    private static <T, ID> int doDropTable(DatabaseType databaseType, ConnectionSource connectionSource, TableInfo<T, ID> tableInfo, boolean z) throws SQLException {
        ArrayList arrayList = new ArrayList();
        addDropIndexStatements(databaseType, tableInfo, arrayList, true);
        addDropTableStatements(databaseType, tableInfo, arrayList, true);
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection(tableInfo.getTableName());
        try {
            return doStatements(readWriteConnection, "drop", arrayList, z, databaseType.isCreateTableReturnsNegative(), false);
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
                        logger.info("executed {} table statement changed {} rows: {}", str, Integer.valueOf(iRunExecute), str2);
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

    public static <T, ID> int dropTable(ConnectionSource connectionSource, Class<T> cls, boolean z) throws SQLException {
        return dropTable(DaoManager.createDao(connectionSource, cls), z);
    }

    public static <T, ID> List<String> getCreateTableStatements(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        ArrayList arrayList = new ArrayList();
        addCreateTableStatements(connectionSource.getDatabaseType(), DaoManager.createDao(connectionSource, cls).getTableInfo(), arrayList, arrayList, false, false);
        return arrayList;
    }

    public static int createTable(Dao<?, ?> dao) throws SQLException {
        return doCreateTable(dao, false);
    }

    public static <T> int createTableIfNotExists(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        return doCreateTable(DaoManager.createDao(connectionSource, databaseTableConfig), true);
    }

    public static <T, ID> int dropTable(Dao<T, ID> dao, boolean z) throws SQLException {
        ConnectionSource connectionSource = dao.getConnectionSource();
        Class<T> dataClass = dao.getDataClass();
        DatabaseType databaseType = connectionSource.getDatabaseType();
        if (dao instanceof BaseDaoImpl) {
            return doDropTable(databaseType, connectionSource, ((BaseDaoImpl) dao).getTableInfo(), z);
        }
        return doDropTable(databaseType, connectionSource, new TableInfo(databaseType, dataClass), z);
    }

    private static <T, ID> void addCreateTableStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list, List<String> list2, boolean z, boolean z2) throws SQLException {
        boolean z3;
        StringBuilder sb = new StringBuilder(256);
        if (z2) {
            logger.info("creating table '{}'", tableInfo.getTableName());
        }
        sb.append("CREATE TABLE ");
        if (z && databaseType.isCreateIfNotExistsSupported()) {
            sb.append("IF NOT EXISTS ");
        }
        if (tableInfo.getSchemaName() != null && tableInfo.getSchemaName().length() > 0) {
            databaseType.appendEscapedEntityName(sb, tableInfo.getSchemaName());
            sb.append('.');
        }
        databaseType.appendEscapedEntityName(sb, tableInfo.getTableName());
        sb.append(" (");
        ArrayList<String> arrayList = new ArrayList();
        List<String> arrayList2 = new ArrayList<>();
        List<String> arrayList3 = new ArrayList<>();
        boolean z4 = true;
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            if (!fieldType.isForeignCollection()) {
                if (z4) {
                    z3 = false;
                } else {
                    sb.append(", ");
                    z3 = z4;
                }
                String columnDefinition = fieldType.getColumnDefinition();
                if (columnDefinition == null) {
                    ArrayList arrayList4 = arrayList;
                    List<String> list3 = arrayList2;
                    List<String> list4 = arrayList3;
                    databaseType.appendColumnArg(tableInfo.getTableName(), sb, fieldType, arrayList4, list3, list4, list2);
                    arrayList3 = list4;
                    arrayList2 = list3;
                    arrayList = arrayList4;
                } else {
                    databaseType.appendEscapedEntityName(sb, fieldType.getColumnName());
                    sb.append(' ');
                    sb.append(columnDefinition);
                    sb.append(' ');
                }
                z4 = z3;
            }
        }
        databaseType.addPrimaryKeySql(tableInfo.getFieldTypes(), arrayList, arrayList2, arrayList3, list2);
        databaseType.addUniqueComboSql(tableInfo.getFieldTypes(), arrayList, arrayList2, arrayList3, list2);
        for (String str : arrayList) {
            sb.append(", ");
            sb.append(str);
        }
        sb.append(") ");
        databaseType.appendCreateTableSuffix(sb);
        list.addAll(arrayList2);
        list.add(sb.toString());
        list.addAll(arrayList3);
        addCreateIndexStatements(databaseType, tableInfo, list, z, false, z2);
        addCreateIndexStatements(databaseType, tableInfo, list, z, true, z2);
    }

    public static <T> int createTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        return doCreateTable(DaoManager.createDao(connectionSource, databaseTableConfig), false);
    }

    public static <T, ID> List<String> getCreateTableStatements(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        Dao daoCreateDao = DaoManager.createDao(connectionSource, databaseTableConfig);
        DatabaseType databaseType = connectionSource.getDatabaseType();
        if (daoCreateDao instanceof BaseDaoImpl) {
            return addCreateTableStatements(databaseType, ((BaseDaoImpl) daoCreateDao).getTableInfo(), false, false);
        }
        databaseTableConfig.extractFieldTypes(databaseType);
        return addCreateTableStatements(databaseType, new TableInfo(databaseType, databaseTableConfig), false, false);
    }

    public static <T> int clearTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        return clearTable(connectionSource, databaseTableConfig.getSchemaName(), databaseTableConfig.getTableName());
    }

    private static <T, ID> int doCreateTable(ConnectionSource connectionSource, TableInfo<T, ID> tableInfo, boolean z) throws SQLException {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        addCreateTableStatements(databaseType, tableInfo, arrayList, arrayList2, z, true);
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection(tableInfo.getTableName());
        try {
            return doStatements(readWriteConnection, "create", arrayList, false, databaseType.isCreateTableReturnsNegative(), databaseType.isCreateTableReturnsZero()) + doCreateTestQueries(readWriteConnection, databaseType, arrayList2);
        } finally {
            connectionSource.releaseConnection(readWriteConnection);
        }
    }

    private static <T> int clearTable(ConnectionSource connectionSource, String str, String str2) throws SQLException {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        StringBuilder sb = new StringBuilder(48);
        if (databaseType.isTruncateSupported()) {
            sb.append("TRUNCATE TABLE ");
        } else {
            sb.append("DELETE FROM ");
        }
        if (str != null && str.length() > 0) {
            databaseType.appendEscapedEntityName(sb, str);
            sb.append('.');
        }
        databaseType.appendEscapedEntityName(sb, str2);
        String string = sb.toString();
        logger.info("clearing table '{}' with '{}", str2, string);
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection(str2);
        CompiledStatement compiledStatementCompileStatement = null;
        try {
            compiledStatementCompileStatement = readWriteConnection.compileStatement(string, StatementBuilder.StatementType.EXECUTE, noFieldTypes, -1, false);
            return compiledStatementCompileStatement.runExecute();
        } finally {
            IOUtils.closeThrowSqlException(compiledStatementCompileStatement, "compiled statement");
            connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public static <T, ID> int dropTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig, boolean z) throws SQLException {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        Dao daoCreateDao = DaoManager.createDao(connectionSource, databaseTableConfig);
        if (daoCreateDao instanceof BaseDaoImpl) {
            return doDropTable(databaseType, connectionSource, ((BaseDaoImpl) daoCreateDao).getTableInfo(), z);
        }
        databaseTableConfig.extractFieldTypes(databaseType);
        return doDropTable(databaseType, connectionSource, new TableInfo(databaseType, databaseTableConfig), z);
    }

    @Deprecated
    public static <T> List<String> getCreateTableStatements(DatabaseType databaseType, Class<T> cls) throws SQLException {
        ArrayList arrayList = new ArrayList();
        addCreateTableStatements(databaseType, new TableInfo(databaseType, cls), arrayList, arrayList, false, false);
        return arrayList;
    }
}
