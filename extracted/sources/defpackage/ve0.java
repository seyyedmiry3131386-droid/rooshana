package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ve0 extends fz1 implements Cloneable {
    public float A;
    public float B;
    public float C;
    public float x;
    public float y;
    public float z;

    @Override // defpackage.fz1
    public final void o(float f, float f2, float f3, us7 us7Var) {
        float f4;
        float f5;
        float f6 = this.z;
        if (f6 == 0.0f) {
            us7Var.d(f, 0.0f);
            return;
        }
        float f7 = ((this.y * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.x;
        float f9 = f2 + this.B;
        float f10 = dw1.f(1.0f, f3, f7, this.A * f3);
        if (f10 / f7 >= 1.0f) {
            us7Var.d(f, 0.0f);
            return;
        }
        float f11 = this.C;
        float f12 = f11 * f3;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = f10;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float fSqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - fSqrt;
        float f16 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        us7Var.d(f15, 0.0f);
        float f18 = f15 - f8;
        float f19 = f15 + f8;
        float f20 = f8 * 2.0f;
        us7Var.a(f18, 0.0f, f19, f20, 270.0f, degrees);
        if (z) {
            us7Var.a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f21 = this.y;
            float f22 = f12 * 2.0f;
            float f23 = f21 + f22;
            float f24 = f9 - f7;
            us7Var.a(f24, -(f12 + f21), f23 + f24, f21 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f25 = f9 + f7;
            float f26 = this.y;
            us7Var.d(f25 - ((f26 / 2.0f) + f12), f26 + f12);
            float f27 = this.y;
            us7Var.a(f25 - (f22 + f27), -(f12 + f27), f25, f27 + f12, 90.0f, f17 - 90.0f);
        }
        us7Var.a(f16 - f8, 0.0f, f16 + f8, f20, 270.0f - degrees, degrees);
        us7Var.d(f, 0.0f);
    }

    public final void s(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.A = f;
    }
}
