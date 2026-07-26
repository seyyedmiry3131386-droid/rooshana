package ir.mservices.market.movie.ui.detail;

import defpackage.d15;
import defpackage.dp2;
import defpackage.f57;
import defpackage.f88;
import defpackage.fo0;
import defpackage.g51;
import defpackage.gd2;
import defpackage.js3;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uv1;
import defpackage.zk8;
import ir.mservices.market.movie.data.webapi.MovieFullDto;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$fillMovieFullDto$3", f = "MovieDetailRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieDetailRecyclerListFragment$fillMovieFullDto$3 extends SuspendLambda implements dp2 {
    public final /* synthetic */ MovieDetailRecyclerListFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$fillMovieFullDto$3(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.a = movieDetailRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieDetailRecyclerListFragment$fillMovieFullDto$3(this.a, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        MovieDetailRecyclerListFragment$fillMovieFullDto$3 movieDetailRecyclerListFragment$fillMovieFullDto$3 = (MovieDetailRecyclerListFragment$fillMovieFullDto$3) create((g51) obj);
        tx8 tx8Var = tx8.a;
        movieDetailRecyclerListFragment$fillMovieFullDto$3.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String posterLandscapeUrl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        int i = MovieDetailRecyclerListFragment.H1;
        MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.a;
        movieDetailRecyclerListFragment.y1().scrollBy(0, 1);
        MovieFullDto movieFullDtoF = movieDetailRecyclerListFragment.X1().F();
        if (movieFullDtoF != null && (posterLandscapeUrl = movieFullDtoF.getPosterLandscapeUrl()) != null) {
            if (f88.n0(posterLandscapeUrl)) {
                posterLandscapeUrl = null;
            }
            if (posterLandscapeUrl != null) {
                f57 f57Var = (f57) ((f57) zk8.Q(movieDetailRecyclerListFragment, posterLandscapeUrl).W(uv1.b()).E(5)).G(!movieDetailRecyclerListFragment.d2() ? new fo0() : new gd2());
                d15 d15Var = movieDetailRecyclerListFragment.s1;
                if (d15Var == null) {
                    js3.V("collapseBinding");
                    throw null;
                }
                f57Var.P(d15Var.v);
            }
        }
        return tx8.a;
    }
}
