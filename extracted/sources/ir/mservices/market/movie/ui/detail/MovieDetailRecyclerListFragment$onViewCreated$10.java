package ir.mservices.market.movie.ui.detail;

import defpackage.dp2;
import defpackage.f88;
import defpackage.g51;
import defpackage.hh2;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$10", f = "MovieDetailRecyclerListFragment.kt", l = {1093}, m = "invokeSuspend", v = 1)
final class MovieDetailRecyclerListFragment$onViewCreated$10 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieDetailRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$10$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$10$1", f = "MovieDetailRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
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
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((String) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String string = (String) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
            if (string == null || f88.n0(string)) {
                string = movieDetailRecyclerListFragment.K().getString(rs6.error_dto_default_message);
                js3.o(string, "getString(...)");
            }
            hh2.H(new hh2(movieDetailRecyclerListFragment.F(), string));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$onViewCreated$10(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieDetailRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieDetailRecyclerListFragment$onViewCreated$10(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieDetailRecyclerListFragment$onViewCreated$10) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = MovieDetailRecyclerListFragment.H1;
            MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
            pv6 pv6Var = movieDetailRecyclerListFragment.Y1().F;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(movieDetailRecyclerListFragment, null);
            this.a = 1;
            if (d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
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
