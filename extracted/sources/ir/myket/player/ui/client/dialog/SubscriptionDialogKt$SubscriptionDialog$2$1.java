package ir.myket.player.ui.client.dialog;

import defpackage.bp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.dialog.SubscriptionDialogKt$SubscriptionDialog$2$1", f = "SubscriptionDialog.kt", l = {}, m = "invokeSuspend", v = 1)
final class SubscriptionDialogKt$SubscriptionDialog$2$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ bp2 a;
    public final /* synthetic */ wb5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionDialogKt$SubscriptionDialog$2$1(bp2 bp2Var, wb5 wb5Var, g51 g51Var) {
        super(2, g51Var);
        this.a = bp2Var;
        this.b = wb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SubscriptionDialogKt$SubscriptionDialog$2$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        SubscriptionDialogKt$SubscriptionDialog$2$1 subscriptionDialogKt$SubscriptionDialog$2$1 = (SubscriptionDialogKt$SubscriptionDialog$2$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        subscriptionDialogKt$SubscriptionDialog$2$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        if (((Boolean) this.b.getValue()).booleanValue()) {
            this.a.invoke();
        }
        return tx8.a;
    }
}
