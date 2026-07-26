package ir.mservices.market.movie.ui.detail.seasons;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$scrollToSeason$3$1", f = "MovieSeasonsRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieSeasonsRecyclerListFragment$scrollToSeason$3$1 extends SuspendLambda implements dp2 {
    public final /* synthetic */ MovieSeasonsRecyclerListFragment a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSeasonsRecyclerListFragment$scrollToSeason$3$1(MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment, int i, g51 g51Var) {
        super(1, g51Var);
        this.a = movieSeasonsRecyclerListFragment;
        this.b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieSeasonsRecyclerListFragment$scrollToSeason$3$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        MovieSeasonsRecyclerListFragment$scrollToSeason$3$1 movieSeasonsRecyclerListFragment$scrollToSeason$3$1 = (MovieSeasonsRecyclerListFragment$scrollToSeason$3$1) create((g51) obj);
        tx8 tx8Var = tx8.a;
        movieSeasonsRecyclerListFragment$scrollToSeason$3$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        this.a.N1(this.b);
        return tx8.a;
    }
}
