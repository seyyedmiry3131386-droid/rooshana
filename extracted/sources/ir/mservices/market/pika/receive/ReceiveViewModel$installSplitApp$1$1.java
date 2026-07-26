package ir.mservices.market.pika.receive;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.ReceiveViewModel$installSplitApp$1$1", f = "ReceiveViewModel.kt", l = {205}, m = "invokeSuspend", v = 1)
final class ReceiveViewModel$installSplitApp$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ReceiveViewModel b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveViewModel$installSplitApp$1$1(ReceiveViewModel receiveViewModel, long j, String str, String str2, g51 g51Var) {
        super(2, g51Var);
        this.b = receiveViewModel;
        this.c = j;
        this.d = str;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReceiveViewModel$installSplitApp$1$1(this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReceiveViewModel$installSplitApp$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            ir.mservices.market.pika.receive.model.a aVar = this.b.v;
            this.a = 1;
            if (aVar.e(this.c, this.d, this.e, this) == coroutineSingletons) {
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
