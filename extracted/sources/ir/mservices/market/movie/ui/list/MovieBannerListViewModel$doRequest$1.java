package ir.mservices.market.movie.ui.list;

import androidx.paging.e;
import defpackage.a05;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.m22;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ut4;
import defpackage.y97;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.list.MovieBannerListViewModel$doRequest$1", f = "MovieBannerListViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieBannerListViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MovieBannerListViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieBannerListViewModel$doRequest$1(MovieBannerListViewModel movieBannerListViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = movieBannerListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieBannerListViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieBannerListViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        MovieBannerListViewModel movieBannerListViewModel = this.a;
        ut4 ut4Var = movieBannerListViewModel.t;
        a05 a05Var = movieBannerListViewModel.u;
        HomeMovieBannerListDto homeMovieBannerListDto = a05Var.a;
        String str = a05Var.c;
        return new bz6(e.b(gu9.x(ut4Var.i(homeMovieBannerListDto, str, str, movieBannerListViewModel), new m22(23, movieBannerListViewModel)), y97.G(movieBannerListViewModel)), null, null, null, 14);
    }
}
