package androidx.tv.material3;

import defpackage.a24;
import defpackage.bb0;
import defpackage.bb7;
import defpackage.bg0;
import defpackage.bl4;
import defpackage.bp2;
import defpackage.cb7;
import defpackage.eg0;
import defpackage.eq;
import defpackage.ex4;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j56;
import defpackage.js3;
import defpackage.jv;
import defpackage.o40;
import defpackage.ok4;
import defpackage.pn3;
import defpackage.qp2;
import defpackage.qy7;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.t49;
import defpackage.tv0;
import defpackage.tx8;
import defpackage.vv0;
import defpackage.yh0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class ListItemKt$BaseListItem$1 extends Lambda implements rp2 {
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        qz0 qz0Var = (qz0) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && qz0Var.B()) {
            qz0Var.U();
        } else {
            ex4 ex4Var = ex4.b;
            hx4 hx4VarY = yh0.y(androidx.compose.foundation.layout.b.b(ex4Var, 0.0f, 0.0f, 1), null);
            bb0 bb0Var = eq.m;
            qz0Var.b0(693286680);
            cb7 cb7VarA = bb7.a(jv.a, bb0Var, qz0Var, 48);
            qz0Var.b0(-1323940314);
            int iB = ok4.B(qz0Var);
            j56 j56VarL = qz0Var.l();
            hz0.d0.getClass();
            bp2 bp2Var = androidx.compose.ui.node.d.b;
            androidx.compose.runtime.internal.a aVarE = androidx.compose.ui.layout.e.e(hx4VarY);
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            qp2 qp2Var = androidx.compose.ui.node.d.f;
            ia7.o(qz0Var, qp2Var, cb7VarA);
            qp2 qp2Var2 = androidx.compose.ui.node.d.e;
            ia7.o(qz0Var, qp2Var2, j56VarL);
            qp2 qp2Var3 = androidx.compose.ui.node.d.g;
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
                o40.C(iB, qz0Var, iB, qp2Var3);
            }
            aVarE.a(new qy7(qz0Var), qz0Var, 0);
            qz0Var.b0(2058660585);
            qz0Var.b0(25294625);
            qz0Var.q(false);
            if (1.0f <= 0.0d) {
                pn3.a("invalid weight; must be greater than zero");
            }
            hx4 hx4VarG = bl4.g(new a24(1.0f, true), new t49(bb0Var));
            qz0Var.b0(733328855);
            eg0 eg0VarE = bg0.e(eq.c, false, qz0Var, 0);
            qz0Var.b0(-1323940314);
            int iB2 = ok4.B(qz0Var);
            j56 j56VarL2 = qz0Var.l();
            androidx.compose.runtime.internal.a aVarE2 = androidx.compose.ui.layout.e.e(hx4VarG);
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, qp2Var, eg0VarE);
            ia7.o(qz0Var, qp2Var2, j56VarL2);
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB2))) {
                o40.C(iB2, qz0Var, iB2, qp2Var3);
            }
            aVarE2.a(new qy7(qz0Var), qz0Var, 0);
            qz0Var.b0(2058660585);
            qz0Var.b0(-483455358);
            vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var, 0);
            qz0Var.b0(-1323940314);
            int iB3 = ok4.B(qz0Var);
            j56 j56VarL3 = qz0Var.l();
            androidx.compose.runtime.internal.a aVarE3 = androidx.compose.ui.layout.e.e(ex4Var);
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, qp2Var, vv0VarA);
            ia7.o(qz0Var, qp2Var2, j56VarL3);
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB3))) {
                o40.C(iB3, qz0Var, iB3, qp2Var3);
            }
            aVarE3.a(new qy7(qz0Var), qz0Var, 0);
            qz0Var.b0(2058660585);
            qz0Var.b0(1509815837);
            qz0Var.q(false);
            m.a(null, null, qz0Var, 0);
            qz0Var.b0(1509838206);
            qz0Var.q(false);
            qz0Var.q(false);
            qz0Var.q(true);
            qz0Var.q(false);
            qz0Var.q(false);
            qz0Var.q(false);
            qz0Var.q(true);
            qz0Var.q(false);
            qz0Var.q(false);
            qz0Var.b0(25356578);
            qz0Var.q(false);
            qz0Var.q(false);
            qz0Var.q(true);
            qz0Var.q(false);
            qz0Var.q(false);
        }
        return tx8.a;
    }
}
