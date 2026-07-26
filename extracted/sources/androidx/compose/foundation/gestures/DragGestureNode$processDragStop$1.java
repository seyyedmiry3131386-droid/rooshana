package androidx.compose.foundation.gestures;

import defpackage.ru1;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {659}, m = "processDragStop", v = 1)
final class DragGestureNode$processDragStop$1 extends ContinuationImpl {
    public ru1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStop$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return e.H0(this.c, null, this);
    }
}
