package androidx.compose.foundation.gestures;

import defpackage.qu1;
import defpackage.tb1;
import defpackage.wu1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {649, 652}, m = "processDragStart", v = 1)
final class DragGestureNode$processDragStart$1 extends ContinuationImpl {
    public qu1 a;
    public wu1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStart$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return e.G0(this.d, null, this);
    }
}
