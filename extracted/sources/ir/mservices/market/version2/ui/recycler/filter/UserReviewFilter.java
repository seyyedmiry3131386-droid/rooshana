package ir.mservices.market.version2.ui.recycler.filter;

import defpackage.u19;
import defpackage.v48;
import ir.mservices.market.common.Filter;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.ui.detail.review.MovieUserSubmitReviewData;

/* JADX INFO: loaded from: classes3.dex */
public final class UserReviewFilter extends GeneralFilter {
    @Override // ir.mservices.market.common.Filter
    public final boolean u(MyketRecyclerData myketRecyclerData) {
        MovieUserSubmitReviewData movieUserSubmitReviewData;
        v48 v48Var;
        u19 u19Var = myketRecyclerData instanceof u19 ? (u19) myketRecyclerData : null;
        if ((u19Var == null || (v48Var = (movieUserSubmitReviewData = (MovieUserSubmitReviewData) u19Var).c) == null) ? false : movieUserSubmitReviewData.d ^ ((Boolean) v48Var.getValue()).booleanValue()) {
            return true;
        }
        Filter filter = this.a;
        return filter != null ? filter.u(myketRecyclerData) : false;
    }
}
