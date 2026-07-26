package androidx.compose.ui.input.pointer;

import defpackage.ah0;
import defpackage.fh6;
import defpackage.jz0;
import defpackage.qz0;
import defpackage.rp2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends Lambda implements rp2 {
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        qz0 qz0Var = (qz0) obj2;
        ((Number) obj3).intValue();
        qz0Var.a0(374375707);
        Object objM = qz0Var.M();
        if (objM == jz0.a) {
            objM = new fh6();
            qz0Var.l0(objM);
        }
        fh6 fh6Var = (fh6) objM;
        fh6Var.b = null;
        ah0 ah0Var = fh6Var.c;
        if (ah0Var != null) {
            ah0Var.b = null;
        }
        fh6Var.c = null;
        qz0Var.q(false);
        return fh6Var;
    }
}
