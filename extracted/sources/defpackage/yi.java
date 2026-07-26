package defpackage;

import ir.mservices.market.pika.common.model.ByteArrayResult;

/* JADX INFO: loaded from: classes.dex */
public final class yi {
    public float a;
    public float b;

    public yi(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public yd2 a(float f) {
        double dB = b(f);
        double d = zd2.a;
        double d2 = d - 1.0d;
        return new yd2(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.b))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = ig.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }

    public float c(h81 h81Var) {
        js3.p(h81Var, ByteArrayResult.AppInfo.VERSION_CODE_SERIALISED_NAME);
        float fA = h81Var.a();
        float f = this.a;
        float fB = h81Var.b();
        float f2 = this.b;
        float fA2 = p29.a(fA - f, fB - f2);
        float[] fArr = h81Var.a;
        float fA3 = fA2 - p29.a(fArr[0] - f, fArr[1] - f2);
        float f3 = p29.c;
        float fD = p29.d(fA3, f3);
        if (fD > f3 - 1.0E-4f) {
            return 0.0f;
        }
        return fD;
    }
}
