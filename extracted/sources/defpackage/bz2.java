package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import ir.mservices.market.version2.fragments.base.BaseDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bz2 extends DialogFragment implements br2 {
    public r69 Q0;
    public volatile fu S0;
    public boolean R0 = false;
    public final Object T0 = new Object();
    public boolean U0 = false;

    public final void G0() {
        if (this.Q0 == null) {
            this.Q0 = new r69(super.H(), this);
            this.R0 = rf0.B(super.H());
        }
    }

    @Override // androidx.fragment.app.d
    public Context H() {
        if (super.H() == null && !this.R0) {
            return null;
        }
        G0();
        return this.Q0;
    }

    public void H0() {
        if (this.U0) {
            return;
        }
        this.U0 = true;
        BaseDialogFragment baseDialogFragment = (BaseDialogFragment) this;
        w91 w91Var = ((t91) ((r60) e())).a;
        baseDialogFragment.Y0 = (x57) w91Var.G.get();
        baseDialogFragment.Z0 = (lw8) w91Var.E.get();
    }

    @Override // androidx.fragment.app.d
    public void V(Activity activity2) {
        boolean z = true;
        this.H = true;
        r69 r69Var = this.Q0;
        if (r69Var != null && fu.c(r69Var) != activity2) {
            z = false;
        }
        y97.q(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        G0();
        H0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void W(Context context) {
        super.W(context);
        G0();
        H0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.S0 == null) {
            synchronized (this.T0) {
                try {
                    if (this.S0 == null) {
                        this.S0 = new fu(this);
                    }
                } finally {
                }
            }
        }
        return this.S0.e();
    }

    @Override // androidx.fragment.app.d, defpackage.jx2
    public final q79 h() {
        return gu9.s(this, super.h());
    }
}
