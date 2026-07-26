package ir.mservices.market.model.paging;

import defpackage.tb1;
import defpackage.x06;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.model.paging.PagingSourceMultiOffset", f = "MyketPagingSource.kt", l = {26}, m = "load", v = 1)
final class PagingSourceMultiOffset$load$1 extends ContinuationImpl {
    public x06 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingSourceMultiOffset$load$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
