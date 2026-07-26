package androidx.compose.foundation.gestures;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1103}, m = "awaitDragOrCancellation-rnUCldI", v = 1)
final class DragGestureDetectorKt$awaitDragOrCancellation$1 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.e a;
    public Ref$LongRef b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return d.b(null, 0L, this);
    }
}
