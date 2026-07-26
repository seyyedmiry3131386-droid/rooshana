package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.bumptech.glide.a;
import ir.mservices.market.app.home.data.HugeBannerDto;
import ir.mservices.market.app.home.ui.recycler.HugeBannerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketAdInfoView;
import ir.mservices.market.views.MyketTextView;
import ir.myket.core.utils.GraphicUtils$Dimension;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class xe3 extends qg5 {
    public b33 A;
    public final float B;
    public final /* synthetic */ int C;
    public final GraphicUtils$Dimension w;
    public final og5 x;
    public final s82 y;
    public d04 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe3(View view, GraphicUtils$Dimension graphicUtils$Dimension, og5 og5Var, s82 s82Var, int i) {
        super(view);
        this.C = i;
        this.w = graphicUtils$Dimension;
        this.x = og5Var;
        this.y = s82Var;
        this.B = 1.0f;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        float f;
        f57 f57VarH;
        HugeBannerData hugeBannerData = (HugeBannerData) myketRecyclerData;
        js3.p(hugeBannerData, "data");
        b33 b33Var = this.A;
        if (b33Var == null) {
            js3.V("binding");
            throw null;
        }
        CardView cardView = b33Var.A;
        js3.m(cardView);
        View view = this.a;
        uy6.q(cardView, 0, Float.valueOf(view.getResources().getDimensionPixelSize(pq6.space_8)), 1);
        cardView.setCardBackgroundColor(sj8.b().p);
        b33 b33Var2 = this.A;
        if (b33Var2 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = b33Var2.A.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_12);
        layoutParams2.leftMargin = dimensionPixelSize;
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams2.topMargin = dimensionPixelSize / 3;
        layoutParams2.bottomMargin = dimensionPixelSize;
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.huge_banner_max_width);
        int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.huge_banner_max_height);
        float f2 = 1188;
        switch (this.C) {
            case 1:
                f = 0.6f;
                break;
            default:
                f = this.B;
                break;
        }
        int iCeil = (int) Math.ceil(f * f2);
        GraphicUtils$Dimension graphicUtils$Dimension = this.w;
        if (dimensionPixelSize2 < graphicUtils$Dimension.a) {
            b33 b33Var3 = this.A;
            if (b33Var3 == null) {
                js3.V("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams3 = b33Var3.z.getLayoutParams();
            if (1080 <= dimensionPixelSize2) {
                dimensionPixelSize2 = 1080;
            }
            layoutParams3.width = dimensionPixelSize2;
            if (iCeil <= dimensionPixelSize3) {
                dimensionPixelSize3 = iCeil;
            }
            layoutParams3.height = dimensionPixelSize3;
        } else {
            b33 b33Var4 = this.A;
            if (b33Var4 == null) {
                js3.V("binding");
                throw null;
            }
            int paddingLeft = b33Var4.A.getPaddingLeft();
            b33 b33Var5 = this.A;
            if (b33Var5 == null) {
                js3.V("binding");
                throw null;
            }
            int paddingRight = b33Var5.A.getPaddingRight() + paddingLeft;
            b33 b33Var6 = this.A;
            if (b33Var6 == null) {
                js3.V("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams4 = b33Var6.z.getLayoutParams();
            layoutParams4.width = ((graphicUtils$Dimension.a - layoutParams2.leftMargin) - layoutParams2.rightMargin) - paddingRight;
            if (this.A == null) {
                js3.V("binding");
                throw null;
            }
            layoutParams4.height = (int) ((r3.z.getLayoutParams().width * iCeil) / 1080);
        }
        b33 b33Var7 = this.A;
        if (b33Var7 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams5 = b33Var7.x.getLayoutParams();
        b33 b33Var8 = this.A;
        if (b33Var8 == null) {
            js3.V("binding");
            throw null;
        }
        layoutParams5.height = (211 * b33Var8.z.getLayoutParams().height) / iCeil;
        b33 b33Var9 = this.A;
        if (b33Var9 == null) {
            js3.V("binding");
            throw null;
        }
        int i = (51 * b33Var9.z.getLayoutParams().width) / 1080;
        d04 d04Var = this.z;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        if (d04Var.f()) {
            b33 b33Var10 = this.A;
            if (b33Var10 == null) {
                js3.V("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams6 = b33Var10.w.getLayoutParams();
            js3.n(layoutParams6, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams6).rightMargin = i;
            b33 b33Var11 = this.A;
            if (b33Var11 == null) {
                js3.V("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams7 = b33Var11.B.getLayoutParams();
            js3.n(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams7).leftMargin = i;
            b33 b33Var12 = this.A;
            if (b33Var12 == null) {
                js3.V("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams8 = b33Var12.y.getLayoutParams();
            js3.n(layoutParams8, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) layoutParams8;
            b33 b33Var13 = this.A;
            if (b33Var13 == null) {
                js3.V("binding");
                throw null;
            }
            layoutParams9.rightMargin = (b33Var13.z.getLayoutParams().width * 19) / 1080;
            b33 b33Var14 = this.A;
            if (b33Var14 == null) {
                js3.V("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams10 = b33Var14.v.getLayoutParams();
            js3.n(layoutParams10, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams11 = (LinearLayout.LayoutParams) layoutParams10;
            b33 b33Var15 = this.A;
            if (b33Var15 == null) {
                js3.V("binding");
                throw null;
            }
            layoutParams11.rightMargin = (19 * b33Var15.z.getLayoutParams().width) / 1080;
        } else {
            b33 b33Var16 = this.A;
            if (b33Var16 == null) {
                js3.V("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams12 = b33Var16.w.getLayoutParams();
            js3.n(layoutParams12, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams12).leftMargin = i;
            b33 b33Var17 = this.A;
            if (b33Var17 == null) {
                js3.V("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams13 = b33Var17.B.getLayoutParams();
            js3.n(layoutParams13, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams13).rightMargin = i;
            b33 b33Var18 = this.A;
            if (b33Var18 == null) {
                js3.V("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams14 = b33Var18.y.getLayoutParams();
            js3.n(layoutParams14, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams15 = (LinearLayout.LayoutParams) layoutParams14;
            b33 b33Var19 = this.A;
            if (b33Var19 == null) {
                js3.V("binding");
                throw null;
            }
            layoutParams15.leftMargin = (b33Var19.z.getLayoutParams().width * 19) / 1080;
            b33 b33Var20 = this.A;
            if (b33Var20 == null) {
                js3.V("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams16 = b33Var20.v.getLayoutParams();
            js3.n(layoutParams16, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams17 = (LinearLayout.LayoutParams) layoutParams16;
            b33 b33Var21 = this.A;
            if (b33Var21 == null) {
                js3.V("binding");
                throw null;
            }
            layoutParams17.leftMargin = (19 * b33Var21.z.getLayoutParams().width) / 1080;
        }
        b33 b33Var22 = this.A;
        if (b33Var22 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams18 = b33Var22.w.getLayoutParams();
        b33 b33Var23 = this.A;
        if (b33Var23 == null) {
            js3.V("binding");
            throw null;
        }
        layoutParams18.width = (b33Var23.z.getLayoutParams().width * 173) / 1080;
        b33 b33Var24 = this.A;
        if (b33Var24 == null) {
            js3.V("binding");
            throw null;
        }
        layoutParams18.height = (173 * b33Var24.z.getLayoutParams().width) / 1080;
        b33 b33Var25 = this.A;
        if (b33Var25 == null) {
            js3.V("binding");
            throw null;
        }
        FastDownloadView fastDownloadView = b33Var25.B;
        fastDownloadView.setSolidBackgroundColor(Integer.valueOf(sj8.b().c));
        fastDownloadView.setStrokeSize(0);
        fastDownloadView.setTextColor(-1);
        HugeBannerDto hugeBannerDto = hugeBannerData.a;
        b33 b33Var26 = this.A;
        if (b33Var26 == null) {
            js3.V("binding");
            throw null;
        }
        CardView cardView2 = b33Var26.A;
        Object obj = lw8.b;
        String bannerBg = hugeBannerDto.getBannerBg();
        int color = sj8.b().p;
        try {
            color = Color.parseColor(bannerBg);
        } catch (Exception unused) {
        }
        cardView2.setCardBackgroundColor(color);
        String bannerUrl = hugeBannerDto.getBannerUrl();
        if (bannerUrl == null || f88.n0(bannerUrl)) {
            lw.g(null, "url is empty", null);
            bannerUrl = "empty_url";
        }
        try {
            f57VarH = a.f(view).q(new ne5(bannerUrl, null));
            js3.m(f57VarH);
        } catch (Exception unused2) {
            f57VarH = t61.h(bannerUrl, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
        }
        f57 f57VarW = f57VarH.W(uv1.b());
        b33 b33Var27 = this.A;
        if (b33Var27 == null) {
            js3.V("binding");
            throw null;
        }
        f57VarW.P(b33Var27.z);
        b33 b33Var28 = this.A;
        if (b33Var28 == null) {
            js3.V("binding");
            throw null;
        }
        CardView cardView3 = b33Var28.A;
        js3.o(cardView3, "cardView");
        qg5.v(cardView3, this.x, this, hugeBannerData);
        if (hugeBannerDto.getApp() == null) {
            b33 b33Var29 = this.A;
            if (b33Var29 != null) {
                b33Var29.x.setVisibility(8);
                return;
            } else {
                js3.V("binding");
                throw null;
            }
        }
        b33 b33Var30 = this.A;
        if (b33Var30 == null) {
            js3.V("binding");
            throw null;
        }
        b33Var30.x.setVisibility(0);
        b33 b33Var31 = this.A;
        if (b33Var31 == null) {
            js3.V("binding");
            throw null;
        }
        b33Var31.y.setText(hugeBannerDto.getApp().getTitle());
        b33 b33Var32 = this.A;
        if (b33Var32 == null) {
            js3.V("binding");
            throw null;
        }
        b33Var32.w.setErrorImageResId(yq6.icon);
        b33 b33Var33 = this.A;
        if (b33Var33 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = b33Var33.w;
        js3.o(appIconView, "appIcon");
        AppIconView.setImageUrl$default(appIconView, hugeBannerDto.getApp().getIconPath(), null, false, 6, null);
        b33 b33Var34 = this.A;
        if (b33Var34 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView2 = b33Var34.w;
        String strN = dw1.n("image_", hugeBannerDto.getApp().getPackageName());
        WeakHashMap weakHashMap = q69.a;
        h69.n(appIconView2, strN);
        ApplicationDTO app = hugeBannerDto.getApp();
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
        String refId = hugeBannerDto.getApp().getRefId();
        Bundle bundle = r82Var.k;
        bundle.putString("refId", refId);
        bundle.putString("BUNDLE_KEY_CALLBACK_URL", hugeBannerDto.getApp().getCallbackUrl());
        bundle.putString("installCallbackUrl", hugeBannerDto.getApp().getInstallCallbackUrl());
        bundle.putString("BUNDLE_KEY_DOWNLOAD_REF", CommonDataKt.HOME_MOVIE_TYPE_LIST);
        b33 b33Var35 = this.A;
        if (b33Var35 == null) {
            js3.V("binding");
            throw null;
        }
        b33Var35.B.setData(r82Var, this.y);
        b33 b33Var36 = this.A;
        if (b33Var36 == null) {
            js3.V("binding");
            throw null;
        }
        RelativeLayout relativeLayout = b33Var36.x;
        Object obj2 = lw8.b;
        String appBg = hugeBannerDto.getAppBg();
        int color2 = sj8.b().N;
        try {
            color2 = Color.parseColor(appBg);
        } catch (Exception unused3) {
        }
        relativeLayout.setBackgroundColor(color2);
        b33 b33Var37 = this.A;
        if (b33Var37 == null) {
            js3.V("binding");
            throw null;
        }
        b33Var37.v.setData(hugeBannerDto.getApp().getAdInfoDto());
        b33 b33Var38 = this.A;
        if (b33Var38 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = b33Var38.y;
        MyketAdInfoView myketAdInfoView = b33Var38.v;
        js3.o(myketAdInfoView, "adInfo");
        myketTextView.setMaxLines(myketAdInfoView.getVisibility() != 0 ? 2 : 1);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof b33) {
            this.A = (b33) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
