package defpackage;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.a;
import kotlinx.coroutines.flow.internal.b;

/* JADX INFO: loaded from: classes3.dex */
public final class fp0 extends b {
    public fp0(xe2 xe2Var, w61 w61Var, int i, BufferOverflow bufferOverflow, int i2) {
        super(xe2Var, (i2 & 2) != 0 ? EmptyCoroutineContext.a : w61Var, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.a : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final a g(w61 w61Var, int i, BufferOverflow bufferOverflow) {
        return new fp0(this.d, w61Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final xe2 h() {
        return this.d;
    }

    @Override // kotlinx.coroutines.flow.internal.b
    public final Object j(ze2 ze2Var, g51 g51Var) {
        Object objA = this.d.a(ze2Var, g51Var);
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }
}
