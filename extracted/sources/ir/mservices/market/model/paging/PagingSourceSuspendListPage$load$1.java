package ir.mservices.market.model.paging;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.model.paging.PagingSourceSuspendListPage", f = "MyketPagingSource.kt", l = {97}, m = "load$suspendImpl", v = 1)
final class PagingSourceSuspendListPage$load$1<T> extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ c b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingSourceSuspendListPage$load$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return c.e(this.b, this);
    }
}
