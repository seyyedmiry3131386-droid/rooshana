package ir.mservices.market.app.detail.ui.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.recycler.AppBarViewHolder$onAttach$1", f = "AppBar.kt", l = {148}, m = "invokeSuspend", v = 1)
final class AppBarViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AppBarData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.recycler.AppBarViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.recycler.AppBarViewHolder$onAttach$1$1", f = "AppBar.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
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

        /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                boolean r0 = r5.a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                kotlin.b.b(r6)
                ir.mservices.market.app.detail.ui.recycler.AppBarData r6 = r5.c
                v48 r1 = r6.g
                java.lang.Object r1 = r1.getValue()
                ir.mservices.market.data.AppBarSampleData r1 = (ir.mservices.market.data.AppBarSampleData) r1
                r2 = 0
                if (r1 == 0) goto L19
                ir.mservices.market.app.detail.data.TrafficPriceDto r1 = r1.getTrafficPrice()
                goto L1a
            L19:
                r1 = r2
            L1a:
                v48 r3 = r6.g
                java.lang.Object r3 = r3.getValue()
                ir.mservices.market.data.AppBarSampleData r3 = (ir.mservices.market.data.AppBarSampleData) r3
                if (r3 == 0) goto L36
                java.lang.String r3 = r3.getStartTagLine()
                if (r3 == 0) goto L36
                boolean r4 = defpackage.f88.n0(r3)
                if (r4 != 0) goto L31
                goto L32
            L31:
                r3 = r2
            L32:
                if (r3 == 0) goto L36
                r2 = r3
                goto L44
            L36:
                v48 r6 = r6.g
                java.lang.Object r6 = r6.getValue()
                ir.mservices.market.data.AppBarSampleData r6 = (ir.mservices.market.data.AppBarSampleData) r6
                if (r6 == 0) goto L44
                java.lang.String r2 = r6.getTagLine()
            L44:
                int r6 = ir.mservices.market.app.detail.ui.recycler.a.R
                ir.mservices.market.app.detail.ui.recycler.a r6 = r5.b
                r6.M(r0, r1, r2)
                tx8 r6 = defpackage.tx8.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.recycler.AppBarViewHolder$onAttach$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarViewHolder$onAttach$1(g51 g51Var, AppBarData appBarData, a aVar) {
        super(2, g51Var);
        this.b = appBarData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppBarViewHolder$onAttach$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppBarViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            AppBarData appBarData = this.b;
            v48 v48Var = appBarData.i;
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
