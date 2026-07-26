package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class me2 implements be2 {
    public final int a;
    public final zy1 b;
    public final long c;
    public final long d;

    public me2(int i, int i2, zy1 zy1Var) {
        this.a = i;
        this.b = zy1Var;
        this.c = ((long) i) * 1000000;
        this.d = ((long) i2) * 1000000;
    }

    @Override // defpackage.sk
    public final x39 a(mt8 mt8Var) {
        return new o77(this);
    }

    @Override // defpackage.be2
    public final float b(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (e(j4, f, f2, f3) - e(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.be2
    public final long c(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // defpackage.be2
    public final float d(float f, float f2, float f3) {
        return b(c(f, f2, f3), f, f2, f3);
    }

    @Override // defpackage.be2
    public final float e(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fB = this.b.b(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * fB) + ((1 - fB) * f);
    }
}
