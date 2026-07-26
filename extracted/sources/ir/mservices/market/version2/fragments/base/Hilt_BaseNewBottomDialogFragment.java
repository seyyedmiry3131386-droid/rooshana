package ir.mservices.market.version2.fragments.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import defpackage.br2;
import defpackage.dv2;
import defpackage.fu;
import defpackage.gu9;
import defpackage.j80;
import defpackage.lw8;
import defpackage.q79;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.w91;
import defpackage.x57;
import defpackage.y97;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_BaseNewBottomDialogFragment extends BottomSheetDialogFragment implements br2 {
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
        BaseNewBottomDialogFragment baseNewBottomDialogFragment = (BaseNewBottomDialogFragment) this;
        w91 w91Var = ((t91) ((j80) e())).a;
        baseNewBottomDialogFragment.V0 = (dv2) w91Var.q.get();
        baseNewBottomDialogFragment.W0 = (lw8) w91Var.E.get();
        baseNewBottomDialogFragment.X0 = (x57) w91Var.G.get();
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
