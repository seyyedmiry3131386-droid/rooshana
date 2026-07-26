package ir.mservices.market.movie.ui.detail.review;

import defpackage.g32;
import defpackage.h45;
import defpackage.js3;
import defpackage.js6;
import defpackage.oi0;
import defpackage.rm7;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.MovieReviewDto;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieReviewData implements MyketRecyclerData, h45, g32, wo2 {
    public static final int f = js6.holder_movie_review;
    public final MovieReviewDto a;
    public final String b;
    public final oi0 c;
    public final Boolean d;
    public final boolean e;

    public MovieReviewData(MovieReviewDto movieReviewDto, String str, oi0 oi0Var, Boolean bool, boolean z) {
        js3.p(str, "movieId");
        this.a = movieReviewDto;
        this.b = str;
        this.c = oi0Var;
        this.d = bool;
        this.e = z;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return f;
    }

    @Override // defpackage.h45
    public final String a() {
        return rm7.n(this.a.getId(), "more_reviews");
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieReviewData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.review.MovieReviewData");
        MovieReviewData movieReviewData = (MovieReviewData) obj;
        return js3.i(this.d, movieReviewData.d) && js3.i(this.c, movieReviewData.c) && js3.i(this.a, movieReviewData.a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return a();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
