package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oi4 extends fz1 {
    public final float x;

    public oi4(float f) {
        super(0);
        this.x = f - 0.001f;
    }

    @Override // defpackage.fz1
    public final void o(float f, float f2, float f3, us7 us7Var) {
        double d = this.x;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        us7Var.e(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
        us7Var.d(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        us7Var.d(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}
