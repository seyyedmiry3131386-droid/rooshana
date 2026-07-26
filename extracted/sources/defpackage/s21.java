package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s21 implements sl7, kl7 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final long h;
    public final int i;
    public final int j;
    public final boolean k;
    public final long l;

    public s21(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.l = j == -1 ? -1L : j;
    }

    @Override // defpackage.sl7
    public final long c() {
        return this.l;
    }

    @Override // defpackage.kl7
    public final boolean e() {
        return this.d != -1 || this.g;
    }

    @Override // defpackage.sl7
    public final long f(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // defpackage.kl7
    public final jl7 j(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            ml7 ml7Var = new ml7(0L, j3);
            return new jl7(ml7Var, ml7Var);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i);
        ml7 ml7Var2 = new ml7(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new jl7(ml7Var2, new ml7((Math.max(0L, j5 - j3) * 8000000) / ((long) i), j5));
            }
        }
        return new jl7(ml7Var2, ml7Var2);
    }

    @Override // defpackage.sl7
    public final int k() {
        return this.i;
    }

    @Override // defpackage.kl7
    public final long l() {
        return this.f;
    }
}
