package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.version2.fragments.dialog.AlertButtonComponentDialogFragment;
import ir.mservices.market.version2.fragments.dialog.AppInstallSuccessDialogFragment;
import ir.mservices.market.version2.fragments.dialog.AppSignNotMatchedDialogFragment;
import ir.mservices.market.version2.fragments.dialog.InAppNotificationDialogFragment;
import ir.mservices.market.version2.fragments.dialog.PushNotifDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zy2 extends BaseNewDialogFragment {
    public final /* synthetic */ int Y0;
    public r69 Z0;
    public boolean a1 = false;
    public boolean b1 = false;

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.d
    public final Context H() {
        switch (this.Y0) {
            case 0:
                if (super.H() != null || this.a1) {
                    O0();
                }
                break;
            case 1:
                if (super.H() != null || this.a1) {
                    P0();
                }
                break;
            case 2:
                if (super.H() != null || this.a1) {
                    Q0();
                }
                break;
            case 3:
                if (super.H() != null || this.a1) {
                    R0();
                }
                break;
            default:
                if (super.H() != null || this.a1) {
                    S0();
                }
                break;
        }
        return this.Z0;
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment
    public final void H0() {
        switch (this.Y0) {
            case 0:
                if (!this.b1) {
                    this.b1 = true;
                    AlertButtonComponentDialogFragment alertButtonComponentDialogFragment = (AlertButtonComponentDialogFragment) this;
                    w91 w91Var = ((t91) ((ed) e())).a;
                    alertButtonComponentDialogFragment.V0 = (x57) w91Var.G.get();
                    alertButtonComponentDialogFragment.W0 = (lw8) w91Var.E.get();
                }
                break;
            case 1:
                if (!this.b1) {
                    this.b1 = true;
                    AppInstallSuccessDialogFragment appInstallSuccessDialogFragment = (AppInstallSuccessDialogFragment) this;
                    w91 w91Var2 = ((t91) ((rq) e())).a;
                    appInstallSuccessDialogFragment.V0 = (x57) w91Var2.G.get();
                    appInstallSuccessDialogFragment.W0 = (lw8) w91Var2.E.get();
                    appInstallSuccessDialogFragment.e1 = (dp3) w91Var2.v.get();
                }
                break;
            case 2:
                if (!this.b1) {
                    this.b1 = true;
                    AppSignNotMatchedDialogFragment appSignNotMatchedDialogFragment = (AppSignNotMatchedDialogFragment) this;
                    w91 w91Var3 = ((t91) ((vs) e())).a;
                    appSignNotMatchedDialogFragment.V0 = (x57) w91Var3.G.get();
                    appSignNotMatchedDialogFragment.W0 = (lw8) w91Var3.E.get();
                    appSignNotMatchedDialogFragment.c1 = (dp3) w91Var3.v.get();
                }
                break;
            case 3:
                if (!this.b1) {
                    this.b1 = true;
                    InAppNotificationDialogFragment inAppNotificationDialogFragment = (InAppNotificationDialogFragment) this;
                    w91 w91Var4 = ((t91) ((mk3) e())).a;
                    inAppNotificationDialogFragment.V0 = (x57) w91Var4.G.get();
                    inAppNotificationDialogFragment.W0 = (lw8) w91Var4.E.get();
                }
                break;
            default:
                if (!this.b1) {
                    this.b1 = true;
                    PushNotifDialogFragment pushNotifDialogFragment = (PushNotifDialogFragment) this;
                    w91 w91Var5 = ((t91) ((ko6) e())).a;
                    pushNotifDialogFragment.V0 = (x57) w91Var5.G.get();
                    pushNotifDialogFragment.W0 = (lw8) w91Var5.E.get();
                }
                break;
        }
    }

    public void O0() {
        if (this.Z0 == null) {
            this.Z0 = new r69(super.H(), this);
            this.a1 = rf0.B(super.H());
        }
    }

    public void P0() {
        if (this.Z0 == null) {
            this.Z0 = new r69(super.H(), this);
            this.a1 = rf0.B(super.H());
        }
    }

    public void Q0() {
        if (this.Z0 == null) {
            this.Z0 = new r69(super.H(), this);
            this.a1 = rf0.B(super.H());
        }
    }

    public void R0() {
        if (this.Z0 == null) {
            this.Z0 = new r69(super.H(), this);
            this.a1 = rf0.B(super.H());
        }
    }

    public void S0() {
        if (this.Z0 == null) {
            this.Z0 = new r69(super.H(), this);
            this.a1 = rf0.B(super.H());
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.d
    public final void V(Activity activity2) {
        switch (this.Y0) {
            case 0:
                super.V(activity2);
                r69 r69Var = this.Z0;
                y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                O0();
                H0();
                break;
            case 1:
                super.V(activity2);
                r69 r69Var2 = this.Z0;
                y97.q(r69Var2 == null || fu.c(r69Var2) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                P0();
                H0();
                break;
            case 2:
                super.V(activity2);
                r69 r69Var3 = this.Z0;
                y97.q(r69Var3 == null || fu.c(r69Var3) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                Q0();
                H0();
                break;
            case 3:
                super.V(activity2);
                r69 r69Var4 = this.Z0;
                y97.q(r69Var4 == null || fu.c(r69Var4) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                R0();
                H0();
                break;
            default:
                super.V(activity2);
                r69 r69Var5 = this.Z0;
                y97.q(r69Var5 == null || fu.c(r69Var5) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                S0();
                H0();
                break;
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void W(Context context) {
        switch (this.Y0) {
            case 0:
                super.W(context);
                O0();
                H0();
                break;
            case 1:
                super.W(context);
                P0();
                H0();
                break;
            case 2:
                super.W(context);
                Q0();
                H0();
                break;
            case 3:
                super.W(context);
                R0();
                H0();
                break;
            default:
                super.W(context);
                S0();
                H0();
                break;
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        switch (this.Y0) {
            case 0:
                LayoutInflater layoutInflaterD0 = super.d0(bundle);
                return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
            case 1:
                LayoutInflater layoutInflaterD02 = super.d0(bundle);
                return layoutInflaterD02.cloneInContext(new r69(layoutInflaterD02, this));
            case 2:
                LayoutInflater layoutInflaterD03 = super.d0(bundle);
                return layoutInflaterD03.cloneInContext(new r69(layoutInflaterD03, this));
            case 3:
                LayoutInflater layoutInflaterD04 = super.d0(bundle);
                return layoutInflaterD04.cloneInContext(new r69(layoutInflaterD04, this));
            default:
                LayoutInflater layoutInflaterD05 = super.d0(bundle);
                return layoutInflaterD05.cloneInContext(new r69(layoutInflaterD05, this));
        }
    }
}
