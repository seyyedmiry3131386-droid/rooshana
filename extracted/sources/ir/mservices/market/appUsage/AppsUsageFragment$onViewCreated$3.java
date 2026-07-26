package ir.mservices.market.appUsage;

import android.view.View;
import defpackage.dp2;
import defpackage.f68;
import defpackage.g51;
import defpackage.h68;
import defpackage.j68;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.appUsage.data.SortMode;
import ir.mservices.market.appUsage.recycler.StorageUsageFixedHeaderData;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.appUsage.AppsUsageFragment$onViewCreated$3", f = "AppsUsageFragment.kt", l = {117}, m = "invokeSuspend", v = 1)
final class AppsUsageFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AppsUsageFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.appUsage.AppsUsageFragment$onViewCreated$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.appUsage.AppsUsageFragment$onViewCreated$3$1", f = "AppsUsageFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ AppsUsageFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppsUsageFragment appsUsageFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = appsUsageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((f68) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            f68 f68Var = (f68) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            AppsUsageFragment appsUsageFragment = this.b;
            h68 h68Var = appsUsageFragment.k1;
            if (h68Var == null) {
                js3.V("headerBinding");
                throw null;
            }
            View view = h68Var.l;
            js3.o(view, "getRoot(...)");
            view.setVisibility(0);
            j68 j68Var = appsUsageFragment.l1;
            if (j68Var != null) {
                j68Var.t(new StorageUsageFixedHeaderData(f68Var, (SortMode) appsUsageFragment.Q1().y.a.getValue()));
                return tx8.a;
            }
            js3.V("headerViewHolder");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppsUsageFragment$onViewCreated$3(AppsUsageFragment appsUsageFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = appsUsageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppsUsageFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AppsUsageFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = AppsUsageFragment.m1;
            AppsUsageFragment appsUsageFragment = this.b;
            o4 o4Var = new o4(appsUsageFragment.Q1().w, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(appsUsageFragment, null);
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
