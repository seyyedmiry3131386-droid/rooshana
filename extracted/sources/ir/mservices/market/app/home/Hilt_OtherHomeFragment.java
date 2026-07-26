package ir.mservices.market.app.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.d04;
import defpackage.d56;
import defpackage.dv2;
import defpackage.fu;
import defpackage.lw8;
import defpackage.pw5;
import defpackage.r69;
import defpackage.ra3;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.xf5;
import defpackage.y97;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_OtherHomeFragment extends HomeFragment {
    public boolean A1 = false;
    public boolean B1 = false;
    public r69 z1;

    @Override // ir.mservices.market.app.home.Hilt_HomeFragment, ir.mservices.market.common.search.Hilt_BaseSearchFragment, defpackage.cz2
    public final void A0() {
        if (this.B1) {
            return;
        }
        this.B1 = true;
        OtherHomeFragment otherHomeFragment = (OtherHomeFragment) this;
        w91 w91Var = ((t91) ((pw5) e())).a;
        otherHomeFragment.F0 = (d04) w91Var.p.get();
        otherHomeFragment.G0 = (x57) w91Var.G.get();
        otherHomeFragment.S0 = (dv2) w91Var.q.get();
        otherHomeFragment.i1 = (lw8) w91Var.E.get();
        otherHomeFragment.j1 = w91Var.G0();
        otherHomeFragment.u1 = (ra3) w91Var.j1.get();
        otherHomeFragment.v1 = (d56) w91Var.U.get();
        otherHomeFragment.C1 = (xf5) w91Var.F.get();
    }

    @Override // ir.mservices.market.app.home.Hilt_HomeFragment, ir.mservices.market.common.search.Hilt_BaseSearchFragment, defpackage.cz2, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.A1) {
            return null;
        }
        l2();
        return this.z1;
    }

    @Override // ir.mservices.market.app.home.Hilt_HomeFragment, ir.mservices.market.common.search.Hilt_BaseSearchFragment, defpackage.cz2, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.z1;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        l2();
        A0();
    }

    @Override // ir.mservices.market.app.home.Hilt_HomeFragment, ir.mservices.market.common.search.Hilt_BaseSearchFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        l2();
        A0();
    }

    @Override // ir.mservices.market.app.home.Hilt_HomeFragment, ir.mservices.market.common.search.Hilt_BaseSearchFragment, defpackage.cz2, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }

    public final void l2() {
        if (this.z1 == null) {
            this.z1 = new r69(super.H(), this);
            this.A1 = rf0.B(super.H());
        }
    }
}
