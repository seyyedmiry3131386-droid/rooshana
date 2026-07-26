package androidx.compose.material3;

import defpackage.g51;
import defpackage.nr5;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
final class ClockDialNode$pointerInputTapNode$1$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ long a;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        long j = ((nr5) obj2).a;
        ClockDialNode$pointerInputTapNode$1$1 clockDialNode$pointerInputTapNode$1$1 = new ClockDialNode$pointerInputTapNode$1$1(3, (g51) obj3);
        clockDialNode$pointerInputTapNode$1$1.a = j;
        clockDialNode$pointerInputTapNode$1$1.invokeSuspend(tx8.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        Float.intBitsToFloat((int) (this.a >> 32));
        throw null;
    }
}
