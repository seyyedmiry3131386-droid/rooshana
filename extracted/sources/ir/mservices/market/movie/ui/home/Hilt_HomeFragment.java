package ir.mservices.market.movie.ui.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.d04;
import defpackage.d56;
import defpackage.dv2;
import defpackage.fu;
import defpackage.lu7;
import defpackage.lw8;
import defpackage.qa3;
import defpackage.r69;
import defpackage.rb3;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import ir.mservices.market.common.search.BaseSearchFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_HomeFragment extends BaseSearchFragment {
    public r69 r1;
    public boolean s1 = false;
    public boolean t1 = false;

    @Override // ir.mservices.market.common.search.Hilt_BaseSearchFragment, defpackage.cz2
    public void A0() {
        if (this.t1) {
            return;
        }
        this.t1 = true;
        HomeFragment homeFragment = (HomeFragment) this;
        w91 w91Var = ((t91) ((rb3) e())).a;
        homeFragment.F0 = (d04) w91Var.p.get();
        homeFragment.G0 = (x57) w91Var.G.get();
        homeFragment.S0 = (dv2) w91Var.q.get();
        homeFragment.i1 = (lw8) w91Var.E.get();
        homeFragment.j1 = w91Var.G0();
        homeFragment.u1 = (qa3) w91Var.H0.get();
        homeFragment.v1 = (d56) w91Var.U.get();
        homeFragment.w1 = (lu7) w91Var.h.get();
    }

    @Override // ir.mservices.market.common.search.Hilt_BaseSearchFragment, defpackage.cz2, androidx.fragment.app.d
    public Context H() {
        if (super.H() == null && !this.s1) {
            return null;
        }
        d2();
        return this.r1;
    }

    @Override // ir.mservices.market.common.search.Hilt_BaseSearchFragment, defpackage.cz2, androidx.fragment.app.d
    public void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.r1;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        d2();
        A0();
    }

    @Override // ir.mservices.market.common.search.Hilt_BaseSearchFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public void W(Context context) {
        super.W(context);
        d2();
        A0();
    }

    @Override // ir.mservices.market.common.search.Hilt_BaseSearchFragment, defpackage.cz2, androidx.fragment.app.d
    public LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }

    public final void d2() {
        if (this.r1 == null) {
            this.r1 = new r69(super.H(), this);
            this.s1 = rf0.B(super.H());
        }
    }
}
