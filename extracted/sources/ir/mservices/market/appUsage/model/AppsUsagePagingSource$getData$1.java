package ir.mservices.market.appUsage.model;

import defpackage.f68;
import defpackage.tb1;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.appUsage.model.AppsUsagePagingSource", f = "AppsUsagePagingSource.kt", l = {22, 28}, m = "getData", v = 1)
final class AppsUsagePagingSource$getData$1 extends ContinuationImpl {
    public f68 a;
    public ArrayList b;
    public ArrayList c;
    public f68 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppsUsagePagingSource$getData$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(this);
    }
}
