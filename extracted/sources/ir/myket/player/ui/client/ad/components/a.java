package ir.myket.player.ui.client.ad.components;

import android.content.Context;
import androidx.compose.animation.j;
import androidx.compose.foundation.f;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.c;
import androidx.compose.runtime.g;
import androidx.compose.runtime.i;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import defpackage.ab5;
import defpackage.av;
import defpackage.aw8;
import defpackage.az1;
import defpackage.b47;
import defpackage.bb7;
import defpackage.bg0;
import defpackage.bp2;
import defpackage.cb7;
import defpackage.cc7;
import defpackage.cl4;
import defpackage.db;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.eq;
import defpackage.ex4;
import defpackage.f8;
import defpackage.f88;
import defpackage.fa;
import defpackage.fv;
import defpackage.g8;
import defpackage.gj8;
import defpackage.h8;
import defpackage.hb;
import defpackage.hq6;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.i8;
import defpackage.ia7;
import defpackage.ix4;
import defpackage.j56;
import defpackage.js3;
import defpackage.jv;
import defpackage.jz0;
import defpackage.ka7;
import defpackage.km6;
import defpackage.la7;
import defpackage.ln2;
import defpackage.m8;
import defpackage.mi8;
import defpackage.ml9;
import defpackage.my6;
import defpackage.n08;
import defpackage.o38;
import defpackage.o40;
import defpackage.ok4;
import defpackage.p08;
import defpackage.p41;
import defpackage.pc8;
import defpackage.pk;
import defpackage.qm3;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.r97;
import defpackage.rq4;
import defpackage.s7;
import defpackage.sb;
import defpackage.tj8;
import defpackage.tv0;
import defpackage.tx8;
import defpackage.u48;
import defpackage.u58;
import defpackage.uj8;
import defpackage.vs6;
import defpackage.vv0;
import defpackage.vy2;
import defpackage.w61;
import defpackage.w8;
import defpackage.wb5;
import defpackage.wf5;
import defpackage.x2;
import defpackage.x5;
import defpackage.xa7;
import defpackage.y97;
import defpackage.yh0;
import defpackage.z27;
import defpackage.zk8;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.myket.player.ui.client.ad.components.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(i8 i8Var, qz0 qz0Var, int i) {
        js3.p(i8Var, "adAppInfo");
        qz0Var.c0(2014064698);
        int i2 = (qz0Var.h(i8Var) ? 4 : 2) | i;
        if (qz0Var.R(i2 & 1, (i2 & 3) != 2)) {
            Object obj = (Context) qz0Var.j(e.b);
            m8 m8Var = i8Var.b;
            Object objM = qz0Var.M();
            Object obj2 = jz0.a;
            if (objM == obj2) {
                objM = g.h(Boolean.TRUE);
                qz0Var.l0(objM);
            }
            wb5 wb5Var = (wb5) objM;
            Integer num = i8Var.a;
            if (num == null || num.intValue() <= 0) {
                num = null;
            }
            if (num == null) {
                qz0Var.a0(308522027);
            } else {
                qz0Var.a0(308522028);
                int iIntValue = num.intValue();
                boolean zD = qz0Var.d(iIntValue);
                Object objM2 = qz0Var.M();
                if (zD || objM2 == obj2) {
                    objM2 = new AdAppBannerComponentKt$AdAppBannerComponent$2$1$1(iIntValue, wb5Var, null);
                    qz0Var.l0(objM2);
                }
                zk8.h(qz0Var, (qp2) objM2, tx8.a);
            }
            qz0Var.q(false);
            Object objM3 = qz0Var.M();
            if (objM3 == obj2) {
                objM3 = o40.r(qz0Var);
            }
            ab5 ab5Var = (ab5) objM3;
            boolean zH = qz0Var.h(obj) | qz0Var.h(m8Var);
            Object objM4 = qz0Var.M();
            if (zH || objM4 == obj2) {
                objM4 = new f8(obj, m8Var, wb5Var, 0);
                qz0Var.l0(objM4);
            }
            hx4 hx4VarA = f.a(ex4.b, ab5Var, null, false, null, (bp2) objM4, 28);
            cb7 cb7VarA = bb7.a(jv.a, eq.m, qz0Var, 48);
            long j = qz0Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = b.c(qz0Var, hx4VarA);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, cb7VarA);
            ia7.o(qz0Var, d.e, j56VarL);
            ia7.g(qz0Var, Integer.valueOf(i3), d.g);
            ia7.n(qz0Var, d.h);
            ia7.o(qz0Var, d.d, hx4VarC);
            f(m8Var, ((Boolean) wb5Var.getValue()).booleanValue(), qz0Var, 0);
            androidx.compose.animation.f.d(!((Boolean) wb5Var.getValue()).booleanValue(), null, j.d(y97.e0(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, null, 4), 2), j.e(y97.e0(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, 0, null, 6), 2), null, vy2.b, qz0Var, 1600518, 18);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new g8(i, 0, i8Var);
        }
    }

    public static final void b(hx4 hx4Var, int i, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        androidx.compose.animation.core.a aVar;
        n08 n08Var;
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(-2066102705);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var2.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var2.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var2.h(dp2Var) ? 256 : 128;
        }
        if (qz0Var2.R(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) qz0Var2.j(e.b);
            Object objM = qz0Var2.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = g.e(i);
                qz0Var2.l0(objM);
            }
            n08 n08Var2 = (n08) objM;
            Object objM2 = qz0Var2.M();
            if (objM2 == avVar) {
                objM2 = dt2.a(0.0f);
                qz0Var2.l0(objM2);
            }
            androidx.compose.animation.core.a aVar2 = (androidx.compose.animation.core.a) objM2;
            Integer numValueOf = Integer.valueOf(i);
            boolean zH = ((i3 & 896) == 256) | ((i3 & 112) == 32) | qz0Var2.h(aVar2);
            Object objM3 = qz0Var2.M();
            if (zH || objM3 == avVar) {
                aVar = aVar2;
                AdEndCardTimerKt$AdEndCardTimer$2$1 adEndCardTimerKt$AdEndCardTimer$2$1 = new AdEndCardTimerKt$AdEndCardTimer$2$1(aVar, i, dp2Var, n08Var2, null);
                n08Var = n08Var2;
                qz0Var2.l0(adEndCardTimerKt$AdEndCardTimer$2$1);
                objM3 = adEndCardTimerKt$AdEndCardTimer$2$1;
            } else {
                n08Var = n08Var2;
                aVar = aVar2;
            }
            zk8.h(qz0Var2, (qp2) objM3, numValueOf);
            hx4 hx4VarI = androidx.compose.foundation.layout.b.i(hx4Var, ml9.q(hq6.ad_end_card_timer_size, qz0Var2));
            u58 u58Var = uj8.a;
            Object objJ = qz0Var2.j(u58Var);
            js3.m(objJ);
            hx4 hx4VarF = rq4.f(hx4VarI, ((tj8) objJ).E, la7.a);
            cl4 cl4VarD = bg0.d(eq.g, false);
            long j = qz0Var2.T;
            int i4 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = b.c(qz0Var2, hx4VarF);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, cl4VarD);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i4), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC);
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            Object objJ2 = qz0Var2.j(u58Var);
            js3.m(objJ2);
            long j2 = ((tj8) objJ2).I.e;
            Object objJ3 = qz0Var2.j(u58Var);
            js3.m(objJ3);
            long j3 = ((tj8) objJ3).j;
            float fQ = ml9.q(hq6.size_2, qz0Var2);
            float f = 0;
            boolean zH2 = qz0Var2.h(aVar);
            Object objM4 = qz0Var2.M();
            if (zH2 || objM4 == avVar) {
                objM4 = new x2(1, aVar);
                qz0Var2.l0(objM4);
            }
            km6.b((bp2) objM4, fillElement, j2, fQ, j3, 0, f, qz0Var2, 1572912);
            String strF = xa7.f(context, String.valueOf(n08Var.h()));
            gj8 gj8Var = ((wf5) qz0Var2.j(aw8.a)).l;
            Object objJ4 = qz0Var2.j(u58Var);
            js3.m(objJ4);
            mi8.b(strF, null, ((tj8) objJ4).j, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var, qz0Var, 0, 0, 131066);
            qz0Var2 = qz0Var;
            qz0Var2.q(true);
        } else {
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new fa(i, i2, dp2Var, hx4Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    public static final void c(final hx4 hx4Var, final db dbVar, final bp2 bp2Var, final long j, qz0 qz0Var, final int i) {
        qz0 qz0Var2;
        char c;
        ex4 ex4Var;
        u48 u48Var;
        ?? r3;
        qz0 qz0Var3;
        qz0 qz0Var4;
        qz0 qz0Var5 = qz0Var;
        js3.p(dbVar, "adProgressBarConfig");
        String str = dbVar.c;
        js3.p(bp2Var, "currentPlaybackTimeMs");
        qz0Var5.c0(1937374602);
        int i2 = i | (qz0Var5.f(hx4Var) ? 4 : 2) | (qz0Var5.h(dbVar) ? 32 : 16) | (qz0Var5.h(bp2Var) ? 256 : 128) | (qz0Var5.e(j) ? 2048 : 1024);
        if (qz0Var5.R(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) qz0Var5.j(e.b);
            Object objM = qz0Var5.M();
            Object obj = jz0.a;
            if (objM == obj) {
                objM = g.f(0L);
                qz0Var5.l0(objM);
            }
            p08 p08Var = (p08) objM;
            float fS = 0.0f;
            if (j > 0) {
                c = ' ';
                fS = ok4.s(p08Var.h() / j, 0.0f, 1.0f);
            } else {
                c = ' ';
            }
            float f = fS;
            u48 u48VarB = androidx.compose.animation.core.b.b(f, y97.e0(500, 0, az1.c, 2), "AdProgress", null, qz0Var5, 3072, 20);
            boolean zC = qz0Var5.c(f) | ((i2 & 896) == 256);
            Object objM2 = qz0Var5.M();
            if (zC || objM2 == obj) {
                objM2 = new AdProgressBarKt$AdProgressBar$1$1(f, p08Var, bp2Var, null);
                qz0Var5.l0(objM2);
            }
            zk8.h(qz0Var5, (qp2) objM2, bp2Var);
            fv fvVar = jv.a;
            vv0 vv0VarA = tv0.a(jv.g(ml9.q(hq6.space_8, qz0Var5)), eq.o, qz0Var5, 0);
            long j2 = qz0Var5.T;
            int i3 = (int) (j2 ^ (j2 >>> c));
            j56 j56VarL = qz0Var5.l();
            hx4 hx4VarC = b.c(qz0Var5, hx4Var);
            hz0.d0.getClass();
            bp2 bp2Var2 = d.b;
            qz0Var5.e0();
            if (qz0Var5.S) {
                qz0Var5.k(bp2Var2);
            } else {
                qz0Var5.o0();
            }
            qp2 qp2Var = d.f;
            ia7.o(qz0Var5, qp2Var, vv0VarA);
            qp2 qp2Var2 = d.e;
            ia7.o(qz0Var5, qp2Var2, j56VarL);
            Integer numValueOf = Integer.valueOf(i3);
            qp2 qp2Var3 = d.g;
            ia7.g(qz0Var5, numValueOf, qp2Var3);
            dp2 dp2Var = d.h;
            ia7.n(qz0Var5, dp2Var);
            qp2 qp2Var4 = d.d;
            ia7.o(qz0Var5, qp2Var4, hx4VarC);
            cb7 cb7VarA = bb7.a(jv.g(ml9.q(hq6.space_8, qz0Var5)), eq.m, qz0Var5, 48);
            long j3 = qz0Var5.T;
            int i4 = (int) (j3 ^ (j3 >>> c));
            j56 j56VarL2 = qz0Var5.l();
            ex4 ex4Var2 = ex4.b;
            hx4 hx4VarC2 = b.c(qz0Var5, ex4Var2);
            qz0Var5.e0();
            if (qz0Var5.S) {
                qz0Var5.k(bp2Var2);
            } else {
                qz0Var5.o0();
            }
            ia7.o(qz0Var5, qp2Var, cb7VarA);
            ia7.o(qz0Var5, qp2Var2, j56VarL2);
            ia7.g(qz0Var5, Integer.valueOf(i4), qp2Var3);
            ia7.n(qz0Var5, dp2Var);
            ia7.o(qz0Var5, qp2Var4, hx4VarC2);
            if (dbVar.b) {
                qz0Var5.a0(24242874);
                int i5 = vs6.player_placeholder_seconds;
                int iV = b47.v(j - p08Var.h());
                if (iV < 0) {
                    iV = 0;
                }
                String strF = xa7.f(context, ln2.g(i5, new Object[]{Integer.valueOf(iV)}, qz0Var5));
                gj8 gj8Var = ((wf5) qz0Var5.j(aw8.a)).i;
                i iVar = uj8.a;
                Object objJ = qz0Var5.j(iVar);
                js3.m(objJ);
                long j4 = ((tj8) objJ).j;
                ex4Var = ex4Var2;
                u48Var = u48VarB;
                r3 = 0;
                mi8.b(strF, null, j4, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var, qz0Var, 0, 0, 131066);
                qz0 qz0Var6 = qz0Var;
                if (str == null || f88.n0(str)) {
                    qz0Var6.a0(21132210);
                } else {
                    qz0Var6.a0(24613665);
                    hx4 hx4VarI = androidx.compose.foundation.layout.b.i(ex4Var, ml9.q(hq6.size_2, qz0Var6));
                    Object objJ2 = qz0Var6.j(iVar);
                    js3.m(objJ2);
                    z27.a(qz0Var6, rq4.f(hx4VarI, ((tj8) objJ2).j, la7.a));
                }
                qz0Var6.q(false);
                qz0Var3 = qz0Var6;
            } else {
                ex4Var = ex4Var2;
                u48Var = u48VarB;
                r3 = 0;
                qz0Var5.a0(21132210);
                qz0Var3 = qz0Var5;
            }
            qz0Var3.q(r3);
            qz0Var3.a0(-137743026);
            String str2 = str == null ? "" : str;
            gj8 gj8Var2 = ((wf5) qz0Var3.j(aw8.a)).i;
            u58 u58Var = uj8.a;
            Object objJ3 = qz0Var3.j(u58Var);
            js3.m(objJ3);
            mi8.b(str2, null, ((tj8) objJ3).j, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var2, qz0Var, 0, 0, 131066);
            qz0 qz0Var7 = qz0Var;
            qz0Var7.q(r3);
            qz0Var7.q(true);
            if (dbVar.a) {
                qz0Var7.a0(-701691793);
                boolean zF = qz0Var7.f(u48Var);
                Object objM3 = qz0Var7.M();
                if (zF || objM3 == obj) {
                    objM3 = new hb(u48Var, r3);
                    qz0Var7.l0(objM3);
                }
                Object objJ4 = qz0Var7.j(u58Var);
                js3.m(objJ4);
                long j5 = ((tj8) objJ4).I.d;
                Object objJ5 = qz0Var7.j(u58Var);
                js3.m(objJ5);
                d((bp2) objM3, j5, ((tj8) objJ5).j, ml9.q(hq6.progress_bar_thickness, qz0Var7), qz0Var7, 0);
                qz0 qz0Var8 = qz0Var7;
                qz0Var8.q(r3);
                qz0Var4 = qz0Var8;
            } else {
                qz0Var7.a0(-701438337);
                z27.a(qz0Var7, androidx.compose.foundation.layout.b.d(ex4Var, ml9.q(hq6.size_4, qz0Var7)));
                qz0Var7.q(r3);
                qz0Var4 = qz0Var7;
            }
            qz0Var4.q(true);
            qz0Var2 = qz0Var4;
        } else {
            qz0Var5.U();
            qz0Var2 = qz0Var5;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(dbVar, bp2Var, j, i) { // from class: ib
                public final /* synthetic */ db b;
                public final /* synthetic */ bp2 c;
                public final /* synthetic */ long d;

                @Override // defpackage.qp2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iW = hs9.W(1);
                    a.c(this.a, this.b, this.c, this.d, (qz0) obj2, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void d(final bp2 bp2Var, final long j, final long j2, final float f, qz0 qz0Var, final int i) {
        qz0Var.c0(-1150358721);
        int i2 = i | (qz0Var.h(bp2Var) ? 4 : 2) | (qz0Var.e(j) ? 32 : 16) | (qz0Var.e(j2) ? 256 : 128) | (qz0Var.c(f) ? 2048 : 1024);
        if (qz0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            float f2 = f / 2;
            hx4 hx4VarD = yh0.D(androidx.compose.foundation.layout.b.c(ex4.b, 1.0f), f2, 0.0f, f2, f2, 2);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objM = qz0Var.M();
            if (z || objM == jz0.a) {
                dp2 dp2Var = new dp2() { // from class: jb
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        hv1 hv1Var = (hv1) obj;
                        js3.p(hv1Var, "$this$Canvas");
                        float fFloatValue = ((Number) bp2Var.invoke()).floatValue();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (hv1Var.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (hv1Var.d() & 4294967295L)) / 2;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                        float f3 = f;
                        hv1Var.y(j, jFloatToRawIntBits, jFloatToRawIntBits2, hv1Var.S(f3), (496 & 16) != 0 ? 0 : 1);
                        hv1Var.y(j2, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fFloatValue * fIntBitsToFloat) << 32), hv1Var.S(f3), (496 & 16) != 0 ? 0 : 1);
                        return tx8.a;
                    }
                };
                qz0Var.l0(dp2Var);
                objM = dp2Var;
            }
            ml9.c(hx4VarD, (dp2) objM, qz0Var, 0);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(j, j2, f, i) { // from class: kb
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ float d;

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = hs9.W(1);
                    a.d(this.a, this.b, this.c, this.d, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void e(hx4 hx4Var, int i, int i2, String str, bp2 bp2Var, bp2 bp2Var2, qz0 qz0Var, int i3) {
        int i4;
        Integer num;
        wb5 wb5Var;
        Integer num2;
        Context context;
        wb5 wb5Var2;
        Object obj;
        js3.p(str, "moviePosterUrl");
        js3.p(bp2Var, "currentPlaybackTimeSec");
        qz0Var.c0(516083334);
        int i5 = i3 | 6 | (qz0Var.d(i) ? 32 : 16) | (qz0Var.d(i2) ? 256 : 128) | (qz0Var.f(str) ? 2048 : 1024) | (qz0Var.h(bp2Var) ? 16384 : 8192) | (qz0Var.h(bp2Var2) ? 131072 : 65536);
        if (qz0Var.R(i5 & 1, (74899 & i5) != 74898)) {
            Context context2 = (Context) qz0Var.j(e.b);
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = o40.r(qz0Var);
            }
            ab5 ab5Var = (ab5) objM;
            Object objM2 = qz0Var.M();
            if (objM2 == avVar) {
                Integer numValueOf = Integer.valueOf(i2);
                if (i2 <= 0) {
                    numValueOf = null;
                }
                objM2 = g.e(numValueOf != null ? numValueOf.intValue() : i);
                qz0Var.l0(objM2);
            }
            n08 n08Var = (n08) objM2;
            Object objM3 = qz0Var.M();
            if (objM3 == avVar) {
                objM3 = g.e(n08Var.h());
                qz0Var.l0(objM3);
            }
            n08 n08Var2 = (n08) objM3;
            Object objM4 = qz0Var.M();
            if (objM4 == avVar) {
                objM4 = g.h(Boolean.FALSE);
                qz0Var.l0(objM4);
            }
            wb5 wb5Var3 = (wb5) objM4;
            Object objM5 = qz0Var.M();
            if (objM5 == avVar) {
                objM5 = g.h("");
                qz0Var.l0(objM5);
            }
            wb5 wb5Var4 = (wb5) objM5;
            Integer numValueOf2 = Integer.valueOf(i);
            Integer numValueOf3 = Integer.valueOf(i2);
            boolean zH = ((i5 & 57344) == 16384) | qz0Var.h(context2);
            Object objM6 = qz0Var.M();
            if (zH || objM6 == avVar) {
                i4 = i5;
                num = numValueOf3;
                wb5Var = wb5Var4;
                num2 = numValueOf2;
                context = context2;
                wb5Var2 = wb5Var3;
                AdSkipButtonKt$AdSkipButton$2$1 adSkipButtonKt$AdSkipButton$2$1 = new AdSkipButtonKt$AdSkipButton$2$1(n08Var2, bp2Var, wb5Var, context, n08Var, wb5Var2, null);
                obj = bp2Var;
                qz0Var.l0(adSkipButtonKt$AdSkipButton$2$1);
                objM6 = adSkipButtonKt$AdSkipButton$2$1;
            } else {
                wb5Var2 = wb5Var3;
                i4 = i5;
                wb5Var = wb5Var4;
                num = numValueOf3;
                num2 = numValueOf2;
                context = context2;
                obj = bp2Var;
            }
            qp2 qp2Var = (qp2) objM6;
            w61 w61Var = qz0Var.R;
            boolean zF = qz0Var.f(num2) | qz0Var.f(num) | qz0Var.f(obj);
            Object objM7 = qz0Var.M();
            if (zF || objM7 == avVar) {
                objM7 = new c(w61Var, qp2Var);
                qz0Var.l0(objM7);
            }
            ka7 ka7VarA = la7.a(ml9.q(hq6.radius_8, qz0Var));
            ex4 ex4Var = ex4.b;
            hx4 hx4VarD = androidx.compose.foundation.layout.b.d(zk8.s(ex4Var, ka7VarA), ml9.q(hq6.ad_skip_button_height, qz0Var));
            u58 u58Var = uj8.a;
            Object objJ = qz0Var.j(u58Var);
            js3.m(objJ);
            hx4Var = ex4Var;
            hx4 hx4VarA = qm3.a(hx4VarD, ab5Var, r97.a(0.0f, 3, ((tj8) objJ).z));
            ka7 ka7VarA2 = la7.a(ml9.q(hq6.radius_8, qz0Var));
            Object objJ2 = qz0Var.j(u58Var);
            js3.m(objJ2);
            pc8.b(bp2Var2, hx4VarA, ((Boolean) wb5Var2.getValue()).booleanValue(), ka7VarA2, ((tj8) objJ2).E, 0L, 0.0f, null, ab5Var, s7.X(-355000293, new w8(wb5Var, context, str, 2), qz0Var), qz0Var, ((i4 >> 15) & 14) | 805306368, 480);
        } else {
            qz0Var.U();
        }
        hx4 hx4Var2 = hx4Var;
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new sb(hx4Var2, i, i2, str, bp2Var, bp2Var2, i3);
        }
    }

    public static final void f(m8 m8Var, boolean z, qz0 qz0Var, int i) {
        boolean z2;
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(1899107972);
        int i2 = (qz0Var2.h(m8Var) ? 4 : 2) | i | (qz0Var2.g(z) ? 32 : 16);
        int i3 = 1;
        int i4 = 0;
        if (qz0Var2.R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) qz0Var2.j(e.b);
            o38 o38VarC0 = y97.c0(0.0f, z ? 4000.0f : 8000.0f, null, 5);
            ex4 ex4Var = ex4.b;
            hx4 hx4VarA = pk.a(ex4Var, o38VarC0, null, 2);
            Object objJ = qz0Var2.j(uj8.a);
            js3.m(objJ);
            hx4 hx4VarZ = yh0.z(rq4.f(hx4VarA, ((tj8) objJ).E, la7.a(ml9.q(hq6.radius_8, qz0Var2))), ml9.q(hq6.space_8, qz0Var2));
            cb7 cb7VarA = bb7.a(jv.a, eq.m, qz0Var2, 48);
            long j = qz0Var2.T;
            int i5 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = b.c(qz0Var2, hx4VarZ);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, cb7VarA);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i5), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC);
            hx4 hx4VarA2 = pk.a(ex4Var, null, null, 3);
            hx4 hx4VarP = androidx.compose.foundation.layout.b.p();
            hx4 hx4VarL = androidx.compose.foundation.layout.b.l(ex4Var, 0);
            int i6 = ix4.a;
            js3.p(hx4VarA2, "<this>");
            js3.p(hx4VarP, "ifTrueModifier");
            js3.p(hx4VarL, "ifFalseModifier");
            if (!z) {
                hx4VarP = hx4VarL;
            }
            androidx.compose.animation.f.d(z, hx4VarA2.d(hx4VarP), j.d(y97.e0(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, 0, null, 6), 2), j.e(y97.e0(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, 0, null, 6), 2), null, s7.X(-1947681080, new x5(context, m8Var, i3), qz0Var2), qz0Var, 1600518 | (i2 & 112), 16);
            z2 = z;
            qz0Var2 = qz0Var;
            cc7.a(m8Var.d, ix4.c(qz0Var2, zk8.s(androidx.compose.foundation.layout.b.i(ex4Var, ml9.q(hq6.ad_app_banner_icon_size, qz0Var2)), la7.a(ml9.q(hq6.radius_4, qz0Var2)))), p41.a, null, qz0Var2, 1572912, 1976);
            qz0Var2.q(true);
        } else {
            z2 = z;
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new h8(m8Var, z2, i, i4);
        }
    }
}
