package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class h35 extends qg5 {
    public m43 A;
    public final int w;
    public og5 x;
    public final d04 y;
    public final int z;

    public h35(int i, View view) {
        super(view);
        this.w = i;
        this.y = (d04) ((w91) qg5.r()).p.get();
        this.z = (int) ((i * 9.0f) / 16.0f);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        int i;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        MovieHomeBannersItemData movieHomeBannersItemData = (MovieHomeBannersItemData) myketRecyclerData;
        js3.p(movieHomeBannersItemData, "data");
        HomeMovieBannerDto homeMovieBannerDto = movieHomeBannersItemData.a;
        m43 m43Var = this.A;
        if (m43Var == null) {
            js3.V("binding");
            throw null;
        }
        View view = m43Var.l;
        d04 d04Var = this.y;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        view.setLayoutDirection(d04Var.c());
        if (js3.i(homeMovieBannerDto.isTransparent(), Boolean.FALSE)) {
            View view2 = this.a;
            dimensionPixelSize2 = view2.getResources().getDimensionPixelSize(pq6.margin_default_v2);
            dimensionPixelSize = view2.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
            i = sj8.b().p;
        } else {
            i = sj8.b().l;
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
        }
        m43 m43Var2 = this.A;
        if (m43Var2 == null) {
            js3.V("binding");
            throw null;
        }
        ScreenshotView screenshotView = m43Var2.v;
        float f = dimensionPixelSize;
        screenshotView.setElevation(f);
        float f2 = dimensionPixelSize2;
        screenshotView.setOutlineProvider(new r45(dimensionPixelSize, f2));
        ScreenshotView.setStyle$default(screenshotView, Integer.valueOf(i), Integer.valueOf(dimensionPixelSize2), null, 4, null);
        screenshotView.setSize(this.w, this.z);
        screenshotView.c("", homeMovieBannerDto.getBannerUrl());
        m43 m43Var3 = this.A;
        if (m43Var3 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = m43Var3.w;
        frameLayout.setElevation(dimensionPixelSize != 0 ? 2 + f : 0.0f);
        uy6.q(frameLayout, 0, Float.valueOf(f2), 1);
        String title = homeMovieBannerDto.getTitle();
        frameLayout.setVisibility((title == null || f88.n0(title)) ? 0 : 8);
        m43 m43Var4 = this.A;
        if (m43Var4 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout2 = m43Var4.w;
        js3.o(frameLayout2, "bannerClickable");
        qg5.v(frameLayout2, this.x, this, movieHomeBannersItemData);
        m43 m43Var5 = this.A;
        if (m43Var5 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout3 = m43Var5.x;
        frameLayout3.setElevation(dimensionPixelSize != 0 ? f + 2 : 0.0f);
        uy6.q(frameLayout3, 0, null, 3);
        String title2 = homeMovieBannerDto.getTitle();
        frameLayout3.setVisibility((title2 == null || f88.n0(title2)) ? 8 : 0);
        m43 m43Var6 = this.A;
        if (m43Var6 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout4 = m43Var6.x;
        js3.o(frameLayout4, "bannerTitleClickable");
        qg5.v(frameLayout4, this.x, this, movieHomeBannersItemData);
        m43 m43Var7 = this.A;
        if (m43Var7 == null) {
            js3.V("binding");
            throw null;
        }
        m43Var7.z.setElevation(f + 1);
        m43 m43Var8 = this.A;
        if (m43Var8 == null) {
            js3.V("binding");
            throw null;
        }
        m43Var8.z.setData(homeMovieBannerDto.getLabel());
        m43 m43Var9 = this.A;
        if (m43Var9 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = m43Var9.A;
        js3.m(myketTextView);
        String title3 = homeMovieBannerDto.getTitle();
        myketTextView.setVisibility((title3 == null || f88.n0(title3)) ? 8 : 0);
        myketTextView.setText(homeMovieBannerDto.getTitle());
        myketTextView.setTextColor(sj8.b().m);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof m43) {
            this.A = (m43) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
