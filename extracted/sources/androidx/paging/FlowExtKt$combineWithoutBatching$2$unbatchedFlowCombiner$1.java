package androidx.paging;

import defpackage.pw7;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1", f = "FlowExt.kt", l = {126, 126}, m = "invokeSuspend", v = 1)
public final class FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ Object b;

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
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
            pw7 pw7Var = (pw7) this.b;
            kotlin.b.b(obj);
            this.b = null;
            this.a = 2;
            if (pw7Var.b.c(this, obj) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
