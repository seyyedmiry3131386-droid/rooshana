package ir.mservices.market.download.movie;

import defpackage.dp2;
import defpackage.g51;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.download.movie.MovieRecentDownloadAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment$onViewCreated$3", f = "MovieDownloadRecyclerListFragment.kt", l = {100}, m = "invokeSuspend", v = 1)
final class MovieDownloadRecyclerListFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieDownloadRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment$onViewCreated$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment$onViewCreated$3$1", f = "MovieDownloadRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ MovieDownloadRecyclerListFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MovieDownloadRecyclerListFragment movieDownloadRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = movieDownloadRecyclerListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            MovieDownloadRecyclerListFragment movieDownloadRecyclerListFragment = this.a;
            ir.mservices.market.version2.ui.recycler.adapter.a aVar = movieDownloadRecyclerListFragment.Z0;
            if (aVar != null) {
                aVar.A();
            }
            int i = MovieDownloadRecyclerListFragment.l1;
            ((MovieRecentDownloadViewModel) movieDownloadRecyclerListFragment.j1.getValue()).r(MovieRecentDownloadAction.RefreshDoneAction.INSTANCE);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDownloadRecyclerListFragment$onViewCreated$3(MovieDownloadRecyclerListFragment movieDownloadRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieDownloadRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieDownloadRecyclerListFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieDownloadRecyclerListFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = MovieDownloadRecyclerListFragment.l1;
            MovieDownloadRecyclerListFragment movieDownloadRecyclerListFragment = this.b;
            o4 o4Var = new o4(((MovieRecentDownloadViewModel) movieDownloadRecyclerListFragment.j1.getValue()).B, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(movieDownloadRecyclerListFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
