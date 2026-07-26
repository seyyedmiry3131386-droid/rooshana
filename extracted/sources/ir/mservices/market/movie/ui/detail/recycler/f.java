package ir.mservices.market.movie.ui.detail.recycler;

import android.view.View;
import android.view.ViewGroup;
import defpackage.a63;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q15;
import defpackage.qg5;
import defpackage.r45;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.sr4;
import defpackage.t61;
import defpackage.t7;
import defpackage.uy6;
import defpackage.xv3;
import defpackage.yp6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.TrailerDto;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.MyketVideoView;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends qg5 {
    public final int A;
    public a63 B;
    public final t7 w;
    public final og5 x;
    public final og5 y;
    public final int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view, GraphicUtils$Dimension graphicUtils$Dimension, t7 t7Var, sr4 sr4Var, q15 q15Var) {
        super(view);
        js3.p(graphicUtils$Dimension, "dimension");
        js3.p(sr4Var, "onClickListener");
        js3.p(q15Var, "onShowTrailerReplayIconListener");
        this.w = t7Var;
        this.x = sr4Var;
        this.y = q15Var;
        int iE = t61.e(view.getResources(), pq6.horizontal_space_inner, 2, t61.e(view.getResources(), pq6.horizontal_space_outer, 2, graphicUtils$Dimension.a - view.getResources().getDimensionPixelSize(pq6.vertical_movie_tab_width)));
        this.z = iE;
        this.A = (int) ((iE * 72.0f) / 128.0f);
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MovieTrailerData movieTrailerData = (MovieTrailerData) myketRecyclerData;
        js3.p(movieTrailerData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MovieTrailerViewHolder$onAttach$1(movieTrailerData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MovieTrailerData movieTrailerData = (MovieTrailerData) myketRecyclerData;
        js3.p(movieTrailerData, "data");
        MyketTextView myketTextView = x().v;
        TrailerDto trailerDto = movieTrailerData.a;
        String title = trailerDto.getTitle();
        View view = this.a;
        if (title == null) {
            title = view.getResources().getString(rs6.trailer);
            js3.o(title, "getString(...)");
        }
        myketTextView.setText(title);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.default_image_corner_radius);
        MyketVideoView myketVideoView = x().w;
        js3.m(myketVideoView);
        float f = dimensionPixelSize;
        uy6.p(myketVideoView, sj8.b().O.c, Float.valueOf(f));
        ViewGroup.LayoutParams layoutParams = myketVideoView.getLayoutParams();
        int i = this.z;
        layoutParams.width = i;
        if (myketVideoView.getResources().getBoolean(yp6.movie_detail_tablet)) {
            myketVideoView.getLayoutParams().height = view.getResources().getDimensionPixelSize(pq6.movie_trailer_tablet_height);
            myketVideoView.setSize((int) ((myketVideoView.getLayoutParams().height * 128.0f) / 72.0f), myketVideoView.getLayoutParams().height);
        } else {
            ViewGroup.LayoutParams layoutParams2 = myketVideoView.getLayoutParams();
            int i2 = this.A;
            layoutParams2.height = i2;
            myketVideoView.setSize(i, i2);
        }
        MyketVideoView.setVideoBannerStyle$default(myketVideoView, null, Integer.valueOf(dimensionPixelSize), 1, null);
        myketVideoView.setImageUrl(trailerDto.getMiniThumbnailUrl(), trailerDto.getThumbnailUrl());
        myketVideoView.setVideoUrl(trailerDto.getTrailerUrl());
        myketVideoView.setTrailerData(movieTrailerData);
        myketVideoView.setActivityResultLauncher(this.w);
        myketVideoView.setVideoType("MOVIE");
        myketVideoView.setSeekbarTheme(sj8.b());
        myketVideoView.setPlayerEndedListener(new xv3(this, myketVideoView, 7));
        qg5.v(view, this.x, this, movieTrailerData);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        x().w.setElevation(dimensionPixelSize2);
        x().w.setOutlineProvider(new r45(dimensionPixelSize2, f));
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        js3.p((MovieTrailerData) myketRecyclerData, "data");
        x().w.i();
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof a63) {
            this.B = (a63) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final a63 x() {
        a63 a63Var = this.B;
        if (a63Var != null) {
            return a63Var;
        }
        js3.V("binding");
        throw null;
    }
}
