package androidx.datastore.core;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend", v = 1)
final class SingleProcessCoordinator$updateNotifications$1 extends SuspendLambda implements qp2 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SingleProcessCoordinator$updateNotifications$1(2, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        SingleProcessCoordinator$updateNotifications$1 singleProcessCoordinator$updateNotifications$1 = (SingleProcessCoordinator$updateNotifications$1) create((ze2) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        singleProcessCoordinator$updateNotifications$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return tx8.a;
    }
}
