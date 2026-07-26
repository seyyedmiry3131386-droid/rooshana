package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1383}, m = "animateToWithDecay", v = 1)
final class AnchoredDraggableKt$animateToWithDecay$1<T> extends ContinuationImpl {
    public Ref$FloatRef a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        int i = (this.c | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.c = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref$FloatRef ref$FloatRef = this.a;
            kotlin.b.b(obj);
            return new Float(0.0f - ref$FloatRef.a);
        }
        kotlin.b.b(obj);
        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
        ref$FloatRef2.a = 0.0f;
        new AnchoredDraggableKt$animateToWithDecay$2(ref$FloatRef2, null);
        this.a = ref$FloatRef2;
        this.c = 1;
        MutatePriority mutatePriority = MutatePriority.a;
        throw null;
    }
}
