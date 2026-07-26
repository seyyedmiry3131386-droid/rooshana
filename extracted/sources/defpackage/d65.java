package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.ScreenshotDto;
import ir.mservices.market.movie.ui.detail.recycler.MovieScreenshotData;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class d65 extends qg5 {
    public q53 A;
    public final int w;
    public final og5 x;
    public final int y;
    public final lw8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d65(int i, og5 og5Var, View view) {
        super(view);
        js3.p(og5Var, "onClickListener");
        this.w = i;
        this.x = og5Var;
        this.z = (lw8) ((w91) qg5.r()).E.get();
        this.y = (int) ((i * 72.0f) / 128.0f);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MovieScreenshotData movieScreenshotData = (MovieScreenshotData) myketRecyclerData;
        js3.p(movieScreenshotData, "data");
        x().v.setOnLoad(new v25(this, movieScreenshotData, 1));
        View view = this.a;
        float dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.card_view_radius);
        FrameLayout frameLayout = x().w;
        js3.o(frameLayout, "clickableLayout");
        uy6.q(frameLayout, 0, Float.valueOf(dimensionPixelSize), 1);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        ScreenshotView screenshotView = x().v;
        js3.m(screenshotView);
        int i = (int) dimensionPixelSize;
        ScreenshotView.setStyle$default(screenshotView, null, Integer.valueOf(i), null, 5, null);
        screenshotView.setSize(this.w, this.y);
        ScreenshotDto screenshotDto = movieScreenshotData.a;
        screenshotView.c(screenshotDto.getMiniThumbnailUrl(), screenshotDto.getThumbnailUrl());
        screenshotView.setOutlineProvider(new r45(dimensionPixelSize2, dimensionPixelSize));
        float f = dimensionPixelSize2;
        screenshotView.setElevation(f);
        x().w.setElevation(2 + f);
        x().x.setElevation(f + 1);
        MyketTextView myketTextView = x().x;
        lw8 lw8Var = this.z;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView.setText(lw8.e(lw8Var, view.getResources().getString(rs6.movie_screenshots_more, Integer.valueOf(movieScreenshotData.b))));
        MyketTextView myketTextView2 = x().x;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.j = true;
        ea7Var.b = sj8.b().J.f;
        ea7Var.h = 0;
        ea7Var.c(i);
        myketTextView2.setBackground(ea7Var.a());
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof q53) {
            this.A = (q53) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final q53 x() {
        q53 q53Var = this.A;
        if (q53Var != null) {
            return q53Var;
        }
        js3.V("binding");
        throw null;
    }
}
