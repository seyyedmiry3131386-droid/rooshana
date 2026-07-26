package androidx.compose.material3.internal;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {517}, m = "anchoredDrag")
final class AnchoredDraggableState$anchoredDrag$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ d b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
