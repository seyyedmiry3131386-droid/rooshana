package ir.mservices.market.movie.ui.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.d04;
import defpackage.d56;
import defpackage.dv2;
import defpackage.eg5;
import defpackage.fu;
import defpackage.lu7;
import defpackage.lw8;
import defpackage.m35;
import defpackage.qa3;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MovieHomeFragment extends HomeFragment {
    public r69 A1;
    public boolean B1 = false;
    public boolean C1 = false;

    @Override // ir.mservices.market.movie.ui.home.Hilt_HomeFragment, ir.mservices.market.common.search.Hilt_BaseSearchFragment, defpackage.cz2
    public final void A0() {
        if (this.C1) {
            return;
        }
        this.C1 = true;
        MovieHomeFragment movieHomeFragment = (MovieHomeFragment) this;
        w91 w91Var = ((t91) ((m35) e())).a;
        movieHomeFragment.F0 = (d04) w91Var.p.get();
        movieHomeFragment.G0 = (x57) w91Var.G.get();
        movieHomeFragment.S0 = (dv2) w91Var.q.get();
        movieHomeFragment.i1 = (lw8) w91Var.E.get();
        movieHomeFragment.j1 = w91Var.G0();
        movieHomeFragment.u1 = (qa3) w91Var.H0.get();
        movieHomeFragment.v1 = (d56) w91Var.U.get();
        movieHomeFragment.w1 = (lu7) w91Var.h.get();
        movieHomeFragment.D1 = (eg5) w91Var.t0.get();
    }

    @Override // ir.mservices.market.movie.ui.home.Hilt_HomeFragment, ir.mservices.market.common.search.Hilt_BaseSearchFragment, defpackage.cz2, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.B1) {
            return null;
        }
        j2();
        return this.A1;
    }

    @Override // ir.mservices.market.movie.ui.home.Hilt_HomeFragment, ir.mservices.market.common.search.Hilt_BaseSearchFragment, defpackage.cz2, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.A1;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        j2();
        A0();
    }

    @Override // ir.mservices.market.movie.ui.home.Hilt_HomeFragment, ir.mservices.market.common.search.Hilt_BaseSearchFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        j2();
        A0();
    }

    @Override // ir.mservices.market.movie.ui.home.Hilt_HomeFragment, ir.mservices.market.common.search.Hilt_BaseSearchFragment, defpackage.cz2, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }

    public final void j2() {
        if (this.A1 == null) {
            this.A1 = new r69(super.H(), this);
            this.B1 = rf0.B(super.H());
        }
    }
}
