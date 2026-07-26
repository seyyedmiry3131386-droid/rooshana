package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.f57;
import defpackage.f88;
import defpackage.fa1;
import defpackage.h79;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw;
import defpackage.ne5;
import defpackage.rr6;
import defpackage.t61;
import defpackage.uv1;
import defpackage.yq6;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class LoginInfoView extends Hilt_LoginInfoView {
    public final h79 s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginInfoView(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public final void setAppData(String str, String str2, String str3, String str4, boolean z) {
        h79 h79Var = this.s;
        AppIconView appIconView = h79Var.v;
        PaymentPriceView paymentPriceView = h79Var.w;
        js3.m(appIconView);
        appIconView.setVisibility(0);
        appIconView.setErrorImageResId(yq6.icon);
        AppIconView.setImageUrl$default(appIconView, str, null, false, 6, null);
        MyketTextView myketTextView = h79Var.x;
        js3.m(myketTextView);
        myketTextView.setVisibility(!(str2 == null || f88.n0(str2)) ? 0 : 8);
        myketTextView.setText(str2);
        js3.o(paymentPriceView, "appPrice");
        boolean z2 = (str3 == null || f88.n0(str3) || z) ? false : true;
        if (z2) {
            paymentPriceView.setPrice(str3, str4);
        }
        paymentPriceView.setVisibility(z2 ? 0 : 8);
        ImageView imageView = h79Var.z;
        js3.o(imageView, "icon");
        imageView.setVisibility(8);
        MyketTextView myketTextView2 = h79Var.B;
        js3.o(myketTextView2, "title");
        myketTextView2.setVisibility(8);
        MyketTextView myketTextView3 = h79Var.y;
        js3.o(myketTextView3, PackageListMetaDataDTO.KEY_DESCRIPTION);
        myketTextView3.setVisibility(8);
    }

    public final void setAppDataLayout(boolean z) {
        h79 h79Var = this.s;
        ViewGroup.LayoutParams layoutParams = h79Var.v.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        MyketTextView myketTextView = h79Var.x;
        ViewGroup.LayoutParams layoutParams3 = myketTextView.getLayoutParams();
        js3.n(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        PaymentPriceView paymentPriceView = h79Var.w;
        ViewGroup.LayoutParams layoutParams5 = paymentPriceView.getLayoutParams();
        js3.n(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        if (z) {
            ConstraintLayout.LayoutParams[] layoutParamsArr = {layoutParams2, layoutParams6, layoutParams4};
            for (int i = 0; i < 3; i++) {
                ConstraintLayout.LayoutParams layoutParams7 = layoutParamsArr[i];
                layoutParams7.t = 0;
                layoutParams7.v = 0;
                layoutParams7.s = -1;
                layoutParams7.u = -1;
            }
            layoutParams6.l = -1;
            layoutParams4.j = rr6.app_icon;
            layoutParams4.i = -1;
        } else {
            layoutParams2.t = 0;
            int i2 = rr6.app_icon;
            layoutParams4.s = i2;
            layoutParams4.i = i2;
            layoutParams4.j = -1;
            layoutParams6.l = i2;
            layoutParams6.t = rr6.app_title;
        }
        paymentPriceView.requestLayout();
        myketTextView.requestLayout();
        h79Var.v.requestLayout();
    }

    public final void setMessage(String str) {
        if (str != null && !f88.n0(str)) {
            setVisibility(0);
        }
        this.s.A.setText(str);
    }

    public final void setMessageGravity(int i) {
        this.s.A.setGravity(i);
    }

    public final void setOtherData(String str, String str2, String str3) {
        f57 f57VarH;
        h79 h79Var = this.s;
        AppIconView appIconView = h79Var.v;
        js3.o(appIconView, "appIcon");
        int i = 8;
        appIconView.setVisibility(8);
        MyketTextView myketTextView = h79Var.x;
        js3.o(myketTextView, "appTitle");
        myketTextView.setVisibility(8);
        PaymentPriceView paymentPriceView = h79Var.w;
        js3.o(paymentPriceView, "appPrice");
        paymentPriceView.setVisibility(8);
        ImageView imageView = h79Var.z;
        js3.o(imageView, "icon");
        imageView.setVisibility((str == null || f88.n0(str)) ? 8 : 0);
        if (str != null && !f88.n0(str)) {
            if (f88.n0(str)) {
                lw.g(null, "url is empty", null);
                str = "empty_url";
            }
            try {
                f57VarH = com.bumptech.glide.a.f(this).q(new ne5(str, null));
                js3.m(f57VarH);
            } catch (Exception unused) {
                f57VarH = t61.h(str, null, com.bumptech.glide.a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
            }
            ((f57) ((f57) f57VarH.k(yq6.icon)).m()).W(uv1.b()).P(imageView);
        }
        MyketTextView myketTextView2 = h79Var.B;
        js3.m(myketTextView2);
        myketTextView2.setVisibility((str2 == null || f88.n0(str2)) ? 8 : 0);
        myketTextView2.setText(str2);
        MyketTextView myketTextView3 = h79Var.y;
        js3.m(myketTextView3);
        if (str3 != null && !f88.n0(str3)) {
            i = 0;
        }
        myketTextView3.setVisibility(i);
        myketTextView3.setText(str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = h79.C;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        h79 h79Var = (h79) a79.f0(layoutInflaterFrom, js6.view_login_info, this, true, null);
        js3.o(h79Var, "inflate(...)");
        this.s = h79Var;
        AppIconView appIconView = h79Var.v;
        js3.o(appIconView, "appIcon");
        appIconView.setVisibility(8);
        MyketTextView myketTextView = h79Var.x;
        js3.o(myketTextView, "appTitle");
        myketTextView.setVisibility(8);
        PaymentPriceView paymentPriceView = h79Var.w;
        js3.o(paymentPriceView, "appPrice");
        paymentPriceView.setVisibility(8);
        ImageView imageView = h79Var.z;
        js3.o(imageView, "icon");
        imageView.setVisibility(8);
        MyketTextView myketTextView2 = h79Var.B;
        js3.o(myketTextView2, "title");
        myketTextView2.setVisibility(8);
        MyketTextView myketTextView3 = h79Var.y;
        js3.o(myketTextView3, PackageListMetaDataDTO.KEY_DESCRIPTION);
        myketTextView3.setVisibility(8);
    }

    public /* synthetic */ LoginInfoView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
