package ir.mservices.market.pika.home.dialog;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a86;
import defpackage.bi5;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.ml5;
import defpackage.n15;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t15;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class PikaPermissionBottomDialog extends Hilt_PikaPermissionBottomDialog {
    public ml5 h1;
    public final bi5 i1 = new bi5(g27.a(a86.class), new n15(18, this));

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String K0() {
        return "";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((a86) this.i1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "PikaPermissionBottomDialog";
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
        int i = ml5.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        ml5 ml5Var = (ml5) fa1.c(layoutInflater, js6.nearby_permission_alert_dialog, null, false);
        this.h1 = ml5Var;
        js3.m(ml5Var);
        View view = ml5Var.l;
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
        ml5 ml5Var = this.h1;
        js3.m(ml5Var);
        ml5Var.x.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
        ml5 ml5Var2 = this.h1;
        js3.m(ml5Var2);
        ml5Var2.w.setTitles(K().getString(rs6.access_txt_btn), K().getString(rs6.not_now));
        ml5 ml5Var3 = this.h1;
        js3.m(ml5Var3);
        ml5Var3.w.setOnClickListener(new t15(5, this));
    }
}
