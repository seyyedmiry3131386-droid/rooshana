package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import ir.mservices.market.version2.fragments.base.BaseDialogFragment;
import ir.mservices.market.version2.fragments.dialog.AppDataInstallProgressDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class az2 extends BaseDialogFragment {
    public r69 c1;
    public boolean d1;
    public boolean e1;

    @Override // defpackage.bz2, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.d1) {
            return null;
        }
        L0();
        return this.c1;
    }

    @Override // defpackage.bz2
    public final void H0() {
        if (this.e1) {
            return;
        }
        this.e1 = true;
        AppDataInstallProgressDialogFragment appDataInstallProgressDialogFragment = (AppDataInstallProgressDialogFragment) this;
        w91 w91Var = ((t91) ((xo) e())).a;
        appDataInstallProgressDialogFragment.Y0 = (x57) w91Var.G.get();
        appDataInstallProgressDialogFragment.Z0 = (lw8) w91Var.E.get();
        appDataInstallProgressDialogFragment.h1 = (xf5) w91Var.F.get();
    }

    public final void L0() {
        if (this.c1 == null) {
            this.c1 = new r69(super.H(), this);
            this.d1 = rf0.B(super.H());
        }
    }

    @Override // defpackage.bz2, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.c1;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        L0();
        H0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseDialogFragment, defpackage.bz2, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        L0();
        H0();
    }

    @Override // defpackage.bz2, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }
}
