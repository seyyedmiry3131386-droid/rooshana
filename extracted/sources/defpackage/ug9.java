package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug9 implements sl7 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public ug9(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.sl7
    public final long c() {
        return this.f;
    }

    @Override // defpackage.kl7
    public final boolean e() {
        return this.g != null;
    }

    @Override // defpackage.sl7
    public final long f(long j) {
        long j2 = j - this.a;
        if (!e() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        vy2.t(jArr);
        double d = (j2 * 256.0d) / this.e;
        int iE = j29.e(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) iE) * j3) / 100;
        long j5 = jArr[iE];
        int i = iE + 1;
        long j6 = (j3 * ((long) i)) / 100;
        return Math.round((j5 == (iE == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.kl7
    public final jl7 j(long j) {
        double d;
        double d2;
        boolean zE = e();
        int i = this.b;
        long j2 = this.a;
        if (!zE) {
            ml7 ml7Var = new ml7(0L, j2 + ((long) i));
            return new jl7(ml7Var, ml7Var);
        }
        long j3 = j29.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            vy2.t(jArr);
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j4 = this.e;
        ml7 ml7Var2 = new ml7(j3, j2 + j29.j(Math.round((d4 / d) * j4), i, j4 - 1));
        return new jl7(ml7Var2, ml7Var2);
    }

    @Override // defpackage.sl7
    public final int k() {
        return this.d;
    }

    @Override // defpackage.kl7
    public final long l() {
        return this.c;
    }
}
