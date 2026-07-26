package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class sy5 extends mx4 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final dp2 g;

    public sy5(float f, float f2, float f3, float f4, boolean z, dp2 dp2Var) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        this.g = dp2Var;
        boolean z2 = true;
        boolean z3 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z2 = false;
        }
        if (!z3 || !z2) {
            pn3.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        sy5 sy5Var = obj instanceof sy5 ? (sy5) obj : null;
        return sy5Var != null && au1.b(this.b, sy5Var.b) && au1.b(this.c, sy5Var.c) && au1.b(this.d, sy5Var.d) && au1.b(this.e, sy5Var.e) && this.f == sy5Var.f;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        uy5 uy5Var = new uy5();
        uy5Var.o = this.b;
        uy5Var.p = this.c;
        uy5Var.q = this.d;
        uy5Var.r = this.e;
        uy5Var.s = this.f;
        return uy5Var;
    }

    public final int hashCode() {
        return dw1.g(this.e, dw1.g(this.d, dw1.g(this.c, Float.floatToIntBits(this.b) * 31, 31), 31), 31) + (this.f ? 1231 : 1237);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        uy5 uy5Var = (uy5) gx4Var;
        uy5Var.o = this.b;
        uy5Var.p = this.c;
        uy5Var.q = this.d;
        uy5Var.r = this.e;
        uy5Var.s = this.f;
    }
}
