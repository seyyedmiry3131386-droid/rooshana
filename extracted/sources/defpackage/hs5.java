package defpackage;

import io.sentry.okhttp.b;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.a;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes3.dex */
public final class hs5 implements cl0 {
    public static final List F = ih9.k(new Protocol[]{Protocol.f, Protocol.d});
    public static final List G = ih9.k(new y11[]{y11.e, y11.g});
    public final int A;
    public final long B;
    public final c35 C;
    public final gf8 D;
    public final pt2 E;
    public final vp7 a;
    public final List b;
    public final List c;
    public final f09 d;
    public final boolean e;
    public final boolean f;
    public final g10 g;
    public final boolean h;
    public final boolean i;
    public final th0 j;
    public final fk0 k;
    public final pq1 l;
    public final ProxySelector m;
    public final f10 n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final HostnameVerifier t;
    public final io0 u;
    public final at2 v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public hs5(gs5 gs5Var) throws NoSuchAlgorithmException, KeyStoreException {
        js3.p(gs5Var, "builder");
        gs5Var.e = new f09(10, new b(gs5Var.e));
        this.a = gs5Var.a;
        this.b = ih9.j(gs5Var.c);
        this.c = ih9.j(gs5Var.d);
        this.d = gs5Var.e;
        this.e = gs5Var.f;
        this.f = gs5Var.g;
        this.g = gs5Var.h;
        this.h = gs5Var.i;
        this.i = gs5Var.j;
        this.j = gs5Var.k;
        this.k = gs5Var.l;
        this.l = gs5Var.m;
        ProxySelector proxySelector = gs5Var.n;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = sp5.a;
        }
        this.m = proxySelector;
        this.n = gs5Var.o;
        this.o = gs5Var.p;
        List list = gs5Var.s;
        this.r = list;
        this.s = gs5Var.t;
        this.t = gs5Var.u;
        this.w = gs5Var.x;
        this.x = gs5Var.y;
        this.y = gs5Var.z;
        this.z = gs5Var.A;
        this.A = gs5Var.B;
        this.B = gs5Var.C;
        c35 c35Var = gs5Var.D;
        this.C = c35Var == null ? new c35(10) : c35Var;
        gf8 gf8Var = gs5Var.E;
        this.D = gf8Var == null ? gf8.l : gf8Var;
        pt2 pt2Var = gs5Var.b;
        if (pt2Var == null) {
            pt2Var = new pt2(16);
            gs5Var.b = pt2Var;
        }
        this.E = pt2Var;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((y11) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = gs5Var.q;
                    if (sSLSocketFactory == null) {
                        k96 k96Var = k96.a;
                        k96.a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        js3.m(trustManagers);
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.q = x509TrustManager;
                                k96 k96Var2 = k96.a;
                                k96Var2.getClass();
                                try {
                                    SSLContext sSLContextL = k96Var2.l();
                                    sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                                    js3.o(socketFactory, "getSocketFactory(...)");
                                    this.p = socketFactory;
                                    at2 at2VarC = k96.a.c(x509TrustManager);
                                    this.v = at2VarC;
                                    io0 io0Var = gs5Var.v;
                                    io0Var.getClass();
                                    this.u = js3.i(io0Var.b, at2VarC) ? io0Var : new io0(io0Var.a, at2VarC);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        js3.o(string, "toString(...)");
                        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
                    }
                    this.p = sSLSocketFactory;
                    at2 at2Var = gs5Var.w;
                    js3.m(at2Var);
                    this.v = at2Var;
                    X509TrustManager x509TrustManager2 = gs5Var.r;
                    js3.m(x509TrustManager2);
                    this.q = x509TrustManager2;
                    io0 io0Var2 = gs5Var.v;
                    io0Var2.getClass();
                    this.u = js3.i(io0Var2.b, at2Var) ? io0Var2 : new io0(io0Var2.a, at2Var);
                }
            }
            this.p = null;
            this.v = null;
            this.q = null;
            this.u = io0.c;
        } else {
            this.p = null;
            this.v = null;
            this.q = null;
            this.u = io0.c;
        }
        X509TrustManager x509TrustManager3 = this.q;
        at2 at2Var2 = this.v;
        SSLSocketFactory sSLSocketFactory2 = this.p;
        List list2 = this.c;
        List list3 = this.b;
        js3.n(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        js3.n(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.r;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((y11) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (at2Var2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager3 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (at2Var2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager3 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!js3.i(this.u, io0.c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final gs5 a() {
        gs5 gs5Var = new gs5();
        gs5Var.a = this.a;
        gs5Var.b = this.E;
        a.b0(this.b, gs5Var.c);
        a.b0(this.c, gs5Var.d);
        gs5Var.e = this.d;
        gs5Var.f = this.e;
        gs5Var.g = this.f;
        gs5Var.h = this.g;
        gs5Var.i = this.h;
        gs5Var.j = this.i;
        gs5Var.k = this.j;
        gs5Var.l = this.k;
        gs5Var.m = this.l;
        gs5Var.n = this.m;
        gs5Var.o = this.n;
        gs5Var.p = this.o;
        gs5Var.q = this.p;
        gs5Var.r = this.q;
        gs5Var.s = this.r;
        gs5Var.t = this.s;
        gs5Var.u = this.t;
        gs5Var.v = this.u;
        gs5Var.w = this.v;
        gs5Var.x = this.w;
        gs5Var.y = this.x;
        gs5Var.z = this.y;
        gs5Var.A = this.z;
        gs5Var.B = this.A;
        gs5Var.C = this.B;
        gs5Var.D = this.C;
        gs5Var.E = this.D;
        return gs5Var;
    }

    public final xv6 b(w47 w47Var) {
        js3.p(w47Var, "request");
        return new xv6(this, w47Var);
    }

    public hs5() {
        this(new gs5());
    }
}
