package com.j256.ormlite.misc;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class TransactionManager {
    private static final String SAVE_POINT_PREFIX = "ORMLITE";
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) TransactionManager.class);
    private static final AtomicInteger savePointCounter = new AtomicInteger();
    private static final ThreadLocal<TransactionLevel> transactionLevelThreadLocal = new ThreadLocal<TransactionLevel>() { // from class: com.j256.ormlite.misc.TransactionManager.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public TransactionLevel initialValue() {
            return new TransactionLevel();
        }
    };
    private ConnectionSource connectionSource;

    public static class TransactionLevel {
        int counter;

        private TransactionLevel() {
        }

        public int decrementAndGet() {
            int i = this.counter - 1;
            this.counter = i;
            return i;
        }

        public int incrementAndGet() {
            int i = this.counter + 1;
            this.counter = i;
            return i;
        }
    }

    public TransactionManager() {
    }

    private static void commit(DatabaseConnection databaseConnection, Savepoint savepoint) throws SQLException {
        String savepointName = savepoint == null ? null : savepoint.getSavepointName();
        databaseConnection.commit(savepoint);
        if (savepointName == null) {
            logger.trace("committed savePoint transaction");
        } else {
            logger.trace("committed savePoint transaction {}", savepointName);
        }
    }

    private static void release(DatabaseConnection databaseConnection, Savepoint savepoint) throws SQLException {
        String savepointName = savepoint == null ? null : savepoint.getSavepointName();
        databaseConnection.releaseSavePoint(savepoint);
        if (savepointName == null) {
            logger.trace("released savePoint transaction");
        } else {
            logger.trace("released savePoint transaction {}", savepointName);
        }
    }

    private static void rollBack(DatabaseConnection databaseConnection, Savepoint savepoint) throws SQLException {
        String savepointName = savepoint == null ? null : savepoint.getSavepointName();
        databaseConnection.rollback(savepoint);
        if (savepointName == null) {
            logger.trace("rolled back savePoint transaction");
        } else {
            logger.trace("rolled back savePoint transaction {}", savepointName);
        }
    }

    public <T> T callInTransaction(Callable<T> callable) throws SQLException {
        return (T) callInTransaction(this.connectionSource, callable);
    }

    public void initialize() {
        if (this.connectionSource == null) {
            throw new IllegalStateException("dataSource was not set on ".concat(getClass().getSimpleName()));
        }
    }

    public void setConnectionSource(ConnectionSource connectionSource) {
        this.connectionSource = connectionSource;
    }

    public TransactionManager(ConnectionSource connectionSource) {
        this.connectionSource = connectionSource;
        initialize();
    }

    public <T> T callInTransaction(String str, Callable<T> callable) throws SQLException {
        return (T) callInTransaction(str, this.connectionSource, callable);
    }

    public static <T> T callInTransaction(ConnectionSource connectionSource, Callable<T> callable) throws SQLException {
        return (T) callInTransaction((String) null, connectionSource, callable);
    }

    public static <T> T callInTransaction(String str, ConnectionSource connectionSource, Callable<T> callable) throws Throwable {
        boolean zSaveSpecialConnection;
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection(str);
        try {
            zSaveSpecialConnection = connectionSource.saveSpecialConnection(readWriteConnection);
            try {
                T t = (T) callInTransaction(readWriteConnection, zSaveSpecialConnection, connectionSource.getDatabaseType(), callable);
                if (zSaveSpecialConnection) {
                    connectionSource.clearSpecialConnection(readWriteConnection);
                }
                connectionSource.releaseConnection(readWriteConnection);
                return t;
            } catch (Throwable th) {
                th = th;
                if (zSaveSpecialConnection) {
                    connectionSource.clearSpecialConnection(readWriteConnection);
                }
                connectionSource.releaseConnection(readWriteConnection);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zSaveSpecialConnection = false;
        }
    }

    public static <T> T callInTransaction(DatabaseConnection databaseConnection, DatabaseType databaseType, Callable<T> callable) throws SQLException {
        return (T) callInTransaction(databaseConnection, false, databaseType, callable);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: all -> 0x001b, TryCatch #3 {all -> 0x001b, blocks: (B:4:0x0011, B:10:0x001e, B:12:0x0024, B:14:0x002a, B:19:0x003a, B:21:0x0052, B:22:0x005a), top: B:60:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #3 {all -> 0x001b, blocks: (B:4:0x0011, B:10:0x001e, B:12:0x0024, B:14:0x002a, B:19:0x003a, B:21:0x0052, B:22:0x005a), top: B:60:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T callInTransaction(com.j256.ormlite.support.DatabaseConnection r8, boolean r9, com.j256.ormlite.db.DatabaseType r10, java.util.concurrent.Callable<T> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.misc.TransactionManager.callInTransaction(com.j256.ormlite.support.DatabaseConnection, boolean, com.j256.ormlite.db.DatabaseType, java.util.concurrent.Callable):java.lang.Object");
    }
}
