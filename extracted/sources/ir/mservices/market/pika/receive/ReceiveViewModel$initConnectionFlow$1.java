package ir.mservices.market.pika.receive;

import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.pika.common.model.ConnectionState;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$initConnectionFlow$1", f = "ReceiveViewModel.kt", l = {135}, m = "invokeSuspend", v = 1)
final class ReceiveViewModel$initConnectionFlow$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ReceiveViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.pika.receive.ReceiveViewModel$initConnectionFlow$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$initConnectionFlow$1$1", f = "ReceiveViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ ReceiveViewModel b;

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
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ConnectionState) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ConnectionState connectionState = (ConnectionState) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            l lVar = this.b.E;
            Boolean boolValueOf = Boolean.valueOf(js3.i(connectionState, ConnectionState.Disconnect.INSTANCE));
            lVar.getClass();
            lVar.p(null, boolValueOf);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveViewModel$initConnectionFlow$1(ReceiveViewModel receiveViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = receiveViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReceiveViewModel$initConnectionFlow$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReceiveViewModel$initConnectionFlow$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            ReceiveViewModel receiveViewModel = this.b;
            o4 o4Var = new o4(receiveViewModel.t.getConnectionState(), 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(receiveViewModel, null);
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
