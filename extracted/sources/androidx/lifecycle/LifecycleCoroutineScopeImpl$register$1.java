package androidx.lifecycle;

import defpackage.e71;
import defpackage.g51;
import defpackage.i64;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v54;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend", v = 1)
final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ v54 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(v54 v54Var, g51 g51Var) {
        super(2, g51Var);
        this.b = v54Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.b, g51Var);
        lifecycleCoroutineScopeImpl$register$1.a = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = (LifecycleCoroutineScopeImpl$register$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        lifecycleCoroutineScopeImpl$register$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        e71 e71Var = (e71) this.a;
        v54 v54Var = this.b;
        i64 i64Var = v54Var.a;
        if (i64Var.d.compareTo(Lifecycle$State.b) >= 0) {
            i64Var.a(v54Var);
        } else {
            kotlinx.coroutines.a.c(e71Var.getCoroutineContext(), null);
        }
        return tx8.a;
    }
}
