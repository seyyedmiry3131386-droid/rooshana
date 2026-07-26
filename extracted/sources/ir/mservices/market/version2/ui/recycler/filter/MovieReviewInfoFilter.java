package ir.mservices.market.version2.ui.recycler.filter;

import defpackage.i55;
import defpackage.ql3;
import ir.mservices.market.common.Filter;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.MovieReviewInfoDto;
import ir.mservices.market.movie.ui.detail.review.MovieReviewInfoData;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieReviewInfoFilter extends GeneralFilter {
    @Override // ir.mservices.market.common.Filter
    public final boolean u(MyketRecyclerData myketRecyclerData) {
        ql3 ql3Var = null;
        i55 i55Var = myketRecyclerData instanceof i55 ? (i55) myketRecyclerData : null;
        if (i55Var != null) {
            MovieReviewInfoDto movieReviewInfoDto = ((MovieReviewInfoData) i55Var).a;
            if (movieReviewInfoDto != null && movieReviewInfoDto.getRating() != null) {
                ql3Var = new ql3();
            }
            if (ql3Var == null) {
                return true;
            }
        }
        Filter filter = this.a;
        return filter != null ? filter.u(myketRecyclerData) : false;
    }
}
