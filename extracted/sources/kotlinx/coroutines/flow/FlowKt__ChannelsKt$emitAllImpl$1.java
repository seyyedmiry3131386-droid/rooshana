package kotlinx.coroutines.flow;

import defpackage.lh0;
import defpackage.pw6;
import defpackage.tb1;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {
    public ze2 a;
    public pw6 b;
    public lh0 c;
    public boolean d;
    public /* synthetic */ Object e;
    public int f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return d.n(null, null, false, this);
    }
}
