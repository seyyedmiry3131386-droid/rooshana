package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class lv1 extends mx4 {
    public final dp2 b;

    public lv1(dp2 dp2Var) {
        this.b = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lv1) {
            return this.b == ((lv1) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        mv1 mv1Var = new mv1();
        mv1Var.o = this.b;
        return mv1Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((mv1) gx4Var).o = this.b;
    }
}
