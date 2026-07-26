package defpackage;

import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: loaded from: classes.dex */
public final class kd7 implements b64, AutoCloseable {
    public final String a;
    public final jd7 b;
    public boolean c;

    public kd7(String str, jd7 jd7Var) {
        this.a = str;
        this.b = jd7Var;
    }

    public final void b(bn6 bn6Var, i64 i64Var) {
        js3.p(bn6Var, "registry");
        js3.p(i64Var, "lifecycle");
        if (this.c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.c = true;
        i64Var.a(this);
        bn6Var.u(this.a, (yx0) this.b.b.f);
    }

    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.c = false;
            g64Var.D().f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
