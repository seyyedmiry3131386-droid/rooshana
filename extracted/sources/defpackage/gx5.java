package defpackage;

import androidx.compose.foundation.interaction.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class gx5 {
    public static final float a = 4;

    public static final void a(final String str, final dp2 dp2Var, final hx4 hx4Var, boolean z, final gj8 gj8Var, final qp2 qp2Var, final boolean z2, wa9 wa9Var, ty3 ty3Var, sy3 sy3Var, final int i, int i2, final xr7 xr7Var, final dh8 dh8Var, qz0 qz0Var, final int i3) {
        int i4;
        hx4 hx4Var2;
        qp2 qp2Var2;
        final boolean z3;
        final wa9 wa9Var2;
        final ty3 ty3Var2;
        final sy3 sy3Var2;
        final int i5;
        wa9 wa9Var3;
        ty3 ty3Var3;
        sy3 sy3Var3;
        int i6;
        qz0Var.c0(1901501544);
        if ((i3 & 6) == 0) {
            i4 = (qz0Var.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= qz0Var.h(dp2Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            hx4Var2 = hx4Var;
            i4 |= qz0Var.f(hx4Var2) ? 256 : 128;
        } else {
            hx4Var2 = hx4Var;
        }
        int i7 = i4 | 27648;
        if ((196608 & i3) == 0) {
            i7 |= qz0Var.f(gj8Var) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            qp2Var2 = qp2Var;
            i7 |= qz0Var.h(qp2Var2) ? 1048576 : 524288;
        } else {
            qp2Var2 = qp2Var;
        }
        int i8 = i7 | 918552576;
        boolean z4 = true;
        if (qz0Var.R(i8 & 1, ((i8 & 306783379) == 306783378 && (((qz0Var.g(z2) ? (char) 2048 : (char) 1024) | 25014) & 306783379) == 306783378 && ((((qz0Var.f(xr7Var) ? ' ' : (char) 16) | 6) | (qz0Var.f(dh8Var) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            qz0Var.W();
            if ((i3 & 1) == 0 || qz0Var.z()) {
                wa9Var3 = eq.M;
                ty3Var3 = ty3.a;
                sy3Var3 = sy3.a;
                i6 = 1;
            } else {
                qz0Var.U();
                z4 = z;
                wa9Var3 = wa9Var;
                ty3Var3 = ty3Var;
                sy3Var3 = sy3Var;
                i6 = i2;
            }
            qz0Var.r();
            qz0Var.a0(1310051731);
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = o40.r(qz0Var);
            }
            ab5 ab5Var = (ab5) objM;
            qz0Var.q(false);
            qz0Var.a0(1981927842);
            long jB = gj8Var.b();
            if (jB == 16) {
                jB = !z4 ? dh8Var.c : z2 ? dh8Var.d : ((Boolean) a.a(ab5Var, qz0Var, 0).getValue()).booleanValue() ? dh8Var.a : dh8Var.b;
            }
            long j = jB;
            qz0Var.q(false);
            qp2 qp2Var3 = qp2Var2;
            boolean z5 = z4;
            zk8.b(cj8.a.a(dh8Var.k), s7.X(1874034984, new fx5(hx4Var2, qp2Var3, z2, dh8Var, str, dp2Var, z5, gj8Var.d(new gj8(j, 0L, null, null, 0L, 0, 0L, 16777214)), ty3Var3, sy3Var3, i, i6, wa9Var3, ab5Var, xr7Var), qz0Var), qz0Var, 56);
            z3 = z5;
            ty3Var2 = ty3Var3;
            sy3Var2 = sy3Var3;
            i5 = i6;
            wa9Var2 = wa9Var3;
        } else {
            qz0Var.U();
            z3 = z;
            wa9Var2 = wa9Var;
            ty3Var2 = ty3Var;
            sy3Var2 = sy3Var;
            i5 = i2;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: bx5
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = hs9.W(i3 | 1);
                    gx5.a(str, dp2Var, hx4Var, z3, gj8Var, qp2Var, z2, wa9Var2, ty3Var2, sy3Var2, i, i5, xr7Var, dh8Var, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0591  */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final defpackage.qp2 r41, defpackage.rp2 r42, defpackage.qp2 r43, final defpackage.qp2 r44, final defpackage.qp2 r45, final defpackage.qp2 r46, final defpackage.qp2 r47, final defpackage.lh8 r48, defpackage.jh8 r49, final defpackage.dp2 r50, final androidx.compose.runtime.internal.a r51, defpackage.qp2 r52, final defpackage.wy5 r53, defpackage.qz0 r54, final int r55, final int r56) {
        /*
            Method dump skipped, instruction units count: 1660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx5.b(qp2, rp2, qp2, qp2, qp2, qp2, qp2, lh8, jh8, dp2, androidx.compose.runtime.internal.a, qp2, wy5, qz0, int, int):void");
    }
}
