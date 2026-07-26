package ir.mservices.market.download.movie;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.movie.download.core.MovieDownloadViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment$onViewCreated$2", f = "MovieDownloadRecyclerListFragment.kt", l = {93}, m = "invokeSuspend", v = 1)
final class MovieDownloadRecyclerListFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieDownloadRecyclerListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDownloadRecyclerListFragment$onViewCreated$2(MovieDownloadRecyclerListFragment movieDownloadRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieDownloadRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieDownloadRecyclerListFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((MovieDownloadRecyclerListFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = MovieDownloadRecyclerListFragment.l1;
            MovieDownloadRecyclerListFragment movieDownloadRecyclerListFragment = this.b;
            pv6 pv6Var = ((MovieDownloadViewModel) movieDownloadRecyclerListFragment.k1.getValue()).D;
            a aVar = new a(movieDownloadRecyclerListFragment);
            this.a = 1;
            if (pv6Var.a.a(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
