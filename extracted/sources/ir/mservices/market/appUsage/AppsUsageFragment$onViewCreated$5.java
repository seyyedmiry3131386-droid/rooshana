package ir.mservices.market.appUsage;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.internal.g;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.appUsage.AppsUsageFragment$onViewCreated$5", f = "AppsUsageFragment.kt", l = {136}, m = "invokeSuspend", v = 1)
final class AppsUsageFragment$onViewCreated$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AppsUsageFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.appUsage.AppsUsageFragment$onViewCreated$5$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.appUsage.AppsUsageFragment$onViewCreated$5$1", f = "AppsUsageFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements rp2 {
        @Override // defpackage.rp2
        public final Object a(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (g51) obj3);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.appUsage.AppsUsageFragment$onViewCreated$5$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.appUsage.AppsUsageFragment$onViewCreated$5$2", f = "AppsUsageFragment.kt", l = {137, 139}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ AppsUsageFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AppsUsageFragment appsUsageFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = appsUsageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.b, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tx8) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (kotlinx.coroutines.a.e(500, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r7.a
                ir.mservices.market.appUsage.AppsUsageFragment r2 = r7.b
                r3 = 500(0x1f4, double:2.47E-321)
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L20
                if (r1 == r6) goto L1c
                if (r1 != r5) goto L14
                kotlin.b.b(r8)
                goto L3f
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                kotlin.b.b(r8)
                goto L2c
            L20:
                kotlin.b.b(r8)
                r7.a = r6
                java.lang.Object r8 = kotlinx.coroutines.a.e(r3, r7)
                if (r8 != r0) goto L2c
                goto L3e
            L2c:
                int r8 = ir.mservices.market.appUsage.AppsUsageFragment.m1
                androidx.recyclerview.widget.RecyclerView r8 = r2.y1()
                r1 = 0
                r8.k0(r1)
                r7.a = r5
                java.lang.Object r8 = kotlinx.coroutines.a.e(r3, r7)
                if (r8 != r0) goto L3f
            L3e:
                return r0
            L3f:
                int r8 = ir.mservices.market.appUsage.AppsUsageFragment.m1
                ir.mservices.market.views.TryAgainView r8 = r2.C1()
                if (r8 == 0) goto L4a
                r8.v()
            L4a:
                tx8 r8 = defpackage.tx8.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.appUsage.AppsUsageFragment$onViewCreated$5.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppsUsageFragment$onViewCreated$5(AppsUsageFragment appsUsageFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = appsUsageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppsUsageFragment$onViewCreated$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AppsUsageFragment$onViewCreated$5) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pv6 pv6Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            AppsUsageFragment appsUsageFragment = this.b;
            a aVar = appsUsageFragment.Z0;
            if (aVar != null && (pv6Var = aVar.g) != null) {
                int i2 = AppsUsageFragment.m1;
                g gVar = new g(appsUsageFragment.Q1().y, pv6Var, new AnonymousClass1(3, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(appsUsageFragment, null);
                this.a = 1;
                if (d.f(gVar, anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
