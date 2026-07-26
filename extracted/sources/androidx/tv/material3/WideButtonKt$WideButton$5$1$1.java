package androidx.tv.material3;

import defpackage.bg0;
import defpackage.bp2;
import defpackage.eg0;
import defpackage.eq;
import defpackage.ex4;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j56;
import defpackage.js3;
import defpackage.o40;
import defpackage.ok4;
import defpackage.qp2;
import defpackage.qy7;
import defpackage.qz0;
import defpackage.tx8;
import defpackage.y90;
import defpackage.yh0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class WideButtonKt$WideButton$5$1$1 extends Lambda implements qp2 {
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && qz0Var.B()) {
            qz0Var.U();
            return tx8.a;
        }
        hx4 hx4VarB = yh0.B(ex4.b, 0.0f, y90.a, 1);
        qz0Var.b0(733328855);
        eg0 eg0VarE = bg0.e(eq.c, false, qz0Var, 0);
        qz0Var.b0(-1323940314);
        int iB = ok4.B(qz0Var);
        j56 j56VarL = qz0Var.l();
        hz0.d0.getClass();
        bp2 bp2Var = androidx.compose.ui.node.d.b;
        androidx.compose.runtime.internal.a aVarE = androidx.compose.ui.layout.e.e(hx4VarB);
        qz0Var.e0();
        if (qz0Var.S) {
            qz0Var.k(bp2Var);
        } else {
            qz0Var.o0();
        }
        ia7.o(qz0Var, androidx.compose.ui.node.d.f, eg0VarE);
        ia7.o(qz0Var, androidx.compose.ui.node.d.e, j56VarL);
        qp2 qp2Var = androidx.compose.ui.node.d.g;
        if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
            o40.C(iB, qz0Var, iB, qp2Var);
        }
        aVarE.a(new qy7(qz0Var), qz0Var, 0);
        qz0Var.b0(2058660585);
        throw null;
    }
}
