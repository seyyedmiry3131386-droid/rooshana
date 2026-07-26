package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class mt5 extends mx4 {
    public final dp2 b;

    public mt5(dp2 dp2Var) {
        this.b = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mt5) {
            return this.b == ((mt5) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        nt5 nt5Var = new nt5();
        nt5Var.o = this.b;
        return nt5Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((nt5) gx4Var).o = this.b;
    }
}
