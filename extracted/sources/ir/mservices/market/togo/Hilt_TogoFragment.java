package ir.mservices.market.togo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.b56;
import defpackage.d04;
import defpackage.d56;
import defpackage.dp3;
import defpackage.du;
import defpackage.fu;
import defpackage.g76;
import defpackage.k68;
import defpackage.lu7;
import defpackage.pk0;
import defpackage.r69;
import defpackage.rf0;
import defpackage.rf7;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;
import defpackage.ym8;
import ir.mservices.market.common.base.BaseContentFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_TogoFragment extends BaseContentFragment {
    public r69 S0;
    public boolean T0 = false;
    public boolean U0 = false;

    @Override // defpackage.cz2
    public final void A0() {
        if (this.U0) {
            return;
        }
        this.U0 = true;
        TogoFragment togoFragment = (TogoFragment) this;
        w91 w91Var = ((t91) ((ym8) e())).a;
        togoFragment.F0 = (d04) w91Var.p.get();
        togoFragment.G0 = (x57) w91Var.G.get();
        togoFragment.V0 = (dp3) w91Var.v.get();
        togoFragment.W0 = (ir.mservices.market.version2.manager.a) w91Var.D.get();
        togoFragment.X0 = (d56) w91Var.U.get();
        togoFragment.Y0 = (b56) w91Var.A.get();
        togoFragment.Z0 = (rf7) w91Var.r.get();
        togoFragment.a1 = (du) w91Var.B0.get();
        togoFragment.b1 = (lu7) w91Var.h.get();
        togoFragment.c1 = (k68) w91Var.V.get();
        togoFragment.d1 = (g76) w91Var.O.get();
        togoFragment.e1 = (pk0) w91Var.m1.get();
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
    public void W(Context context) {
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
