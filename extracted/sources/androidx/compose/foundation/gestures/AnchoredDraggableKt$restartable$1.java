package androidx.compose.foundation.gestures;

import defpackage.js3;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1547}, m = "restartable", v = 1)
final class AnchoredDraggableKt$restartable$1<I> extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnchoredDraggableKt$restartable$1<I> anchoredDraggableKt$restartable$1;
        this.a = obj;
        int i = this.b | Integer.MIN_VALUE;
        this.b = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.b = i - Integer.MIN_VALUE;
            anchoredDraggableKt$restartable$1 = this;
        } else {
            anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1<>(this);
        }
        Object obj2 = anchoredDraggableKt$restartable$1.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = anchoredDraggableKt$restartable$1.b;
        try {
            if (i2 == 0) {
                kotlin.b.b(obj2);
                AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(null, null, null);
                anchoredDraggableKt$restartable$1.b = 1;
                if (js3.v(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj2);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return tx8.a;
    }
}
