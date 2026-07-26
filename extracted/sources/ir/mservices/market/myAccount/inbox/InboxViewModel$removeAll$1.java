package ir.mservices.market.myAccount.inbox;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.w38;
import defpackage.x38;
import ir.mservices.market.myAccount.inbox.model.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.inbox.InboxViewModel$removeAll$1", f = "InboxViewModel.kt", l = {57}, m = "invokeSuspend", v = 1)
final class InboxViewModel$removeAll$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ InboxViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxViewModel$removeAll$1(InboxViewModel inboxViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = inboxViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InboxViewModel$removeAll$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InboxViewModel$removeAll$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        InboxViewModel inboxViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            a aVar = inboxViewModel.t;
            this.a = 1;
            obj = aVar.b.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        if (((x38) obj) instanceof w38) {
            inboxViewModel.e();
        }
        return tx8.a;
    }
}
