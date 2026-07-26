package com.j256.ormlite.misc;

import defpackage.dw1;
import defpackage.rm7;
import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;

/* JADX INFO: loaded from: classes3.dex */
public class IOUtils {
    public static void closeQuietly(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                rm7.x(autoCloseable);
            } catch (Exception unused) {
            }
        }
    }

    public static void closeThrowSqlException(AutoCloseable autoCloseable, String str) throws SQLException {
        if (autoCloseable != null) {
            try {
                rm7.x(autoCloseable);
            } catch (Exception e) {
                throw new SQLException(dw1.n("could not close ", str), e);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeThrowSqlException(Closeable closeable, String str) throws SQLException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                throw new SQLException(dw1.n("could not close ", str), e);
            }
        }
    }
}
