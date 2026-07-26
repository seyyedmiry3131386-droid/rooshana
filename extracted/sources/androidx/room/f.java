package androidx.room;

import defpackage.bt2;
import defpackage.eq;
import defpackage.om0;
import defpackage.qp2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ om0 a;
    public final /* synthetic */ d b;
    public final /* synthetic */ qp2 c;

    public f(om0 om0Var, d dVar, qp2 qp2Var) {
        this.a = om0Var;
        this.b = dVar;
        this.c = qp2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        om0 om0Var = this.a;
        try {
            bt2.Q(om0Var.e.P(eq.u), new RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1(this.b, om0Var, this.c, null));
        } catch (Throwable th) {
            om0Var.n(th);
        }
    }
}
