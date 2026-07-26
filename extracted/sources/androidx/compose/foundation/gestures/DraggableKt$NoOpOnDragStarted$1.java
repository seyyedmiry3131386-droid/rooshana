package androidx.compose.foundation.gestures;

import defpackage.g51;
import defpackage.nr5;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend", v = 1)
final class DraggableKt$NoOpOnDragStarted$1 extends SuspendLambda implements rp2 {
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        long j = ((nr5) obj2).a;
        DraggableKt$NoOpOnDragStarted$1 draggableKt$NoOpOnDragStarted$1 = new DraggableKt$NoOpOnDragStarted$1(3, (g51) obj3);
        tx8 tx8Var = tx8.a;
        draggableKt$NoOpOnDragStarted$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return tx8.a;
    }
}
