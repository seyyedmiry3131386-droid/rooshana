package defpackage;

import androidx.compose.animation.core.h;
import androidx.compose.material3.p;
import androidx.compose.runtime.g;
import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class fo8 {
    public static final float a;
    public static final float b = 24;
    public static final float c = 40;
    public static final wy5 d;

    static {
        float f = 4;
        a = f;
        float f2 = 8;
        d = new wy5(f2, f, f2, f);
    }

    public static final void a(final io8 io8Var, hx4 hx4Var, float f, xr7 xr7Var, long j, long j2, float f2, float f3, final a aVar, qz0 qz0Var, final int i) {
        int i2;
        hx4 hx4Var2;
        final float f4;
        final xr7 xr7Var2;
        final long j3;
        final long j4;
        final float f5;
        final float f6;
        float f7;
        long jD;
        int i3;
        long j5;
        float f8;
        xr7 xr7Var3;
        float f9;
        qz0Var.c0(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? qz0Var.f(io8Var) : qz0Var.h(io8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= qz0Var.h(aVar) ? 536870912 : 268435456;
        }
        if (qz0Var.R(i5 & 1, (306783379 & i5) != 306783378)) {
            qz0Var.W();
            if ((i & 1) == 0 || qz0Var.z()) {
                f7 = ao8.a;
                xr7 xr7VarA = jt7.a(j96.b, qz0Var);
                jD = mv0.d(j96.c, qz0Var);
                long jD2 = mv0.d(j96.a, qz0Var);
                i3 = i5 & (-4186113);
                hx4Var2 = ex4.b;
                j5 = jD2;
                f8 = 0;
                xr7Var3 = xr7VarA;
                f9 = 0;
            } else {
                qz0Var.U();
                i3 = i5 & (-4186113);
                hx4Var2 = hx4Var;
                f7 = f;
                xr7Var3 = xr7Var;
                jD = j;
                j5 = j2;
                f8 = f2;
                f9 = f3;
            }
            qz0Var.r();
            qz0Var.a0(-1719831991);
            qz0Var.q(false);
            int i6 = i3 >> 9;
            pc8.a(hx4Var2, xr7Var3, j5, 0L, f8, f9, s7.X(-1573998995, new do8(f7, jD, aVar), qz0Var), qz0Var, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            f4 = f7;
            j3 = jD;
            xr7Var2 = xr7Var3;
            j4 = j5;
            f5 = f8;
            f6 = f9;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
            f4 = f;
            xr7Var2 = xr7Var;
            j3 = j;
            j4 = j2;
            f5 = f2;
            f6 = f3;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            final hx4 hx4Var3 = hx4Var2;
            my6VarS.d = new qp2() { // from class: co8
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fo8.a(io8Var, hx4Var3, f4, xr7Var2, j3, j4, f5, f6, aVar, (qz0) obj, hs9.W(i | 1));
                    return tx8.a;
                }
            };
        }
    }

    public static final void b(fi6 fi6Var, a aVar, p pVar, hx4 hx4Var, boolean z, a aVar2, qz0 qz0Var, int i) {
        int i2;
        hx4 hx4Var2;
        boolean z2;
        qz0Var.c0(-293753984);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(fi6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? qz0Var.f(pVar) : qz0Var.h(pVar) ? 256 : 128;
        }
        int i3 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i3 |= qz0Var.h(aVar2) ? 67108864 : 33554432;
        }
        if (qz0Var.R(i3 & 1, (38347923 & i3) != 38347922)) {
            jr8 jr8VarD = h.d(pVar.b, "tooltip transition", qz0Var, 48);
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = g.h(null);
                qz0Var.l0(objM);
            }
            wb5 wb5Var = (wb5) objM;
            Object objM2 = qz0Var.M();
            if (objM2 == avVar) {
                new v8(wb5Var, 11);
                objM2 = new io8();
                qz0Var.l0(objM2);
            }
            zk8.a(fi6Var, s7.X(-527401546, new eo8(jr8VarD, aVar, (io8) objM2), qz0Var), pVar, s7.X(-23901870, new qa0(wb5Var, aVar2, 3), qz0Var), qz0Var, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
            hx4Var2 = ex4.b;
            z2 = true;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
            z2 = z;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new pa0(fi6Var, aVar, pVar, hx4Var2, z2, aVar2, i);
        }
    }
}
