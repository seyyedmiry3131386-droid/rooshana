package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class cw5 {
    public final i a;
    public final pv6 b;

    public cw5() {
        i iVarE = vy2.e(0, 7, null);
        this.a = iVarE;
        this.b = new pv6(iVarE);
    }

    public final Object a(boolean z, SuspendLambda suspendLambda) throws Throwable {
        Object objEmit = this.a.emit(Boolean.valueOf(z), suspendLambda);
        return objEmit == CoroutineSingletons.a ? objEmit : tx8.a;
    }
}
