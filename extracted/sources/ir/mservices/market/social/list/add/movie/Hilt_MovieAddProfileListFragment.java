package ir.mservices.market.social.list.add.movie;

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
import defpackage.y97;
import defpackage.yz4;
import ir.mservices.market.social.list.add.BaseAddProfileListFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MovieAddProfileListFragment extends BaseAddProfileListFragment {
    public r69 d1;
    public boolean e1 = false;
    public boolean f1 = false;

    @Override // ir.mservices.market.social.list.add.Hilt_BaseAddProfileListFragment, defpackage.cz2
    public final void A0() {
        if (this.f1) {
            return;
        }
        this.f1 = true;
        MovieAddProfileListFragment movieAddProfileListFragment = (MovieAddProfileListFragment) this;
        w91 w91Var = ((t91) ((yz4) e())).a;
        movieAddProfileListFragment.F0 = (d04) w91Var.p.get();
        movieAddProfileListFragment.G0 = (x57) w91Var.G.get();
        movieAddProfileListFragment.V0 = (lw8) w91Var.E.get();
        movieAddProfileListFragment.W0 = (dv2) w91Var.q.get();
    }

    @Override // ir.mservices.market.social.list.add.Hilt_BaseAddProfileListFragment, defpackage.cz2, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.e1) {
            return null;
        }
        x1();
        return this.d1;
    }

    @Override // ir.mservices.market.social.list.add.Hilt_BaseAddProfileListFragment, defpackage.cz2, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.d1;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        x1();
        A0();
    }

    @Override // ir.mservices.market.social.list.add.Hilt_BaseAddProfileListFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        x1();
        A0();
    }

    @Override // ir.mservices.market.social.list.add.Hilt_BaseAddProfileListFragment, defpackage.cz2, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }

    public final void x1() {
        if (this.d1 == null) {
            this.d1 = new r69(super.H(), this);
            this.e1 = rf0.B(super.H());
        }
    }
}
