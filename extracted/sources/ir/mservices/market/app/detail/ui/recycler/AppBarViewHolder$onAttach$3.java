package ir.mservices.market.app.detail.ui.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import ir.mservices.market.data.AppBarSampleData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.recycler.AppBarViewHolder$onAttach$3", f = "AppBar.kt", l = {188}, m = "invokeSuspend", v = 1)
final class AppBarViewHolder$onAttach$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AppBarData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.recycler.AppBarViewHolder$onAttach$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.recycler.AppBarViewHolder$onAttach$3$1", f = "AppBar.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ a b;
        public final /* synthetic */ AppBarData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, AppBarData appBarData, a aVar) {
            super(2, g51Var);
            this.b = aVar;
            this.c = appBarData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.c, this.b);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((AppBarSampleData) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.a
                ir.mservices.market.data.AppBarSampleData r0 = (ir.mservices.market.data.AppBarSampleData) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                kotlin.b.b(r6)
                ir.mservices.market.app.detail.ui.recycler.AppBarData r6 = r5.c
                v48 r6 = r6.i
                java.lang.Object r6 = r6.getValue()
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                r1 = 0
                if (r0 == 0) goto L1f
                ir.mservices.market.app.detail.data.TrafficPriceDto r2 = r0.getTrafficPrice()
                goto L20
            L1f:
                r2 = r1
            L20:
                if (r0 == 0) goto L35
                java.lang.String r3 = r0.getStartTagLine()
                if (r3 == 0) goto L35
                boolean r4 = defpackage.f88.n0(r3)
                if (r4 != 0) goto L2f
                goto L30
            L2f:
                r3 = r1
            L30:
                if (r3 != 0) goto L33
                goto L35
            L33:
                r1 = r3
                goto L3b
            L35:
                if (r0 == 0) goto L3b
                java.lang.String r1 = r0.getTagLine()
            L3b:
                int r0 = ir.mservices.market.app.detail.ui.recycler.a.R
                ir.mservices.market.app.detail.ui.recycler.a r0 = r5.b
                r0.M(r6, r2, r1)
                tx8 r6 = defpackage.tx8.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.recycler.AppBarViewHolder$onAttach$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarViewHolder$onAttach$3(g51 g51Var, AppBarData appBarData, a aVar) {
        super(2, g51Var);
        this.b = appBarData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppBarViewHolder$onAttach$3(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppBarViewHolder$onAttach$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            AppBarData appBarData = this.b;
            v48 v48Var = appBarData.g;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, appBarData, this.c);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(v48Var, anonymousClass1, this) == coroutineSingletons) {
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
