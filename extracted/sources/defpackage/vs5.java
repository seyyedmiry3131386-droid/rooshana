package defpackage;

import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: loaded from: classes.dex */
public final class vs5 implements b64, AutoCloseable {
    public final /* synthetic */ qs5 a;
    public final /* synthetic */ i64 b;

    public vs5(qs5 qs5Var, ws5 ws5Var, i64 i64Var) {
        this.a = qs5Var;
        this.b = i64Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.f(this);
    }

    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        Lifecycle$Event lifecycle$Event2 = Lifecycle$Event.ON_START;
        qs5 qs5Var = this.a;
        if (lifecycle$Event == lifecycle$Event2) {
            qs5Var.j(true);
        } else if (lifecycle$Event == Lifecycle$Event.ON_STOP) {
            qs5Var.j(false);
        }
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            qs5Var.h();
            this.b.f(this);
        }
    }
}
