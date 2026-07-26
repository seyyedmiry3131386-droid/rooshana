package ir.mservices.market.movie.ui.detail.recycler;

import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.f88;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.r43;
import defpackage.r45;
import defpackage.z65;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.EpisodeDto;
import ir.mservices.market.movie.download.MovieDownloadButton;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public r43 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, z65 z65Var) {
        super(view);
        js3.p(z65Var, "onDownloadClickListener");
        this.w = z65Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MovieDownloadEpisodeData movieDownloadEpisodeData = (MovieDownloadEpisodeData) myketRecyclerData;
        js3.p(movieDownloadEpisodeData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MovieDownloadEpisodeViewHolder$onAttach$1(movieDownloadEpisodeData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new MovieDownloadEpisodeViewHolder$onAttach$2(movieDownloadEpisodeData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new MovieDownloadEpisodeViewHolder$onAttach$3(movieDownloadEpisodeData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MovieDownloadEpisodeData movieDownloadEpisodeData = (MovieDownloadEpisodeData) myketRecyclerData;
        js3.p(movieDownloadEpisodeData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_4);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        ScreenshotView screenshotView = x().v;
        screenshotView.setSize(view.getResources().getDimensionPixelSize(pq6.movie_episode_banner_landscape_width), view.getResources().getDimensionPixelSize(pq6.movie_episode_banner_landscape_height));
        ScreenshotView.setStyle$default(screenshotView, null, Integer.valueOf(dimensionPixelSize), null, 5, null);
        EpisodeDto episodeDto = movieDownloadEpisodeData.a;
        String bannerUrl = episodeDto.getBannerUrl();
        if (bannerUrl == null || f88.n0(bannerUrl)) {
            lw.g(null, "banner url on episode is empty", null);
        } else {
            ScreenshotView screenshotView2 = x().v;
            screenshotView2.setElevation(dimensionPixelSize2);
            screenshotView2.setOutlineProvider(new r45(dimensionPixelSize2, dimensionPixelSize));
            screenshotView2.c("", episodeDto.getBannerUrl());
        }
        x().z.setText(episodeDto.getTitle());
        x().y.setText(episodeDto.getSecondaryTitle());
        View view2 = x().l;
        js3.o(view2, "getRoot(...)");
        og5 og5Var = this.w;
        qg5.v(view2, og5Var, this, movieDownloadEpisodeData);
        MovieDownloadButton movieDownloadButton = x().x;
        js3.o(movieDownloadButton, "download");
        qg5.v(movieDownloadButton, og5Var, this, movieDownloadEpisodeData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof r43) {
            this.x = (r43) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final r43 x() {
        r43 r43Var = this.x;
        if (r43Var != null) {
            return r43Var;
        }
        js3.V("binding");
        throw null;
    }
}
