package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.j256.ormlite.field.FieldType;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qb7 implements i42, od8, jt0 {
    public static final u12 f = new u12("proto");
    public final jf7 a;
    public final wt0 b;
    public final wt0 c;
    public final m20 d;
    public final pn6 e;

    public qb7(wt0 wt0Var, wt0 wt0Var2, m20 m20Var, jf7 jf7Var, pn6 pn6Var) {
        this.a = jf7Var;
        this.b = wt0Var;
        this.c = wt0Var2;
        this.d = m20Var;
        this.e = pn6Var;
    }

    public static String D(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((v20) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object I(Cursor cursor, ob7 ob7Var) {
        try {
            return ob7Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long d(SQLiteDatabase sQLiteDatabase, d30 d30Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(d30Var.a, String.valueOf(gk6.a(d30Var.c))));
        byte[] bArr = d30Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{FieldType.FOREIGN_ID_FIELD_SUFFIX}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final SQLiteDatabase b() {
        jf7 jf7Var = this.a;
        Objects.requireNonNull(jf7Var);
        wt0 wt0Var = this.c;
        long jA = wt0Var.a();
        while (true) {
            try {
                return jf7Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (wt0Var.a() >= ((long) this.d.c) + jA) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final Object g(ob7 ob7Var) {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            Object objApply = ob7Var.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final ArrayList k(SQLiteDatabase sQLiteDatabase, d30 d30Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long lD = d(sQLiteDatabase, d30Var);
        if (lD == null) {
            return arrayList;
        }
        I(sQLiteDatabase.query("events", new String[]{FieldType.FOREIGN_ID_FIELD_SUFFIX, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lD.toString()}, null, null, null, String.valueOf(i)), new tg1(this, (Object) arrayList, d30Var, 10));
        return arrayList;
    }

    public final void u(long j, LogEventDropped$Reason logEventDropped$Reason, String str) {
        g(new vn4(j, str, logEventDropped$Reason));
    }

    public final Object y(nd8 nd8Var) {
        SQLiteDatabase sQLiteDatabaseB = b();
        wt0 wt0Var = this.c;
        long jA = wt0Var.a();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
                try {
                    Object objExecute = nd8Var.execute();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (wt0Var.a() >= ((long) this.d.c) + jA) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
