package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class jw4 implements sl7 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public jw4(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? j29.V(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        int iE = j29.e(jArr, j, true);
        long j2 = jArr[iE];
        long j3 = jArr2[iE];
        int i = iE + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.sl7
    public final long c() {
        return -1L;
    }

    @Override // defpackage.kl7
    public final boolean e() {
        return true;
    }

    @Override // defpackage.sl7
    public final long f(long j) {
        return j29.V(((Long) a(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.kl7
    public final jl7 j(long j) {
        Pair pairA = a(j29.k0(j29.j(j, 0L, this.c)), this.b, this.a);
        ml7 ml7Var = new ml7(j29.V(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new jl7(ml7Var, ml7Var);
    }

    @Override // defpackage.sl7
    public final int k() {
        return -2147483647;
    }

    @Override // defpackage.kl7
    public final long l() {
        return this.c;
    }
}
