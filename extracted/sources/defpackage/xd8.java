package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class xd8 extends mx4 {
    public final dp2 b;
    public final dp2 c;

    public xd8(dp2 dp2Var, dp2 dp2Var2) {
        this.b = dp2Var;
        this.c = dp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xd8) {
            return this.c == ((xd8) obj).c;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        yd8 yd8Var = new yd8(s7.i);
        yd8Var.r = this.c;
        return yd8Var;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        yd8 yd8Var = (yd8) gx4Var;
        dp2 dp2Var = yd8Var.r;
        dp2 dp2Var2 = this.c;
        if (dp2Var != dp2Var2) {
            yd8Var.r = dp2Var2;
            rf9 rf9Var = yd8Var.s;
            if (rf9Var != null) {
                me9 me9Var = (me9) dp2Var2.invoke(rf9Var);
                if (js3.i(me9Var, yd8Var.q)) {
                    return;
                }
                yd8Var.q = me9Var;
                yd8Var.D0();
            }
        }
    }
}
