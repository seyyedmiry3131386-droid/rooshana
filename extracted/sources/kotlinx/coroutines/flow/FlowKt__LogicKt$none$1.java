package kotlinx.coroutines.flow;

import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {107}, m = "none")
final class FlowKt__LogicKt$none$1<T> extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        int i = (this.b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.b = 1;
            obj = d.c(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return Boolean.valueOf(!((Boolean) obj).booleanValue());
    }
}
