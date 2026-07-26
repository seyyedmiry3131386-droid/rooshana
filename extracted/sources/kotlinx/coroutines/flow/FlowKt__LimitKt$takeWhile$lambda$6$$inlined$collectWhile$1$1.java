package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.if2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {132, 133}, m = "emit")
public final class FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 extends ContinuationImpl {
    public if2 a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ if2 d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1(if2 if2Var, g51 g51Var) {
        super(g51Var);
        this.d = if2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
