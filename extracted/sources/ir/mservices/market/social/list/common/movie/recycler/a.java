package ir.mservices.market.social.list.common.movie.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a79;
import defpackage.bt2;
import defpackage.c80;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.o93;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.r45;
import defpackage.sj8;
import defpackage.sm7;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public final og5 x;
    public o93 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, og5 og5Var, sm7 sm7Var) {
        super(view);
        js3.p(og5Var, "onSelectClickListener");
        this.w = og5Var;
        this.x = sm7Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ProfileMovieData profileMovieData = (ProfileMovieData) myketRecyclerData;
        js3.p(profileMovieData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ProfileMovieViewHolder$onAttach$1(profileMovieData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ProfileMovieData profileMovieData = (ProfileMovieData) myketRecyclerData;
        js3.p(profileMovieData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.margin_default_v2_half);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_episode_banner_portrait_height);
        int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.movie_episode_banner_portrait_width);
        ScreenshotView screenshotView = x().v;
        int dimensionPixelSize4 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        screenshotView.setElevation(dimensionPixelSize4);
        screenshotView.setOutlineProvider(new r45(dimensionPixelSize4, dimensionPixelSize));
        ScreenshotView.setStyle$default(screenshotView, null, Integer.valueOf(dimensionPixelSize), null, 5, null);
        screenshotView.setSize(dimensionPixelSize3, dimensionPixelSize2);
        screenshotView.getLayoutParams().width = dimensionPixelSize3;
        screenshotView.getLayoutParams().height = dimensionPixelSize2;
        ViewGroup.LayoutParams layoutParams = screenshotView.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = view.getResources().getDimensionPixelSize(pq6.margin_default_v2_oneHalf);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = view.getResources().getDimensionPixelSize(pq6.margin_default_v2_oneHalf);
        screenshotView.setOnLoad(new c80(profileMovieData, this, dimensionPixelSize3, 2));
        MovieDto movieDto = profileMovieData.b;
        screenshotView.c("", movieDto.getPosterUrl());
        x().z.setText(movieDto.getTitle());
        x().w.setText(movieDto.getSecondaryTitle());
        x().x.getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        ImageView imageView = x().A;
        js3.o(imageView, "trailing");
        qg5.v(imageView, this.w, this, profileMovieData);
        ImageView imageView2 = x().x;
        js3.o(imageView2, "leading");
        qg5.v(imageView2, this.x, this, profileMovieData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof o93) {
            this.y = (o93) a79Var;
        } else {
            lw.g(null, "incompatible data binding", null);
        }
    }

    public final o93 x() {
        o93 o93Var = this.y;
        if (o93Var != null) {
            return o93Var;
        }
        js3.V("binding");
        throw null;
    }
}
