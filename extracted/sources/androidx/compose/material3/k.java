package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.k;
import androidx.compose.material3.n;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.bn6;
import defpackage.bp2;
import defpackage.c61;
import defpackage.dp2;
import defpackage.e71;
import defpackage.eq;
import defpackage.ex4;
import defpackage.ff0;
import defpackage.g8;
import defpackage.hm5;
import defpackage.hn7;
import defpackage.hx4;
import defpackage.ja1;
import defpackage.jz0;
import defpackage.kd2;
import defpackage.kt;
import defpackage.lb7;
import defpackage.lt8;
import defpackage.mf0;
import defpackage.ml9;
import defpackage.my6;
import defpackage.ng0;
import defpackage.o37;
import defpackage.o87;
import defpackage.pc8;
import defpackage.qj1;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.s08;
import defpackage.s7;
import defpackage.sh;
import defpackage.tw4;
import defpackage.u48;
import defpackage.us3;
import defpackage.uy6;
import defpackage.vy2;
import defpackage.wq2;
import defpackage.wu7;
import defpackage.xr7;
import defpackage.xu7;
import defpackage.yd7;
import defpackage.ys6;
import defpackage.zc8;
import defpackage.zs6;
import defpackage.zu1;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final float a = 48;
    public static final float b = 24;
    public static final long c = lb7.a(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:100:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.bp2 r29, final defpackage.hx4 r30, final androidx.compose.material3.n r31, final float r32, boolean r33, final defpackage.xr7 r34, final long r35, long r37, float r39, long r40, final androidx.compose.runtime.internal.a r42, defpackage.qp2 r43, final defpackage.uw4 r44, final androidx.compose.runtime.internal.a r45, defpackage.qz0 r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.k.a(bp2, hx4, androidx.compose.material3.n, float, boolean, xr7, long, long, float, long, androidx.compose.runtime.internal.a, qp2, uw4, androidx.compose.runtime.internal.a, qz0, int):void");
    }

    public static final void b(final androidx.compose.animation.core.a aVar, final e71 e71Var, final bp2 bp2Var, final dp2 dp2Var, final hx4 hx4Var, final n nVar, final float f, final boolean z, final xr7 xr7Var, final long j, final long j2, final float f2, final androidx.compose.runtime.internal.a aVar2, final qp2 qp2Var, final androidx.compose.runtime.internal.a aVar3, qz0 qz0Var, final int i) {
        hx4 hx4VarA;
        qz0Var.c0(-37400432);
        int i2 = i | (qz0Var.h(aVar) ? 32 : 16) | (qz0Var.h(e71Var) ? 256 : 128) | (qz0Var.h(bp2Var) ? 2048 : 1024) | (qz0Var.h(dp2Var) ? 16384 : 8192) | (qz0Var.f(hx4Var) ? 131072 : 65536) | (qz0Var.f(nVar) ? 1048576 : 524288) | (qz0Var.c(f) ? 8388608 : 4194304) | (qz0Var.g(z) ? 67108864 : 33554432) | (qz0Var.f(xr7Var) ? 536870912 : 268435456);
        int i3 = (qz0Var.e(j) ? 4 : 2) | (qz0Var.e(j2) ? 32 : 16) | (qz0Var.c(f2) ? 256 : 128) | (qz0Var.h(aVar2) ? 2048 : 1024) | (qz0Var.h(qp2Var) ? 16384 : 8192) | (qz0Var.h(aVar3) ? 131072 : 65536);
        boolean z2 = true;
        if (qz0Var.R(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 74899) == 74898) ? false : true)) {
            qz0Var.W();
            if ((i & 1) != 0 && !qz0Var.z()) {
                qz0Var.U();
            }
            qz0Var.r();
            String strG = uy6.g(ys6.m3c_bottom_sheet_pane_title, qz0Var);
            hx4 hx4VarC = androidx.compose.foundation.layout.b.c(androidx.compose.foundation.layout.b.m(ng0.a.a(hx4Var, eq.d), f), 1.0f);
            Object obj = jz0.a;
            if (z) {
                qz0Var.a0(-1582035383);
                boolean z3 = (((i2 & 3670016) ^ 1572864) > 1048576 && qz0Var.f(nVar)) || (i2 & 1572864) == 1048576;
                Object objM = qz0Var.M();
                if (z3 || objM == obj) {
                    Orientation orientation = Orientation.a;
                    lt8 lt8Var = xu7.a;
                    objM = new wu7(nVar, dp2Var);
                    qz0Var.l0(objM);
                }
                hx4VarA = androidx.compose.ui.input.nestedscroll.c.a((hm5) objM, null);
                qz0Var.q(false);
            } else {
                qz0Var.a0(-1582020872);
                qz0Var.q(false);
                hx4VarA = ex4.b;
            }
            hx4 hx4VarD = hx4VarC.d(hx4VarA);
            androidx.compose.material3.internal.d dVar = nVar.d;
            androidx.compose.material3.internal.d dVar2 = nVar.d;
            Orientation orientation2 = Orientation.a;
            int i4 = (i2 & 3670016) ^ 1572864;
            boolean z4 = (i4 > 1048576 && qz0Var.f(nVar)) || (i2 & 1572864) == 1048576;
            Object objM2 = qz0Var.M();
            if (z4 || objM2 == obj) {
                objM2 = new g8(12, nVar);
                qz0Var.l0(objM2);
            }
            hx4 hx4VarB = androidx.compose.material3.internal.b.b(hx4VarD, dVar, (qp2) objM2);
            androidx.compose.material3.internal.c cVar = dVar2.f;
            boolean z5 = z && nVar.d();
            boolean z6 = ((s08) dVar2.k).getValue() != null;
            boolean z7 = (i2 & 57344) == 16384;
            Object objM3 = qz0Var.M();
            if (z7 || objM3 == obj) {
                objM3 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(null, dp2Var);
                qz0Var.l0(objM3);
            }
            hx4 hx4VarD2 = hx4VarB.d(new zu1(cVar, z5, z6, androidx.compose.foundation.gestures.f.a, (rp2) objM3));
            boolean zF = qz0Var.f(strG);
            Object objM4 = qz0Var.M();
            int i5 = 6;
            if (zF || objM4 == obj) {
                objM4 = new kt(strG, i5);
                qz0Var.l0(objM4);
            }
            hx4 hx4VarA2 = hn7.a(hx4VarD2, false, (dp2) objM4);
            int iE = (int) dVar2.e();
            if (iE < 0) {
                iE = 0;
            }
            hx4 hx4VarV = vy2.v(hx4VarA2, new kd2(iE));
            boolean z8 = (i4 > 1048576 && qz0Var.f(nVar)) || (i2 & 1572864) == 1048576;
            if ((i2 & 112) != 32 && !qz0Var.h(aVar)) {
                z2 = false;
            }
            boolean z9 = z8 | z2;
            Object objM5 = qz0Var.M();
            if (z9 || objM5 == obj) {
                objM5 = new defpackage.m(nVar, aVar, 28);
                qz0Var.l0(objM5);
            }
            int i6 = i3 << 6;
            pc8.a(androidx.compose.ui.graphics.d.a(androidx.compose.ui.graphics.d.a(hx4VarV, (dp2) objM5), new mf0(nVar, 0)), xr7Var, j, j2, f2, 0.0f, s7.X(728743275, new tw4(qp2Var, aVar, nVar, aVar2, aVar3, bp2Var, e71Var, z), qz0Var), qz0Var, ((i2 >> 24) & 112) | 12582912 | (i6 & 896) | (i6 & 7168) | (i6 & 57344), 96);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(e71Var, bp2Var, dp2Var, hx4Var, nVar, f, z, xr7Var, j, j2, f2, aVar2, qp2Var, aVar3, i) { // from class: ow4
                public final /* synthetic */ e71 b;
                public final /* synthetic */ bp2 c;
                public final /* synthetic */ dp2 d;
                public final /* synthetic */ hx4 e;
                public final /* synthetic */ n f;
                public final /* synthetic */ float g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ xr7 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ float l;
                public final /* synthetic */ a m;
                public final /* synthetic */ qp2 n;
                public final /* synthetic */ a o;

                @Override // defpackage.qp2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iW = hs9.W(71);
                    k.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (qz0) obj2, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void c(final long j, final bp2 bp2Var, final boolean z, final boolean z2, qz0 qz0Var, final int i) {
        boolean z3;
        hx4 hx4VarA;
        qz0Var.c0(-391613911);
        int i2 = i | (qz0Var.e(j) ? 4 : 2) | (qz0Var.h(bp2Var) ? 32 : 16) | (qz0Var.g(z) ? 256 : 128) | (qz0Var.g(z2) ? 2048 : 1024);
        if (!qz0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            qz0Var.U();
        } else if (j != 16) {
            qz0Var.a0(-1438582326);
            final u48 u48VarB = androidx.compose.animation.core.b.b(z ? 1.0f : 0.0f, ja1.E(MotionSchemeKeyTokens.c, qz0Var), null, null, qz0Var, 0, 28);
            Object objG = uy6.g(zs6.close_sheet, qz0Var);
            Object obj = jz0.a;
            if (z2) {
                qz0Var.a0(-1438283579);
                int i3 = i2 & 112;
                boolean z4 = i3 == 32;
                Object objM = qz0Var.M();
                if (z4 || objM == obj) {
                    objM = new c61(1, bp2Var);
                    qz0Var.l0(objM);
                }
                zc8 zc8Var = new zc8(bp2Var, null, (PointerInputEventHandler) objM, 6);
                boolean zF = (i3 == 32) | qz0Var.f(objG);
                Object objM2 = qz0Var.M();
                if (zF || objM2 == obj) {
                    objM2 = new defpackage.m(objG, bp2Var, 29);
                    qz0Var.l0(objM2);
                }
                z3 = true;
                hx4VarA = hn7.a(zc8Var, true, (dp2) objM2);
                qz0Var.q(false);
            } else {
                z3 = true;
                qz0Var.a0(-1437857391);
                qz0Var.q(false);
                hx4VarA = ex4.b;
            }
            hx4 hx4VarD = androidx.compose.foundation.layout.b.c.d(hx4VarA);
            boolean zF2 = qz0Var.f(u48VarB) | ((i2 & 14) == 4 ? z3 : false);
            Object objM3 = qz0Var.M();
            if (zF2 || objM3 == obj) {
                objM3 = new dp2() { // from class: mw4
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj2) {
                        o40.l((hv1) obj2, j, 0L, ok4.s(((Number) u48VarB.getValue()).floatValue(), 0.0f, 1.0f), 118);
                        return tx8.a;
                    }
                };
                qz0Var.l0(objM3);
            }
            ml9.c(hx4VarD, (dp2) objM3, qz0Var, 0);
            qz0Var.q(false);
        } else {
            qz0Var.a0(-1437676103);
            qz0Var.q(false);
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(j, bp2Var, z, z2, i) { // from class: nw4
                public final /* synthetic */ long a;
                public final /* synthetic */ bp2 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;

                @Override // defpackage.qp2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iW = hs9.W(1);
                    k.c(this.a, this.b, this.c, this.d, (qz0) obj2, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final float d(o87 o87Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (o87Var.n >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (wq2.L(0.0f, Math.min(o87Var.getDensity() * a, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float e(o87 o87Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (o87Var.n & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (wq2.L(0.0f, Math.min(o87Var.getDensity() * b, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final n f(int i, int i2, qz0 qz0Var) {
        final SheetValue sheetValue = SheetValue.a;
        final int i3 = 1;
        final int i4 = 0;
        final boolean z = (i2 & 1) == 0;
        Object objM = qz0Var.M();
        Object obj = jz0.a;
        Object obj2 = objM;
        if (objM == obj) {
            Object us3Var = new us3(14);
            qz0Var.l0(us3Var);
            obj2 = us3Var;
        }
        final dp2 dp2Var = (dp2) obj2;
        int i5 = (i & 14) | 384;
        lt8 lt8Var = xu7.a;
        final float f = ff0.a;
        final float f2 = ff0.b;
        final qj1 qj1Var = (qj1) qz0Var.j(androidx.compose.ui.platform.l.h);
        boolean zF = qz0Var.f(qj1Var) | qz0Var.c(f);
        Object objM2 = qz0Var.M();
        Object obj3 = objM2;
        if (zF || objM2 == obj) {
            Object obj4 = new bp2() { // from class: uu7
                @Override // defpackage.bp2
                public final Object invoke() {
                    float fS;
                    switch (i4) {
                        case 0:
                            fS = qj1Var.S(f);
                            break;
                        default:
                            fS = qj1Var.S(f);
                            break;
                    }
                    return Float.valueOf(fS);
                }
            };
            qz0Var.l0(obj4);
            obj3 = obj4;
        }
        final bp2 bp2Var = (bp2) obj3;
        boolean zF2 = qz0Var.f(qj1Var) | qz0Var.c(f2);
        Object objM3 = qz0Var.M();
        Object obj5 = objM3;
        if (zF2 || objM3 == obj) {
            Object obj6 = new bp2() { // from class: uu7
                @Override // defpackage.bp2
                public final Object invoke() {
                    float fS;
                    switch (i3) {
                        case 0:
                            fS = qj1Var.S(f2);
                            break;
                        default:
                            fS = qj1Var.S(f2);
                            break;
                    }
                    return Float.valueOf(fS);
                }
            };
            qz0Var.l0(obj6);
            obj5 = obj6;
        }
        final bp2 bp2Var2 = (bp2) obj5;
        Object[] objArr = {Boolean.valueOf(z), dp2Var, Boolean.FALSE};
        bn6 bn6Var = new bn6(new yd7(2), new sh(bp2Var, z, dp2Var, bp2Var2), 5);
        if ((((i5 & 14) ^ 6) <= 4 || !qz0Var.g(z)) && (i5 & 6) != 4) {
            i3 = 0;
        }
        int i6 = (qz0Var.f(bp2Var) ? 1 : 0) | i3 | (qz0Var.f(bp2Var2) ? 1 : 0) | (qz0Var.f(dp2Var) ? 1 : 0) | (qz0Var.g(false) ? 1 : 0);
        Object objM4 = qz0Var.M();
        if (i6 != 0 || objM4 == obj) {
            Object obj7 = new bp2() { // from class: vu7
                @Override // defpackage.bp2
                public final Object invoke() {
                    return new n(z, bp2Var, bp2Var2, sheetValue, dp2Var);
                }
            };
            qz0Var.l0(obj7);
            objM4 = obj7;
        }
        return (n) o37.B(objArr, bn6Var, (bp2) objM4, qz0Var, 0);
    }
}
