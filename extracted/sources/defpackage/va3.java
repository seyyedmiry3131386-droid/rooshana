package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.app.home.ui.recycler.HomeBannerAppData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.HomeBannerAppDto;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class va3 extends za3 {
    public final int x;
    public t23 y;

    public va3(int i, View view) {
        super(view);
        this.x = i;
        view.getLayoutParams().width = i;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        HomeBannerAppData homeBannerAppData = (HomeBannerAppData) myketRecyclerData;
        js3.p(homeBannerAppData, "data");
        HomeBannerAppDto homeBannerAppDto = homeBannerAppData.a;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.default_image_corner_radius);
        int dimensionPixelOffset = this.x - (view.getResources().getDimensionPixelOffset(pq6.space_8) + (view.getResources().getDimensionPixelOffset(pq6.horizontal_space_inner) * 2));
        int i = (int) ((712 * dimensionPixelOffset) / 1080);
        t23 t23Var = this.y;
        if (t23Var == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = t23Var.A;
        js3.m(frameLayout);
        uy6.q(frameLayout, 0, Float.valueOf(dimensionPixelSize), 1);
        frameLayout.getLayoutParams().width = dimensionPixelOffset;
        frameLayout.getLayoutParams().height = i;
        frameLayout.requestLayout();
        t23 t23Var2 = this.y;
        if (t23Var2 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout2 = t23Var2.A;
        js3.o(frameLayout2, "clickableLayout");
        qg5.v(frameLayout2, this.w, this, homeBannerAppData);
        t23 t23Var3 = this.y;
        if (t23Var3 == null) {
            js3.V("binding");
            throw null;
        }
        ScreenshotView screenshotView = t23Var3.z;
        js3.m(screenshotView);
        Object obj = lw8.b;
        String bannerBg = homeBannerAppDto.getBannerBg();
        int color = sj8.b().p;
        try {
            color = Color.parseColor(bannerBg);
        } catch (Exception unused) {
        }
        ScreenshotView.setStyle$default(screenshotView, Integer.valueOf(color), null, null, 6, null);
        screenshotView.setSize(dimensionPixelOffset, i);
        screenshotView.c(homeBannerAppDto.getBlurUrl(), homeBannerAppDto.getBannerUrl());
        t23 t23Var4 = this.y;
        if (t23Var4 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = t23Var4.x.getLayoutParams();
        layoutParams.width = dimensionPixelOffset;
        layoutParams.height = (i * 211) / 712;
        t23 t23Var5 = this.y;
        if (t23Var5 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams2 = t23Var5.w.getLayoutParams();
        int i2 = (dimensionPixelOffset * 173) / 1080;
        layoutParams2.width = i2;
        layoutParams2.height = i2;
        int i3 = (dimensionPixelOffset * 19) / 1080;
        t23 t23Var6 = this.y;
        if (t23Var6 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams3 = t23Var6.w.getLayoutParams();
        js3.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).setMarginStart(view.getResources().getDimensionPixelSize(pq6.space_8));
        t23 t23Var7 = this.y;
        if (t23Var7 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams4 = t23Var7.y.getLayoutParams();
        js3.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams4).setMarginStart(i3);
        t23 t23Var8 = this.y;
        if (t23Var8 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams5 = t23Var8.v.getLayoutParams();
        js3.n(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams5).setMarginStart(i3);
        t23 t23Var9 = this.y;
        if (t23Var9 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams6 = t23Var9.z.getLayoutParams();
        js3.n(layoutParams6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams6).E = Double.valueOf(0.5d).floatValue();
        t23 t23Var10 = this.y;
        if (t23Var10 == null) {
            js3.V("binding");
            throw null;
        }
        t23Var10.y.setText(homeBannerAppDto.getApp().getTitle());
        t23 t23Var11 = this.y;
        if (t23Var11 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = t23Var11.w;
        appIconView.setErrorImageResId(yq6.icon);
        AppIconView.setImageUrl$default(appIconView, homeBannerAppDto.getApp().getIconPath(), null, false, 6, null);
        t23 t23Var12 = this.y;
        if (t23Var12 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView2 = t23Var12.w;
        String strN = dw1.n("image_", homeBannerAppDto.getApp().getPackageName());
        WeakHashMap weakHashMap = q69.a;
        h69.n(appIconView2, strN);
        ApplicationDTO app = homeBannerAppDto.getApp();
        js3.p(app, "data");
        app.isIncompatible();
        app.getPackageName();
        app.getTitle();
        app.isFree();
        app.getButtonText();
        app.getRealPrice();
        app.hasIAP();
        app.getVersion();
        app.getVersionCode();
        app.getFileSize();
        app.hasMainData();
        app.hasPatchData();
        app.getIconPath();
        app.getCategoryName();
        app.getForceUpdate();
        Bundle bundle = new Bundle();
        bundle.putString("refId", homeBannerAppDto.getApp().getRefId());
        bundle.putString("BUNDLE_KEY_CALLBACK_URL", homeBannerAppDto.getApp().getCallbackUrl());
        bundle.putString("installCallbackUrl", homeBannerAppDto.getApp().getInstallCallbackUrl());
        bundle.putString("BUNDLE_KEY_DOWNLOAD_REF", CommonDataKt.HOME_MOVIE_TYPE_LIST);
        t23 t23Var13 = this.y;
        if (t23Var13 == null) {
            js3.V("binding");
            throw null;
        }
        View view2 = t23Var13.x;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.f = dimensionPixelSize;
        ea7Var.b();
        ea7Var.g = dimensionPixelSize;
        ea7Var.b();
        ea7Var.d = 0;
        ea7Var.b();
        ea7Var.e = 0;
        ea7Var.b();
        ea7Var.h = 0;
        Object obj2 = lw8.b;
        String appBg = homeBannerAppDto.getAppBg();
        int color2 = sj8.b().N;
        try {
            color2 = Color.parseColor(appBg);
        } catch (Exception unused2) {
        }
        ea7Var.b = color2;
        ea7Var.j = true;
        view2.setBackground(ea7Var.a());
        t23 t23Var14 = this.y;
        if (t23Var14 == null) {
            js3.V("binding");
            throw null;
        }
        t23Var14.v.setData(homeBannerAppDto.getApp().getAdInfoDto());
        t23 t23Var15 = this.y;
        if (t23Var15 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = t23Var15.y;
        MyketAdInfoView myketAdInfoView = t23Var15.v;
        js3.o(myketAdInfoView, "adInfo");
        myketTextView.setMaxLines(myketAdInfoView.getVisibility() != 0 ? 2 : 1);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof t23) {
            this.y = (t23) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // defpackage.za3
    public final ImageView x() {
        t23 t23Var = this.y;
        if (t23Var == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = t23Var.w;
        js3.o(appIconView, "appIcon");
        return appIconView;
    }
}
