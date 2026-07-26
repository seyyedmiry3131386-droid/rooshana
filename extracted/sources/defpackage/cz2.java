package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.d;
import ir.mservices.market.version2.fragments.base.BaseFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cz2 extends d implements br2 {
    public r69 A0;
    public volatile fu C0;
    public boolean B0 = false;
    public final Object D0 = new Object();
    public boolean E0 = false;

    public void A0() {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        BaseFragment baseFragment = (BaseFragment) this;
        w91 w91Var = ((t91) ((y60) e())).a;
        baseFragment.F0 = (d04) w91Var.p.get();
        baseFragment.G0 = (x57) w91Var.G.get();
    }

    @Override // androidx.fragment.app.d
    public Context H() {
        if (super.H() == null && !this.B0) {
            return null;
        }
        z0();
        return this.A0;
    }

    @Override // androidx.fragment.app.d
    public void V(Activity activity2) {
        boolean z = true;
        this.H = true;
        r69 r69Var = this.A0;
        if (r69Var != null && fu.c(r69Var) != activity2) {
            z = false;
        }
        y97.q(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        z0();
        A0();
    }

    @Override // androidx.fragment.app.d
    public void W(Context context) {
        super.W(context);
        z0();
        A0();
    }

    @Override // androidx.fragment.app.d
    public LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.C0 == null) {
            synchronized (this.D0) {
                try {
                    if (this.C0 == null) {
                        this.C0 = new fu(this);
                    }
                } finally {
                }
            }
        }
        return this.C0.e();
    }

    @Override // androidx.fragment.app.d, defpackage.jx2
    public final q79 h() {
        return gu9.s(this, super.h());
    }

    public final void z0() {
        if (this.A0 == null) {
            this.A0 = new r69(super.H(), this);
            this.B0 = rf0.B(super.H());
        }
    }
}
