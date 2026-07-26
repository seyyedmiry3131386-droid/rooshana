package ir.mservices.market.screenshots;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.cv1;
import defpackage.d04;
import defpackage.fu;
import defpackage.r69;
import defpackage.rf0;
import defpackage.t91;
import defpackage.y97;
import ir.mservices.market.version2.fragments.base.BaseDraggableFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_DraggableScreenshotFragment extends BaseDraggableFragment {
    public r69 X0;
    public boolean Y0 = false;
    public boolean Z0 = false;

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseDraggableFragment, androidx.fragment.app.d
    public final Context H() {
        if (super.H() == null && !this.Y0) {
            return null;
        }
        N0();
        return this.X0;
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseDraggableFragment
    public final void H0() {
        if (this.Z0) {
            return;
        }
        this.Z0 = true;
        ((DraggableScreenshotFragment) this).a1 = (d04) ((t91) ((cv1) e())).a.p.get();
    }

    public final void N0() {
        if (this.X0 == null) {
            this.X0 = new r69(super.H(), this);
            this.Y0 = rf0.B(super.H());
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseDraggableFragment, androidx.fragment.app.d
    public final void V(Activity activity2) {
        super.V(activity2);
        r69 r69Var = this.X0;
        y97.q(r69Var == null || fu.c(r69Var) == activity2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        N0();
        H0();
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseDraggableFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        N0();
        H0();
    }

    @Override // ir.mservices.market.version2.fragments.base.Hilt_BaseDraggableFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        return layoutInflaterD0.cloneInContext(new r69(layoutInflaterD0, this));
    }
}
