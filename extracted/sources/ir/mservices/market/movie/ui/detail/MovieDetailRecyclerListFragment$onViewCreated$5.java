package ir.mservices.market.movie.ui.detail;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u15;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$5", f = "MovieDetailRecyclerListFragment.kt", l = {1033}, m = "invokeSuspend", v = 1)
final class MovieDetailRecyclerListFragment$onViewCreated$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieDetailRecyclerListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$onViewCreated$5(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieDetailRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieDetailRecyclerListFragment$onViewCreated$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((MovieDetailRecyclerListFragment$onViewCreated$5) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = MovieDetailRecyclerListFragment.H1;
            MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
            pv6 pv6Var = movieDetailRecyclerListFragment.X1().N;
            u15 u15Var = new u15(movieDetailRecyclerListFragment, 2);
            this.a = 1;
            if (pv6Var.a.a(u15Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
