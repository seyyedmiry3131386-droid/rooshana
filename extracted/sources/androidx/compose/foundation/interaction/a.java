package androidx.compose.foundation.interaction;

import androidx.compose.runtime.g;
import defpackage.ab5;
import defpackage.av;
import defpackage.jz0;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.wb5;
import defpackage.zk8;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final wb5 a(ab5 ab5Var, qz0 qz0Var, int i) {
        Object objM = qz0Var.M();
        av avVar = jz0.a;
        if (objM == avVar) {
            objM = g.h(Boolean.FALSE);
            qz0Var.l0(objM);
        }
        wb5 wb5Var = (wb5) objM;
        boolean z = (((i & 14) ^ 6) > 4 && qz0Var.f(ab5Var)) || (i & 6) == 4;
        Object objM2 = qz0Var.M();
        if (z || objM2 == avVar) {
            objM2 = new FocusInteractionKt$collectIsFocusedAsState$1$1(ab5Var, wb5Var, null);
            qz0Var.l0(objM2);
        }
        zk8.h(qz0Var, (qp2) objM2, ab5Var);
        return wb5Var;
    }

    public static final wb5 b(ab5 ab5Var, qz0 qz0Var, int i) {
        Object objM = qz0Var.M();
        av avVar = jz0.a;
        if (objM == avVar) {
            objM = g.h(Boolean.FALSE);
            qz0Var.l0(objM);
        }
        wb5 wb5Var = (wb5) objM;
        boolean z = (((i & 14) ^ 6) > 4 && qz0Var.f(ab5Var)) || (i & 6) == 4;
        Object objM2 = qz0Var.M();
        if (z || objM2 == avVar) {
            objM2 = new PressInteractionKt$collectIsPressedAsState$1$1(ab5Var, wb5Var, null);
            qz0Var.l0(objM2);
        }
        zk8.h(qz0Var, (qp2) objM2, ab5Var);
        return wb5Var;
    }
}
