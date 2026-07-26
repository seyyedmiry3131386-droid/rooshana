package ir.mservices.market.app.home.ui.recycler;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a79;
import defpackage.b95;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d04;
import defpackage.dw1;
import defpackage.f88;
import defpackage.g70;
import defpackage.h69;
import defpackage.hh2;
import defpackage.jc3;
import defpackage.js3;
import defpackage.kg5;
import defpackage.lw;
import defpackage.pq6;
import defpackage.q57;
import defpackage.q69;
import defpackage.qg5;
import defpackage.r82;
import defpackage.s57;
import defpackage.s82;
import defpackage.sj8;
import defpackage.w91;
import defpackage.xf5;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.VideoRowDto;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.MyketVideoView;
import ir.mservices.market.views.ScreenshotView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends g70 {
    public final int A;
    public final xf5 B;
    public final d04 C;
    public s82 D;
    public jc3 E;

    public d(int i, View view) {
        super(view);
        this.A = i;
        w91 w91Var = (w91) qg5.r();
        this.B = (xf5) w91Var.F.get();
        this.C = (d04) w91Var.p.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        HomeVideoData homeVideoData = (HomeVideoData) myketRecyclerData;
        js3.p(homeVideoData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new HomeVideoViewHolder$onAttach$1(homeVideoData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new HomeVideoViewHolder$onAttach$2(homeVideoData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        String startCallbackUrl;
        HomeVideoData homeVideoData = (HomeVideoData) myketRecyclerData;
        js3.p(homeVideoData, "data");
        VideoRowDto videoRowDto = homeVideoData.a;
        View view = z().l;
        d04 d04Var = this.C;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        view.setLayoutDirection(d04Var.c());
        z().v.B.setVisibility(8);
        z().x.setCardBackgroundColor(sj8.b().l);
        this.z = videoRowDto != null ? videoRowDto.getId() : null;
        View view2 = this.a;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        int i = this.A;
        layoutParams.width = i;
        int dimensionPixelOffset = (i - (view2.getResources().getDimensionPixelOffset(pq6.horizontal_space_inner) * 2)) - view2.getResources().getDimensionPixelOffset(pq6.item_space);
        int i2 = (int) (((double) dimensionPixelOffset) * 0.562d);
        MyketVideoView myketVideoView = z().x;
        myketVideoView.getLayoutParams().width = dimensionPixelOffset;
        myketVideoView.getLayoutParams().height = i2;
        kg5 kg5Var = myketVideoView.o;
        if (kg5Var == null) {
            js3.V("binding");
            throw null;
        }
        ScreenshotView screenshotView = kg5Var.w;
        screenshotView.getClass();
        s57 s57VarF = com.bumptech.glide.a.f(screenshotView);
        s57VarF.getClass();
        s57VarF.o(new q57(screenshotView));
        String thumbnailUrl = videoRowDto != null ? videoRowDto.getThumbnailUrl() : null;
        if (thumbnailUrl == null || f88.n0(thumbnailUrl)) {
            MyketVideoView myketVideoView2 = z().x;
            myketVideoView2.setImageUrl("", videoRowDto != null ? videoRowDto.getBgUrl() : null);
            MyketVideoView.setVideoBannerStyle$default(myketVideoView2, Integer.valueOf(sj8.b().K), null, 2, null);
        } else {
            MyketVideoView myketVideoView3 = z().x;
            myketVideoView3.setImageUrl(videoRowDto != null ? videoRowDto.getThumbnailUrl() : null, videoRowDto != null ? videoRowDto.getBgUrl() : null);
            MyketVideoView.setVideoBannerStyle$default(myketVideoView3, Integer.valueOf(sj8.b().p), null, 2, null);
        }
        if (videoRowDto != null && (startCallbackUrl = videoRowDto.getStartCallbackUrl()) != null) {
            z().x.setStartCallbackUrl(startCallbackUrl);
        }
        MyketVideoView myketVideoView4 = z().x;
        myketVideoView4.setSize(dimensionPixelOffset, i2);
        myketVideoView4.setVideoUrl(videoRowDto != null ? videoRowDto.getVideoUrl() : null);
        myketVideoView4.setAparatId(videoRowDto != null ? videoRowDto.getAparatId() : null);
        myketVideoView4.setVideoListener(new hh2(this, homeVideoData, 5));
        ApplicationDTO application = videoRowDto != null ? videoRowDto.getApplication() : null;
        if (application == null) {
            z().v.y.setVisibility(8);
            return;
        }
        b95 b95Var = z().v;
        FrameLayout frameLayout = b95Var.y;
        MyketTextView myketTextView = b95Var.z;
        frameLayout.setVisibility(0);
        myketTextView.setText(application.getTitle());
        myketTextView.setTextColor(sj8.b().m);
        AppIconView appIconView = b95Var.x;
        js3.o(appIconView, "applicationIcon");
        AppIconView.setImageUrl$default(appIconView, application.getIconPath(), null, false, 6, null);
        b95Var.v.setData(application.getAdInfoDto());
        xf5 xf5Var = this.B;
        if (xf5Var == null) {
            js3.V("myketUIUtils");
            throw null;
        }
        String packageName = application.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        int versionCode = application.getVersionCode();
        boolean zIsIncompatible = application.isIncompatible();
        ForceUpdateDto forceUpdate = application.getForceUpdate();
        MyketTextView myketTextView2 = z().v.w;
        js3.o(myketTextView2, "applicationDescription");
        xf5Var.l(packageName, versionCode, zIsIncompatible, forceUpdate, myketTextView2, application.getCategoryName());
        AppIconView appIconView2 = z().v.x;
        String strN = dw1.n("image_", videoRowDto.getApplication().getPackageName());
        WeakHashMap weakHashMap = q69.a;
        h69.n(appIconView2, strN);
        boolean zIsIncompatible2 = application.isIncompatible();
        String packageName2 = application.getPackageName();
        String title = application.getTitle();
        boolean zIsFree = application.isFree();
        String buttonText = application.getButtonText();
        application.getRealPrice();
        application.hasIAP();
        application.getVersion();
        int versionCode2 = application.getVersionCode();
        long fileSize = application.getFileSize();
        boolean zHasMainData = application.hasMainData();
        boolean zHasPatchData = application.hasPatchData();
        String iconPath = application.getIconPath();
        application.getCategoryName();
        r82 r82Var = new r82(zIsIncompatible2, packageName2, title, zIsFree, buttonText, versionCode2, fileSize, zHasMainData, zHasPatchData, iconPath, application.getForceUpdate());
        String refId = application.getRefId();
        Bundle bundle = r82Var.k;
        bundle.putString("refId", refId);
        bundle.putString("installCallbackUrl", application.getInstallCallbackUrl());
        bundle.putString("BUNDLE_KEY_CALLBACK_URL", application.getCallbackUrl());
        bundle.putString("BUNDLE_KEY_DOWNLOAD_REF", CommonDataKt.HOME_MOVIE_TYPE_LIST);
        z().v.A.setData(r82Var, this.D);
        FrameLayout frameLayout2 = z().v.y;
        js3.o(frameLayout2, "applicationLayout");
        qg5.v(frameLayout2, this.w, this, homeVideoData);
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        js3.p((HomeVideoData) myketRecyclerData, "data");
        y();
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof jc3) {
            this.E = (jc3) a79Var;
        } else {
            lw.g(null, "Data binding is incompatible", null);
        }
    }

    @Override // defpackage.g70
    public final AppIconView x() {
        AppIconView appIconView = z().v.x;
        js3.o(appIconView, "applicationIcon");
        return appIconView;
    }

    @Override // defpackage.g70
    public final void y() {
        z().x.i();
    }

    public final jc3 z() {
        jc3 jc3Var = this.E;
        if (jc3Var != null) {
            return jc3Var;
        }
        js3.V("binding");
        throw null;
    }
}
