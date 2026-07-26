package androidx.compose.material3.internal;

import defpackage.ah6;
import defpackage.qp2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.internal.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", l = {145, 186}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
final class DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 extends ContinuationImpl {
    public qp2 a;
    public androidx.compose.ui.input.pointer.e b;
    public Ref$LongRef c;
    public ah6 d;
    public float e;
    public float f;
    public /* synthetic */ Object g;
    public int h;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.h |= Integer.MIN_VALUE;
        return i.a(null, this);
    }
}
