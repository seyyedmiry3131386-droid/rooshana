package androidx.compose.foundation.gestures;

import defpackage.ah6;
import defpackage.nq0;
import defpackage.qp2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1116, 1158}, m = "awaitTouchSlopOrCancellation-jO51t88", v = 1)
final class DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 extends ContinuationImpl {
    public qp2 a;
    public androidx.compose.ui.input.pointer.e b;
    public Ref$LongRef c;
    public nq0 d;
    public ah6 e;
    public float f;
    public /* synthetic */ Object g;
    public int h;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.h |= Integer.MIN_VALUE;
        return d.d(null, 0L, null, this);
    }
}
