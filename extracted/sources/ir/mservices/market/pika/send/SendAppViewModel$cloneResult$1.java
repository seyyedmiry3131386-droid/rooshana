package ir.mservices.market.pika.send;

import defpackage.au0;
import defpackage.du0;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.SendAppViewModel$cloneResult$1", f = "SendAppViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class SendAppViewModel$cloneResult$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SendAppViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAppViewModel$cloneResult$1(SendAppViewModel sendAppViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = sendAppViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        SendAppViewModel$cloneResult$1 sendAppViewModel$cloneResult$1 = new SendAppViewModel$cloneResult$1(this.b, g51Var);
        sendAppViewModel$cloneResult$1.a = obj;
        return sendAppViewModel$cloneResult$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        SendAppViewModel$cloneResult$1 sendAppViewModel$cloneResult$1 = (SendAppViewModel$cloneResult$1) create((du0) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        sendAppViewModel$cloneResult$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        du0 du0Var = (du0) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        if (du0Var instanceof au0) {
            SendAppViewModel.r(this.b, ((au0) du0Var).a ? "fail-clone" : "fail-cpu");
        }
        return tx8.a;
    }
}
