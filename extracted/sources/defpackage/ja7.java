package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ja7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public final float h;
    public long i;

    public ja7(long j, long j2, long j3, q61 q61Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long jD0 = yq2.d0(yq2.q0(j, j2));
        this.d = jD0;
        long jD02 = yq2.d0(yq2.q0(j3, j2));
        this.e = jD02;
        float f = q61Var.a;
        this.f = f;
        this.g = q61Var.b;
        float fZ = yq2.Z(jD0, jD02);
        float f2 = 1;
        float f3 = p29.b;
        float fSqrt = (float) Math.sqrt(f2 - (fZ * fZ));
        this.h = ((double) fSqrt) > 0.001d ? ((fZ + f2) * f) / fSqrt : 0.0f;
        this.i = ge2.a(0.0f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.h81 b(float r16, float r17, long r18, long r20, long r22, long r24, long r26, float r28) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja7.b(float, float, long, long, long, long, long, float):h81");
    }

    public final float a(float f) {
        float fC = c();
        float f2 = this.g;
        if (f > fC) {
            return f2;
        }
        float f3 = this.h;
        if (f > f3) {
            return ((f - f3) * f2) / (c() - f3);
        }
        return 0.0f;
    }

    public final float c() {
        return (1 + this.g) * this.h;
    }
}
