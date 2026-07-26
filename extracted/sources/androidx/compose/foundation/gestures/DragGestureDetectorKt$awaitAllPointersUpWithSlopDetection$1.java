package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.nq0;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {897}, m = "awaitAllPointersUpWithSlopDetection", v = 1)
final class DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.e a;
    public PointerEventPass b;
    public Ref$LongRef c;
    public nq0 d;
    public int e;
    public float f;
    public /* synthetic */ Object g;
    public int h;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.h |= Integer.MIN_VALUE;
        return d.a(null, null, null, this);
    }
}
