package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.tb1;
import defpackage.w48;
import defpackage.wt3;
import defpackage.ze2;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, ErrorDTO.CODE_SERVER_SING_OUT, 406}, m = "collect")
final class StateFlowImpl$collect$1 extends ContinuationImpl {
    public l a;
    public ze2 b;
    public w48 c;
    public wt3 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ l g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowImpl$collect$1(l lVar, g51 g51Var) {
        super(g51Var);
        this.g = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        this.g.a(null, this);
        return CoroutineSingletons.a;
    }
}
