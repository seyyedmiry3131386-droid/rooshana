package androidx.paging;

import defpackage.gz5;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {647}, m = "currentPagingState", v = 1)
final class PageFetcherSnapshot$currentPagingState$1 extends ContinuationImpl {
    public gz5 a;
    public kotlinx.coroutines.sync.a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$currentPagingState$1(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(this);
    }
}
