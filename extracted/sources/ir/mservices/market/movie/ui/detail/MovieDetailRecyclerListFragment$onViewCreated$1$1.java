package ir.mservices.market.movie.ui.detail;

import defpackage.e71;
import defpackage.g51;
import defpackage.pt1;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u15;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$1$1", f = "MovieDetailRecyclerListFragment.kt", l = {954}, m = "invokeSuspend", v = 1)
final class MovieDetailRecyclerListFragment$onViewCreated$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieDetailRecyclerListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$onViewCreated$1$1(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, g51 g51Var) {
        super(2, g51Var);
        this.b = movieDetailRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieDetailRecyclerListFragment$onViewCreated$1$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieDetailRecyclerListFragment$onViewCreated$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        int i2 = MovieDetailRecyclerListFragment.H1;
        MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
        rv6 rv6Var = movieDetailRecyclerListFragment.X1().K;
        u15 u15Var = new u15(movieDetailRecyclerListFragment, 0);
        this.a = 1;
        Object objA = rv6Var.a.a(new pt1(u15Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
