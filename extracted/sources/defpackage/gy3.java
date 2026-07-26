package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gy3 extends mx4 {
    public final dp2 b;
    public final dp2 c;

    public gy3(dp2 dp2Var, dp2 dp2Var2) {
        this.b = dp2Var;
        this.c = dp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy3)) {
            return false;
        }
        gy3 gy3Var = (gy3) obj;
        return this.b == gy3Var.b && this.c == gy3Var.c;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        iy3 iy3Var = new iy3();
        iy3Var.o = this.b;
        iy3Var.p = this.c;
        return iy3Var;
    }

    public final int hashCode() {
        dp2 dp2Var = this.b;
        int iHashCode = (dp2Var != null ? dp2Var.hashCode() : 0) * 31;
        dp2 dp2Var2 = this.c;
        return iHashCode + (dp2Var2 != null ? dp2Var2.hashCode() : 0);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        iy3 iy3Var = (iy3) gx4Var;
        iy3Var.o = this.b;
        iy3Var.p = this.c;
    }
}
