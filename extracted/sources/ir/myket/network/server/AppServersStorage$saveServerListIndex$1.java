package ir.myket.network.server;

import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.network.server.AppServersStorage", f = "AppServersStorage.kt", l = {MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER, 54}, m = "saveServerListIndex", v = 1)
final class AppServersStorage$saveServerListIndex$1 extends ContinuationImpl {
    public int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppServersStorage$saveServerListIndex$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0, 0, this);
    }
}
