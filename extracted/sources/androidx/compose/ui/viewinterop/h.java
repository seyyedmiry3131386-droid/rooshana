package androidx.compose.ui.viewinterop;

import defpackage.br9;
import defpackage.c34;
import defpackage.jr5;
import defpackage.m01;
import defpackage.ti1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class h extends ti1 implements jr5, m01 {
    public final androidx.compose.ui.focus.d q;
    public c34 r;

    public h() {
        androidx.compose.ui.focus.d dVar = new androidx.compose.ui.focus.d(0, new FocusTargetInteropNode$focusTargetNode$1(2, this, h.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0), 9);
        C0(dVar);
        this.q = dVar;
    }

    @Override // defpackage.jr5
    public final void Y() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        br9.G(this, new FocusTargetInteropNode$retrievePinnableContainer$1(ref$ObjectRef, this));
        c34 c34Var = (c34) ref$ObjectRef.a;
        if (this.q.H0().b()) {
            c34 c34Var2 = this.r;
            if (c34Var2 != null) {
                c34Var2.b();
            }
            if (c34Var != null) {
                c34Var.a();
            } else {
                c34Var = null;
            }
            this.r = c34Var;
        }
    }
}
