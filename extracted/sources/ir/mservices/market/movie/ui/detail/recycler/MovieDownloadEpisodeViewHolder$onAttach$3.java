package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.h25;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.recycler.MovieDownloadEpisodeViewHolder$onAttach$3", f = "MovieDownloadEpisode.kt", l = {129}, m = "invokeSuspend", v = 1)
final class MovieDownloadEpisodeViewHolder$onAttach$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieDownloadEpisodeData b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDownloadEpisodeViewHolder$onAttach$3(MovieDownloadEpisodeData movieDownloadEpisodeData, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = movieDownloadEpisodeData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieDownloadEpisodeViewHolder$onAttach$3(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((MovieDownloadEpisodeViewHolder$onAttach$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            MovieDownloadEpisodeData movieDownloadEpisodeData = this.b;
            rv6 rv6Var = movieDownloadEpisodeData.d;
            h25 h25Var = new h25(this.c, movieDownloadEpisodeData);
            this.a = 1;
            if (rv6Var.a.a(h25Var, this) == coroutineSingletons) {
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
