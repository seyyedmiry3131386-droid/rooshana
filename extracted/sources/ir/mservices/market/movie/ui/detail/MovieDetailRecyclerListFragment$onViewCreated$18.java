package ir.mservices.market.movie.ui.detail;

import defpackage.d25;
import defpackage.dp2;
import defpackage.dq4;
import defpackage.eq1;
import defpackage.g51;
import defpackage.hs9;
import defpackage.js3;
import defpackage.qp2;
import defpackage.sq4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.us3;
import defpackage.z15;
import ir.mservices.market.views.BigMovieOvalButton;
import ir.mservices.market.views.MyketProgressState;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$18", f = "MovieDetailRecyclerListFragment.kt", l = {1163}, m = "invokeSuspend", v = 1)
final class MovieDetailRecyclerListFragment$onViewCreated$18 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieDetailRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$18$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$18$2", f = "MovieDetailRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ MovieDetailRecyclerListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = movieDetailRecyclerListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, g51Var);
            anonymousClass2.a = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((dq4) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            dq4 dq4Var = (dq4) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            int i = MovieDetailRecyclerListFragment.H1;
            MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
            MyketProgressState myketProgressStateQ1 = MovieDetailRecyclerListFragment.Q1(movieDetailRecyclerListFragment, (Pair) movieDetailRecyclerListFragment.X1().z0.a.getValue(), dq4Var);
            d25 d25Var = movieDetailRecyclerListFragment.r1;
            if (d25Var == null) {
                js3.V("toolbarBinding");
                throw null;
            }
            d25Var.w.setState(myketProgressStateQ1);
            z15 z15Var = movieDetailRecyclerListFragment.A1;
            js3.m(z15Var);
            BigMovieOvalButton bigMovieOvalButton = z15Var.x;
            if (bigMovieOvalButton != null) {
                bigMovieOvalButton.setState(myketProgressStateQ1);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$onViewCreated$18(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieDetailRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieDetailRecyclerListFragment$onViewCreated$18(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieDetailRecyclerListFragment$onViewCreated$18) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [c24, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
            eq1 eq1VarB = hs9.B(((sq4) movieDetailRecyclerListFragment.n1.getValue()).e, new us3(27), hs9.e);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(movieDetailRecyclerListFragment, null);
            this.a = 1;
            if (d.f(eq1VarB, anonymousClass2, this) == coroutineSingletons) {
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
