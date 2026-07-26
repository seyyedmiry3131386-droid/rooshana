package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class rt5 extends mx4 {
    public final dp2 b;

    public rt5(dp2 dp2Var) {
        this.b = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rt5) {
            return this.b == ((rt5) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        st5 st5Var = new st5();
        st5Var.o = this.b;
        long j = Integer.MIN_VALUE;
        st5Var.p = (j & 4294967295L) | (j << 32);
        return st5Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        st5 st5Var = (st5) gx4Var;
        st5Var.o = this.b;
        long j = Integer.MIN_VALUE;
        st5Var.p = (j & 4294967295L) | (j << 32);
    }
}
