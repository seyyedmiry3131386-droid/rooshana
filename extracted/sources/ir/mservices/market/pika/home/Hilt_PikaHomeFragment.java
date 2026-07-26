package ir.mservices.market.pika.home;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.d04;
import defpackage.fu;
import defpackage.lu7;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.x76;
import defpackage.y97;
import ir.mservices.market.common.base.BaseContentFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_PikaHomeFragment extends BaseContentFragment {
    public ContextWrapper S0;
    public boolean T0 = false;
    public boolean U0 = false;

    @Override // defpackage.cz2
    public final void A0() {
        if (this.U0) {
            return;
        }
        this.U0 = true;
        PikaHomeFragment pikaHomeFragment = (PikaHomeFragment) this;
        w91 w91Var = ((t91) ((x76) e())).a;
        pikaHomeFragment.F0 = (d04) w91Var.p.get();
        pikaHomeFragment.G0 = (x57) w91Var.G.get();
        pikaHomeFragment.Y0 = (lu7) w91Var.h.get();
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
        ContextWrapper contextWrapper = this.S0;
        y97.q(contextWrapper == null || fu.c(contextWrapper) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
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
            this.S0 = new r69((ContextWrapper) super.H(), this);
            this.T0 = rf0.B(super.H());
        }
    }
}
