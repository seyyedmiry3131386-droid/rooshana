package ir.mservices.market.download.app.model;

import defpackage.tb1;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.app.model.DownloadRepositoryImpl", f = "DownloadRepositoryImpl.kt", l = {34}, m = "getApplicationsState", v = 1)
final class DownloadRepositoryImpl$getApplicationsState$1 extends ContinuationImpl {
    public Map a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadRepositoryImpl$getApplicationsState$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
