package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class yf0 extends mx4 {
    public final qd b;
    public final boolean c;
    public final dp2 d;

    public yf0(qd qdVar, boolean z, dp2 dp2Var) {
        this.b = qdVar;
        this.c = z;
        this.d = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        yf0 yf0Var = obj instanceof yf0 ? (yf0) obj : null;
        return yf0Var != null && js3.i(this.b, yf0Var.b) && this.c == yf0Var.c;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        zf0 zf0Var = new zf0();
        zf0Var.o = this.b;
        zf0Var.p = this.c;
        return zf0Var;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + (this.c ? 1231 : 1237);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        zf0 zf0Var = (zf0) gx4Var;
        zf0Var.o = this.b;
        zf0Var.p = this.c;
    }
}
