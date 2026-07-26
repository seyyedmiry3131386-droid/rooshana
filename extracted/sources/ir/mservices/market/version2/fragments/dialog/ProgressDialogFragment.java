package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.em6;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.n15;
import defpackage.sj8;
import defpackage.xn1;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.LoadingView;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressDialogFragment extends BaseNewDialogFragment {
    public final bi5 Y0 = new bi5(g27.a(em6.class), new n15(28, this));
    public xn1 Z0;

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return ((em6) this.Y0.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return "ProgressDialogFragment";
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = xn1.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        xn1 xn1Var = (xn1) fa1.c(layoutInflater, js6.dialog_progress, null, false);
        this.Z0 = xn1Var;
        js3.m(xn1Var);
        View view = xn1Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        xn1 xn1Var = this.Z0;
        js3.m(xn1Var);
        xn1Var.v.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.SRC_ATOP));
        LoadingView loadingView = xn1Var.w;
        loadingView.setIndicatorColor(sj8.b().n);
        loadingView.d(true);
        Dialog dialog = this.L0;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(((em6) this.Y0.getValue()).b);
        }
        Dialog dialog2 = this.L0;
        BaseNewDialogFragment.I0(dialog2 != null ? dialog2.getWindow() : null);
        M0(this.L0);
    }
}
