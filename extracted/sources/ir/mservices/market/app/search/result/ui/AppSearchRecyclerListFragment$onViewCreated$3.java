package ir.mservices.market.app.search.result.ui;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment$onViewCreated$3", f = "AppSearchRecyclerListFragment.kt", l = {313}, m = "invokeSuspend", v = 1)
final class AppSearchRecyclerListFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AppSearchRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment$onViewCreated$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment$onViewCreated$3$1", f = "AppSearchRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ AppSearchRecyclerListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppSearchRecyclerListFragment appSearchRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = appSearchRecyclerListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = ((Boolean) obj).booleanValue();
            return anonymousClass1;
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
            boolean z = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.b;
            if (z) {
                int i = AppSearchRecyclerListFragment.e1;
                appSearchRecyclerListFragment.Y0();
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = AppSearchRecyclerListFragment.e1;
                appSearchRecyclerListFragment.V0();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSearchRecyclerListFragment$onViewCreated$3(AppSearchRecyclerListFragment appSearchRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = appSearchRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppSearchRecyclerListFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AppSearchRecyclerListFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = AppSearchRecyclerListFragment.e1;
            AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.b;
            pv6 pv6Var = appSearchRecyclerListFragment.U0().B;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(appSearchRecyclerListFragment, null);
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
