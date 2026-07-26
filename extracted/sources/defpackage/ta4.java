package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ta4 extends bb5 {
    public final fj9 l;
    public g64 m;
    public ua4 n;

    public ta4(fj9 fj9Var) {
        this.l = fj9Var;
        if (fj9Var.a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        fj9Var.a = this;
    }

    @Override // defpackage.bb5
    public final void e() {
        fj9 fj9Var = this.l;
        fj9Var.b = true;
        fj9Var.d = false;
        fj9Var.c = false;
        fj9Var.i.drainPermits();
        fj9Var.c();
    }

    @Override // defpackage.bb5
    public final void f() {
        this.l.b = false;
    }

    @Override // defpackage.bb5
    public final void g(ir5 ir5Var) {
        super.g(ir5Var);
        this.m = null;
        this.n = null;
    }

    public final void i() {
        g64 g64Var = this.m;
        ua4 ua4Var = this.n;
        if (g64Var == null || ua4Var == null) {
            return;
        }
        super.g(ua4Var);
        d(g64Var, ua4Var);
    }

    public final String toString() {
        StringBuilder sbA = o40.A(64, "LoaderInfo{");
        sbA.append(Integer.toHexString(System.identityHashCode(this)));
        sbA.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sbA.append(cls.getSimpleName());
        sbA.append("{");
        sbA.append(Integer.toHexString(System.identityHashCode(cls)));
        sbA.append("}}");
        return sbA.toString();
    }
}
