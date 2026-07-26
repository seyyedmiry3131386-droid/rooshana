package androidx.compose.runtime;

import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wt3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", l = {1011, 1031, 1032}, m = "invokeSuspend", v = 1)
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ Object b;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            throw null;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            throw null;
        }
        if (i == 2) {
            wt3 wt3Var = (wt3) this.b;
            kotlin.b.b(obj);
            this.b = null;
            this.a = 3;
            if (kotlinx.coroutines.a.d(wt3Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
