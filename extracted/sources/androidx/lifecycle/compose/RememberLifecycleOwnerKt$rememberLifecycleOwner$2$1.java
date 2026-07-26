package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle$State;
import defpackage.bz0;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.lifecycle.compose.RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1", f = "RememberLifecycleOwner.kt", l = {}, m = "invokeSuspend", v = 1)
final class RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ bz0 a;
    public final /* synthetic */ Lifecycle$State b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1(bz0 bz0Var, Lifecycle$State lifecycle$State, g51 g51Var) {
        super(2, g51Var);
        this.a = bz0Var;
        this.b = lifecycle$State;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1 rememberLifecycleOwnerKt$rememberLifecycleOwner$2$1 = (RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        rememberLifecycleOwnerKt$rememberLifecycleOwner$2$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        Lifecycle$State lifecycle$State = this.b;
        bz0 bz0Var = this.a;
        bz0Var.c = lifecycle$State;
        bz0Var.a();
        return tx8.a;
    }
}
