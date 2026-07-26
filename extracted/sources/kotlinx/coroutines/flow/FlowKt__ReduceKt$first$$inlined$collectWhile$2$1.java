package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.mf2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 extends ContinuationImpl {
    public mf2 a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ mf2 d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ReduceKt$first$$inlined$collectWhile$2$1(mf2 mf2Var, g51 g51Var) {
        super(g51Var);
        this.d = mf2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
