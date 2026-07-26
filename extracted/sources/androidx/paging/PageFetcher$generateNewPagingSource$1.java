package androidx.paging;

import defpackage.b16;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = {212}, m = "generateNewPagingSource", v = 1)
final class PageFetcher$generateNewPagingSource$1 extends ContinuationImpl {
    public b16 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$generateNewPagingSource$1(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return k.a(this.c, null, this);
    }
}
