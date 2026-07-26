package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.detail.ui.recycler.AppHorizontalTagsData;
import ir.mservices.market.app.detail.ui.recycler.MessageBoxData;
import ir.mservices.market.app.detail.ui.recycler.c;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.movie.ui.detail.a;
import ir.mservices.market.movie.ui.detail.recycler.MovieCastData;
import ir.mservices.market.movie.ui.detail.recycler.MovieCastTitleData;
import ir.mservices.market.movie.ui.detail.recycler.MovieDescriptionData;
import ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeData;
import ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeMoreData;
import ir.mservices.market.movie.ui.detail.recycler.MovieHeaderData;
import ir.mservices.market.movie.ui.detail.recycler.MovieScreenshotsData;
import ir.mservices.market.movie.ui.detail.recycler.MovieSeasonTitleData;
import ir.mservices.market.movie.ui.detail.recycler.MovieTabData;
import ir.mservices.market.movie.ui.detail.recycler.MovieTrailerData;
import ir.mservices.market.movie.ui.detail.recycler.b;
import ir.mservices.market.movie.ui.detail.recycler.d;
import ir.mservices.market.movie.ui.detail.recycler.e;
import ir.mservices.market.movie.ui.detail.recycler.f;
import ir.mservices.market.movie.ui.detail.review.MovieEmptyReviewData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewInfoData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewMoreData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewTitleData;
import ir.mservices.market.movie.ui.detail.review.MovieUserSubmitReviewData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class f15 extends b80 {
    public q15 A;
    public q15 B;
    public q15 C;
    public q15 D;
    public q15 E;
    public q15 F;
    public q15 G;
    public q15 H;
    public q15 I;
    public q15 J;
    public q15 K;
    public q15 L;
    public sr4 M;
    public q15 N;
    public q15 O;
    public q15 P;
    public q15 Q;
    public r15 R;
    public q15 S;
    public q15 T;
    public a U;
    public final GraphicUtils$Dimension s;
    public final boolean t;
    public final t7 u;
    public q15 v;
    public q15 w;
    public q15 x;
    public q15 y;
    public q15 z;

    public f15(GraphicUtils$Dimension graphicUtils$Dimension, boolean z, lk2 lk2Var) {
        super(1);
        this.s = graphicUtils$Dimension;
        this.t = z;
        this.u = lk2Var;
    }

    @Override // defpackage.b80, ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == MovieSeasonTitleData.e) {
            q15 q15Var = this.I;
            if (q15Var != null) {
                return new y65(view, q15Var);
            }
            js3.V("onSeasonClickListener");
            throw null;
        }
        if (i == MovieDescriptionData.d) {
            a15 a15Var = new a15(view);
            return a15Var;
        }
        if (i == AppHorizontalTagsData.c) {
            q15 q15Var2 = this.v;
            if (q15Var2 != null) {
                return new c(view, q15Var2);
            }
            js3.V("onTagClickListener");
            throw null;
        }
        if (i == AddaxBoxData.c) {
            r15 r15Var = this.R;
            if (r15Var != null) {
                return new rc(0, r15Var, view);
            }
            js3.V("onAddaxClickListener");
            throw null;
        }
        if (i == AddaxBoxData.d) {
            r15 r15Var2 = this.R;
            if (r15Var2 != null) {
                return new rc(2, r15Var2, view);
            }
            js3.V("onAddaxClickListener");
            throw null;
        }
        if (i == AddaxBoxData.e) {
            r15 r15Var3 = this.R;
            if (r15Var3 != null) {
                return new rc(1, r15Var3, view);
            }
            js3.V("onAddaxClickListener");
            throw null;
        }
        if (i == MovieEpisodeData.e) {
            q15 q15Var3 = this.K;
            if (q15Var3 != null) {
                return new b(view, q15Var3);
            }
            js3.V("onEpisodeClickListener");
            throw null;
        }
        if (i == MovieEpisodeMoreData.b) {
            q15 q15Var4 = this.J;
            if (q15Var4 != null) {
                return new a35(view, q15Var4);
            }
            js3.V("onEpisodeMoreClickListener");
            throw null;
        }
        if (i == MovieCastTitleData.b) {
            return new l5(13, view);
        }
        if (i == MovieCastData.b) {
            return new l5(14, view);
        }
        if (i == MovieScreenshotsData.c) {
            q15 q15Var5 = this.L;
            if (q15Var5 != null) {
                return new d(view, this.s, q15Var5);
            }
            js3.V("onScreenshotClickListener");
            throw null;
        }
        if (i == MovieReviewTitleData.a) {
            q15 q15Var6 = this.w;
            if (q15Var6 != null) {
                return new u55(view, q15Var6);
            }
            js3.V("onMovieReviewShowMoreClickListener");
            throw null;
        }
        if (i == MovieReviewInfoData.b) {
            q15 q15Var7 = this.x;
            if (q15Var7 != null) {
                return new q55(view, q15Var7);
            }
            js3.V("onMovieRatingClickListener");
            throw null;
        }
        if (i == MovieUserSubmitReviewData.j) {
            q15 q15Var8 = this.B;
            if (q15Var8 == null) {
                js3.V("onUserProfileClickListener");
                throw null;
            }
            q15 q15Var9 = this.C;
            if (q15Var9 == null) {
                js3.V("onUserMovieSubmitReviewLikeClickListener");
                throw null;
            }
            q15 q15Var10 = this.D;
            if (q15Var10 == null) {
                js3.V("onUserMovieSubmitReviewDislikeClickListener");
                throw null;
            }
            q15 q15Var11 = this.E;
            if (q15Var11 == null) {
                js3.V("onUserMovieSubmitClickListener");
                throw null;
            }
            q15 q15Var12 = this.F;
            if (q15Var12 != null) {
                return new ir.mservices.market.movie.ui.detail.review.a(view, q15Var8, q15Var9, q15Var10, q15Var11, q15Var12);
            }
            js3.V("onEditReviewClickListener");
            throw null;
        }
        if (i == MovieReviewData.f) {
            view.setBackgroundColor(sj8.b().l);
            q15 q15Var13 = this.G;
            if (q15Var13 == null) {
                js3.V("onMovieReviewLikeClickListener");
                throw null;
            }
            q15 q15Var14 = this.H;
            if (q15Var14 == null) {
                js3.V("onMovieReviewDisLikeClickListener");
                throw null;
            }
            q15 q15Var15 = this.A;
            if (q15Var15 == null) {
                js3.V("onProfileClickListener");
                throw null;
            }
            q15 q15Var16 = this.z;
            if (q15Var16 != null) {
                return new y55(view, q15Var13, q15Var14, q15Var15, q15Var16);
            }
            js3.V("onMenuClickListener");
            throw null;
        }
        if (i == MovieReviewMoreData.a) {
            q15 q15Var17 = this.y;
            if (q15Var17 != null) {
                return new r55(view, q15Var17);
            }
            js3.V("onMovieReviewShowAllClickListener");
            throw null;
        }
        if (i == MovieTrailerData.e) {
            sr4 sr4Var = this.M;
            if (sr4Var == null) {
                js3.V("onTrailerClickListener");
                throw null;
            }
            q15 q15Var18 = this.N;
            if (q15Var18 != null) {
                return new f(view, this.s, this.u, sr4Var, q15Var18);
            }
            js3.V("onShowTrailerReplayIconListener");
            throw null;
        }
        if (i == DividerData.k) {
            return new oq1(view);
        }
        if (i == MessageBoxData.c) {
            q15 q15Var19 = this.T;
            if (q15Var19 != null) {
                return new av4(view, q15Var19);
            }
            js3.V("onMessageBoxClickListener");
            throw null;
        }
        if (i != MovieHeaderData.r) {
            if (i != MovieTabData.e) {
                return i == MovieEmptyReviewData.c ? new l5(15, view) : super.I(i, view, viewGroup);
            }
            a aVar = this.U;
            if (aVar != null) {
                return new e(view, aVar);
            }
            js3.V("onTabClickListener");
            throw null;
        }
        q15 q15Var20 = this.Q;
        if (q15Var20 == null) {
            js3.V("onDownloadButtonClickListener");
            throw null;
        }
        q15 q15Var21 = this.O;
        if (q15Var21 == null) {
            js3.V("onButtonClickListener");
            throw null;
        }
        q15 q15Var22 = this.S;
        if (q15Var22 == null) {
            js3.V("onPosterClickListener");
            throw null;
        }
        q15 q15Var23 = this.P;
        if (q15Var23 != null) {
            return new ir.mservices.market.movie.ui.detail.recycler.c(view, q15Var20, q15Var21, q15Var22, q15Var23);
        }
        js3.V("onStreamerClickListener");
        throw null;
    }

    @Override // defpackage.b80
    public final GraphicUtils$Dimension O() {
        return this.s;
    }

    @Override // defpackage.b80
    public final boolean P() {
        return this.t;
    }
}
