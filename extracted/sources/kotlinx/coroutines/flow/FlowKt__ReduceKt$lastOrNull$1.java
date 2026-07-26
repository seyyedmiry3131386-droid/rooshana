package kotlinx.coroutines.flow;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {163}, m = "lastOrNull")
final class FlowKt__ReduceKt$lastOrNull$1<T> extends ContinuationImpl {
    public Ref$ObjectRef a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return d.u(null, this);
    }
}
