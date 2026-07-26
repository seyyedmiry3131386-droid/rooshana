package kotlinx.coroutines.flow.internal;

import defpackage.g51;
import defpackage.js3;
import defpackage.rp2;
import defpackage.tx8;
import defpackage.w61;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b {
    public final SuspendLambda e;

    /* JADX WARN: Multi-variable type inference failed */
    public d(rp2 rp2Var, xe2 xe2Var, w61 w61Var, int i, BufferOverflow bufferOverflow) {
        super(xe2Var, w61Var, i, bufferOverflow);
        this.e = (SuspendLambda) rp2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
    @Override // kotlinx.coroutines.flow.internal.a
    public final a g(w61 w61Var, int i, BufferOverflow bufferOverflow) {
        return new d(this.e, this.d, w61Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.b
    public final Object j(ze2 ze2Var, g51 g51Var) {
        Object objV = js3.v(new ChannelFlowTransformLatest$flowCollect$3(this, ze2Var, null), g51Var);
        return objV == CoroutineSingletons.a ? objV : tx8.a;
    }
}
