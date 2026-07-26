package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes.dex */
public final class ab5 {
    public final i a = vy2.e(0, 1, BufferOverflow.b);

    public final Object a(gr3 gr3Var, g51 g51Var) throws Throwable {
        Object objEmit = this.a.emit(gr3Var, g51Var);
        return objEmit == CoroutineSingletons.a ? objEmit : tx8.a;
    }

    public final void b(gr3 gr3Var) {
        this.a.e(gr3Var);
    }
}
