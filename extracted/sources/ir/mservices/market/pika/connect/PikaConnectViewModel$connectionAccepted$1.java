package ir.mservices.market.pika.connect;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.connect.PikaConnectViewModel$connectionAccepted$1", f = "PikaConnectViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PikaConnectViewModel$connectionAccepted$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ PikaConnectViewModel a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PikaConnectViewModel$connectionAccepted$1(PikaConnectViewModel pikaConnectViewModel, String str, g51 g51Var) {
        super(2, g51Var);
        this.a = pikaConnectViewModel;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PikaConnectViewModel$connectionAccepted$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PikaConnectViewModel$connectionAccepted$1 pikaConnectViewModel$connectionAccepted$1 = (PikaConnectViewModel$connectionAccepted$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        pikaConnectViewModel$connectionAccepted$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        this.a.t.connectionAccepted(this.b);
        return tx8.a;
    }
}
