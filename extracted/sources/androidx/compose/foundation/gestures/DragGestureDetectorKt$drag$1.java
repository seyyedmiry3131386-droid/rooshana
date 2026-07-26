package androidx.compose.foundation.gestures;

import defpackage.dp2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {110}, m = "drag-jO51t88", v = 1)
final class DragGestureDetectorKt$drag$1 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.e a;
    public dp2 b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return d.f(null, 0L, null, this);
    }
}
