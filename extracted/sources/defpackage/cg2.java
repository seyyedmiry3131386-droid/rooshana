package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cg2 extends mx4 {
    public final dp2 b;

    public cg2(dp2 dp2Var) {
        this.b = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cg2) {
            return this.b == ((cg2) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        dg2 dg2Var = new dg2();
        dg2Var.o = this.b;
        return dg2Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((dg2) gx4Var).o = this.b;
    }
}
