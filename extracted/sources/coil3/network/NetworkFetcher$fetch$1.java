package coil3.network;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {61, 74, 102}, m = "fetch")
final class NetworkFetcher$fetch$1 extends ContinuationImpl {
    public Ref$ObjectRef a;
    public Ref$ObjectRef b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
