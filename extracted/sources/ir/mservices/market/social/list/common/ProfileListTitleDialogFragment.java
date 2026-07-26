package ir.mservices.market.social.list.common;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.kl6;
import defpackage.mb0;
import defpackage.n15;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.ut4;
import defpackage.wm1;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketEditText;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileListTitleDialogFragment extends Hilt_ProfileListTitleDialogFragment {
    public final bi5 h1 = new bi5(g27.a(kl6.class), new n15(26, this));
    public wm1 i1;

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((kl6) this.h1.getValue()).b;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "ProfileListTitleDialogFragment";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.a1 = true;
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = wm1.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        wm1 wm1Var = (wm1) fa1.c(layoutInflater, js6.dialog_custom_list_title, viewGroup, false);
        this.i1 = wm1Var;
        js3.m(wm1Var);
        View view = wm1Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.i1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        wm1 wm1Var = this.i1;
        js3.m(wm1Var);
        MyketEditText myketEditText = wm1Var.z;
        myketEditText.setHintTextColor(sj8.b().n);
        myketEditText.setTextColor(sj8.b().n);
        myketEditText.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().w, PorterDuff.Mode.MULTIPLY));
        myketEditText.addTextChangedListener(new mb0(8, this));
        myketEditText.setText(((kl6) this.h1.getValue()).a);
        myketEditText.requestFocus();
        wm1 wm1Var2 = this.i1;
        js3.m(wm1Var2);
        wm1Var2.x.setTextColor(sj8.b().A);
        wm1 wm1Var3 = this.i1;
        js3.m(wm1Var3);
        DialogButtonComponent dialogButtonComponent = wm1Var3.w;
        dialogButtonComponent.setTitles(L(rs6.connect_dialog_continue), null);
        dialogButtonComponent.setOnClickListener(new ut4(6, this));
    }
}
