package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.jf2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1", f = "Logic.kt", l = {132}, m = "emit")
public final class FlowKt__LogicKt$any$$inlined$collectWhile$1$1 extends ContinuationImpl {
    public jf2 a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ jf2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LogicKt$any$$inlined$collectWhile$1$1(jf2 jf2Var, g51 g51Var) {
        super(g51Var);
        this.d = jf2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        this.d.emit(null, this);
        return tx8.a;
    }
}
