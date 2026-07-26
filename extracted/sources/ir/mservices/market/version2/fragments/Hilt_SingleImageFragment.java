package ir.mservices.market.version2.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.bx7;
import defpackage.c5;
import defpackage.d04;
import defpackage.fu;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import ir.mservices.market.version2.fragments.base.BaseFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_SingleImageFragment extends BaseFragment {
    public r69 J0;
    public boolean K0 = false;
    public boolean L0 = false;

    @Override // defpackage.cz2
    public final void A0() {
        if (this.L0) {
            return;
        }
        this.L0 = true;
        SingleImageFragment singleImageFragment = (SingleImageFragment) this;
        w91 w91Var = ((t91) ((bx7) e())).a;
        singleImageFragment.F0 = (d04) w91Var.p.get();
        singleImageFragment.G0 = (x57) w91Var.G.get();
        singleImageFragment.O0 = (c5) w91Var.L.get();
    }

    public final void C0() {
        if (this.J0 == null) {
            this.J0 = new r69(super.H(), this);
            this.K0 = rf0.B(super.H());
        }
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.K0) {
            return null;
        }
        C0();
        return this.J0;
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.J0;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        C0();
        A0();
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        C0();
        A0();
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }
}
