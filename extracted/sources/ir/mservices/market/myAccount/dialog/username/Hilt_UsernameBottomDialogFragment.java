package ir.mservices.market.myAccount.dialog.username;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.c5;
import defpackage.d29;
import defpackage.dv2;
import defpackage.fu;
import defpackage.lw8;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_UsernameBottomDialogFragment extends BaseNewBottomDialogFragment {
    public r69 e1;
    public boolean f1 = false;
    public boolean g1 = false;

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.f1) {
            return null;
        }
        U0();
        return this.e1;
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment
    public final void H0() {
        if (this.g1) {
            return;
        }
        this.g1 = true;
        UsernameBottomDialogFragment usernameBottomDialogFragment = (UsernameBottomDialogFragment) this;
        w91 w91Var = ((t91) ((d29) e())).a;
        usernameBottomDialogFragment.V0 = (dv2) w91Var.q.get();
        usernameBottomDialogFragment.W0 = (lw8) w91Var.E.get();
        usernameBottomDialogFragment.X0 = (x57) w91Var.G.get();
        usernameBottomDialogFragment.h1 = (c5) w91Var.L.get();
    }

    public final void U0() {
        if (this.e1 == null) {
            this.e1 = new r69(super.H(), this);
            this.f1 = rf0.B(super.H());
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.e1;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        U0();
        H0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        U0();
        H0();
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }
}
