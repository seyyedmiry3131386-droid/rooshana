package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n38 {
    public float a;
    public double b;
    public float c;

    public final long a(float f, float f2, long j) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f3 = f - this.a;
        double d = j / 1000.0d;
        float f4 = this.c;
        double d2 = ((double) f4) * ((double) f4);
        double d3 = this.b;
        double d4 = ((double) (-f4)) * d3;
        if (f4 > 1.0f) {
            double dSqrt = Math.sqrt(d2 - ((double) 1)) * d3;
            double d5 = d4 + dSqrt;
            double d6 = d4 - dSqrt;
            double d7 = f3;
            double d8 = ((d6 * d7) - ((double) f2)) / (d6 - d5);
            double d9 = d7 - d8;
            double d10 = d6 * d;
            double d11 = d * d5;
            dSin = (Math.exp(d11) * d8) + (Math.exp(d10) * d9);
            dExp = Math.exp(d10) * d9 * d6;
            dExp2 = Math.exp(d11) * d8 * d5;
        } else {
            if (f4 != 1.0f) {
                double d12 = 1;
                double dSqrt2 = Math.sqrt(d12 - d2) * d3;
                double d13 = f3;
                double d14 = (((-d4) * d13) + ((double) f2)) * (d12 / dSqrt2);
                double d15 = dSqrt2 * d;
                double d16 = d * d4;
                dSin = ((Math.sin(d15) * d14) + (Math.cos(d15) * d13)) * Math.exp(d16);
                dCos = (((Math.cos(d15) * dSqrt2 * d14) + (Math.sin(d15) * (-dSqrt2) * d13)) * Math.exp(d16)) + (d4 * dSin);
                return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.a))) << 32);
            }
            double d17 = f3;
            double d18 = (d3 * d17) + ((double) f2);
            double d19 = (-d3) * d;
            double d20 = (d * d18) + d17;
            dSin = Math.exp(d19) * d20;
            dExp = Math.exp(d19) * d20 * (-this.b);
            dExp2 = Math.exp(d19) * d18;
        }
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.a))) << 32);
    }
}
