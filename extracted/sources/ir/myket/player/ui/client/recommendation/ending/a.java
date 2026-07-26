package ir.myket.player.ui.client.recommendation.ending;

import androidx.compose.animation.f;
import androidx.compose.animation.j;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.g;
import androidx.compose.ui.node.d;
import defpackage.ab0;
import defpackage.av;
import defpackage.b22;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.eq;
import defpackage.fv;
import defpackage.fy6;
import defpackage.hq6;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j56;
import defpackage.js3;
import defpackage.jv;
import defpackage.jz0;
import defpackage.ml9;
import defpackage.my6;
import defpackage.og0;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.s7;
import defpackage.tv0;
import defpackage.tx8;
import defpackage.vv0;
import defpackage.wb5;
import defpackage.y97;
import defpackage.yh0;
import defpackage.z5;
import defpackage.zk8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(hx4 hx4Var, fy6 fy6Var, dp2 dp2Var, int i, qz0 qz0Var, int i2) {
        int i3;
        js3.p(fy6Var, "recommendationViewState");
        qz0Var.c0(-495567393);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(fy6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var.d(i) ? 2048 : 1024;
        }
        if (qz0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = g.h(Boolean.FALSE);
                qz0Var.l0(objM);
            }
            wb5 wb5Var = (wb5) objM;
            Object objM2 = qz0Var.M();
            if (objM2 == avVar) {
                objM2 = new EndingRecommendationPaneKt$EndingRecommendationPane$2$1(wb5Var, null);
                qz0Var.l0(objM2);
            }
            zk8.h(qz0Var, (qp2) objM2, tx8.a);
            hx4 hx4VarZ = yh0.z(b.c(ml9.u(hx4Var, -ml9.q(hq6.space_36, qz0Var)), 1.0f), ml9.q(hq6.space_16, qz0Var));
            ab0 ab0Var = eq.p;
            fv fvVar = jv.a;
            vv0 vv0VarA = tv0.a(jv.g(ml9.q(hq6.space_16, qz0Var)), ab0Var, qz0Var, 48);
            long j = qz0Var.T;
            int i4 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4VarZ);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, vv0VarA);
            ia7.o(qz0Var, d.e, j56VarL);
            ia7.g(qz0Var, Integer.valueOf(i4), d.g);
            ia7.n(qz0Var, d.h);
            ia7.o(qz0Var, d.d, hx4VarC);
            f.b(((Boolean) wb5Var.getValue()).booleanValue(), null, j.d(y97.e0(500, 0, null, 6), 2), null, null, s7.X(1717160657, new z5(i, 1), qz0Var), qz0Var, 1575942);
            f.b(((Boolean) wb5Var.getValue()).booleanValue(), null, j.d(y97.e0(500, 0, null, 6), 2).a(j.j(y97.e0(500, 0, null, 6))), null, null, s7.X(-1690845382, new b22(fy6Var, dp2Var, 0), qz0Var), qz0Var, 1575942);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new og0(hx4Var, fy6Var, dp2Var, i, i2, 3);
        }
    }
}
