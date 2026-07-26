package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dr0 implements kl7 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public dr0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // defpackage.kl7
    public final boolean e() {
        return true;
    }

    @Override // defpackage.kl7
    public final jl7 j(long j) {
        long[] jArr = this.e;
        int iE = j29.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.c;
        ml7 ml7Var = new ml7(j2, jArr2[iE]);
        if (j2 >= j || iE == this.a - 1) {
            return new jl7(ml7Var, ml7Var);
        }
        int i = iE + 1;
        return new jl7(ml7Var, new ml7(jArr[i], jArr2[i]));
    }

    @Override // defpackage.kl7
    public final long l() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
