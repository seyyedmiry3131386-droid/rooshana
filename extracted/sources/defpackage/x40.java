package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class x40 extends mx4 {
    public final long b;
    public final ch0 c;
    public final float d;
    public final xr7 e;
    public final dp2 f;

    public x40(long j, g74 g74Var, xr7 xr7Var, dp2 dp2Var, int i) {
        j = (i & 1) != 0 ? zu0.h : j;
        g74Var = (i & 2) != 0 ? null : g74Var;
        this.b = j;
        this.c = g74Var;
        this.d = 1.0f;
        this.e = xr7Var;
        this.f = dp2Var;
    }

    public final boolean equals(Object obj) {
        x40 x40Var = obj instanceof x40 ? (x40) obj : null;
        return x40Var != null && zu0.c(this.b, x40Var.b) && js3.i(this.c, x40Var.c) && this.d == x40Var.d && js3.i(this.e, x40Var.e);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        z40 z40Var = new z40();
        z40Var.o = this.b;
        z40Var.p = this.c;
        z40Var.q = this.d;
        z40Var.r = this.e;
        z40Var.s = 9205357640488583168L;
        return z40Var;
    }

    public final int hashCode() {
        int i = zu0.i;
        int iA = tw8.a(this.b) * 31;
        ch0 ch0Var = this.c;
        return this.e.hashCode() + dw1.g(this.d, (iA + (ch0Var != null ? ch0Var.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        z40 z40Var = (z40) gx4Var;
        z40Var.o = this.b;
        z40Var.p = this.c;
        z40Var.q = this.d;
        xr7 xr7Var = z40Var.r;
        xr7 xr7Var2 = this.e;
        if (!js3.i(xr7Var, xr7Var2)) {
            z40Var.r = xr7Var2;
            t17.f(z40Var);
        }
        rf0.z(z40Var);
    }
}
