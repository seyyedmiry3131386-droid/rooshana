package ir.mservices.market.movie.ui.detail;

import defpackage.dp2;
import defpackage.g51;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.movie.download.core.MovieDownloadViewModel;
import ir.myket.movie.common.domain.models.RestrictionInfo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$13", f = "MovieDetailRecyclerListFragment.kt", l = {1132}, m = "invokeSuspend", v = 1)
final class MovieDetailRecyclerListFragment$onViewCreated$13 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieDetailRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$13$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$13$1", f = "MovieDetailRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ MovieDetailRecyclerListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = movieDetailRecyclerListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((RestrictionInfo) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RestrictionInfo restrictionInfo = (RestrictionInfo) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            int i = MovieDetailRecyclerListFragment.H1;
            this.b.j2(restrictionInfo, true, null);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$onViewCreated$13(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieDetailRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieDetailRecyclerListFragment$onViewCreated$13(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieDetailRecyclerListFragment$onViewCreated$13) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
            o4 o4Var = new o4(((MovieDownloadViewModel) movieDetailRecyclerListFragment.w1.getValue()).B, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(movieDetailRecyclerListFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
