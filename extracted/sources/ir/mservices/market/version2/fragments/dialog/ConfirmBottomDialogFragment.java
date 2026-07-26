package ir.mservices.market.version2.fragments.dialog;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.ca7;
import defpackage.d11;
import defpackage.e11;
import defpackage.fa1;
import defpackage.js6;
import defpackage.sj8;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;

/* JADX INFO: loaded from: classes3.dex */
public class ConfirmBottomDialogFragment extends BaseNewBottomDialogFragment {
    public e11 e1;
    public d11 f1;
    public ThemeData g1 = sj8.b();

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return this.f1.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return getClass().getSimpleName();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final ThemeData O0() {
        return this.g1;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        d11 d11VarFromBundle = d11.fromBundle(p0());
        this.f1 = d11VarFromBundle;
        this.g1 = d11VarFromBundle.g;
        super.W(context);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.a1 = true;
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = e11.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        e11 e11Var = (e11) fa1.c(layoutInflater, js6.confirm_dialog, null, false);
        this.e1 = e11Var;
        return e11Var.l;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.e1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        super.k0(view, bundle);
        DialogButtonComponent dialogButtonComponent = this.e1.w;
        d11 d11Var = this.f1;
        dialogButtonComponent.setTitles(d11Var.d, d11Var.c);
        this.e1.v.setText(this.f1.b);
        this.e1.v.setVisibility(0);
        this.e1.v.setTextColor(this.g1.n);
        this.e1.w.setOnClickListener(new ca7(15, this));
        DialogButtonComponent dialogButtonComponent2 = this.e1.w;
        d11 d11Var2 = this.f1;
        dialogButtonComponent2.setPrimaryColor(d11Var2.e, d11Var2.f);
        view.getBackground().setColorFilter(this.g1.l, PorterDuff.Mode.MULTIPLY);
    }
}
