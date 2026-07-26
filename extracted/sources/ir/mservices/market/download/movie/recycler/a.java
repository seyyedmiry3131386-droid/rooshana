package ir.mservices.market.download.movie.recycler;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.f88;
import defpackage.js3;
import defpackage.l25;
import defpackage.lw;
import defpackage.lw8;
import defpackage.og5;
import defpackage.p25;
import defpackage.pq6;
import defpackage.q25;
import defpackage.qg5;
import defpackage.r25;
import defpackage.s25;
import defpackage.sj8;
import defpackage.t25;
import defpackage.t43;
import defpackage.u25;
import defpackage.v25;
import defpackage.w50;
import defpackage.w91;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public ValueAnimator A;
    public final int B;
    public final int C;
    public boolean D;
    public final og5 w;
    public final og5 x;
    public final lw8 y;
    public t43 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, l25 l25Var, l25 l25Var2) {
        super(view);
        js3.p(l25Var, "onItemClickListener");
        js3.p(l25Var2, "onDownloadClickListener");
        this.w = l25Var;
        this.x = l25Var2;
        this.B = view.getResources().getDimensionPixelSize(pq6.movie_download_banner_width);
        this.C = view.getResources().getDimensionPixelSize(pq6.movie_download_banner_height);
        this.D = true;
        this.y = (lw8) ((w91) qg5.r()).E.get();
    }

    public static final int x(a aVar, u25 u25Var) {
        if ((u25Var instanceof s25) || (u25Var instanceof r25) || (u25Var instanceof p25)) {
            return sj8.b().j;
        }
        if ((u25Var instanceof t25) || (u25Var instanceof q25)) {
            return sj8.b().v;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int y(a aVar, u25 u25Var) {
        if (u25Var instanceof s25) {
            return yq6.ic_play_downloaded_movie;
        }
        if ((u25Var instanceof r25) || (u25Var instanceof p25)) {
            return yq6.ic_download_start;
        }
        if ((u25Var instanceof t25) || (u25Var instanceof q25)) {
            return yq6.ic_pause_download;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MovieDownloadData movieDownloadData = (MovieDownloadData) myketRecyclerData;
        js3.p(movieDownloadData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MovieDownloadViewHolder$onAttach$1(movieDownloadData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new MovieDownloadViewHolder$onAttach$2(movieDownloadData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MovieDownloadData movieDownloadData = (MovieDownloadData) myketRecyclerData;
        js3.p(movieDownloadData, "data");
        int i = 8;
        z().C.setVisibility(8);
        ScreenshotView screenshotView = z().v;
        js3.m(screenshotView);
        ScreenshotView.setStyle$default(screenshotView, null, Integer.valueOf(this.a.getResources().getDimensionPixelSize(pq6.space_4)), null, 5, null);
        screenshotView.setSize(this.B, this.C);
        screenshotView.setOnLoad(new v25(movieDownloadData, this, 0));
        screenshotView.c("", movieDownloadData.b);
        MovieDownloadMetaData movieDownloadMetaData = movieDownloadData.a;
        z().E.setText(movieDownloadMetaData.c);
        z().B.setText(movieDownloadMetaData.d);
        MyketTextView myketTextView = z().B;
        js3.o(myketTextView, "secondaryTitle");
        String str = movieDownloadMetaData.d;
        if (str != null && !f88.n0(str)) {
            i = 0;
        }
        myketTextView.setVisibility(i);
        z().A.setText(movieDownloadMetaData.e);
        z().z.setText(movieDownloadMetaData.g);
        LoadingView loadingView = z().x;
        loadingView.setIndicatorColor(sj8.b().j);
        loadingView.setTrackColor(sj8.b().j);
        loadingView.setIndicatorSize(loadingView.getResources().getDimensionPixelSize(pq6.big_button_height));
        loadingView.setTrackThickness(loadingView.getResources().getDimensionPixelSize(pq6.circle_progress_thickness));
        loadingView.setIndeterminate(false);
        loadingView.setMax(10000);
        if (movieDownloadData.d) {
            FrameLayout frameLayout = z().w;
            js3.o(frameLayout, "content");
            qg5.v(frameLayout, this.w, this, movieDownloadData);
        }
        z().y.setOnClickListener(new w50(this, movieDownloadData, 7));
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        js3.p((MovieDownloadData) myketRecyclerData, "data");
        this.D = true;
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof t43) {
            this.z = (t43) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final t43 z() {
        t43 t43Var = this.z;
        if (t43Var != null) {
            return t43Var;
        }
        js3.V("binding");
        throw null;
    }
}
