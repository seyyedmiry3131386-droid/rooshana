package ir.mservices.market.pika.send;

import defpackage.g51;
import defpackage.q86;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.pika.common.model.PayloadState;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.SendAppViewModel$getShareFileState$1", f = "SendAppViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class SendAppViewModel$getShareFileState$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SendAppViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAppViewModel$getShareFileState$1(SendAppViewModel sendAppViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = sendAppViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        SendAppViewModel$getShareFileState$1 sendAppViewModel$getShareFileState$1 = new SendAppViewModel$getShareFileState$1(this.b, g51Var);
        sendAppViewModel$getShareFileState$1.a = obj;
        return sendAppViewModel$getShareFileState$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        SendAppViewModel$getShareFileState$1 sendAppViewModel$getShareFileState$1 = (SendAppViewModel$getShareFileState$1) create((PayloadState) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        sendAppViewModel$getShareFileState$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PayloadState payloadState = (PayloadState) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        boolean z = payloadState instanceof PayloadState.InProgress;
        SendAppViewModel sendAppViewModel = this.b;
        if (z) {
            l lVar = sendAppViewModel.F;
            PayloadState.InProgress inProgress = (PayloadState.InProgress) payloadState;
            q86 q86Var = new q86(inProgress.getProgress(), inProgress.getTotalReceivedData(), inProgress.getAllData());
            lVar.getClass();
            lVar.p(null, q86Var);
        } else if (payloadState instanceof PayloadState.Canceled) {
            SendAppViewModel.r(sendAppViewModel, "cancel");
        } else if (payloadState instanceof PayloadState.Failed) {
            SendAppViewModel.r(sendAppViewModel, "fail");
        } else if (payloadState instanceof PayloadState.Success) {
            SendAppViewModel.r(sendAppViewModel, "success");
        }
        sendAppViewModel.H.o(payloadState);
        return tx8.a;
    }
}
