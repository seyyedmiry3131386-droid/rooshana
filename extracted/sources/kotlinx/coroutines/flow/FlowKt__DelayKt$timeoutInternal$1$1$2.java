package kotlinx.coroutines.flow;

import defpackage.dp2;
import defpackage.g51;
import defpackage.qx1;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements dp2 {
    public final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j, g51 g51Var) {
        super(1, g51Var);
        this.a = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.a, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((FlowKt__DelayKt$timeoutInternal$1$1$2) create((g51) obj)).invokeSuspend(tx8.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) qx1.i(this.a)), null);
    }
}
