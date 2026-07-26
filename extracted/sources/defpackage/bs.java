package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class bs extends qg5 {
    public final og5 w;
    public final int x;
    public h83 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(View view, og5 og5Var) {
        super(view);
        int i = sj8.b().p;
        this.w = og5Var;
        this.x = i;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AppScreenshotData appScreenshotData = (AppScreenshotData) myketRecyclerData;
        js3.p(appScreenshotData, "data");
        ScreenshotDto screenshotDto = appScreenshotData.a;
        og5 og5Var = this.w;
        View view = this.a;
        String str = null;
        if (og5Var != null) {
            h83 h83Var = this.y;
            if (h83Var == null) {
                js3.V("binding");
                throw null;
            }
            FrameLayout frameLayout = h83Var.v;
            frameLayout.setVisibility(0);
            uy6.q(frameLayout, 0, Float.valueOf(view.getResources().getDimensionPixelSize(pq6.default_image_corner_radius)), 1);
        } else {
            h83 h83Var2 = this.y;
            if (h83Var2 == null) {
                js3.V("binding");
                throw null;
            }
            h83Var2.v.setVisibility(8);
        }
        h83 h83Var3 = this.y;
        if (h83Var3 == null) {
            js3.V("binding");
            throw null;
        }
        ScreenshotView screenshotView = h83Var3.w;
        js3.m(screenshotView);
        ScreenshotView.setStyle$default(screenshotView, Integer.valueOf(this.x), null, null, 6, null);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.screenshot_height);
        int width = appScreenshotData.h ? (int) ((dimensionPixelSize * 16.0f) / 9.0f) : (screenshotDto.getWidth() * dimensionPixelSize) / screenshotDto.getHeight();
        screenshotView.setSize(width, dimensionPixelSize);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = dimensionPixelSize;
        screenshotView.setOnLoad(new m(this, appScreenshotData, 3));
        String miniThumbnailUrl = screenshotDto.getMiniThumbnailUrl();
        if (miniThumbnailUrl != null) {
            if (miniThumbnailUrl.length() == 0) {
                miniThumbnailUrl = screenshotDto.getThumbnailUrl();
            }
            str = miniThumbnailUrl;
        }
        screenshotView.c(str, screenshotDto.getThumbnailUrl());
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof h83) {
            this.y = (h83) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
