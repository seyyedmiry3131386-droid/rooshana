package ir.mservices.market.pika.receive;

import defpackage.bz6;
import defpackage.e71;
import defpackage.g51;
import defpackage.pq6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.pika.receive.recycler.ReceivedAppData;
import ir.mservices.market.pika.receive.recycler.ReceivedAppDivider;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$doRequest$1", f = "ReceiveViewModel.kt", l = {81, 81}, m = "invokeSuspend", v = 1)
final class ReceiveViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ReceiveViewModel c;

    /* JADX INFO: renamed from: ir.mservices.market.pika.receive.ReceiveViewModel$doRequest$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$doRequest$1$1", f = "ReceiveViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ ReceiveViewModel b;

        /* JADX INFO: renamed from: ir.mservices.market.pika.receive.ReceiveViewModel$doRequest$1$1$2, reason: invalid class name */
        @tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$doRequest$1$1$2", f = "ReceiveViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements qp2 {
            public final /* synthetic */ ReceiveViewModel a;

            /* JADX INFO: renamed from: ir.mservices.market.pika.receive.ReceiveViewModel$doRequest$1$1$2$1, reason: invalid class name and collision with other inner class name */
            final /* synthetic */ class C00281 extends FunctionReferenceImpl implements qp2 {
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    RecyclerItem recyclerItem = (RecyclerItem) obj;
                    RecyclerItem recyclerItem2 = (RecyclerItem) obj2;
                    ((ReceiveViewModel) this.receiver).getClass();
                    if (recyclerItem == null) {
                        return null;
                    }
                    MyketRecyclerData myketRecyclerData = recyclerItem.c;
                    if (recyclerItem2 == null || !(myketRecyclerData instanceof ReceivedAppData) || !(recyclerItem2.c instanceof ReceivedAppData)) {
                        return null;
                    }
                    ReceivedAppDivider receivedAppDivider = new ReceivedAppDivider(((ReceivedAppData) myketRecyclerData).b);
                    receivedAppDivider.e = pq6.recycler_view_horizontal_padding;
                    return new RecyclerItem(receivedAppDivider);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ReceiveViewModel receiveViewModel, g51 g51Var) {
                super(2, g51Var);
                this.a = receiveViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass2(this.a, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                ReceiveViewModel receiveViewModel = this.a;
                return new bz6(receiveViewModel.x, (GeneralFilter) null, new C00281(2, receiveViewModel, ReceiveViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReceiveViewModel receiveViewModel, g51 g51Var) {
            super(2, g51Var);
            this.b = receiveViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((List) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 367
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.pika.receive.ReceiveViewModel$doRequest$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveViewModel$doRequest$1(ReceiveViewModel receiveViewModel, g51 g51Var) {
        super(2, g51Var);
        this.c = receiveViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ReceiveViewModel$doRequest$1 receiveViewModel$doRequest$1 = new ReceiveViewModel$doRequest$1(this.c, g51Var);
        receiveViewModel$doRequest$1.b = obj;
        return receiveViewModel$doRequest$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReceiveViewModel$doRequest$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (kotlinx.coroutines.flow.d.f((defpackage.xe2) r8, r0, r7) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            e71 r0 = (defpackage.e71) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r7.a
            ir.mservices.market.pika.receive.ReceiveViewModel r3 = r7.c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L23
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            kotlin.b.b(r8)
            goto L49
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.b.b(r8)
            goto L37
        L23:
            kotlin.b.b(r8)
            ir.mservices.market.pika.common.model.NearbyRepository r8 = r3.t
            v48 r8 = r8.getReceivedByteArray()
            r7.b = r6
            r7.a = r5
            java.lang.Object r8 = kotlinx.coroutines.flow.d.B(r8, r0, r7)
            if (r8 != r1) goto L37
            goto L48
        L37:
            xe2 r8 = (defpackage.xe2) r8
            ir.mservices.market.pika.receive.ReceiveViewModel$doRequest$1$1 r0 = new ir.mservices.market.pika.receive.ReceiveViewModel$doRequest$1$1
            r0.<init>(r3, r6)
            r7.b = r6
            r7.a = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.d.f(r8, r0, r7)
            if (r8 != r1) goto L49
        L48:
            return r1
        L49:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.pika.receive.ReceiveViewModel$doRequest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
