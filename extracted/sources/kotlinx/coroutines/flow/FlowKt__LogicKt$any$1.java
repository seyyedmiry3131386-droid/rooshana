package kotlinx.coroutines.flow;

import defpackage.jf2;
import defpackage.tb1;
import ir.mservices.market.version2.webapi.responsedto.PaymentRequiredBindingDto;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {119}, m = PaymentRequiredBindingDto.BINDING_ANY)
final class FlowKt__LogicKt$any$1<T> extends ContinuationImpl {
    public Ref$BooleanRef a;
    public jf2 b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return d.c(this);
    }
}
