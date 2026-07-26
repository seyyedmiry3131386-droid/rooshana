package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u81 extends c26 {
    public double v;
    public double[] w;

    @Override // defpackage.c26
    public final double B(double d) {
        return 0.0d;
    }

    @Override // defpackage.c26
    public final void C(double d, double[] dArr) {
        for (int i = 0; i < this.w.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // defpackage.c26
    public final double[] D() {
        return new double[]{this.v};
    }

    @Override // defpackage.c26
    public final double w(double d) {
        return this.w[0];
    }

    @Override // defpackage.c26
    public final void x(double d, double[] dArr) {
        double[] dArr2 = this.w;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // defpackage.c26
    public final void y(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.w;
            if (i >= dArr.length) {
                return;
            }
            fArr[i] = (float) dArr[i];
            i++;
        }
    }
}
