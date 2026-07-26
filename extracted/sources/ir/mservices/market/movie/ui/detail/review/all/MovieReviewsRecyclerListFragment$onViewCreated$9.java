package ir.mservices.market.movie.ui.detail.review.all;

import defpackage.dp2;
import defpackage.g51;
import defpackage.hh2;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment$onViewCreated$9", f = "MovieReviewsRecyclerListFragment.kt", l = {206}, m = "invokeSuspend", v = 1)
final class MovieReviewsRecyclerListFragment$onViewCreated$9 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieReviewsRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment$onViewCreated$9$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment$onViewCreated$9$1", f = "MovieReviewsRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ MovieReviewsRecyclerListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = movieReviewsRecyclerListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((String) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            hh2.H(new hh2(this.b.H(), str));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieReviewsRecyclerListFragment$onViewCreated$9(MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieReviewsRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieReviewsRecyclerListFragment$onViewCreated$9(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieReviewsRecyclerListFragment$onViewCreated$9) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = MovieReviewsRecyclerListFragment.s1;
            MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment = this.b;
            pv6 pv6Var = movieReviewsRecyclerListFragment.R1().O;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(movieReviewsRecyclerListFragment, null);
            this.a = 1;
            if (d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
