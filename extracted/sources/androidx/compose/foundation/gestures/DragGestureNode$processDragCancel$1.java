package androidx.compose.foundation.gestures;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {667}, m = "processDragCancel", v = 1)
final class DragGestureNode$processDragCancel$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragCancel$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return e.F0(this.b, this);
    }
}
