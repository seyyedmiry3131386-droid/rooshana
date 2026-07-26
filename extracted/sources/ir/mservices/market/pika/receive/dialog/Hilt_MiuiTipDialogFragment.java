package ir.mservices.market.pika.receive.dialog;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.ew4;
import defpackage.fu;
import defpackage.lw8;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MiuiTipDialogFragment extends BaseNewDialogFragment {
    public r69 Y0;
    public boolean Z0 = false;
    public boolean a1 = false;

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.Z0) {
            return null;
        }
        O0();
        return this.Y0;
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment
    public final void H0() {
        if (this.a1) {
            return;
        }
        this.a1 = true;
        MiuiTipDialogFragment miuiTipDialogFragment = (MiuiTipDialogFragment) this;
        w91 w91Var = ((t91) ((ew4) e())).a;
        miuiTipDialogFragment.V0 = (x57) w91Var.G.get();
        miuiTipDialogFragment.W0 = (lw8) w91Var.E.get();
    }

    public final void O0() {
        if (this.Y0 == null) {
            this.Y0 = new r69(super.H(), this);
            this.Z0 = rf0.B(super.H());
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.Y0;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        O0();
        H0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        O0();
        H0();
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }
}
