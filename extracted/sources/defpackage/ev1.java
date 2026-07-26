package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ev1 extends mx4 {
    public final dp2 b;

    public ev1(dp2 dp2Var) {
        this.b = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ev1) {
            return this.b == ((ev1) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        dv1 dv1Var = new dv1();
        dv1Var.o = this.b;
        return dv1Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((dv1) gx4Var).o = this.b;
    }
}
