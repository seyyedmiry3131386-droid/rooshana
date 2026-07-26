package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.movie.ui.detail.review.MovieRateWithoutCommentData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewInfoData;
import ir.mservices.market.movie.ui.detail.review.MovieUserSubmitReviewData;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class c55 extends a {
    public z55 l;
    public z55 m;
    public z55 n;
    public z55 o;
    public z55 p;
    public z55 q;
    public z55 r;
    public z55 s;
    public z55 t;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == MovieReviewInfoData.b) {
            return new q55(view, null);
        }
        if (i == MovieReviewData.f) {
            z55 z55Var = this.l;
            if (z55Var == null) {
                js3.V("onMovieReviewLikeClickListener");
                throw null;
            }
            z55 z55Var2 = this.m;
            if (z55Var2 == null) {
                js3.V("onMovieReviewDislikeClickListener");
                throw null;
            }
            z55 z55Var3 = this.n;
            if (z55Var3 == null) {
                js3.V("onProfileClickListener");
                throw null;
            }
            z55 z55Var4 = this.o;
            if (z55Var4 != null) {
                return new y55(view, z55Var, z55Var2, z55Var3, z55Var4);
            }
            js3.V("onReviewMenuClickListener");
            throw null;
        }
        if (i == MovieRateWithoutCommentData.c) {
            ft1 ft1Var = new ft1(3, view);
            ft1Var.x = (d04) ((w91) qg5.r()).p.get();
            return ft1Var;
        }
        if (i != MovieUserSubmitReviewData.j) {
            return null;
        }
        z55 z55Var5 = this.p;
        if (z55Var5 == null) {
            js3.V("onUserProfileClickListener");
            throw null;
        }
        z55 z55Var6 = this.q;
        if (z55Var6 == null) {
            js3.V("onUserMovieSubmitReviewLikeClickListener");
            throw null;
        }
        z55 z55Var7 = this.r;
        if (z55Var7 == null) {
            js3.V("onUserMovieSubmitReviewDislikeClickListener");
            throw null;
        }
        z55 z55Var8 = this.s;
        if (z55Var8 == null) {
            js3.V("onUserMovieSubmitClickListener");
            throw null;
        }
        z55 z55Var9 = this.t;
        if (z55Var9 != null) {
            return new ir.mservices.market.movie.ui.detail.review.a(view, z55Var5, z55Var6, z55Var7, z55Var8, z55Var9);
        }
        js3.V("onEditReviewClickListener");
        throw null;
    }
}
