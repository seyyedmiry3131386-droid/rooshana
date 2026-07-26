package ir.mservices.market.appUsage;

import defpackage.dp2;
import defpackage.f68;
import defpackage.g51;
import defpackage.j68;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.appUsage.data.SortMode;
import ir.mservices.market.appUsage.recycler.StorageUsageFixedHeaderData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.mservices.market.views.TryAgainView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.appUsage.AppsUsageFragment$onViewCreated$4", f = "AppsUsageFragment.kt", l = {125}, m = "invokeSuspend", v = 1)
final class AppsUsageFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AppsUsageFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.appUsage.AppsUsageFragment$onViewCreated$4$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.appUsage.AppsUsageFragment$onViewCreated$4$1", f = "AppsUsageFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ AppsUsageFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppsUsageFragment appsUsageFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = appsUsageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((SortMode) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = AppsUsageFragment.m1;
            AppsUsageFragment appsUsageFragment = this.a;
            f68 f68Var = (f68) appsUsageFragment.Q1().w.a.getValue();
            if (f68Var != null) {
                j68 j68Var = appsUsageFragment.l1;
                if (j68Var == null) {
                    js3.V("headerViewHolder");
                    throw null;
                }
                j68Var.t(new StorageUsageFixedHeaderData(f68Var, (SortMode) appsUsageFragment.Q1().y.a.getValue()));
            }
            a aVar = appsUsageFragment.Z0;
            if (aVar != null) {
                aVar.A();
            }
            TryAgainView tryAgainViewC1 = appsUsageFragment.C1();
            if (tryAgainViewC1 != null) {
                tryAgainViewC1.t();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppsUsageFragment$onViewCreated$4(AppsUsageFragment appsUsageFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = appsUsageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppsUsageFragment$onViewCreated$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AppsUsageFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = AppsUsageFragment.m1;
            AppsUsageFragment appsUsageFragment = this.b;
            rv6 rv6Var = appsUsageFragment.Q1().y;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(appsUsageFragment, null);
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
