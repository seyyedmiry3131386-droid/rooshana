package ir.mservices.market.search.history.ui;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment$createDataAdapter$1$5$1", f = "SearchHistoryRecyclerListFragment.kt", l = {167}, m = "invokeSuspend", v = 1)
final class SearchHistoryRecyclerListFragment$createDataAdapter$1$5$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ SearchHistoryRecyclerListFragment b;
    public final /* synthetic */ View c;

    /* JADX INFO: renamed from: ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment$createDataAdapter$1$5$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment$createDataAdapter$1$5$1$1", f = "SearchHistoryRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ View a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(View view, g51 g51Var) {
            super(2, g51Var);
            this.a = view;
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
            View view = this.a;
            js3.n(view, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
            ((LottieAnimationView) view).f();
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHistoryRecyclerListFragment$createDataAdapter$1$5$1(SearchHistoryRecyclerListFragment searchHistoryRecyclerListFragment, View view, g51 g51Var) {
        super(1, g51Var);
        this.b = searchHistoryRecyclerListFragment;
        this.c = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SearchHistoryRecyclerListFragment$createDataAdapter$1$5$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((SearchHistoryRecyclerListFragment$createDataAdapter$1$5$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = SearchHistoryRecyclerListFragment.e1;
            pv6 pv6Var = this.b.U0().J;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
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
