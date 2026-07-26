package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.hu7;
import defpackage.tb1;
import defpackage.wt3;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
final class SharedFlowImpl$collect$1<T> extends ContinuationImpl {
    public i a;
    public ze2 b;
    public hu7 c;
    public wt3 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ i f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(i iVar, g51 g51Var) {
        super(g51Var);
        this.f = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        i.p(this.f, null, this);
        return CoroutineSingletons.a;
    }
}
