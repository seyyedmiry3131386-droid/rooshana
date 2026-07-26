package ir.mservices.market.movie.ui.detail.review.all;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.br9;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vo4;
import defpackage.xe2;
import defpackage.y97;
import defpackage.z45;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel$doRequest$1", f = "MovieReviewsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieReviewsViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MovieReviewsViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieReviewsViewModel$doRequest$1(MovieReviewsViewModel movieReviewsViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = movieReviewsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieReviewsViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieReviewsViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final MovieReviewsViewModel movieReviewsViewModel = this.a;
        final vo4 vo4Var = movieReviewsViewModel.v;
        final String str = movieReviewsViewModel.z.a;
        vo4Var.getClass();
        js3.p(str, "movieId");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.n(false), new bp2() { // from class: ir.mservices.market.movie.ui.detail.review.all.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new MovieReviewsRepositoryImpl$getReviewList$1$1(vo4Var, str, movieReviewsViewModel, null), null);
            }
        }).a, new z45(2, movieReviewsViewModel)), y97.G(movieReviewsViewModel)), ir.mservices.market.version2.ui.recycler.filter.a.a(br9.B("userReviewFilter")), null, null, 12);
    }
}
