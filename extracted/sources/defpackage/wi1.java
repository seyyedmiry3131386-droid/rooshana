package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wi1 implements aj1, nd8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wi1(zi1 zi1Var, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = zi1Var;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // defpackage.aj1
    public ScheduledFuture a(ca7 ca7Var) {
        switch (this.a) {
            case 0:
                zi1 zi1Var = (zi1) this.b;
                Runnable runnable = (Runnable) this.e;
                return zi1Var.b.schedule(new yi1(zi1Var, runnable, ca7Var, 1), this.c, (TimeUnit) this.d);
            default:
                zi1 zi1Var2 = (zi1) this.b;
                Callable callable = (Callable) this.e;
                return zi1Var2.b.schedule(new if4(zi1Var2, callable, ca7Var, 2), this.c, (TimeUnit) this.d);
        }
    }

    @Override // defpackage.nd8
    public Object execute() {
        v24 v24Var = (v24) this.b;
        Iterable iterable = (Iterable) this.e;
        d30 d30Var = (d30) this.d;
        qb7 qb7Var = (qb7) ((i42) v24Var.c);
        qb7Var.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + qb7.D(iterable);
            SQLiteDatabase sQLiteDatabaseB = qb7Var.b();
            sQLiteDatabaseB.beginTransaction();
            try {
                sQLiteDatabaseB.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        qb7Var.u(cursorRawQuery.getInt(0), LogEventDropped$Reason.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseB.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseB.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseB.endTransaction();
            }
        }
        qb7Var.g(new dd1(((wt0) v24Var.g).a() + this.c, d30Var));
        return null;
    }

    public /* synthetic */ wi1(v24 v24Var, Iterable iterable, d30 d30Var, long j) {
        this.a = 2;
        this.b = v24Var;
        this.e = iterable;
        this.d = d30Var;
        this.c = j;
    }
}
