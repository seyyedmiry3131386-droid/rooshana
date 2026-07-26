package ir.mservices.market.pika.connect;

import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xt3;
import ir.mservices.market.pika.common.model.ConnectionState;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.connect.PikaConnectViewModel$getNearbyConnectionState$1", f = "PikaConnectViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PikaConnectViewModel$getNearbyConnectionState$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PikaConnectViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PikaConnectViewModel$getNearbyConnectionState$1(PikaConnectViewModel pikaConnectViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = pikaConnectViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PikaConnectViewModel$getNearbyConnectionState$1 pikaConnectViewModel$getNearbyConnectionState$1 = new PikaConnectViewModel$getNearbyConnectionState$1(this.b, g51Var);
        pikaConnectViewModel$getNearbyConnectionState$1.a = obj;
        return pikaConnectViewModel$getNearbyConnectionState$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PikaConnectViewModel$getNearbyConnectionState$1 pikaConnectViewModel$getNearbyConnectionState$1 = (PikaConnectViewModel$getNearbyConnectionState$1) create((ConnectionState) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        pikaConnectViewModel$getNearbyConnectionState$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConnectionState connectionState = (ConnectionState) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        if (connectionState instanceof ConnectionState.ConnectionInitiatedState) {
            PikaConnectViewModel pikaConnectViewModel = this.b;
            l lVar = pikaConnectViewModel.v;
            String str = ((ConnectionState.ConnectionInitiatedState) connectionState).getInfo().a;
            js3.o(str, "getEndpointName(...)");
            lVar.getClass();
            lVar.p(null, str);
            xt3 xt3Var = pikaConnectViewModel.x;
            if (xt3Var != null) {
                xt3Var.g(null);
            }
        }
        return tx8.a;
    }
}
