package io.sentry.compose;

import defpackage.bb7;
import defpackage.bp2;
import defpackage.cb7;
import defpackage.db7;
import defpackage.eq;
import defpackage.ex4;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j56;
import defpackage.js3;
import defpackage.jv;
import defpackage.kh3;
import defpackage.mi8;
import defpackage.o40;
import defpackage.ok4;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rf0;
import defpackage.rp2;
import defpackage.tx8;
import defpackage.yh0;
import defpackage.z27;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
final class SentryUserFeedbackButtonKt$SentryUserFeedbackButton$2 extends Lambda implements rp2 {
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        qz0 qz0Var = (qz0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        js3.p((db7) obj, "$this$Button");
        if (qz0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            cb7 cb7VarA = bb7.a(jv.d, eq.m, qz0Var, 54);
            int iB = ok4.B(qz0Var);
            j56 j56VarL = qz0Var.l();
            ex4 ex4Var = ex4.b;
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, ex4Var);
            hz0.d0.getClass();
            bp2 bp2Var = androidx.compose.ui.node.d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, androidx.compose.ui.node.d.f, cb7VarA);
            ia7.o(qz0Var, androidx.compose.ui.node.d.e, j56VarL);
            qp2 qp2Var = androidx.compose.ui.node.d.g;
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
                o40.C(iB, qz0Var, iB, qp2Var);
            }
            ia7.o(qz0Var, androidx.compose.ui.node.d.d, hx4VarC);
            kh3.a(rf0.G(a.sentry_user_feedback_compose_button_logo_24, qz0Var), null, 0L, qz0Var, 48, 12);
            z27.a(qz0Var, yh0.B(ex4Var, 4, 0.0f, 2));
            mi8.b(null, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, qz0Var, 0, 0, 262142);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
