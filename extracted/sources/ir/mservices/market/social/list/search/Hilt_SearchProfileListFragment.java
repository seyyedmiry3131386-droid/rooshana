package ir.mservices.market.social.list.search;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.d04;
import defpackage.dv2;
import defpackage.ej7;
import defpackage.fu;
import defpackage.lw8;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_SearchProfileListFragment extends PagingRecyclerListFragment {
    public r69 V0;
    public boolean W0 = false;
    public boolean X0 = false;

    @Override // defpackage.cz2
    public final void A0() {
        if (this.X0) {
            return;
        }
        this.X0 = true;
        SearchProfileListFragment searchProfileListFragment = (SearchProfileListFragment) this;
        w91 w91Var = ((t91) ((ej7) e())).a;
        searchProfileListFragment.F0 = (d04) w91Var.p.get();
        searchProfileListFragment.G0 = (x57) w91Var.G.get();
        searchProfileListFragment.K0 = (dv2) w91Var.q.get();
        searchProfileListFragment.Y0 = (lw8) w91Var.E.get();
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.W0) {
            return null;
        }
        T0();
        return this.V0;
    }

    public final void T0() {
        if (this.V0 == null) {
            this.V0 = new r69(super.H(), this);
            this.W0 = rf0.B(super.H());
        }
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.V0;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        T0();
        A0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        T0();
        A0();
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }
}
