package ir.mservices.market.version2.fragments.dialog;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.bn6;
import defpackage.d04;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.lp8;
import defpackage.lw8;
import defpackage.np8;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.tf5;
import defpackage.yw6;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketTextView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingAppPaymentBottomDialogFragment extends Hilt_TrackingAppPaymentBottomDialogFragment {
    public np8 h1;
    public final bi5 i1 = new bi5(g27.a(lp8.class), new yw6(23, this));
    public ir.mservices.market.version2.services.e j1;
    public d04 k1;

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((lp8) this.i1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "TrackingAppPaymentBottomDialogFragment";
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
        int i = np8.C;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        np8 np8Var = (np8) fa1.c(layoutInflater, js6.tracking_app_payment_content, null, false);
        this.h1 = np8Var;
        js3.m(np8Var);
        View view = np8Var.l;
        js3.o(view, "getRoot(...)");
        d04 d04Var = this.k1;
        if (d04Var != null) {
            view.setLayoutDirection(d04Var.c());
            return view;
        }
        js3.V("languageHelper");
        throw null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.h1 = null;
        super.b0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void j0() {
        super.j0();
        P0();
        lw8.b(F());
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        np8 np8Var = this.h1;
        js3.m(np8Var);
        np8Var.z.setBackgroundColor(Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{48, Integer.valueOf(sj8.b().x & 16777215)}, 2))));
        np8 np8Var2 = this.h1;
        js3.m(np8Var2);
        np8Var2.y.getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().x, PorterDuff.Mode.MULTIPLY));
        String str = ((lp8) this.i1.getValue()).b;
        if (str == null) {
            str = "";
        }
        np8 np8Var3 = this.h1;
        js3.m(np8Var3);
        MyketTextView myketTextView = np8Var3.B;
        myketTextView.setBackground(null);
        myketTextView.setText(str);
        myketTextView.setVisibility(f88.n0(str) ? 8 : 0);
        myketTextView.setOnClickListener(new tf5(myketTextView, this, str, 5));
        np8 np8Var4 = this.h1;
        js3.m(np8Var4);
        DialogButtonComponent dialogButtonComponent = np8Var4.v;
        dialogButtonComponent.setTitles(L(rs6.purchase_done), null);
        dialogButtonComponent.setOnClickListener(new bn6(this, str, 11));
    }
}
