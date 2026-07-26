package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.SearchMovieDto;
import ir.mservices.market.movie.ui.bookmark.recycler.MovieBookmarkData;
import ir.mservices.market.version2.manager.d;
import ir.mservices.market.version2.ui.recycler.holder.MultiSelectViewHolder$ViewHolderType;
import ir.mservices.market.version2.ui.recycler.holder.a;
import ir.mservices.market.views.MovieWatchProgressBackgroundView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SeriesBackground;

/* JADX INFO: loaded from: classes3.dex */
public final class f05 extends a {
    public j53 A;
    public final d B;
    public final og5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f05(View view, qs3 qs3Var, z95 z95Var) {
        super(view, z95Var);
        js3.p(qs3Var, "onClickListener");
        this.z = qs3Var;
        this.B = (d) ((w91) qg5.r()).A0.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MovieWatchProgressBackgroundView movieWatchProgressBackgroundView;
        ProgressBar progressBar;
        int i;
        MovieBookmarkData movieBookmarkData = (MovieBookmarkData) myketRecyclerData;
        js3.p(movieBookmarkData, "data");
        SearchMovieDto searchMovieDto = movieBookmarkData.h;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.margin_default_v2_half);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_episode_banner_portrait_height);
        int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.movie_episode_banner_portrait_width);
        j53 j53Var = this.A;
        if (j53Var == null) {
            js3.V("binding");
            throw null;
        }
        o43 o43Var = j53Var.v;
        SeriesBackground seriesBackground = o43Var.y;
        MyketTextView myketTextView = o43Var.w;
        MovieWatchProgressBackgroundView movieWatchProgressBackgroundView2 = o43Var.B;
        ProgressBar progressBar2 = o43Var.A;
        seriesBackground.setVisibility(8);
        progressBar2.setProgress(0);
        progressBar2.setVisibility(8);
        ScreenshotView screenshotView = o43Var.v;
        int dimensionPixelSize4 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        screenshotView.setElevation(dimensionPixelSize4);
        screenshotView.setOutlineProvider(new r45(dimensionPixelSize4, dimensionPixelSize));
        ScreenshotView.setStyle$default(screenshotView, null, Integer.valueOf(dimensionPixelSize), null, 5, null);
        screenshotView.setSize(dimensionPixelSize3, dimensionPixelSize2);
        ViewGroup.LayoutParams layoutParams = screenshotView.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = view.getResources().getDimensionPixelSize(pq6.margin_default_v2_oneHalf);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = view.getResources().getDimensionPixelSize(pq6.margin_default_v2_oneHalf);
        screenshotView.setOnLoad(new c80(movieBookmarkData, o43Var, dimensionPixelSize3, 1));
        screenshotView.c("", searchMovieDto.getPosterUrl());
        o43Var.z.setText(searchMovieDto.getTitle());
        float dimensionPixelSize5 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        movieWatchProgressBackgroundView2.setBackgroundRadius(dimensionPixelSize);
        float f = dimensionPixelSize5 + 1;
        movieWatchProgressBackgroundView2.setElevation(f);
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        progressBar2.setProgressDrawable(ml9.r(context));
        progressBar2.setElevation(f);
        o43Var.x.setText(searchMovieDto.getSecondaryTitle());
        String imdbRate = searchMovieDto.getImdbRate();
        if (imdbRate == null || imdbRate.length() == 0) {
            movieWatchProgressBackgroundView = movieWatchProgressBackgroundView2;
            progressBar = progressBar2;
            i = 8;
            myketTextView.setVisibility(8);
        } else {
            js3.o(myketTextView, "imdb");
            movieWatchProgressBackgroundView = movieWatchProgressBackgroundView2;
            progressBar = progressBar2;
            i = 8;
            MyketTextView.setTextFromHtml$default(myketTextView, searchMovieDto.getImdbRate(), 2, null, null, false, 28, null);
        }
        d dVar = this.B;
        if (dVar == null) {
            js3.V("movieProgressManager");
            throw null;
        }
        x45 x45VarA = dVar.a(searchMovieDto.getId());
        boolean z = x45VarA instanceof w45;
        movieWatchProgressBackgroundView.setVisibility(z ? 0 : i);
        progressBar.setProgress(x45VarA.a());
        progressBar.setVisibility(z ? 0 : i);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof j53) {
            this.A = (j53) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.holder.a
    public final og5 x() {
        return this.z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.holder.a
    public final MultiSelectViewHolder$ViewHolderType y() {
        return MultiSelectViewHolder$ViewHolderType.a;
    }

    @Override // ir.mservices.market.version2.ui.recycler.holder.a
    public final Point z() {
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_4);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_episode_banner_portrait_width);
        int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.movie_episode_banner_portrait_height);
        Point point = new Point();
        point.x = dimensionPixelSize2 - dimensionPixelSize;
        point.y = dimensionPixelSize3 - (dimensionPixelSize * 2);
        return point;
    }
}
