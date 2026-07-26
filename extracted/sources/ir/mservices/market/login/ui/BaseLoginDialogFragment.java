package ir.mservices.market.login.ui;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.window.OnBackInvokedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.d04;
import defpackage.d87;
import defpackage.e87;
import defpackage.f88;
import defpackage.fa1;
import defpackage.h79;
import defpackage.js3;
import defpackage.js6;
import defpackage.ln1;
import defpackage.p3;
import defpackage.q57;
import defpackage.rr6;
import defpackage.s57;
import defpackage.sj8;
import defpackage.tx8;
import defpackage.u70;
import defpackage.yl;
import defpackage.yq6;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PinBindData;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.LoginInfoView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.PaymentPriceView;
import ir.mservices.market.virtualKeyboard.VirtualKeyboardView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseLoginDialogFragment extends Hilt_BaseLoginDialogFragment {
    public d04 h1;
    public ln1 i1;

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Object d87Var;
        tx8 tx8Var;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        Dialog dialogC0 = super.C0(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            Window window = dialogC0.getWindow();
            if (window == null || (onBackInvokedDispatcher = window.getOnBackInvokedDispatcher()) == null) {
                tx8Var = null;
            } else {
                onBackInvokedDispatcher.registerOnBackInvokedCallback(0, new yl(2, this));
                tx8Var = tx8.a;
            }
            d87Var = new e87(tx8Var);
        } else {
            d87Var = new d87();
        }
        if (d87Var instanceof d87) {
            dialogC0.setOnKeyListener(new u70(this, 0));
            return dialogC0;
        }
        return dialogC0;
    }

    public abstract View V0(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract LoginData W0();

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.a1 = !(W0().a instanceof PinBindData);
        this.Y0 = true;
        this.c1 = false;
    }

    public String X0() {
        return "";
    }

    public boolean Y0() {
        return true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = ln1.D;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        ln1 ln1Var = (ln1) fa1.c(layoutInflater, js6.dialog_login, viewGroup, false);
        this.i1 = ln1Var;
        js3.m(ln1Var);
        FrameLayout frameLayout = ln1Var.v;
        ln1 ln1Var2 = this.i1;
        js3.m(ln1Var2);
        frameLayout.addView(V0(layoutInflater, ln1Var2.v));
        ln1 ln1Var3 = this.i1;
        js3.m(ln1Var3);
        return ln1Var3.l;
    }

    public boolean Z0() {
        return false;
    }

    public void a1() {
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void b0() {
        this.i1 = null;
        super.b0();
    }

    public final void b1(boolean z) {
        ln1 ln1Var = this.i1;
        js3.m(ln1Var);
        DialogHeaderComponent dialogHeaderComponent = ln1Var.y;
        js3.o(dialogHeaderComponent, "header");
        dialogHeaderComponent.setVisibility(z ? 0 : 8);
        ln1 ln1Var2 = this.i1;
        js3.m(ln1Var2);
        ImageView imageView = ln1Var2.B;
        js3.o(imageView, "logoIcon");
        imageView.setVisibility(!z ? 0 : 8);
        ln1 ln1Var3 = this.i1;
        js3.m(ln1Var3);
        ImageView imageView2 = ln1Var3.C;
        js3.o(imageView2, "logoText");
        imageView2.setVisibility(z ? 8 : 0);
        ln1 ln1Var4 = this.i1;
        js3.m(ln1Var4);
        ViewGroup.LayoutParams layoutParams = ln1Var4.w.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).j = z ? rr6.header : rr6.logo_icon;
    }

    public void c1(String str) {
        js3.p(str, "item");
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public void k0(View view, Bundle bundle) {
        boolean z;
        ConstraintLayout.LayoutParams layoutParams;
        String str;
        js3.p(view, "view");
        super.k0(view, bundle);
        Resources resourcesK = K();
        js3.o(resourcesK, "getResources(...)");
        Drawable drawableMutate = p3.k(resourcesK, yq6.actionbar_logo).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().M, PorterDuff.Mode.MULTIPLY));
        ln1 ln1Var = this.i1;
        js3.m(ln1Var);
        ln1Var.C.setImageDrawable(drawableMutate);
        ln1 ln1Var2 = this.i1;
        js3.m(ln1Var2);
        ImageView imageView = ln1Var2.B;
        Resources resourcesK2 = K();
        js3.o(resourcesK2, "getResources(...)");
        imageView.setImageDrawable(p3.k(resourcesK2, yq6.app_icon_gradient).mutate());
        LoginData loginDataW0 = W0();
        if (Z0()) {
            ir.mservices.market.version2.core.utils.a.c(this, 0L, new BaseLoginDialogFragment$handleData$1(this, null));
            ir.mservices.market.version2.core.utils.a.c(this, 0L, new BaseLoginDialogFragment$handleData$2(this, null));
            ln1 ln1Var3 = this.i1;
            js3.m(ln1Var3);
            ln1Var3.z.setVisibility(4);
            ln1 ln1Var4 = this.i1;
            js3.m(ln1Var4);
            VirtualKeyboardView virtualKeyboardView = ln1Var4.A;
            js3.o(virtualKeyboardView, "keyboard");
            virtualKeyboardView.setVisibility(0);
            ln1 ln1Var5 = this.i1;
            js3.m(ln1Var5);
            View view2 = ln1Var5.x;
            ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
            layoutParams = layoutParams2 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams != null) {
                layoutParams.i = rr6.keyboard;
                layoutParams.l = 0;
                return;
            }
            return;
        }
        ln1 ln1Var6 = this.i1;
        js3.m(ln1Var6);
        LoginInfoView loginInfoView = ln1Var6.z;
        h79 h79Var = loginInfoView.s;
        s57 s57VarF = com.bumptech.glide.a.f(loginInfoView);
        ImageView imageView2 = h79Var.z;
        s57VarF.getClass();
        s57VarF.o(new q57(imageView2));
        ImageView imageView3 = h79Var.z;
        js3.o(imageView3, "icon");
        imageView3.setVisibility(8);
        AppIconView appIconView = h79Var.v;
        js3.m(appIconView);
        AppIconView.setImageUrl$default(appIconView, "", null, false, 6, null);
        appIconView.setVisibility(8);
        PaymentPriceView paymentPriceView = h79Var.w;
        paymentPriceView.setPrice("", "");
        paymentPriceView.setVisibility(8);
        MyketTextView myketTextView = h79Var.x;
        myketTextView.setText("");
        myketTextView.setVisibility(8);
        MyketTextView myketTextView2 = h79Var.B;
        myketTextView2.setText("");
        myketTextView2.setVisibility(8);
        MyketTextView myketTextView3 = h79Var.y;
        myketTextView3.setText("");
        myketTextView3.setVisibility(8);
        h79Var.A.setText("");
        boolean z2 = this instanceof LoginDialogFragment;
        if (z2) {
            String str2 = loginDataW0.f;
            String str3 = loginDataW0.h;
            if ((str2 == null || f88.n0(str2)) && ((str = loginDataW0.g) == null || f88.n0(str))) {
                if (str3 != null && !f88.n0(str3)) {
                    ln1 ln1Var7 = this.i1;
                    js3.m(ln1Var7);
                    ln1Var7.z.setOtherData(loginDataW0.d, loginDataW0.e, str3);
                }
                z = false;
            } else {
                ln1 ln1Var8 = this.i1;
                js3.m(ln1Var8);
                ln1Var8.z.setAppData(loginDataW0.d, loginDataW0.e, loginDataW0.f, loginDataW0.g, loginDataW0.j);
            }
            z = true;
        } else {
            z = false;
        }
        ln1 ln1Var9 = this.i1;
        js3.m(ln1Var9);
        LoginInfoView loginInfoView2 = ln1Var9.z;
        js3.m(loginInfoView2);
        loginInfoView2.setVisibility(z ? 0 : 8);
        loginInfoView2.setMessage(X0());
        boolean z3 = z2 && z;
        ln1 ln1Var10 = this.i1;
        js3.m(ln1Var10);
        ViewGroup.LayoutParams layoutParams3 = ln1Var10.z.getLayoutParams();
        js3.n(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        ln1 ln1Var11 = this.i1;
        js3.m(ln1Var11);
        ViewGroup.LayoutParams layoutParams5 = ln1Var11.v.getLayoutParams();
        js3.n(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        boolean z4 = N0().c() == 2;
        if (z3 && z4) {
            ln1 ln1Var12 = this.i1;
            js3.m(ln1Var12);
            LoginInfoView loginInfoView3 = ln1Var12.z;
            loginInfoView3.setMessageGravity(17);
            loginInfoView3.setAppDataLayout(true);
            ln1 ln1Var13 = this.i1;
            js3.m(ln1Var13);
            View view3 = ln1Var13.x;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            layoutParams6.R = 0.6f;
            layoutParams6.j = rr6.divider;
            layoutParams4.R = 0.4f;
            layoutParams4.k = -1;
            layoutParams4.l = 0;
            d04 d04Var = this.h1;
            if (d04Var == null) {
                js3.V("languageHelper");
                throw null;
            }
            if (d04Var.f()) {
                layoutParams4.f = rr6.content;
                layoutParams4.g = -1;
                layoutParams4.e = -1;
                layoutParams4.h = 0;
                layoutParams6.g = rr6.info;
                layoutParams6.f = -1;
                layoutParams6.h = -1;
                layoutParams6.e = 0;
            } else {
                layoutParams4.f = -1;
                layoutParams4.g = rr6.content;
                layoutParams4.e = 0;
                layoutParams4.h = -1;
                layoutParams6.g = -1;
                layoutParams6.f = rr6.info;
                layoutParams6.h = 0;
                layoutParams6.e = -1;
            }
        } else {
            ln1 ln1Var14 = this.i1;
            js3.m(ln1Var14);
            LoginInfoView loginInfoView4 = ln1Var14.z;
            d04 d04Var2 = this.h1;
            if (d04Var2 == null) {
                js3.V("languageHelper");
                throw null;
            }
            loginInfoView4.setMessageGravity(d04Var2.f() ? 5 : 3);
            loginInfoView4.setAppDataLayout(false);
            ln1 ln1Var15 = this.i1;
            js3.m(ln1Var15);
            View view4 = ln1Var15.x;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            layoutParams4.R = 1.0f;
            layoutParams4.k = rr6.content;
            layoutParams4.l = -1;
            layoutParams4.f = -1;
            layoutParams4.g = -1;
            layoutParams4.e = 0;
            layoutParams4.h = 0;
            layoutParams6.R = 1.0f;
            layoutParams6.j = rr6.info;
            layoutParams6.g = -1;
            layoutParams6.f = -1;
            layoutParams6.h = 0;
            layoutParams6.e = 0;
        }
        ln1 ln1Var16 = this.i1;
        js3.m(ln1Var16);
        ln1Var16.z.requestLayout();
        ln1 ln1Var17 = this.i1;
        js3.m(ln1Var17);
        ln1Var17.v.requestLayout();
        ln1 ln1Var18 = this.i1;
        js3.m(ln1Var18);
        VirtualKeyboardView virtualKeyboardView2 = ln1Var18.A;
        js3.o(virtualKeyboardView2, "keyboard");
        virtualKeyboardView2.setVisibility(8);
        ln1 ln1Var19 = this.i1;
        js3.m(ln1Var19);
        View view5 = ln1Var19.x;
        ViewGroup.LayoutParams layoutParams7 = view5 != null ? view5.getLayoutParams() : null;
        layoutParams = layoutParams7 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams != null) {
            layoutParams.i = rr6.info;
            layoutParams.l = 0;
        }
    }
}
