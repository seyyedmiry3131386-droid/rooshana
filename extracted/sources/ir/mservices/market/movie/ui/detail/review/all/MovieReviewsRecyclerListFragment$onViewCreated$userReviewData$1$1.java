package ir.mservices.market.movie.ui.detail.review.all;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment$onViewCreated$userReviewData$1$1", f = "MovieReviewsRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieReviewsRecyclerListFragment$onViewCreated$userReviewData$1$1 extends SuspendLambda implements dp2 {
    public final /* synthetic */ MovieReviewsRecyclerListFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieReviewsRecyclerListFragment$onViewCreated$userReviewData$1$1(MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.a = movieReviewsRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieReviewsRecyclerListFragment$onViewCreated$userReviewData$1$1(this.a, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        MovieReviewsRecyclerListFragment$onViewCreated$userReviewData$1$1 movieReviewsRecyclerListFragment$onViewCreated$userReviewData$1$1 = (MovieReviewsRecyclerListFragment$onViewCreated$userReviewData$1$1) create((g51) obj);
        tx8 tx8Var = tx8.a;
        movieReviewsRecyclerListFragment$onViewCreated$userReviewData$1$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        int i = MovieReviewsRecyclerListFragment.s1;
        this.a.O1();
        return tx8.a;
    }
}
