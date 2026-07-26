package kotlinx.coroutines.flow;

import defpackage.fl7;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", l = {128}, m = "emit")
public final class FlowKt__LimitKt$collectWhile$collector$1$emit$1 extends ContinuationImpl {
    public fl7 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fl7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$collectWhile$collector$1$emit$1(fl7 fl7Var, g51 g51Var) {
        super(g51Var);
        this.c = fl7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        this.c.emit(null, this);
        return tx8.a;
    }
}
