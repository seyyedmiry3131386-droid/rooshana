package androidx.paging;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {647, 300, 306, 669, 691, 333, 713, 735, 361}, m = "doInitialLoad", v = 1)
final class PageFetcherSnapshot$doInitialLoad$1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public kotlinx.coroutines.sync.a c;
    public /* synthetic */ Object d;
    public final /* synthetic */ l e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$doInitialLoad$1(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.f(this);
    }
}
