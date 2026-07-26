package androidx.compose.foundation.gestures;

import defpackage.ah6;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1023}, m = "awaitLongPressOrCancellation-rnUCldI", v = 1)
final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl {
    public ah6 a;
    public Ref$ObjectRef b;
    public Ref$BooleanRef c;
    public /* synthetic */ Object d;
    public int e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return d.c(null, 0L, this);
    }
}
