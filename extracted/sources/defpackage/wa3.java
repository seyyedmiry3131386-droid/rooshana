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
public final class wa3 extends za3 {
    public final int x;
    public s82 y;
    public r23 z;

    public wa3(int i, View view) {
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
        r23 r23Var = this.z;
        if (r23Var == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = r23Var.A;
        js3.m(frameLayout);
        uy6.q(frameLayout, 0, Float.valueOf(dimensionPixelSize), 1);
        frameLayout.getLayoutParams().width = dimensionPixelOffset;
        frameLayout.getLayoutParams().height = i;
        frameLayout.requestLayout();
        r23 r23Var2 = this.z;
        if (r23Var2 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout2 = r23Var2.A;
        js3.o(frameLayout2, "clickableLayout");
        qg5.v(frameLayout2, this.w, this, homeBannerAppData);
        r23 r23Var3 = this.z;
        if (r23Var3 == null) {
            js3.V("binding");
            throw null;
        }
        ScreenshotView screenshotView = r23Var3.z;
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
        r23 r23Var4 = this.z;
        if (r23Var4 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = r23Var4.x.getLayoutParams();
        layoutParams.width = dimensionPixelOffset;
        layoutParams.height = (i * 211) / 712;
        r23 r23Var5 = this.z;
        if (r23Var5 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams2 = r23Var5.w.getLayoutParams();
        int i2 = (dimensionPixelOffset * 173) / 1080;
        layoutParams2.width = i2;
        layoutParams2.height = i2;
        int i3 = (dimensionPixelOffset * 19) / 1080;
        r23 r23Var6 = this.z;
        if (r23Var6 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams3 = r23Var6.w.getLayoutParams();
        js3.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).setMarginStart(view.getResources().getDimensionPixelSize(pq6.space_8));
        r23 r23Var7 = this.z;
        if (r23Var7 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams4 = r23Var7.B.getLayoutParams();
        js3.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams4).setMarginEnd(view.getResources().getDimensionPixelSize(pq6.space_8));
        r23 r23Var8 = this.z;
        if (r23Var8 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams5 = r23Var8.y.getLayoutParams();
        js3.n(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams5).setMarginStart(i3);
        r23 r23Var9 = this.z;
        if (r23Var9 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams6 = r23Var9.v.getLayoutParams();
        js3.n(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams6).setMarginStart(i3);
        r23 r23Var10 = this.z;
        if (r23Var10 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams7 = r23Var10.z.getLayoutParams();
        js3.n(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams7).E = Double.valueOf(0.5d).floatValue();
        r23 r23Var11 = this.z;
        if (r23Var11 == null) {
            js3.V("binding");
            throw null;
        }
        r23Var11.y.setText(homeBannerAppDto.getApp().getTitle());
        r23 r23Var12 = this.z;
        if (r23Var12 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = r23Var12.w;
        appIconView.setErrorImageResId(yq6.icon);
        AppIconView.setImageUrl$default(appIconView, homeBannerAppDto.getApp().getIconPath(), null, false, 6, null);
        r23 r23Var13 = this.z;
        if (r23Var13 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView2 = r23Var13.w;
        String strN = dw1.n("image_", homeBannerAppDto.getApp().getPackageName());
        WeakHashMap weakHashMap = q69.a;
        h69.n(appIconView2, strN);
        ApplicationDTO app = homeBannerAppDto.getApp();
        js3.p(app, "data");
        boolean zIsIncompatible = app.isIncompatible();
        String packageName = app.getPackageName();
        String title = app.getTitle();
        boolean zIsFree = app.isFree();
        String buttonText = app.getButtonText();
        app.getRealPrice();
        app.hasIAP();
        app.getVersion();
        int versionCode = app.getVersionCode();
        long fileSize = app.getFileSize();
        boolean zHasMainData = app.hasMainData();
        boolean zHasPatchData = app.hasPatchData();
        String iconPath = app.getIconPath();
        app.getCategoryName();
        r82 r82Var = new r82(zIsIncompatible, packageName, title, zIsFree, buttonText, versionCode, fileSize, zHasMainData, zHasPatchData, iconPath, app.getForceUpdate());
        String refId = homeBannerAppDto.getApp().getRefId();
        Bundle bundle = r82Var.k;
        bundle.putString("refId", refId);
        bundle.putString("BUNDLE_KEY_CALLBACK_URL", homeBannerAppDto.getApp().getCallbackUrl());
        bundle.putString("installCallbackUrl", homeBannerAppDto.getApp().getInstallCallbackUrl());
        bundle.putString("BUNDLE_KEY_DOWNLOAD_REF", CommonDataKt.HOME_MOVIE_TYPE_LIST);
        r23 r23Var14 = this.z;
        if (r23Var14 == null) {
            js3.V("binding");
            throw null;
        }
        r23Var14.B.setData(r82Var, this.y);
        r23 r23Var15 = this.z;
        if (r23Var15 == null) {
            js3.V("binding");
            throw null;
        }
        View view2 = r23Var15.x;
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
        r23 r23Var16 = this.z;
        if (r23Var16 == null) {
            js3.V("binding");
            throw null;
        }
        r23Var16.v.setData(homeBannerAppDto.getApp().getAdInfoDto());
        r23 r23Var17 = this.z;
        if (r23Var17 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = r23Var17.y;
        MyketAdInfoView myketAdInfoView = r23Var17.v;
        js3.o(myketAdInfoView, "adInfo");
        myketTextView.setMaxLines(myketAdInfoView.getVisibility() != 0 ? 2 : 1);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof r23) {
            this.z = (r23) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // defpackage.za3
    public final ImageView x() {
        r23 r23Var = this.z;
        if (r23Var == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = r23Var.w;
        js3.o(appIconView, "appIcon");
        return appIconView;
    }
}
