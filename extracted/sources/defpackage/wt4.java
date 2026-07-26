package defpackage;

import android.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public final class wt4 extends l6 implements ActionProvider.VisibilityListener {
    public ut4 b;
    public final ActionProvider c;

    public wt4(zt4 zt4Var, ActionProvider actionProvider) {
        this.c = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ut4 ut4Var = this.b;
        if (ut4Var != null) {
            ot4 ot4Var = ((vt4) ut4Var.b).n;
            ot4Var.h = true;
            ot4Var.p(true);
        }
    }
}
