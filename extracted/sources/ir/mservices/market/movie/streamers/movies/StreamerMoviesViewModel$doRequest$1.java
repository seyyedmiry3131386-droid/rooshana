package ir.mservices.market.movie.streamers.movies;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.a67;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.xg5;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.streamers.movies.StreamerMoviesViewModel$doRequest$1", f = "StreamerMoviesViewModel.kt", l = {30}, m = "invokeSuspend", v = 1)
final class StreamerMoviesViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ StreamerMoviesViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamerMoviesViewModel$doRequest$1(StreamerMoviesViewModel streamerMoviesViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = streamerMoviesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new StreamerMoviesViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((StreamerMoviesViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        final StreamerMoviesViewModel streamerMoviesViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            final xg5 xg5Var = streamerMoviesViewModel.v;
            final String str = streamerMoviesViewModel.w.a;
            this.a = 1;
            xg5Var.getClass();
            obj = (xe2) new m(gu9.n(false), new bp2() { // from class: ir.mservices.market.movie.streamers.movies.model.a
                @Override // defpackage.bp2
                public final Object invoke() {
                    return new ir.mservices.market.model.paging.a(new StreamerMoviesRepositoryImpl$getStreamerMovies$2$1(xg5Var, str, streamerMoviesViewModel, null), null);
                }
            }).a;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return new bz6(e.b(gu9.x((xe2) obj, new a67(16, streamerMoviesViewModel)), y97.G(streamerMoviesViewModel)), null, null, null, 14);
    }
}
