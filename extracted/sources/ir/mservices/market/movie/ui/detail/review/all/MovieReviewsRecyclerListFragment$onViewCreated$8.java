package ir.mservices.market.movie.ui.detail.review.all;

import android.view.View;
import defpackage.d75;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.lw8;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.w55;
import defpackage.x55;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment$onViewCreated$8", f = "MovieReviewsRecyclerListFragment.kt", l = {198}, m = "invokeSuspend", v = 1)
final class MovieReviewsRecyclerListFragment$onViewCreated$8 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieReviewsRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment$onViewCreated$8$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment$onViewCreated$8$1", f = "MovieReviewsRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
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
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((x55) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x55 x55Var = (x55) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            if (x55Var instanceof w55) {
                MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment = this.b;
                d75 d75Var = movieReviewsRecyclerListFragment.o1;
                js3.m(d75Var);
                View view = d75Var.l;
                js3.o(view, "getRoot(...)");
                view.setVisibility(8);
                if (movieReviewsRecyclerListFragment.j1 == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                d75 d75Var2 = movieReviewsRecyclerListFragment.o1;
                js3.m(d75Var2);
                lw8.a(d75Var2.l);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieReviewsRecyclerListFragment$onViewCreated$8(MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieReviewsRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieReviewsRecyclerListFragment$onViewCreated$8(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieReviewsRecyclerListFragment$onViewCreated$8) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = MovieReviewsRecyclerListFragment.s1;
            MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment = this.b;
            rv6 rv6Var = movieReviewsRecyclerListFragment.R1().S;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(movieReviewsRecyclerListFragment, null);
            this.a = 1;
            if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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
