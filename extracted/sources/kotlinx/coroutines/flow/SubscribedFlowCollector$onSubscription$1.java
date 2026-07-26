package kotlinx.coroutines.flow;

import defpackage.tb1;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {422, ErrorDTO.CODE_FORCE_UPDATE}, m = "onSubscription")
final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {
    public m a;
    public SafeCollector b;
    public /* synthetic */ Object c;
    public final /* synthetic */ m d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
