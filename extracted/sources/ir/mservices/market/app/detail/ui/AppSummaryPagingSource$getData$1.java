package ir.mservices.market.app.detail.ui;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppSummaryPagingSource", f = "AppSummaryPagingSource.kt", l = {26}, m = "getData", v = 1)
final class AppSummaryPagingSource$getData$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSummaryPagingSource$getData$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
