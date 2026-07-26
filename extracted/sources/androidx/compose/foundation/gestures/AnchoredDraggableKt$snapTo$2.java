package androidx.compose.foundation.gestures;

import defpackage.g51;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend", v = 1)
final class AnchoredDraggableKt$snapTo$2 extends SuspendLambda implements sp2 {
    public /* synthetic */ Object a;

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj != null) {
            throw new ClassCastException();
        }
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(4, (g51) obj4);
        anchoredDraggableKt$snapTo$2.a = obj3;
        anchoredDraggableKt$snapTo$2.invokeSuspend(tx8.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        throw null;
    }
}
