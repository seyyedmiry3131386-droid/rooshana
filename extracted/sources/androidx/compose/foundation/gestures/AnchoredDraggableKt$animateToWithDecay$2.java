package androidx.compose.foundation.gestures;

import defpackage.g51;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1394, 1412, 1436}, m = "invokeSuspend", v = 1)
final class AnchoredDraggableKt$animateToWithDecay$2 extends SuspendLambda implements sp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Ref$FloatRef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateToWithDecay$2(Ref$FloatRef ref$FloatRef, g51 g51Var) {
        super(4, g51Var);
        this.b = ref$FloatRef;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj != null) {
            throw new ClassCastException();
        }
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(this.b, (g51) obj4);
        anchoredDraggableKt$animateToWithDecay$2.a = obj3;
        anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(tx8.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        throw null;
    }
}
