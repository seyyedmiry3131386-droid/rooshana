package ir.mservices.market.movie.ui.detail.recycler;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.dq4;
import defpackage.ea7;
import defpackage.eq6;
import defpackage.f88;
import defpackage.js3;
import defpackage.lw;
import defpackage.m88;
import defpackage.ml9;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.qs6;
import defpackage.r45;
import defpackage.v43;
import defpackage.v48;
import defpackage.w91;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.EpisodeDto;
import ir.mservices.market.views.MovieNewTagView;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.ScreenshotView;
import ir.mservices.market.views.SmallMovieOvalButton;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public final og5 w;
    public final ir.mservices.market.version2.manager.d x;
    public v43 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onClickListener");
        this.w = og5Var;
        w91 w91Var = (w91) qg5.r();
        this.x = (ir.mservices.market.version2.manager.d) w91Var.A0.get();
    }

    public static MyketProgressState y(MovieEpisodeData movieEpisodeData, Pair pair, dq4 dq4Var) {
        if (m88.T(movieEpisodeData.a(), pair != null ? (String) pair.b : null, true) && pair != null && ((Boolean) pair.a).booleanValue()) {
            return MyketProgressState.c;
        }
        return (js3.i(dq4Var != null ? dq4Var.a : null, movieEpisodeData.a.getPlayId()) && dq4Var.b) ? MyketProgressState.d : MyketProgressState.b;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MovieEpisodeData movieEpisodeData = (MovieEpisodeData) myketRecyclerData;
        js3.p(movieEpisodeData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MovieEpisodeViewHolder$onAttach$1(null, movieEpisodeData, this), 3);
        bt2.G(cc7.q(view), null, null, new MovieEpisodeViewHolder$onAttach$2(null, movieEpisodeData, this), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        MovieEpisodeData movieEpisodeData = (MovieEpisodeData) myketRecyclerData;
        js3.p(movieEpisodeData, "data");
        EpisodeDto episodeDto = movieEpisodeData.a;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_4);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        v43 v43VarX = x();
        ScreenshotView screenshotView = v43VarX.v;
        screenshotView.setSize(view.getResources().getDimensionPixelSize(pq6.movie_episode_banner_landscape_width), view.getResources().getDimensionPixelSize(pq6.movie_episode_banner_landscape_height));
        ScreenshotView.setStyle$default(screenshotView, null, Integer.valueOf(dimensionPixelSize), null, 5, null);
        ProgressBar progressBar = v43VarX.C;
        progressBar.setProgress(0);
        progressBar.setVisibility(8);
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        progressBar.setProgressDrawable(ml9.r(context));
        float f = dimensionPixelSize2;
        float f2 = 1 + f;
        progressBar.setElevation(f2);
        SmallMovieOvalButton smallMovieOvalButton = v43VarX.x;
        smallMovieOvalButton.setElevation(f2);
        smallMovieOvalButton.setVisibility(0);
        smallMovieOvalButton.setAnimation(qs6.audio_is_playing);
        Resources resources = smallMovieOvalButton.getContext().getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_play_detail;
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        smallMovieOvalButton.setIconWithCompoundDrawables(drawable.mutate());
        v48 v48Var = movieEpisodeData.b;
        smallMovieOvalButton.setState(y(movieEpisodeData, v48Var != null ? (Pair) v48Var.getValue() : null, (dq4) movieEpisodeData.c.getValue()));
        String bannerUrl = episodeDto.getBannerUrl();
        if (bannerUrl == null || f88.n0(bannerUrl)) {
            lw.g(null, "banner url on episode is empty", null);
        } else {
            screenshotView.setElevation(f);
            screenshotView.setOutlineProvider(new r45(dimensionPixelSize2, dimensionPixelSize));
            screenshotView.c("", episodeDto.getBannerUrl());
        }
        View view2 = v43VarX.z;
        Context context2 = view2.getContext();
        js3.o(context2, "getContext(...)");
        ea7 ea7Var = new ea7(context2);
        Resources resources2 = view.getResources();
        int i2 = eq6.movie_episode_shadow_background;
        ThreadLocal threadLocal3 = b77.a;
        ea7Var.b = resources2.getColor(i2, null);
        ea7Var.c(dimensionPixelSize);
        ea7Var.h = 0;
        ea7Var.p = view.getResources().getColor(eq6.transparent, null);
        view2.setBackground(ea7Var.a());
        view2.setElevation(f2);
        v43VarX.B.setText(episodeDto.getTitle());
        View view3 = v43VarX.l;
        js3.o(view3, "getRoot(...)");
        qg5.v(view3, this.w, this, movieEpisodeData);
        MovieNewTagView movieNewTagView = v43VarX.A;
        js3.o(movieNewTagView, "tagNew");
        movieNewTagView.setVisibility(js3.i(episodeDto.getShowNewBadge(), Boolean.TRUE) ? 0 : 8);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof v43) {
            this.y = (v43) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final v43 x() {
        v43 v43Var = this.y;
        if (v43Var != null) {
            return v43Var;
        }
        js3.V("binding");
        throw null;
    }
}
