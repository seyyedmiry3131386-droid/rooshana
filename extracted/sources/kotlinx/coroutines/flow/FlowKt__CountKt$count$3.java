package kotlinx.coroutines.flow;

import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", l = {25}, m = "count")
final class FlowKt__CountKt$count$3<T> extends ContinuationImpl {
    public Ref$IntRef a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        int i = (this.c | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.c = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = new Ref$IntRef();
            this.c = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref$IntRef ref$IntRef = this.a;
        kotlin.b.b(obj);
        return new Integer(ref$IntRef.a);
    }
}
