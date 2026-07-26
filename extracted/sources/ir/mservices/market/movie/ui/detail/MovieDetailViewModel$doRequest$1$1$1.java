package ir.mservices.market.movie.ui.detail;

import defpackage.pq6;
import defpackage.qp2;
import ir.mservices.market.app.detail.ui.recycler.MessageBoxData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.ui.detail.recycler.MovieCastData;
import ir.mservices.market.movie.ui.detail.recycler.MovieDescriptionData;
import ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeData;
import ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeMoreData;
import ir.mservices.market.movie.ui.detail.recycler.MovieHeaderData;
import ir.mservices.market.movie.ui.detail.recycler.MovieHorizontalTagData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewInfoData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewMoreData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewTitleData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeReelsRowData;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class MovieDetailViewModel$doRequest$1$1$1 extends FunctionReferenceImpl implements qp2 {
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        RecyclerItem recyclerItem = (RecyclerItem) obj;
        RecyclerItem recyclerItem2 = (RecyclerItem) obj2;
        MovieDetailViewModel movieDetailViewModel = (MovieDetailViewModel) this.receiver;
        movieDetailViewModel.getClass();
        if (recyclerItem == null || recyclerItem2 == null) {
            return null;
        }
        MyketRecyclerData myketRecyclerData = recyclerItem2.c;
        MyketRecyclerData myketRecyclerData2 = recyclerItem.c;
        if ((myketRecyclerData2 instanceof MovieHorizontalTagData) || (myketRecyclerData2 instanceof MovieReviewMoreData)) {
            return MovieDetailViewModel.C(movieDetailViewModel, Integer.valueOf(pq6.space_8), Integer.valueOf(pq6.space_8), Integer.valueOf(pq6.horizontal_space_outer), Integer.valueOf(pq6.horizontal_space_inner), 16);
        }
        if (myketRecyclerData2 instanceof MovieEpisodeMoreData) {
            return MovieDetailViewModel.C(movieDetailViewModel, Integer.valueOf(pq6.space_8), null, Integer.valueOf(pq6.horizontal_space_outer), Integer.valueOf(pq6.horizontal_space_inner), 18);
        }
        if (myketRecyclerData2 instanceof MovieCastData) {
            if (myketRecyclerData instanceof MovieCastData) {
                return null;
            }
            return MovieDetailViewModel.C(movieDetailViewModel, Integer.valueOf(pq6.space_8), Integer.valueOf(pq6.space_8), Integer.valueOf(pq6.horizontal_space_outer), Integer.valueOf(pq6.horizontal_space_inner), 16);
        }
        if (myketRecyclerData2 instanceof MovieReviewInfoData) {
            if (myketRecyclerData instanceof MovieHomeMoviesRowData) {
                return MovieDetailViewModel.C(movieDetailViewModel, null, Integer.valueOf(pq6.space_8), null, null, 29);
            }
            return null;
        }
        if (myketRecyclerData2 instanceof MovieDescriptionData) {
            return MovieDetailViewModel.C(movieDetailViewModel, Integer.valueOf(pq6.space_8), Integer.valueOf(pq6.space_8), null, null, 28);
        }
        if (myketRecyclerData2 instanceof MovieEpisodeData) {
            if (myketRecyclerData instanceof MovieEpisodeData) {
                return null;
            }
            return MovieDetailViewModel.C(movieDetailViewModel, Integer.valueOf(pq6.space_8), null, null, null, 30);
        }
        if (myketRecyclerData2 instanceof MovieHomeReelsRowData) {
            return MovieDetailViewModel.C(movieDetailViewModel, null, Integer.valueOf(pq6.space_m), null, null, 29);
        }
        if (myketRecyclerData2 instanceof MovieHomeBannersRowData) {
            return MovieDetailViewModel.C(movieDetailViewModel, null, Integer.valueOf(pq6.space_m), null, null, 29);
        }
        if (myketRecyclerData2 instanceof MovieHomeMoviesRowData) {
            return myketRecyclerData instanceof MessageBoxData ? MovieDetailViewModel.C(movieDetailViewModel, null, Integer.valueOf(pq6.space_16), null, null, 29) : myketRecyclerData instanceof MovieReviewTitleData ? MovieDetailViewModel.C(movieDetailViewModel, null, Integer.valueOf(pq6.space_16), null, null, 29) : MovieDetailViewModel.C(movieDetailViewModel, Integer.valueOf(pq6.space_m), null, null, null, 30);
        }
        if ((myketRecyclerData2 instanceof MovieHeaderData) && (myketRecyclerData instanceof MessageBoxData)) {
            return MovieDetailViewModel.C(movieDetailViewModel, null, Integer.valueOf(pq6.space_8), null, null, 29);
        }
        return null;
    }
}
