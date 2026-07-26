package ir.mservices.market.myAccount.inbox;

import defpackage.d;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y2;
import defpackage.zl3;
import ir.mservices.market.myAccount.inbox.model.a;
import ir.mservices.market.myAccount.inbox.recycler.InboxData;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.inbox.InboxViewModel$removeItem$1", f = "InboxViewModel.kt", l = {71}, m = "invokeSuspend", v = 1)
final class InboxViewModel$removeItem$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ InboxViewModel b;
    public final /* synthetic */ InboxData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxViewModel$removeItem$1(InboxViewModel inboxViewModel, InboxData inboxData, g51 g51Var) {
        super(2, g51Var);
        this.b = inboxViewModel;
        this.c = inboxData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InboxViewModel$removeItem$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InboxViewModel$removeItem$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        InboxViewModel inboxViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            a aVar = inboxViewModel.t;
            this.a = 1;
            zl3 zl3Var = aVar.b;
            String strJ = this.c.a.j();
            js3.o(strJ, "getNotificationId(...)");
            zl3Var.getClass();
            Object objA = y2.a(new d(zl3Var, strJ, 1), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        inboxViewModel.e();
        return tx8Var;
    }
}
