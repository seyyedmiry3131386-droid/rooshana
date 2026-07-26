package defpackage;

import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.MovieReviewDto;
import ir.mservices.market.movie.ui.detail.review.MovieReviewData;
import ir.mservices.market.movie.ui.detail.review.data.LikeOrDislikeData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g25 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LikeOrDislikeData b;

    public /* synthetic */ g25(LikeOrDislikeData likeOrDislikeData, int i) {
        this.a = i;
        this.b = likeOrDislikeData;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        MovieReviewDto movieReviewDto;
        MovieReviewDto movieReviewDto2;
        RecyclerItem recyclerItem = (RecyclerItem) obj;
        switch (this.a) {
            case 0:
                MyketRecyclerData myketRecyclerData = recyclerItem.c;
                MovieReviewData movieReviewData = myketRecyclerData instanceof MovieReviewData ? (MovieReviewData) myketRecyclerData : null;
                return Boolean.valueOf((movieReviewData == null || (movieReviewDto = movieReviewData.a) == null || movieReviewDto.getId() != this.b.b) ? false : true);
            default:
                MyketRecyclerData myketRecyclerData2 = recyclerItem.c;
                MovieReviewData movieReviewData2 = myketRecyclerData2 instanceof MovieReviewData ? (MovieReviewData) myketRecyclerData2 : null;
                return Boolean.valueOf((movieReviewData2 == null || (movieReviewDto2 = movieReviewData2.a) == null || movieReviewDto2.getId() != this.b.b) ? false : true);
        }
    }
}
