package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", l = {127, 129}, m = "emit")
final class FlowKt__TransformKt$runningReduce$1$1$emit$1 extends ContinuationImpl {
    public c a;
    public Ref$ObjectRef b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$runningReduce$1$1$emit$1(c cVar, g51 g51Var) {
        super(g51Var);
        this.d = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
