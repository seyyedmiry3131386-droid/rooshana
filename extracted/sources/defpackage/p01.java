package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p01 extends mx4 {
    public final o01 b;

    public p01(j56 j56Var) {
        this.b = j56Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p01) && js3.i(((p01) obj).b, this.b);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        q01 q01Var = new q01();
        q01Var.o = this.b;
        return q01Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        q01 q01Var = (q01) gx4Var;
        o01 o01Var = this.b;
        q01Var.o = o01Var;
        y40.H(q01Var).w0(o01Var);
    }
}
