package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class to3 extends mx4 {
    public final me9 b;
    public final dp2 c;

    public to3(me9 me9Var, dp2 dp2Var) {
        this.b = me9Var;
        this.c = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof to3) {
            return js3.i(((to3) obj).b, this.b);
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new vo3(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        vo3 vo3Var = (vo3) gx4Var;
        me9 me9Var = vo3Var.q;
        me9 me9Var2 = this.b;
        if (js3.i(me9Var2, me9Var)) {
            return;
        }
        vo3Var.q = me9Var2;
        vo3Var.D0();
    }
}
