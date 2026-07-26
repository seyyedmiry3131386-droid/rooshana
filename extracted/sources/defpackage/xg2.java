package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class xg2 extends gx4 implements pg2 {
    @Override // defpackage.pg2
    public final void w(ng2 ng2Var) {
        View viewF = c26.f(this);
        ng2Var.b(this.a.n && c26.f(this).hasFocusable());
        View viewFindFocus = viewF.findFocus();
        if (viewFindFocus != null) {
            ng2Var.e(jg2.a(viewFindFocus, viewF));
        }
    }
}
