package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.internal.a;

/* JADX INFO: loaded from: classes3.dex */
public final class dp0 extends a {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(dp0.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final pw6 d;
    public final boolean e;

    public /* synthetic */ dp0(pw6 pw6Var, boolean z) {
        this(pw6Var, z, EmptyCoroutineContext.a, -3, BufferOverflow.a);
    }

    @Override // kotlinx.coroutines.flow.internal.a, defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) throws Throwable {
        if (this.b == -3) {
            boolean z = this.e;
            if (z && f.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objN = d.n(ze2Var, this.d, z, g51Var);
            if (objN == CoroutineSingletons.a) {
                return objN;
            }
        } else {
            Object objA = super.a(ze2Var, g51Var);
            if (objA == CoroutineSingletons.a) {
                return objA;
            }
        }
        return tx8.a;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final String d() {
        return "channel=" + this.d;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final Object f(rk6 rk6Var, g51 g51Var) throws Throwable {
        Object objN = d.n(new fo7(rk6Var), this.d, this.e, g51Var);
        return objN == CoroutineSingletons.a ? objN : tx8.a;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final a g(w61 w61Var, int i, BufferOverflow bufferOverflow) {
        return new dp0(this.d, this.e, w61Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final xe2 h() {
        return new dp0(this.d, this.e);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final pw6 i(e71 e71Var) {
        if (this.e && f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.b == -3 ? this.d : super.i(e71Var);
    }

    public dp0(pw6 pw6Var, boolean z, w61 w61Var, int i, BufferOverflow bufferOverflow) {
        super(w61Var, i, bufferOverflow);
        this.d = pw6Var;
        this.e = z;
    }
}
