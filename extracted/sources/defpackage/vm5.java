package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final class vm5 extends ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        Object objA;
        try {
            objA = ProxySelector.getDefault().select(uri);
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (Result.a(objA) != null) {
            objA = br9.B(Proxy.NO_PROXY);
        }
        js3.o(objA, "getOrElse(...)");
        return (List) objA;
    }
}
