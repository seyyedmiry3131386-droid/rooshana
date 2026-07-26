package ir.mservices.market.movie.ui.search.result;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.ck4;
import defpackage.g51;
import defpackage.gu9;
import defpackage.i25;
import defpackage.qp2;
import defpackage.rz5;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.search.result.MovieSearchResultViewModel$doRequest$1", f = "MovieSearchResultViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieSearchResultViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MovieSearchResultViewModel a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSearchResultViewModel$doRequest$1(MovieSearchResultViewModel movieSearchResultViewModel, String str, String str2, Integer num, String str3, g51 g51Var) {
        super(2, g51Var);
        this.a = movieSearchResultViewModel;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieSearchResultViewModel$doRequest$1(this.a, this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieSearchResultViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final MovieSearchResultViewModel movieSearchResultViewModel = this.a;
        final ck4 ck4Var = movieSearchResultViewModel.u;
        ck4Var.getClass();
        rz5 rz5VarN = gu9.n(false);
        final String str = this.b;
        final String str2 = this.c;
        final Integer num = this.d;
        final String str3 = this.e;
        return new bz6(e.b(gu9.x((xe2) new m(rz5VarN, new bp2() { // from class: ir.mservices.market.movie.ui.search.result.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new MovieSearchResultRepositoryImpl$getSearchMovies$1$1(ck4Var, str, str2, num, str3, movieSearchResultViewModel, null), null);
            }
        }).a, new i25(4)), y97.G(movieSearchResultViewModel)), null, null, null, 14);
    }
}
