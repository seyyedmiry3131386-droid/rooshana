package ir.mservices.market.social.list.common;

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
import defpackage.n15;
import defpackage.rs6;
import defpackage.sk6;
import defpackage.tk6;
import defpackage.vn1;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileAddListToOwnProfileDialogFragment extends Hilt_ProfileAddListToOwnProfileDialogFragment {
    public final bi5 h1 = new bi5(g27.a(tk6.class), new n15(24, this));
    public vn1 i1;

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((tk6) this.h1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "ProfileAddListToOwnProfileDialogFragment";
    }

    public final void V0(String str) {
        js3.p(str, "errorMessage");
        vn1 vn1Var = this.i1;
        js3.m(vn1Var);
        vn1Var.w.setStateCommit(MyketProgressState.b);
        MyketTextView myketTextView = vn1Var.x;
        js3.m(myketTextView);
        myketTextView.setVisibility(0);
        myketTextView.setText(str);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.b1 = false;
        this.a1 = true;
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = vn1.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        vn1 vn1Var = (vn1) fa1.c(layoutInflater, js6.dialog_profile_add_list, viewGroup, false);
        this.i1 = vn1Var;
        js3.m(vn1Var);
        View view = vn1Var.l;
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
        vn1 vn1Var = this.i1;
        js3.m(vn1Var);
        DialogButtonComponent dialogButtonComponent = vn1Var.w;
        dialogButtonComponent.setTitles(L(rs6.profile_add_list_dialog_confirm_button_text), L(rs6.button_cancel));
        dialogButtonComponent.setOnClickListener(new sk6(dialogButtonComponent, vn1Var, this, 0));
    }
}
