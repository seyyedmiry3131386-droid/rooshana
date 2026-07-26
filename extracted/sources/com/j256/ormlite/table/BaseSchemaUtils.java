package com.j256.ormlite.table;

import com.j256.ormlite.support.ConnectionSource;
import java.sql.SQLException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSchemaUtils {
    public void dumpSchema() throws SQLException {
        ConnectionSource connectionSource = getConnectionSource();
        for (Class<?> cls : getClasses()) {
            Iterator<String> it = TableUtils.getCreateTableStatements(connectionSource, cls).iterator();
            while (it.hasNext()) {
                System.out.println(it.next() + ";");
            }
        }
    }

    public abstract Class<?>[] getClasses();

    public abstract ConnectionSource getConnectionSource() throws SQLException;
}
