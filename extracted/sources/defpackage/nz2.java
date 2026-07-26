package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import ir.mservices.market.version2.fragments.base.BaseNavigationFragment;
import ir.mservices.market.version2.fragments.content.UserManagerFragment;
import ir.mservices.market.version2.fragments.content.UserManagerIntentFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nz2 extends BaseNavigationFragment {
    public final /* synthetic */ int K0;
    public r69 L0;
    public boolean M0 = false;
    public boolean N0 = false;

    public /* synthetic */ nz2(int i) {
        this.K0 = i;
    }

    @Override // defpackage.cz2
    public final void A0() {
        switch (this.K0) {
            case 0:
                if (!this.N0) {
                    this.N0 = true;
                    UserManagerFragment userManagerFragment = (UserManagerFragment) this;
                    w91 w91Var = ((t91) ((i19) e())).a;
                    userManagerFragment.F0 = (d04) w91Var.p.get();
                    userManagerFragment.G0 = (x57) w91Var.G.get();
                    userManagerFragment.O0 = (c5) w91Var.L.get();
                }
                break;
            default:
                if (!this.N0) {
                    this.N0 = true;
                    UserManagerIntentFragment userManagerIntentFragment = (UserManagerIntentFragment) this;
                    w91 w91Var2 = ((t91) ((j19) e())).a;
                    userManagerIntentFragment.F0 = (d04) w91Var2.p.get();
                    userManagerIntentFragment.G0 = (x57) w91Var2.G.get();
                    userManagerIntentFragment.O0 = (c5) w91Var2.L.get();
                }
                break;
        }
    }

    public void D0() {
        if (this.L0 == null) {
            this.L0 = new r69(super.H(), this);
            this.M0 = rf0.B(super.H());
        }
    }

    public void E0() {
        if (this.L0 == null) {
            this.L0 = new r69(super.H(), this);
            this.M0 = rf0.B(super.H());
        }
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final Context H() {
        switch (this.K0) {
            case 0:
                if (super.H() != null || this.M0) {
                    D0();
                }
                break;
            default:
                if (super.H() != null || this.M0) {
                    E0();
                }
                break;
        }
        return this.L0;
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final void V(Activity activity2) {
        switch (this.K0) {
            case 0:
                super.V(activity2);
                r69 r69Var = this.L0;
                y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                D0();
                A0();
                break;
            default:
                super.V(activity2);
                r69 r69Var2 = this.L0;
                y97.q(r69Var2 == null || fu.c(r69Var2) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                E0();
                A0();
                break;
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNavigationFragment, defpackage.cz2, androidx.fragment.app.d
    public final void W(Context context) {
        switch (this.K0) {
            case 0:
                super.W(context);
                D0();
                A0();
                break;
            default:
                super.W(context);
                E0();
                A0();
                break;
        }
    }

    @Override // defpackage.cz2, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        switch (this.K0) {
            case 0:
                LayoutInflater layoutInflaterD0 = super.d0(bundle);
                return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
            default:
                LayoutInflater layoutInflaterD02 = super.d0(bundle);
                return layoutInflaterD02.cloneInContext(new r69(layoutInflaterD02, this));
        }
    }
}
