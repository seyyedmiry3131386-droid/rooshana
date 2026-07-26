package ir.mservices.market.movie.ui.detail.review;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.d04;
import defpackage.fu;
import defpackage.o05;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import ir.mservices.market.version2.fragments.base.BaseNavigationFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MovieCommentFlowFragment extends BaseNavigationFragment {
    public r69 K0;
    public boolean L0 = false;
    public boolean M0 = false;

    @Override // defpackage.cz2
    public final void A0() {
        if (this.M0) {
            return;
        }
        this.M0 = true;
        MovieCommentFlowFragment movieCommentFlowFragment = (MovieCommentFlowFragment) this;
        w91 w91Var = ((t91) ((o05) e())).a;
        movieCommentFlowFragment.F0 = (d04) w91Var.p.get();
        movieCommentFlowFragment.G0 = (x57) w91Var.G.get();
    }

    public final void D0() {
        if (this.K0 == null) {
            this.K0 = new r69(super.H(), this);
            this.L0 = rf0.B(super.H());
        }
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.L0) {
            return null;
        }
        D0();
        return this.K0;
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.K0;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        D0();
        A0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        D0();
        A0();
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }
}
