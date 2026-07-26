package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannerData;
import ir.mservices.market.views.MovieLabelView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class e35 extends qg5 {
    public final og5 w;
    public int x;
    public int y;
    public k43 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e35(View view, GraphicUtils$Dimension graphicUtils$Dimension, og5 og5Var) {
        super(view);
        js3.p(graphicUtils$Dimension, "dimension");
        this.w = og5Var;
        this.y = view.getResources().getDimensionPixelSize(pq6.side_navigation_margin) + (graphicUtils$Dimension.a - ((view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer)) * 2));
        this.x = (int) ((this.y * 9.0f) / 16.0f);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        int i;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) myketRecyclerData;
        js3.p(movieHomeBannerData, "data");
        HomeMovieBannerDto homeMovieBannerDto = movieHomeBannerData.a;
        View view = this.a;
        boolean z = view.getResources().getBoolean(yp6.is_search_banner_wide_screen);
        k43 k43Var = this.z;
        if (k43Var == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = k43Var.w;
        if (js3.i(homeMovieBannerDto.isTransparent(), Boolean.TRUE)) {
            i = sj8.b().l;
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
        } else {
            dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_8);
            dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
            i = sj8.b().p;
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            k43 k43Var2 = this.z;
            if (k43Var2 == null) {
                js3.V("binding");
                throw null;
            }
            layoutParams2.v = k43Var2.x.getId();
            k43 k43Var3 = this.z;
            if (k43Var3 == null) {
                js3.V("binding");
                throw null;
            }
            layoutParams2.t = k43Var3.x.getId();
            k43 k43Var4 = this.z;
            if (k43Var4 == null) {
                js3.V("binding");
                throw null;
            }
            layoutParams2.i = k43Var4.x.getId();
            k43 k43Var5 = this.z;
            if (k43Var5 == null) {
                js3.V("binding");
                throw null;
            }
            layoutParams2.l = k43Var5.x.getId();
            ScreenshotView screenshotView = k43Var.x;
            js3.m(screenshotView);
            screenshotView.setVisibility(0);
            Context context = screenshotView.getContext();
            js3.o(context, "getContext(...)");
            ea7 ea7Var = new ea7(context);
            ea7Var.b = i;
            ea7Var.c(dimensionPixelSize);
            ea7Var.h = 0;
            screenshotView.setBackground(ea7Var.a());
            String bannerBlurUrl = homeMovieBannerDto.getBannerBlurUrl();
            if (bannerBlurUrl != null) {
                if (f88.n0(bannerBlurUrl)) {
                    bannerBlurUrl = null;
                }
                if (bannerBlurUrl != null) {
                    screenshotView.c(null, bannerBlurUrl);
                }
            }
            this.x = view.getResources().getDimensionPixelSize(pq6.single_movie_banner_height);
            this.y = view.getResources().getDimensionPixelSize(pq6.single_movie_banner_width);
        }
        MovieLabelView movieLabelView = k43Var.z;
        float f = dimensionPixelSize2;
        movieLabelView.setElevation(1 + f);
        movieLabelView.setData(homeMovieBannerDto.getLabel());
        MyketTextView myketTextView = k43Var.B;
        js3.m(myketTextView);
        String title = homeMovieBannerDto.getTitle();
        int i2 = 8;
        myketTextView.setVisibility((title == null || f88.n0(title)) ? 8 : 0);
        myketTextView.setText(homeMovieBannerDto.getTitle());
        MyketTextView myketTextView2 = k43Var.y;
        js3.m(myketTextView2);
        String headerTitle = homeMovieBannerDto.getHeaderTitle();
        myketTextView2.setVisibility((headerTitle == null || f88.n0(headerTitle)) ? 8 : 0);
        myketTextView2.setText(homeMovieBannerDto.getHeaderTitle());
        MyketTextView myketTextView3 = k43Var.A;
        js3.m(myketTextView3);
        String secondaryTitle = homeMovieBannerDto.getSecondaryTitle();
        if (secondaryTitle != null && !f88.n0(secondaryTitle)) {
            i2 = 0;
        }
        myketTextView3.setVisibility(i2);
        myketTextView3.setText(homeMovieBannerDto.getSecondaryTitle());
        js3.m(frameLayout);
        float f2 = dimensionPixelSize;
        uy6.q(frameLayout, 0, Float.valueOf(f2), 1);
        qg5.v(frameLayout, this.w, this, movieHomeBannerData);
        frameLayout.setElevation(2 + f);
        ScreenshotView screenshotView2 = k43Var.v;
        screenshotView2.setElevation(f);
        screenshotView2.setOutlineProvider(new r45(dimensionPixelSize2, f2));
        ScreenshotView.setStyle$default(screenshotView2, Integer.valueOf(i), Integer.valueOf(dimensionPixelSize), null, 4, null);
        screenshotView2.setSize(this.y, this.x);
        screenshotView2.c(homeMovieBannerDto.getBannerBlurUrl(), homeMovieBannerDto.getBannerUrl());
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof k43) {
            this.z = (k43) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
