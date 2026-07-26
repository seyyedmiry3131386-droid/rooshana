package androidx.tv.material3;

import androidx.compose.foundation.layout.FillElement;
import defpackage.bg0;
import defpackage.bp2;
import defpackage.cb0;
import defpackage.eg0;
import defpackage.eq;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j56;
import defpackage.js3;
import defpackage.o40;
import defpackage.ok4;
import defpackage.qp2;
import defpackage.qy7;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class IconButtonKt$IconButton$2 extends Lambda implements rp2 {
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        qz0 qz0Var = (qz0) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && qz0Var.B()) {
            qz0Var.U();
            return tx8.a;
        }
        FillElement fillElement = androidx.compose.foundation.layout.b.c;
        cb0 cb0Var = eq.g;
        qz0Var.b0(733328855);
        eg0 eg0VarE = bg0.e(cb0Var, false, qz0Var, 6);
        qz0Var.b0(-1323940314);
        int iB = ok4.B(qz0Var);
        j56 j56VarL = qz0Var.l();
        hz0.d0.getClass();
        bp2 bp2Var = androidx.compose.ui.node.d.b;
        androidx.compose.runtime.internal.a aVarE = androidx.compose.ui.layout.e.e(fillElement);
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
