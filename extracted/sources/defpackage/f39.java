package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f39 implements sl7 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public f39(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = i;
    }

    @Override // defpackage.sl7
    public final long c() {
        return this.d;
    }

    @Override // defpackage.kl7
    public final boolean e() {
        return true;
    }

    @Override // defpackage.sl7
    public final long f(long j) {
        return this.a[j29.e(this.b, j, true)];
    }

    @Override // defpackage.kl7
    public final jl7 j(long j) {
        long[] jArr = this.a;
        int iE = j29.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.b;
        ml7 ml7Var = new ml7(j2, jArr2[iE]);
        if (j2 >= j || iE == jArr.length - 1) {
            return new jl7(ml7Var, ml7Var);
        }
        int i = iE + 1;
        return new jl7(ml7Var, new ml7(jArr[i], jArr2[i]));
    }

    @Override // defpackage.sl7
    public final int k() {
        return this.e;
    }

    @Override // defpackage.kl7
    public final long l() {
        return this.c;
    }
}
