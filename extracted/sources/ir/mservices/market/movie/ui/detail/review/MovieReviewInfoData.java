package ir.mservices.market.movie.ui.detail.review;

import defpackage.g32;
import defpackage.h45;
import defpackage.i55;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.MovieReviewInfoDto;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieReviewInfoData implements MyketRecyclerData, h45, wo2, g32, i55 {
    public static final int b = js6.movie_review_info;
    public final MovieReviewInfoDto a;

    public MovieReviewInfoData(MovieReviewInfoDto movieReviewInfoDto) {
        this.a = movieReviewInfoDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // defpackage.h45
    public final String a() {
        return "review_info";
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieReviewInfoData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.detail.review.MovieReviewInfoData");
        return js3.i(this.a, ((MovieReviewInfoData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "review_info";
    }

    public final int hashCode() {
        MovieReviewInfoDto movieReviewInfoDto = this.a;
        if (movieReviewInfoDto != null) {
            return movieReviewInfoDto.hashCode();
        }
        return 0;
    }
}
