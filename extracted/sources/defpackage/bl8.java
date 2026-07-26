package defpackage;

import androidx.compose.ui.node.h;
import androidx.compose.ui.node.m;

/* JADX INFO: loaded from: classes.dex */
public final class bl8 {
    public final int a;
    public final gx4 b;
    public final dp2 c;
    public bl8 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ cl8 h;

    public bl8(cl8 cl8Var, int i, gx4 gx4Var, dp2 dp2Var) {
        this.h = cl8Var;
        this.a = i;
        this.b = gx4Var;
        this.c = dp2Var;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        j37 j37Var;
        j37 j37Var2;
        long j5 = this.h.f;
        gx4 gx4Var = this.b;
        m mVarE = y40.E(gx4Var, 2);
        h hVarH = y40.H(gx4Var);
        boolean zV = hVarH.V();
        z4 z4Var = hVarH.H;
        if (zV) {
            if (((m) z4Var.e) != mVarE) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = mVarE.c;
                m mVar = (m) z4Var.e;
                mVar.getClass();
                long jI = is3.I(mVar.H(mVarE, jFloatToRawIntBits));
                j37Var = new j37(jI, (4294967295L & ((long) (((int) (jI & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jI >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, gx4Var);
            } else {
                j37Var = new j37(j, j2, j3, j4, j5, fArr, gx4Var);
            }
            j37Var2 = j37Var;
        } else {
            j37Var2 = null;
        }
        if (j37Var2 == null) {
            return;
        }
        this.c.invoke(j37Var2);
    }

    public final void b() {
        cl8 cl8Var = this.h;
        ya5 ya5Var = cl8Var.a;
        int i = this.a;
        bl8 bl8Var = (bl8) ya5Var.g(i);
        if (bl8Var != null) {
            if (bl8Var.equals(this)) {
                bl8 bl8Var2 = this.d;
                this.d = null;
                if (bl8Var2 == null) {
                    h hVarH = y40.H(this.b.a);
                    if (hVarH.h) {
                        m14.a(hVarH).getRectManager().a.w(hVarH.b, false);
                        return;
                    }
                    return;
                }
                int iD = ya5Var.d(i);
                Object[] objArr = ya5Var.c;
                Object obj = objArr[iD];
                ya5Var.b[iD] = i;
                objArr[iD] = bl8Var2;
                return;
            }
            int iD2 = ya5Var.d(i);
            Object[] objArr2 = ya5Var.c;
            Object obj2 = objArr2[iD2];
            ya5Var.b[iD2] = i;
            objArr2[iD2] = bl8Var;
            while (true) {
                bl8 bl8Var3 = bl8Var.d;
                if (bl8Var3 == null) {
                    break;
                }
                if (bl8Var3 == this) {
                    bl8Var.d = this.d;
                    this.d = null;
                    return;
                }
                bl8Var = bl8Var3;
            }
        }
        bl8 bl8Var4 = cl8Var.b;
        if (bl8Var4 == this) {
            cl8Var.b = bl8Var4.d;
            this.d = null;
            return;
        }
        bl8 bl8Var5 = bl8Var4 != null ? bl8Var4.d : null;
        while (true) {
            bl8 bl8Var6 = bl8Var4;
            bl8Var4 = bl8Var5;
            if (bl8Var4 == null) {
                return;
            }
            if (bl8Var4 == this) {
                if (bl8Var6 != null) {
                    bl8Var6.d = bl8Var4.d;
                }
                this.d = null;
                return;
            }
            bl8Var5 = bl8Var4.d;
        }
    }
}
