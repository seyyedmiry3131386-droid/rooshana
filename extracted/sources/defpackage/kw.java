package defpackage;

import androidx.compose.ui.node.j;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class kw extends gx4 implements f14 {
    public float o;

    public final long C0(long j, boolean z) {
        int iRound;
        int iG = h31.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.o)) <= 0) {
            return 0L;
        }
        if (!z || dy3.B(iRound, iG, j)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long D0(long j, boolean z) {
        int iRound;
        int iH = h31.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.o)) <= 0) {
            return 0L;
        }
        if (!z || dy3.B(iH, iRound, j)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long E0(long j, boolean z) {
        int i = h31.i(j);
        int iRound = Math.round(i * this.o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || dy3.B(iRound, i, j)) {
            return (((long) iRound) << 32) | (((long) i) & 4294967295L);
        }
        return 0L;
    }

    public final long F0(long j, boolean z) {
        int iJ = h31.j(j);
        int iRound = Math.round(iJ / this.o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || dy3.B(iJ, iRound, j)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.f14
    public final int a(j jVar, yk4 yk4Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.o) : yk4Var.l(i);
    }

    @Override // defpackage.f14
    public final int b(j jVar, yk4 yk4Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.o) : yk4Var.P(i);
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        long jD0 = D0(j, true);
        if (zq3.b(jD0, 0L)) {
            jD0 = C0(j, true);
            if (zq3.b(jD0, 0L)) {
                jD0 = F0(j, true);
                if (zq3.b(jD0, 0L)) {
                    jD0 = E0(j, true);
                    if (zq3.b(jD0, 0L)) {
                        jD0 = D0(j, false);
                        if (zq3.b(jD0, 0L)) {
                            jD0 = C0(j, false);
                            if (zq3.b(jD0, 0L)) {
                                jD0 = F0(j, false);
                                if (zq3.b(jD0, 0L)) {
                                    jD0 = E0(j, false);
                                    if (zq3.b(jD0, 0L)) {
                                        jD0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!zq3.b(jD0, 0L)) {
            int i = (int) (jD0 >> 32);
            int i2 = (int) (jD0 & 4294967295L);
            if (!((i2 >= 0) & (i >= 0))) {
                tn3.a("width and height must be >= 0");
            }
            j = j31.h(i, i, i2, i2);
        }
        b96 b96VarT = yk4Var.t(j);
        return el4Var.D(b96VarT.a, b96VarT.b, b.I(), new q(b96VarT, 1));
    }

    @Override // defpackage.f14
    public final int e(j jVar, yk4 yk4Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.o) : yk4Var.n(i);
    }

    @Override // defpackage.f14
    public final int f(j jVar, yk4 yk4Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.o) : yk4Var.a(i);
    }
}
