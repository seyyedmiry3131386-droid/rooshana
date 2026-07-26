package androidx.compose.ui.viewinterop;

import androidx.compose.ui.focus.FocusStateImpl;
import defpackage.br9;
import defpackage.c34;
import defpackage.qp2;
import defpackage.tx8;
import defpackage.ug2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FocusTargetInteropNode$focusTargetNode$1 extends FunctionReferenceImpl implements qp2 {
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        boolean zB;
        ug2 ug2Var = (ug2) obj;
        ug2 ug2Var2 = (ug2) obj2;
        h hVar = (h) this.receiver;
        if (hVar.n && (zB = ((FocusStateImpl) ug2Var2).b()) != ((FocusStateImpl) ug2Var).b()) {
            c34 c34Var = null;
            if (zB) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                br9.G(hVar, new FocusTargetInteropNode$retrievePinnableContainer$1(ref$ObjectRef, hVar));
                c34 c34Var2 = (c34) ref$ObjectRef.a;
                if (c34Var2 != null) {
                    c34Var2.a();
                    c34Var = c34Var2;
                }
                hVar.r = c34Var;
            } else {
                c34 c34Var3 = hVar.r;
                if (c34Var3 != null) {
                    c34Var3.b();
                }
                hVar.r = null;
            }
        }
        return tx8.a;
    }
}
