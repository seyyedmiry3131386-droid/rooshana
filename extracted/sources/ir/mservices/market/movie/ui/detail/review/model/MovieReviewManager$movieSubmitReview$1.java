package ir.mservices.market.movie.ui.detail.review.model;

import defpackage.g51;
import defpackage.tb1;
import ir.mservices.market.movie.ui.detail.review.data.SubmitMovieReviewData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.review.model.MovieReviewManager", f = "MovieReviewManager.kt", l = {22, 42}, m = "movieSubmitReview", v = 1)
final class MovieReviewManager$movieSubmitReview$1 extends ContinuationImpl {
    public SubmitMovieReviewData a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieReviewManager$movieSubmitReview$1(a aVar, g51 g51Var) {
        super(g51Var);
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
