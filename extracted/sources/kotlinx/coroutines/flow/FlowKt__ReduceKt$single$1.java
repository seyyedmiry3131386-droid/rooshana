package kotlinx.coroutines.flow;

import defpackage.mu3;
import defpackage.tb1;
import defpackage.vy2;
import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {53}, m = "single")
final class FlowKt__ReduceKt$single$1<T> extends ContinuationImpl {
    public Ref$ObjectRef a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        int i = this.c | Integer.MIN_VALUE;
        mu3 mu3Var = vy2.f;
        int i2 = i - Integer.MIN_VALUE;
        this.c = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (i2 == 0) {
            kotlin.b.b(obj);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.a = mu3Var;
            this.a = ref$ObjectRef;
            this.c = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref$ObjectRef ref$ObjectRef2 = this.a;
        kotlin.b.b(obj);
        Object obj2 = ref$ObjectRef2.a;
        if (obj2 != mu3Var) {
            return obj2;
        }
        throw new NoSuchElementException("Flow is empty");
    }
}
