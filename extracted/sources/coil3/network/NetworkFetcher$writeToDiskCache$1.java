package coil3.network;

import defpackage.c35;
import defpackage.tb1;
import defpackage.ym5;
import defpackage.zv6;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {138, 153}, m = "writeToDiskCache")
final class NetworkFetcher$writeToDiskCache$1 extends ContinuationImpl {
    public zv6 a;
    public ym5 b;
    public ym5 c;
    public c35 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ b f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$writeToDiskCache$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return b.c(this.f, null, null, null, this);
    }
}
