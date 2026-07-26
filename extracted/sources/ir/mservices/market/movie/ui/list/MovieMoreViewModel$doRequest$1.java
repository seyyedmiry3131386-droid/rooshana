package ir.mservices.market.movie.ui.list;

import androidx.paging.e;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.m22;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.list.MovieMoreViewModel$doRequest$1", f = "MovieMoreViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieMoreViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MovieMoreViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieMoreViewModel$doRequest$1(MovieMoreViewModel movieMoreViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = movieMoreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieMoreViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieMoreViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        MovieMoreViewModel movieMoreViewModel = this.a;
        return new bz6(e.b(gu9.x(movieMoreViewModel.t.b(null, movieMoreViewModel.u.a, movieMoreViewModel, false, null), new m22(29, movieMoreViewModel)), y97.G(movieMoreViewModel)), null, null, null, 14);
    }
}
