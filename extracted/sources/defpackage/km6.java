package defpackage;

import androidx.compose.animation.core.c;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class km6 {
    public static final float a = xr0.a;
    public static final i81 b = gz4.b;

    public static final void a(final hx4 hx4Var, final long j, final float f, long j2, int i, final float f2, qz0 qz0Var, final int i2) {
        final long j3;
        final int i3;
        long j4;
        int i4;
        int i5;
        final long j5;
        qz0Var.c0(333154241);
        int i6 = i2 | (qz0Var.f(hx4Var) ? 4 : 2) | (qz0Var.e(j) ? 32 : 16) | (qz0Var.c(f) ? 256 : 128) | 25600;
        if (qz0Var.R(i6 & 1, (74899 & i6) != 74898)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                int i7 = fm6.a;
                j4 = zu0.g;
                i4 = i6 & (-7169);
                i5 = fm6.a;
            } else {
                qz0Var.U();
                i4 = i6 & (-7169);
                j4 = j2;
                i5 = i;
            }
            qz0Var.r();
            final p88 p88Var = new p88(((qj1) qz0Var.j(l.h)).S(f), 0.0f, i5, 0, 26);
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (objM == obj) {
                objM = new c();
                qz0Var.l0(objM);
            }
            c cVar = (c) objM;
            cVar.a(0, qz0Var);
            final jn3 jn3VarH = ja1.h(cVar, 0.0f, 1080.0f, y97.I(y97.e0(6000, 0, az1.c, 2), 0L, 6), qz0Var);
            sm5 sm5Var = new sm5(25);
            zy3 zy3Var = new zy3();
            sm5Var.invoke(zy3Var);
            final jn3 jn3VarH2 = ja1.h(cVar, 0.0f, 360.0f, y97.I(new az3(zy3Var), 0L, 6), qz0Var);
            zy3 zy3Var2 = new zy3();
            zy3Var2.a = 6000;
            zy3Var2.a(Float.valueOf(0.87f), 3000).b = b;
            zy3Var2.a(Float.valueOf(0.1f), 6000);
            final jn3 jn3VarH3 = ja1.h(cVar, 0.1f, 0.87f, y97.I(new az3(zy3Var2), 0L, 6), qz0Var);
            hx4 hx4VarI = b.i(hn7.a(hx4Var, true, new sm5(26)), a);
            boolean zF = qz0Var.f(jn3VarH3) | ((i4 & 896) == 256) | qz0Var.f(jn3VarH) | qz0Var.f(jn3VarH2) | qz0Var.e(j4) | qz0Var.h(p88Var) | ((((i4 & 112) ^ 48) > 32 && qz0Var.e(j)) || (i4 & 48) == 32);
            Object objM2 = qz0Var.M();
            if (zF || objM2 == obj) {
                j5 = j4;
                final int i8 = i5;
                objM2 = new dp2() { // from class: gm6
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj2) throws Throwable {
                        long j6;
                        long j7 = j5;
                        p88 p88Var2 = p88Var;
                        long j8 = j;
                        hv1 hv1Var = (hv1) obj2;
                        float fFloatValue = ((Number) jn3VarH3.getValue()).floatValue() * 360.0f;
                        int i9 = i8;
                        float f3 = f2;
                        if (i9 != 0 && Float.intBitsToFloat((int) (hv1Var.d() & 4294967295L)) <= Float.intBitsToFloat((int) (hv1Var.d() >> 32))) {
                            f3 += f;
                        }
                        float fL = (f3 / ((float) (((double) hv1Var.L(Float.intBitsToFloat((int) (hv1Var.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) jn3VarH2.getValue()).floatValue() + ((Number) jn3VarH.getValue()).floatValue();
                        long jD0 = hv1Var.d0();
                        wv8 wv8VarX = hv1Var.X();
                        long jA = wv8VarX.A();
                        wv8VarX.v().e();
                        try {
                            ((nm5) wv8VarX.b).x(fFloatValue2, jD0);
                            km6.c(hv1Var, Math.min(fFloatValue, fL) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fL) * 2), j7, p88Var2);
                            j6 = jA;
                            try {
                                km6.c(hv1Var, 0.0f, fFloatValue, j8, p88Var2);
                                o40.F(wv8VarX, j6);
                                return tx8.a;
                            } catch (Throwable th) {
                                th = th;
                                o40.F(wv8VarX, j6);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j6 = jA;
                        }
                    }
                };
                qz0Var.l0(objM2);
            } else {
                j5 = j4;
            }
            ml9.c(hx4VarI, (dp2) objM2, qz0Var, 0);
            j3 = j5;
            i3 = i5;
        } else {
            qz0Var.U();
            j3 = j2;
            i3 = i;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(j, f, j3, i3, f2, i2) { // from class: hm6
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;
                public final /* synthetic */ long d;
                public final /* synthetic */ int e;
                public final /* synthetic */ float f;

                @Override // defpackage.qp2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iW = hs9.W(196609);
                    km6.a(this.a, this.b, this.c, this.d, this.e, this.f, (qz0) obj2, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void b(final bp2 bp2Var, hx4 hx4Var, final long j, final float f, final long j2, final int i, final float f2, qz0 qz0Var, final int i2) {
        hx4 hx4Var2;
        int i3;
        qz0Var.c0(-1798883595);
        int i4 = i2 | (qz0Var.h(bp2Var) ? 4 : 2) | (qz0Var.e(j) ? 256 : 128) | (qz0Var.c(f) ? 2048 : 1024) | (qz0Var.e(j2) ? 16384 : 8192) | (qz0Var.d(i) ? 131072 : 65536);
        if (qz0Var.R(i4 & 1, (599187 & i4) != 599186)) {
            qz0Var.W();
            if ((i2 & 1) != 0 && !qz0Var.z()) {
                qz0Var.U();
            }
            qz0Var.r();
            boolean z = (i4 & 14) == 4;
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (z || objM == obj) {
                objM = new uw2(3, bp2Var);
                qz0Var.l0(objM);
            }
            final bp2 bp2Var2 = (bp2) objM;
            final p88 p88Var = new p88(((qj1) qz0Var.j(l.h)).S(f), 0.0f, i, 0, 26);
            boolean zF = qz0Var.f(bp2Var2);
            Object objM2 = qz0Var.M();
            if (zF || objM2 == obj) {
                objM2 = new tu1(3, bp2Var2);
                qz0Var.l0(objM2);
            }
            hx4Var2 = hx4Var;
            hx4 hx4VarI = b.i(hn7.a(hx4Var2, true, (dp2) objM2), a);
            boolean zF2 = ((i4 & 458752) == 131072) | qz0Var.f(bp2Var2) | ((i4 & 7168) == 2048) | ((((57344 & i4) ^ 24576) > 16384 && qz0Var.e(j2)) || (i4 & 24576) == 16384) | qz0Var.h(p88Var) | ((((i4 & 896) ^ 384) > 256 && qz0Var.e(j)) || (i4 & 384) == 256);
            Object objM3 = qz0Var.M();
            if (zF2 || objM3 == obj) {
                i3 = 0;
                Object obj2 = new dp2() { // from class: im6
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj3) {
                        hv1 hv1Var = (hv1) obj3;
                        float fFloatValue = ((Number) bp2Var2.invoke()).floatValue() * 360.0f;
                        int i5 = i;
                        float f3 = f2;
                        if (i5 != 0 && Float.intBitsToFloat((int) (hv1Var.d() & 4294967295L)) <= Float.intBitsToFloat((int) (hv1Var.d() >> 32))) {
                            f3 += f;
                        }
                        float fL = (f3 / ((float) (((double) hv1Var.L(Float.intBitsToFloat((int) (hv1Var.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fMin = Math.min(fFloatValue, fL) + 270.0f + fFloatValue;
                        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fL) * 2);
                        long j3 = j2;
                        p88 p88Var2 = p88Var;
                        km6.c(hv1Var, fMin, fMin2, j3, p88Var2);
                        km6.c(hv1Var, 270.0f, fFloatValue, j, p88Var2);
                        return tx8.a;
                    }
                };
                qz0Var.l0(obj2);
                objM3 = obj2;
            } else {
                i3 = 0;
            }
            ml9.c(hx4VarI, (dp2) objM3, qz0Var, i3);
        } else {
            hx4Var2 = hx4Var;
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            final hx4 hx4Var3 = hx4Var2;
            my6VarS.d = new qp2(hx4Var3, j, f, j2, i, f2, i2) { // from class: jm6
                public final /* synthetic */ hx4 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ float d;
                public final /* synthetic */ long e;
                public final /* synthetic */ int f;
                public final /* synthetic */ float g;

                @Override // defpackage.qp2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iW = hs9.W(1572913);
                    km6.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (qz0) obj3, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void c(hv1 hv1Var, float f, float f2, long j, p88 p88Var) {
        float f3 = 2;
        float f4 = p88Var.a / f3;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (hv1Var.d() >> 32)) - (f3 * f4);
        hv1Var.A(j, f, f2, false, (((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (832 & 128) != 0 ? dc2.a : p88Var);
    }
}
