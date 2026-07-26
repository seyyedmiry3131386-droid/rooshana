package kotlinx.coroutines.flow;

import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {40}, m = "fold")
final class FlowKt__ReduceKt$fold$1<T, R> extends ContinuationImpl {
    public Ref$ObjectRef a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        int i = (this.c | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.c = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref$ObjectRef ref$ObjectRef = this.a;
            kotlin.b.b(obj);
            return ref$ObjectRef.a;
        }
        kotlin.b.b(obj);
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.a = null;
        this.a = ref$ObjectRef2;
        this.c = 1;
        throw null;
    }
}
