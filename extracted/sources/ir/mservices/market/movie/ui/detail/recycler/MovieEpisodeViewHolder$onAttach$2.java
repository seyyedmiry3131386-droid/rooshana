package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.b35;
import defpackage.e71;
import defpackage.eq1;
import defpackage.g51;
import defpackage.hs9;
import defpackage.i25;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeViewHolder$onAttach$2", f = "MovieEpisode.kt", l = {184}, m = "invokeSuspend", v = 1)
final class MovieEpisodeViewHolder$onAttach$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieEpisodeData b;
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieEpisodeViewHolder$onAttach$2(g51 g51Var, MovieEpisodeData movieEpisodeData, b bVar) {
        super(2, g51Var);
        this.b = movieEpisodeData;
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieEpisodeViewHolder$onAttach$2(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieEpisodeViewHolder$onAttach$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            MovieEpisodeData movieEpisodeData = this.b;
            eq1 eq1VarB = hs9.B(movieEpisodeData.c, new i25(1), hs9.e);
            b35 b35Var = new b35(this.c, movieEpisodeData, 1);
            this.a = 1;
            if (eq1VarB.a(b35Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
