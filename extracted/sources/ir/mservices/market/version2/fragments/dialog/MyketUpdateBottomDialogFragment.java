package ir.mservices.market.version2.fragments.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bi5;
import defpackage.c35;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.n15;
import defpackage.qs6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.yf5;
import defpackage.zf5;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketUpdateBottomDialogFragment extends BaseNewBottomDialogFragment {
    public zf5 e1;
    public final bi5 f1 = new bi5(g27.a(yf5.class), new n15(6, this));

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((yf5) this.f1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "MyketUpdateBottomDialogFragment";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.a1 = true;
        this.Z0 = false;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = zf5.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        zf5 zf5Var = (zf5) fa1.c(layoutInflater, js6.myket_update_dialog, null, false);
        this.e1 = zf5Var;
        js3.m(zf5Var);
        View view = zf5Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.e1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        zf5 zf5Var = this.e1;
        js3.m(zf5Var);
        LottieAnimationView lottieAnimationView = zf5Var.z;
        js3.o(lottieAnimationView, "updateAnimation");
        ir.mservices.market.core.ext.a.e(lottieAnimationView, qs6.update_illustration);
        zf5 zf5Var2 = this.e1;
        js3.m(zf5Var2);
        MyketTextView myketTextView = zf5Var2.y;
        myketTextView.setTextColor(sj8.b().m);
        bi5 bi5Var = this.f1;
        myketTextView.setText(((yf5) bi5Var.getValue()).b);
        String str = ((yf5) bi5Var.getValue()).b;
        myketTextView.setVisibility((str == null || f88.n0(str)) ? 8 : 0);
        zf5 zf5Var3 = this.e1;
        js3.m(zf5Var3);
        MyketTextView myketTextView2 = zf5Var3.v;
        myketTextView2.setText(((yf5) bi5Var.getValue()).c);
        myketTextView2.setTextColor(sj8.b().n);
        zf5 zf5Var4 = this.e1;
        js3.m(zf5Var4);
        DialogButtonComponent dialogButtonComponent = zf5Var4.w;
        dialogButtonComponent.setTitles(dialogButtonComponent.getResources().getString(rs6.update_app), null);
        dialogButtonComponent.setPrimaryColor(sj8.b().c, sj8.b().d);
        dialogButtonComponent.setOnClickListener(new c35(1, this));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new MyketUpdateBottomDialogFragment$onViewCreated$4(this, null));
    }
}
