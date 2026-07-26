package androidx.activity.compose;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.activity.compose.ComposePredictiveBackHandler$currentOnBack$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend", v = 1)
final class ComposePredictiveBackHandler$currentOnBack$1 extends SuspendLambda implements qp2 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ComposePredictiveBackHandler$currentOnBack$1(2, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ComposePredictiveBackHandler$currentOnBack$1 composePredictiveBackHandler$currentOnBack$1 = (ComposePredictiveBackHandler$currentOnBack$1) create((xe2) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        composePredictiveBackHandler$currentOnBack$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        return tx8.a;
    }
}
