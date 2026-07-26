package ir.myket.network.server;

import defpackage.tb1;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.network.server.ServerInfo", f = "ServerInfo.kt", l = {32}, m = "decreaseNetworkErrorWeight", v = 1)
final class ServerInfo$decreaseNetworkErrorWeight$1 extends ContinuationImpl {
    public int a;
    public int b;
    public Iterator c;
    public /* synthetic */ Object d;
    public final /* synthetic */ b e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerInfo$decreaseNetworkErrorWeight$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, this);
    }
}
