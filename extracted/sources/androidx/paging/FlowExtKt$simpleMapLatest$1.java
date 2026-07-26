package androidx.paging;

import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.FlowExtKt$simpleMapLatest$1", f = "FlowExt.kt", l = {91, 91}, m = "invokeSuspend", v = 1)
public final class FlowExtKt$simpleMapLatest$1 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;

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
            ze2 ze2Var = this.b;
            kotlin.b.b(obj);
            this.b = null;
            this.a = 2;
            if (ze2Var.emit(obj, this) == coroutineSingletons) {
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
