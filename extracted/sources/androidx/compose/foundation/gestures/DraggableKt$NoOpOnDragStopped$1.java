package androidx.compose.foundation.gestures;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend", v = 1)
final class DraggableKt$NoOpOnDragStopped$1 extends SuspendLambda implements rp2 {
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        DraggableKt$NoOpOnDragStopped$1 draggableKt$NoOpOnDragStopped$1 = new DraggableKt$NoOpOnDragStopped$1(3, (g51) obj3);
        tx8 tx8Var = tx8.a;
        draggableKt$NoOpOnDragStopped$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return tx8.a;
    }
}
