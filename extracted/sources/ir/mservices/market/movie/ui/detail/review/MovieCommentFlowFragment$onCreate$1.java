package ir.mservices.market.movie.ui.detail.review;

import defpackage.dp2;
import defpackage.g51;
import defpackage.n05;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.review.MovieCommentFlowFragment$onCreate$1", f = "MovieCommentFlowFragment.kt", l = {59}, m = "invokeSuspend", v = 1)
final class MovieCommentFlowFragment$onCreate$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieCommentFlowFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieCommentFlowFragment$onCreate$1(MovieCommentFlowFragment movieCommentFlowFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieCommentFlowFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieCommentFlowFragment$onCreate$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((MovieCommentFlowFragment$onCreate$1) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = MovieCommentFlowFragment.P0;
            MovieCommentFlowFragment movieCommentFlowFragment = this.b;
            pv6 pv6Var = movieCommentFlowFragment.F0().G;
            n05 n05Var = new n05(movieCommentFlowFragment, 0);
            this.a = 1;
            if (pv6Var.a.a(n05Var, this) == coroutineSingletons) {
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
