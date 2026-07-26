package ir.mservices.market.version2.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.d04;
import defpackage.dv2;
import defpackage.fu;
import defpackage.hh3;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import ir.mservices.market.version2.services.c;
import ir.mservices.market.version2.services.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_IbexFragment extends BasePlayerVideoFragment {
    public r69 b1;
    public boolean c1 = false;
    public boolean d1 = false;

    @Override // ir.mservices.market.version2.fragments.Hilt_BasePlayerVideoFragment, defpackage.cz2
    public void A0() {
        if (this.d1) {
            return;
        }
        this.d1 = true;
        IbexFragment ibexFragment = (IbexFragment) this;
        w91 w91Var = ((t91) ((hh3) e())).a;
        ibexFragment.F0 = (d04) w91Var.p.get();
        ibexFragment.G0 = (x57) w91Var.G.get();
        ibexFragment.W0 = (dv2) w91Var.q.get();
        ibexFragment.e1 = (c) w91Var.l0.get();
        ibexFragment.f1 = (d) w91Var.S.get();
    }

    @Override // ir.mservices.market.version2.fragments.Hilt_BasePlayerVideoFragment, defpackage.cz2, androidx.fragment.app.d
    public Context H() {
        if (super.H() == null && !this.c1) {
            return null;
        }
        r1();
        return this.b1;
    }

    @Override // ir.mservices.market.version2.fragments.Hilt_BasePlayerVideoFragment, defpackage.cz2, androidx.fragment.app.d
    public void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.b1;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        r1();
        A0();
    }

    @Override // ir.mservices.market.version2.fragments.Hilt_BasePlayerVideoFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public void W(Context context) {
        super.W(context);
        r1();
        A0();
    }

    @Override // ir.mservices.market.version2.fragments.Hilt_BasePlayerVideoFragment, defpackage.cz2, androidx.fragment.app.d
    public LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }

    public final void r1() {
        if (this.b1 == null) {
            this.b1 = new r69(super.H(), this);
            this.c1 = rf0.B(super.H());
        }
    }
}
