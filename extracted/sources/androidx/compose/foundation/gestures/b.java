package androidx.compose.foundation.gestures;

import defpackage.ah7;
import defpackage.bt2;
import defpackage.gx4;
import defpackage.js3;
import defpackage.m01;
import defpackage.pj9;
import defpackage.s01;
import defpackage.sy6;
import defpackage.t04;
import defpackage.tt3;
import defpackage.un3;
import defpackage.v04;
import defpackage.wg0;
import defpackage.xg0;
import defpackage.y97;
import defpackage.z31;
import defpackage.zb5;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
public final class b extends gx4 implements m01, t04 {
    public Orientation o;
    public final o p;
    public boolean q;
    public final ah7 r;
    public boolean t;
    public boolean v;
    public final pj9 s = new pj9(10);
    public long u = 0;

    public b(Orientation orientation, o oVar, boolean z, ah7 ah7Var) {
        this.o = orientation;
        this.p = oVar;
        this.q = z;
        this.r = ah7Var;
    }

    public static final float C0(b bVar, wg0 wg0Var, long j) {
        sy6 sy6Var;
        int iCompare;
        if (zq3.b(bVar.u, 0L)) {
            return 0.0f;
        }
        zb5 zb5Var = (zb5) bVar.s.a;
        int i = zb5Var.c - 1;
        Object[] objArr = zb5Var.a;
        if (i < objArr.length) {
            sy6Var = null;
            while (true) {
                if (i < 0) {
                    break;
                }
                sy6 sy6Var2 = (sy6) ((z31) objArr[i]).a.invoke();
                if (sy6Var2 != null) {
                    long jC = sy6Var2.c();
                    long jM = tt3.M(bVar.u);
                    int iOrdinal = bVar.o.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jM & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jM >> 32)));
                    }
                    if (iCompare <= 0) {
                        sy6Var = sy6Var2;
                    } else if (sy6Var == null) {
                        sy6Var = sy6Var2;
                    }
                }
                i--;
            }
        } else {
            sy6Var = null;
        }
        if (sy6Var == null) {
            sy6 sy6Var3 = bVar.t ? (sy6) bVar.r.invoke() : null;
            if (sy6Var3 == null) {
                return 0.0f;
            }
            sy6Var = sy6Var3;
        }
        long jM2 = tt3.M(bVar.u);
        int iOrdinal2 = bVar.o.ordinal();
        if (iOrdinal2 == 0) {
            float f = sy6Var.b;
            return wg0Var.a(f - ((int) (j & 4294967295L)), sy6Var.d - f, Float.intBitsToFloat((int) (jM2 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        float f2 = sy6Var.a;
        return wg0Var.a(f2 - ((int) (j >> 32)), sy6Var.c - f2, Float.intBitsToFloat((int) (jM2 >> 32)));
    }

    public static boolean D0(b bVar, sy6 sy6Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = bVar.u;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jF0 = bVar.F0(sy6Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jF0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jF0 & 4294967295L))) <= 0.5f;
    }

    public final void E0(long j) {
        s01 s01Var = xg0.a;
        wg0 wg0Var = (wg0) y97.t(this, s01Var);
        if (this.v) {
            un3.c("launchAnimation called when previous animation was running");
        }
        bt2.G(o0(), null, CoroutineStart.d, new ContentInViewNode$launchAnimation$2(this, new q(((wg0) y97.t(this, s01Var)).b()), wg0Var, j, null), 1);
    }

    public final long F0(sy6 sy6Var, long j, long j2) {
        long jM = tt3.M(j);
        int iOrdinal = this.o.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            wg0 wg0Var = (wg0) y97.t(this, xg0.a);
            float f = sy6Var.a;
            return (((long) Float.floatToRawIntBits(wg0Var.a(f - ((int) (j2 >> 32)), sy6Var.c - f, Float.intBitsToFloat((int) (jM >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        wg0 wg0Var2 = (wg0) y97.t(this, xg0.a);
        float f2 = sy6Var.b;
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(wg0Var2.a(f2 - ((int) (j2 & 4294967295L)), sy6Var.d - f2, Float.intBitsToFloat((int) (jM & 4294967295L))))) & 4294967295L);
    }

    @Override // defpackage.t04
    public final /* synthetic */ void k(v04 v04Var) {
    }

    @Override // defpackage.t04
    public final void n(long j) {
        int iR;
        long j2;
        long j3;
        long j4;
        long j5 = this.u;
        this.u = j;
        int iOrdinal = this.o.ordinal();
        if (iOrdinal == 0) {
            iR = js3.r((int) (j & 4294967295L), (int) (j5 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iR = js3.r((int) (j >> 32), (int) (j5 >> 32));
        }
        if (iR >= 0) {
            return;
        }
        if (this.q) {
            j2 = 0;
        } else {
            if (this.o == Orientation.a) {
                j3 = ((long) 0) << 32;
                j4 = ((int) (j5 & 4294967295L)) - ((int) (j & 4294967295L));
            } else {
                j3 = ((long) (((int) (j5 >> 32)) - ((int) (j >> 32)))) << 32;
                j4 = 0;
            }
            j2 = j3 | (j4 & 4294967295L);
        }
        long j6 = j2;
        sy6 sy6Var = (sy6) this.r.invoke();
        if (sy6Var == null || this.v || this.t || !D0(this, sy6Var, j5, 0L, 2) || D0(this, sy6Var, 0L, j6, 1)) {
            return;
        }
        this.t = true;
        E0(j6);
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }
}
