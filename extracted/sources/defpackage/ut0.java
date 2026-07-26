package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: loaded from: classes.dex */
public final class ut0 extends jk2 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public ut0(bm8 bm8Var, long j, long j2, boolean z) throws ClippingMediaSource$IllegalClippingException {
        super(bm8Var);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new ClippingMediaSource$IllegalClippingException(j, 2, j2);
        }
        boolean z2 = false;
        if (bm8Var.h() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        am8 am8VarM = bm8Var.m(0, new am8(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !am8VarM.k && jMax != 0 && !am8VarM.h) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? am8VarM.m : Math.max(0L, j2);
        long j3 = am8VarM.m;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f = jMax;
        this.g = jMax2;
        this.h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (am8VarM.i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z2 = true;
        }
        this.i = z2;
    }

    @Override // defpackage.jk2, defpackage.bm8
    public final yl8 f(int i, yl8 yl8Var, boolean z) {
        this.e.f(0, yl8Var, z);
        long j = yl8Var.e - this.f;
        long j2 = this.h;
        yl8Var.i(yl8Var.a, yl8Var.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, bb.f, false);
        return yl8Var;
    }

    @Override // defpackage.jk2, defpackage.bm8
    public final am8 m(int i, am8 am8Var, long j) {
        this.e.m(0, am8Var, 0L);
        long j2 = am8Var.p;
        long j3 = this.f;
        am8Var.p = j2 + j3;
        am8Var.m = this.h;
        am8Var.i = this.i;
        long j4 = am8Var.l;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            am8Var.l = jMax;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            am8Var.l = jMax - j3;
        }
        long jK0 = j29.k0(j3);
        long j6 = am8Var.e;
        if (j6 != -9223372036854775807L) {
            am8Var.e = j6 + jK0;
        }
        long j7 = am8Var.f;
        if (j7 != -9223372036854775807L) {
            am8Var.f = j7 + jK0;
        }
        return am8Var;
    }
}
