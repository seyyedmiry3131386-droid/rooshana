package coil3.network;

import defpackage.gh0;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {245}, m = "toImageSource")
final class NetworkFetcher$toImageSource$1 extends ContinuationImpl {
    public gh0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$toImageSource$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return b.b(this.c, null, this);
    }
}
