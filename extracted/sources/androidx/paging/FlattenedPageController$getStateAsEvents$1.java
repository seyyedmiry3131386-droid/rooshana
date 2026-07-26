package androidx.paging;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {274}, m = "getStateAsEvents", v = 1)
final class FlattenedPageController$getStateAsEvents$1 extends ContinuationImpl {
    public kotlinx.coroutines.sync.a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPageController$getStateAsEvents$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
