package ir.mservices.market.login.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.d04;
import defpackage.dv2;
import defpackage.fu;
import defpackage.lw8;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.xd4;
import defpackage.y97;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_LoginDialogFragment extends BaseLoginDialogFragment {
    public r69 j1;
    public boolean k1 = false;
    public boolean l1 = false;

    @Override // ir.mservices.market.login.ui.Hilt_BaseLoginDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.k1) {
            return null;
        }
        d1();
        return this.j1;
    }

    @Override // ir.mservices.market.login.ui.Hilt_BaseLoginDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment
    public final void H0() {
        if (this.l1) {
            return;
        }
        this.l1 = true;
        LoginDialogFragment loginDialogFragment = (LoginDialogFragment) this;
        w91 w91Var = ((t91) ((xd4) e())).a;
        loginDialogFragment.V0 = (dv2) w91Var.q.get();
        loginDialogFragment.W0 = (lw8) w91Var.E.get();
        loginDialogFragment.X0 = (x57) w91Var.G.get();
        loginDialogFragment.h1 = (d04) w91Var.p.get();
    }

    @Override // ir.mservices.market.login.ui.Hilt_BaseLoginDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.j1;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        d1();
        H0();
    }

    @Override // ir.mservices.market.login.ui.Hilt_BaseLoginDialogFragment, ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        d1();
        H0();
    }

    @Override // ir.mservices.market.login.ui.Hilt_BaseLoginDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }

    public final void d1() {
        if (this.j1 == null) {
            this.j1 = new r69(super.H(), this);
            this.k1 = rf0.B(super.H());
        }
    }
}
