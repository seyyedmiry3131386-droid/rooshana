package androidx.tv.material3;

import defpackage.bp2;
import defpackage.eq;
import defpackage.ex4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j56;
import defpackage.js3;
import defpackage.jv;
import defpackage.o40;
import defpackage.ok4;
import defpackage.qp2;
import defpackage.qy7;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.tv0;
import defpackage.tx8;
import defpackage.vv0;
import defpackage.wv0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class CardKt$Card$1 extends Lambda implements rp2 {
    public final /* synthetic */ androidx.compose.runtime.internal.a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardKt$Card$1(androidx.compose.runtime.internal.a aVar) {
        super(3);
        this.g = aVar;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        qz0 qz0Var = (qz0) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && qz0Var.B()) {
            qz0Var.U();
        } else {
            qz0Var.b0(-483455358);
            vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var, 0);
            qz0Var.b0(-1323940314);
            int iB = ok4.B(qz0Var);
            j56 j56VarL = qz0Var.l();
            hz0.d0.getClass();
            bp2 bp2Var = androidx.compose.ui.node.d.b;
            androidx.compose.runtime.internal.a aVarE = androidx.compose.ui.layout.e.e(ex4.b);
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, androidx.compose.ui.node.d.f, vv0VarA);
            ia7.o(qz0Var, androidx.compose.ui.node.d.e, j56VarL);
            qp2 qp2Var = androidx.compose.ui.node.d.g;
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
                o40.C(iB, qz0Var, iB, qp2Var);
            }
            aVarE.a(new qy7(qz0Var), qz0Var, 0);
            qz0Var.b0(2058660585);
            this.g.a(wv0.a, qz0Var, 6);
            qz0Var.q(false);
            qz0Var.q(true);
            qz0Var.q(false);
            qz0Var.q(false);
        }
        return tx8.a;
    }
}
