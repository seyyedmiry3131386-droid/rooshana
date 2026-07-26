package ir.mservices.market.version2.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.d04;
import defpackage.dv2;
import defpackage.fu;
import defpackage.g45;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import ir.mservices.market.version2.services.c;
import ir.mservices.market.version2.services.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MovieIbexFragment extends IbexFragment {
    public r69 s1;
    public boolean t1 = false;
    public boolean u1 = false;

    @Override // ir.mservices.market.version2.fragments.Hilt_IbexFragment, ir.mservices.market.version2.fragments.Hilt_BasePlayerVideoFragment, defpackage.cz2
    public final void A0() {
        if (this.u1) {
            return;
        }
        this.u1 = true;
        MovieIbexFragment movieIbexFragment = (MovieIbexFragment) this;
        w91 w91Var = ((t91) ((g45) e())).a;
        movieIbexFragment.F0 = (d04) w91Var.p.get();
        movieIbexFragment.G0 = (x57) w91Var.G.get();
        movieIbexFragment.W0 = (dv2) w91Var.q.get();
        movieIbexFragment.e1 = (c) w91Var.l0.get();
        movieIbexFragment.f1 = (d) w91Var.S.get();
    }

    @Override // ir.mservices.market.version2.fragments.Hilt_IbexFragment, ir.mservices.market.version2.fragments.Hilt_BasePlayerVideoFragment, defpackage.cz2, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.t1) {
            return null;
        }
        z1();
        return this.s1;
    }

    @Override // ir.mservices.market.version2.fragments.Hilt_IbexFragment, ir.mservices.market.version2.fragments.Hilt_BasePlayerVideoFragment, defpackage.cz2, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.s1;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        z1();
        A0();
    }

    @Override // ir.mservices.market.version2.fragments.Hilt_IbexFragment, ir.mservices.market.version2.fragments.Hilt_BasePlayerVideoFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public void W(Context context) {
        super.W(context);
        z1();
        A0();
    }

    @Override // ir.mservices.market.version2.fragments.Hilt_IbexFragment, ir.mservices.market.version2.fragments.Hilt_BasePlayerVideoFragment, defpackage.cz2, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }

    public final void z1() {
        if (this.s1 == null) {
            this.s1 = new r69(super.H(), this);
            this.t1 = rf0.B(super.H());
        }
    }
}
