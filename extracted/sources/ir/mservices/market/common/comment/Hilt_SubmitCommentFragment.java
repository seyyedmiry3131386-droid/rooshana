package ir.mservices.market.common.comment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.ba8;
import defpackage.d04;
import defpackage.fu;
import defpackage.fw0;
import defpackage.lw8;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import ir.mservices.market.common.base.BaseContentFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_SubmitCommentFragment extends BaseContentFragment {
    public r69 S0;
    public boolean T0 = false;
    public boolean U0 = false;

    @Override // defpackage.cz2
    public final void A0() {
        if (this.U0) {
            return;
        }
        this.U0 = true;
        SubmitCommentFragment submitCommentFragment = (SubmitCommentFragment) this;
        w91 w91Var = ((t91) ((ba8) e())).a;
        submitCommentFragment.F0 = (d04) w91Var.p.get();
        submitCommentFragment.G0 = (x57) w91Var.G.get();
        submitCommentFragment.V0 = (fw0) w91Var.i1.get();
        submitCommentFragment.W0 = (lw8) w91Var.E.get();
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.T0) {
            return null;
        }
        j1();
        return this.S0;
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.S0;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        j1();
        A0();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        j1();
        A0();
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }

    public final void j1() {
        if (this.S0 == null) {
            this.S0 = new r69(super.H(), this);
            this.T0 = rf0.B(super.H());
        }
    }
}
