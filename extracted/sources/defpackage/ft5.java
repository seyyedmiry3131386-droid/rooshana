package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ft5 extends mx4 {
    public final dp2 b;

    public ft5(dp2 dp2Var) {
        this.b = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ft5) {
            return this.b == ((ft5) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        gt5 gt5Var = new gt5();
        gt5Var.o = this.b;
        return gt5Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((gt5) gx4Var).o = this.b;
    }
}
