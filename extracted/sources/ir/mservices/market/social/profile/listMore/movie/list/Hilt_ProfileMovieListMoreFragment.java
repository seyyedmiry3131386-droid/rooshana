package ir.mservices.market.social.profile.listMore.movie.list;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.d04;
import defpackage.dv2;
import defpackage.fu;
import defpackage.ql6;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.xf5;
import defpackage.y97;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_ProfileMovieListMoreFragment extends PagingRecyclerListContentFragment {
    public r69 f1;
    public boolean g1 = false;
    public boolean h1 = false;

    @Override // defpackage.cz2
    public final void A0() {
        if (this.h1) {
            return;
        }
        this.h1 = true;
        ProfileMovieListMoreFragment profileMovieListMoreFragment = (ProfileMovieListMoreFragment) this;
        w91 w91Var = ((t91) ((ql6) e())).a;
        profileMovieListMoreFragment.F0 = (d04) w91Var.p.get();
        profileMovieListMoreFragment.G0 = (x57) w91Var.G.get();
        profileMovieListMoreFragment.S0 = (dv2) w91Var.q.get();
        profileMovieListMoreFragment.i1 = (xf5) w91Var.F.get();
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.g1) {
            return null;
        }
        P1();
        return this.f1;
    }

    public final void P1() {
        if (this.f1 == null) {
            this.f1 = new r69(super.H(), this);
            this.g1 = rf0.B(super.H());
        }
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.f1;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        P1();
        A0();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        P1();
        A0();
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }
}
