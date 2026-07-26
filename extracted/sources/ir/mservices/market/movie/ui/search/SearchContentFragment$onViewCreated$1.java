package ir.mservices.market.movie.ui.search;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.views.SearchView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.search.SearchContentFragment$onViewCreated$1", f = "SearchContentFragment.kt", l = {69}, m = "invokeSuspend", v = 1)
final class SearchContentFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ SearchContentFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.search.SearchContentFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.search.SearchContentFragment$onViewCreated$1$1", f = "SearchContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ SearchContentFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchContentFragment searchContentFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = searchContentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tx8) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = SearchContentFragment.t1;
            SearchContentFragment searchContentFragment = this.a;
            SearchView searchView = searchContentFragment.l1;
            if (searchView != null) {
                searchView.i(true, false);
            }
            searchContentFragment.p1.c("");
            SearchView searchView2 = searchContentFragment.l1;
            if (searchView2 != null) {
                searchView2.f();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchContentFragment$onViewCreated$1(SearchContentFragment searchContentFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = searchContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SearchContentFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((SearchContentFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            SearchContentFragment searchContentFragment = this.b;
            pv6 pv6Var = ((SearchIntentViewModel) searchContentFragment.s1.getValue()).x;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchContentFragment, null);
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
