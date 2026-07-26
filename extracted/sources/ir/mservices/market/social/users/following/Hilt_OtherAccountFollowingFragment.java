package ir.mservices.market.social.users.following;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.d04;
import defpackage.dv2;
import defpackage.fu;
import defpackage.gw5;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import ir.mservices.market.social.users.common.BaseAccountUsersFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_OtherAccountFollowingFragment extends BaseAccountUsersFragment {
    public r69 j1;
    public boolean k1 = false;
    public boolean l1 = false;

    @Override // ir.mservices.market.social.users.common.Hilt_BaseAccountUsersFragment, defpackage.cz2
    public final void A0() {
        if (this.l1) {
            return;
        }
        this.l1 = true;
        OtherAccountFollowingFragment otherAccountFollowingFragment = (OtherAccountFollowingFragment) this;
        w91 w91Var = ((t91) ((gw5) e())).a;
        otherAccountFollowingFragment.F0 = (d04) w91Var.p.get();
        otherAccountFollowingFragment.G0 = (x57) w91Var.G.get();
        otherAccountFollowingFragment.S0 = (dv2) w91Var.q.get();
    }

    @Override // ir.mservices.market.social.users.common.Hilt_BaseAccountUsersFragment, defpackage.cz2, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.k1) {
            return null;
        }
        V1();
        return this.j1;
    }

    @Override // ir.mservices.market.social.users.common.Hilt_BaseAccountUsersFragment, defpackage.cz2, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.j1;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        V1();
        A0();
    }

    public final void V1() {
        if (this.j1 == null) {
            this.j1 = new r69(super.H(), this);
            this.k1 = rf0.B(super.H());
        }
    }

    @Override // ir.mservices.market.social.users.common.Hilt_BaseAccountUsersFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        V1();
        A0();
    }

    @Override // ir.mservices.market.social.users.common.Hilt_BaseAccountUsersFragment, defpackage.cz2, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }
}
