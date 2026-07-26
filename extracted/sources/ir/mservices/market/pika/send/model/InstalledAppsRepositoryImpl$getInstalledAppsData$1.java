package ir.mservices.market.pika.send.model;

import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.model.InstalledAppsRepositoryImpl", f = "InstalledAppsRepositoryImpl.kt", l = {MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER, 62}, m = "getInstalledAppsData", v = 1)
final class InstalledAppsRepositoryImpl$getInstalledAppsData$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ c b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledAppsRepositoryImpl$getInstalledAppsData$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return c.a(this.b, this);
    }
}
