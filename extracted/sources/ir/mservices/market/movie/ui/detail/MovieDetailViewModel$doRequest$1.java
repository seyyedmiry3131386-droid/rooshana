package ir.mservices.market.movie.ui.detail;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.br9;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.m22;
import defpackage.pa2;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v15;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.model.paging.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailViewModel$doRequest$1", f = "MovieDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieDetailViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MovieDetailViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailViewModel$doRequest$1(MovieDetailViewModel movieDetailViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = movieDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieDetailViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieDetailViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        final MovieDetailViewModel movieDetailViewModel = this.a;
        v15 v15Var = movieDetailViewModel.R;
        final String str = v15Var.a;
        if (str == null) {
            return null;
        }
        MovieDetailViewModel$doRequest$1$1$1 movieDetailViewModel$doRequest$1$1$1 = new MovieDetailViewModel$doRequest$1$1$1(2, movieDetailViewModel, MovieDetailViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0);
        final pa2 pa2Var = movieDetailViewModel.v;
        final String str2 = v15Var.b;
        final String str3 = v15Var.e;
        pa2Var.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.movie.ui.detail.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new b(new MovieDetailRepositoryImp$getMovieFullDto$1$1(pa2Var, str, str2, str3, movieDetailViewModel, null));
            }
        }).a, new m22(27, movieDetailViewModel)), y97.G(movieDetailViewModel)), ir.mservices.market.version2.ui.recycler.filter.a.a(br9.C("userReviewFilter", "MovieReviewInfoFilter", "movieRecommendationFilter")), movieDetailViewModel$doRequest$1$1$1, null, 8);
    }
}
