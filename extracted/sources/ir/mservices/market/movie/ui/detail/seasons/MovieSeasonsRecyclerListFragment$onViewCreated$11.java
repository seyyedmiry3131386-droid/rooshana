package ir.mservices.market.movie.ui.detail.seasons;

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
@tb1(c = "ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$onViewCreated$11", f = "MovieSeasonsRecyclerListFragment.kt", l = {242}, m = "invokeSuspend", v = 1)
final class MovieSeasonsRecyclerListFragment$onViewCreated$11 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieSeasonsRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$onViewCreated$11$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$onViewCreated$11$1", f = "MovieSeasonsRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ MovieSeasonsRecyclerListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = movieSeasonsRecyclerListFragment;
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
            int i = MovieSeasonsRecyclerListFragment.s1;
            this.b.V1(restrictionInfo, true, null);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSeasonsRecyclerListFragment$onViewCreated$11(MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieSeasonsRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieSeasonsRecyclerListFragment$onViewCreated$11(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieSeasonsRecyclerListFragment$onViewCreated$11) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment = this.b;
            o4 o4Var = new o4(((MovieDownloadViewModel) movieSeasonsRecyclerListFragment.m1.getValue()).B, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(movieSeasonsRecyclerListFragment, null);
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
