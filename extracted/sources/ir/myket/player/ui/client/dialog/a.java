package ir.myket.player.ui.client.dialog;

import android.content.Context;
import androidx.compose.foundation.f;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.g;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.platform.o;
import defpackage.av;
import defpackage.bg0;
import defpackage.bi0;
import defpackage.bp2;
import defpackage.ca;
import defpackage.cf6;
import defpackage.ci0;
import defpackage.cl4;
import defpackage.dp2;
import defpackage.eq;
import defpackage.ex4;
import defpackage.fv;
import defpackage.g39;
import defpackage.hq6;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j56;
import defpackage.js3;
import defpackage.jv;
import defpackage.jz0;
import defpackage.ka7;
import defpackage.la7;
import defpackage.ln2;
import defpackage.mi8;
import defpackage.ml9;
import defpackage.my6;
import defpackage.ng0;
import defpackage.of8;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rq4;
import defpackage.s7;
import defpackage.tv0;
import defpackage.uc7;
import defpackage.v8;
import defpackage.vc7;
import defpackage.vs6;
import defpackage.vv0;
import defpackage.wb5;
import defpackage.wu8;
import defpackage.wy5;
import defpackage.xq2;
import defpackage.yh0;
import defpackage.zk8;
import ir.myket.movie.common.domain.models.SampleWatch;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(hx4 hx4Var, cf6 cf6Var, bp2 bp2Var, qz0 qz0Var, int i) {
        hx4 hx4Var2;
        qz0 qz0Var2 = qz0Var;
        js3.p(cf6Var, "subscriptionDialogNavKey");
        qz0Var2.c0(1497390247);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? qz0Var2.f(cf6Var) : qz0Var2.h(cf6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var2.h(bp2Var) ? 256 : 128;
        }
        if (qz0Var2.R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) qz0Var2.j(e.b);
            SampleWatch sampleWatch = cf6Var.a;
            Object objM = qz0Var2.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = g.h(Boolean.FALSE);
                qz0Var2.l0(objM);
            }
            wb5 wb5Var = (wb5) objM;
            Boolean bool = (Boolean) wb5Var.getValue();
            bool.booleanValue();
            boolean z = (i2 & 896) == 256;
            Object objM2 = qz0Var2.M();
            if (z || objM2 == avVar) {
                objM2 = new SubscriptionDialogKt$SubscriptionDialog$2$1(bp2Var, wb5Var, null);
                qz0Var2.l0(objM2);
            }
            zk8.h(qz0Var2, (qp2) objM2, bool);
            boolean z2 = !((Boolean) wb5Var.getValue()).booleanValue();
            Object objM3 = qz0Var2.M();
            if (objM3 == avVar) {
                objM3 = new v8(wb5Var, 9);
                qz0Var2.l0(objM3);
            }
            xq2.b(z2, (bp2) objM3, qz0Var2, 48, 0);
            hx4 hx4VarD = ml9.D(yh0.D(b.c, ml9.q(hq6.center_dialog_horizontal_margin, qz0Var2), 0.0f, ml9.q(hq6.center_dialog_horizontal_margin, qz0Var2), ml9.q(hq6.bottom_dialog_margin, qz0Var2), 2), o.a, new g39(7));
            Object objM4 = qz0Var2.M();
            if (objM4 == avVar) {
                objM4 = new v8(wb5Var, 10);
                qz0Var2.l0(objM4);
            }
            hx4 hx4VarA = f.a(hx4VarD, null, null, false, null, (bp2) objM4, 28);
            cl4 cl4VarD = bg0.d(eq.c, false);
            long j = qz0Var2.T;
            int i3 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarA);
            hz0.d0.getClass();
            bp2 bp2Var2 = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var2);
            } else {
                qz0Var2.o0();
            }
            qp2 qp2Var = d.f;
            ia7.o(qz0Var2, qp2Var, cl4VarD);
            qp2 qp2Var2 = d.e;
            ia7.o(qz0Var2, qp2Var2, j56VarL);
            Integer numValueOf = Integer.valueOf(i3);
            qp2 qp2Var3 = d.g;
            ia7.g(qz0Var2, numValueOf, qp2Var3);
            dp2 dp2Var = d.h;
            ia7.n(qz0Var2, dp2Var);
            qp2 qp2Var4 = d.d;
            ia7.o(qz0Var2, qp2Var4, hx4VarC);
            float fQ = ml9.q(hq6.bottom_sheet_max_width, qz0Var2);
            ex4 ex4Var = ex4.b;
            hx4 hx4VarA2 = yh0.A(ng0.a.a(rq4.f(b.m(ex4Var, fQ), wu8.x(qz0Var2).i, la7.a(ml9.q(hq6.radius_8, qz0Var2))), eq.j), ml9.q(hq6.space_16, qz0Var2), ml9.q(hq6.space_24, qz0Var2));
            fv fvVar = jv.a;
            vv0 vv0VarA = tv0.a(jv.g(ml9.q(hq6.space_16, qz0Var2)), eq.o, qz0Var2, 0);
            long j2 = qz0Var2.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL2 = qz0Var2.l();
            hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var2, hx4VarA2);
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var2);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, qp2Var, vv0VarA);
            ia7.o(qz0Var2, qp2Var2, j56VarL2);
            ia7.g(qz0Var2, Integer.valueOf(i4), qp2Var3);
            ia7.n(qz0Var2, dp2Var);
            ia7.o(qz0Var2, qp2Var4, hx4VarC2);
            hx4Var2 = ex4Var;
            mi8.b(sampleWatch.c, null, wu8.x(qz0Var2).j, 0L, 0L, null, 0L, 0, false, 0, 0, wu8.y(qz0Var2).c, qz0Var, 0, 0, 131066);
            String strF = sampleWatch.d;
            if (strF == null) {
                qz0Var.a0(22505986);
                strF = ln2.f(vs6.player_subscription_dialog_description, qz0Var);
                qz0Var.q(false);
            } else {
                qz0Var.a0(22504808);
                qz0Var.q(false);
            }
            mi8.b(strF, null, wu8.x(qz0Var).k, 0L, 0L, new of8(5), 0L, 0, false, 0, 0, wu8.y(qz0Var).f, qz0Var, 0, 0, 130042);
            wy5 wy5Var = ci0.a;
            bi0 bi0VarA = ci0.a(wu8.x(qz0Var).g, wu8.x(qz0Var).h, 0L, 0L, qz0Var, 12);
            ka7 ka7VarA = la7.a(ml9.q(hq6.radius_4, qz0Var));
            hx4 hx4VarC3 = b.c(hx4Var2, 1.0f);
            float fQ2 = ml9.q(hq6.space_8, qz0Var);
            float fQ3 = ml9.q(hq6.space_4, qz0Var);
            wy5 wy5Var2 = new wy5(fQ3, fQ2, fQ3, fQ2);
            boolean zH = qz0Var.h(context) | qz0Var.h(sampleWatch);
            Object objM5 = qz0Var.M();
            if (zH || objM5 == avVar) {
                objM5 = new uc7(context, sampleWatch, 2);
                qz0Var.l0(objM5);
            }
            androidx.compose.material3.a.a((bp2) objM5, hx4VarC3, false, ka7VarA, bi0VarA, null, null, wy5Var2, s7.X(-171748461, new vc7(sampleWatch, 2), qz0Var), qz0Var, 805306416, 356);
            qz0Var2 = qz0Var;
            qz0Var2.q(true);
            qz0Var2.q(true);
        } else {
            qz0Var2.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(i, 17, hx4Var2, cf6Var, bp2Var);
        }
    }
}
