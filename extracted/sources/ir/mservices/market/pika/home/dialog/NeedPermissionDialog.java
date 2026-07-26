package ir.mservices.market.pika.home.dialog;

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
import defpackage.n15;
import defpackage.ql5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.sl5;
import defpackage.t15;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class NeedPermissionDialog extends Hilt_NeedPermissionDialog {
    public sl5 h1;
    public final bi5 i1 = new bi5(g27.a(ql5.class), new n15(8, this));

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((ql5) this.i1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "NeedPermissionDialog";
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
        int i = sl5.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        sl5 sl5Var = (sl5) fa1.c(layoutInflater, js6.need_permission_to_continue, null, false);
        this.h1 = sl5Var;
        js3.m(sl5Var);
        View view = sl5Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.h1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        sl5 sl5Var = this.h1;
        js3.m(sl5Var);
        sl5Var.w.setTitles(K().getString(rs6.access_txt_btn), K().getString(rs6.dismiss));
        sl5 sl5Var2 = this.h1;
        js3.m(sl5Var2);
        sl5Var2.w.setOnClickListener(new t15(2, this));
        view.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
    }
}
