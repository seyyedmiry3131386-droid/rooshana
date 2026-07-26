package io.sentry.okhttp;

import defpackage.dp2;
import defpackage.f09;
import defpackage.g77;
import defpackage.js3;
import defpackage.se3;
import defpackage.tx8;
import defpackage.w47;
import defpackage.ww2;
import defpackage.xv6;
import defpackage.yv6;
import defpackage.z32;
import io.sentry.SpanStatus;
import io.sentry.f;
import io.sentry.k1;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends z32 {
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public final dp2 b;
    public z32 c;

    public b(f09 f09Var) {
        js3.p(f09Var, "originalEventListenerFactory");
        this.b = new SentryOkHttpEventListener$2(f09Var);
    }

    @Override // defpackage.z32
    public final void A(xv6 xv6Var, g77 g77Var) {
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.A(xv6Var, g77Var);
        }
    }

    @Override // defpackage.z32
    public final void B(xv6 xv6Var, ww2 ww2Var) {
        a aVar;
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.B(xv6Var, ww2Var);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.b("http.connect.secure_connect_ms", null);
        }
    }

    @Override // defpackage.z32
    public final void C(xv6 xv6Var) {
        a aVar;
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.C(xv6Var);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.onEventStart("http.connect.secure_connect_ms");
        }
    }

    public final boolean D() {
        z32 z32Var = this.c;
        if (z32Var instanceof b) {
            return false;
        }
        return !"io.sentry.android.okhttp.SentryOkHttpEventListener".equals(z32Var != null ? z32Var.getClass().getName() : null);
    }

    @Override // defpackage.z32
    public final void a(xv6 xv6Var, g77 g77Var) {
        js3.p(g77Var, "cachedResponse");
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.a(xv6Var, g77Var);
        }
    }

    @Override // defpackage.z32
    public final void b(xv6 xv6Var, g77 g77Var) {
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.b(xv6Var, g77Var);
        }
    }

    @Override // defpackage.z32
    public final void c(xv6 xv6Var) {
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.c(xv6Var);
        }
    }

    @Override // defpackage.z32
    public final void d(xv6 xv6Var) {
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.d(xv6Var);
        }
        a aVar = (a) d.remove(xv6Var);
        if (aVar == null) {
            return;
        }
        aVar.a(null);
    }

    @Override // defpackage.z32
    public final void e(xv6 xv6Var, IOException iOException) {
        a aVar;
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.e(xv6Var, iOException);
        }
        if (D() && (aVar = (a) d.remove(xv6Var)) != null) {
            aVar.c(iOException.getMessage());
            aVar.a(new SentryOkHttpEventListener$callFailed$1(iOException));
        }
    }

    @Override // defpackage.z32
    public final void f(xv6 xv6Var) {
        z32 z32Var = (z32) ((SentryOkHttpEventListener$2) this.b).invoke(xv6Var);
        this.c = z32Var;
        if (z32Var != null) {
            z32Var.f(xv6Var);
        }
        if (D()) {
            d.put(xv6Var, new a(xv6Var.b));
        }
    }

    @Override // defpackage.z32
    public final void g(xv6 xv6Var) {
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.g(xv6Var);
        }
    }

    @Override // defpackage.z32
    public final void h(xv6 xv6Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        a aVar;
        js3.p(inetSocketAddress, "inetSocketAddress");
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.h(xv6Var, inetSocketAddress, proxy, protocol);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            String strName = protocol != null ? protocol.name() : null;
            if (strName != null) {
                aVar.c.c(strName, "protocol");
                k1 k1Var = aVar.d;
                if (k1Var != null) {
                    k1Var.p(strName, "protocol");
                }
            }
            aVar.b("http.connect_ms", null);
        }
    }

    @Override // defpackage.z32
    public final void i(xv6 xv6Var, InetSocketAddress inetSocketAddress, Proxy proxy, final IOException iOException) {
        a aVar;
        js3.p(inetSocketAddress, "inetSocketAddress");
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.i(xv6Var, inetSocketAddress, proxy, iOException);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.c(iOException.getMessage());
            aVar.b("http.connect_ms", new dp2() { // from class: io.sentry.okhttp.SentryOkHttpEventListener$connectFailed$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    k1 k1Var = (k1) obj;
                    js3.p(k1Var, "it");
                    k1Var.i(iOException);
                    k1Var.a(SpanStatus.INTERNAL_ERROR);
                    return tx8.a;
                }
            });
        }
    }

    @Override // defpackage.z32
    public final void j(xv6 xv6Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        a aVar;
        js3.p(inetSocketAddress, "inetSocketAddress");
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.j(xv6Var, inetSocketAddress, proxy);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.onEventStart("http.connect_ms");
        }
    }

    @Override // defpackage.z32
    public final void k(xv6 xv6Var, yv6 yv6Var) {
        a aVar;
        js3.p(yv6Var, "connection");
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.k(xv6Var, yv6Var);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.onEventStart("http.connection_ms");
        }
    }

    @Override // defpackage.z32
    public final void l(xv6 xv6Var, yv6 yv6Var) {
        a aVar;
        js3.p(yv6Var, "connection");
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.l(xv6Var, yv6Var);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.b("http.connection_ms", null);
        }
    }

    @Override // defpackage.z32
    public final void m(xv6 xv6Var, final String str, final List list) {
        a aVar;
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.m(xv6Var, str, list);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.b("http.client.resolve_dns_ms", new dp2() { // from class: io.sentry.okhttp.SentryOkHttpEventListener$dnsEnd$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    k1 k1Var = (k1) obj;
                    js3.p(k1Var, "it");
                    k1Var.p(str, "domain_name");
                    List list2 = list;
                    if (!list2.isEmpty()) {
                        k1Var.p(kotlin.collections.a.t0(list2, null, null, null, new dp2() { // from class: io.sentry.okhttp.SentryOkHttpEventListener$dnsEnd$1.1
                            @Override // defpackage.dp2
                            public final Object invoke(Object obj2) {
                                InetAddress inetAddress = (InetAddress) obj2;
                                js3.p(inetAddress, "address");
                                String string = inetAddress.toString();
                                js3.o(string, "toString(...)");
                                return string;
                            }
                        }, 31), "dns_addresses");
                    }
                    return tx8.a;
                }
            });
        }
    }

    @Override // defpackage.z32
    public final void n(xv6 xv6Var, String str) {
        a aVar;
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.n(xv6Var, str);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.onEventStart("http.client.resolve_dns_ms");
        }
    }

    @Override // defpackage.z32
    public final void o(xv6 xv6Var, se3 se3Var, final List list) {
        a aVar;
        js3.p(se3Var, "url");
        js3.p(list, "proxies");
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.o(xv6Var, se3Var, list);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.b("http.client.proxy_select_ms", new dp2() { // from class: io.sentry.okhttp.SentryOkHttpEventListener$proxySelectEnd$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    k1 k1Var = (k1) obj;
                    js3.p(k1Var, "it");
                    if (!list.isEmpty()) {
                        k1Var.p(kotlin.collections.a.t0(list, null, null, null, new dp2() { // from class: io.sentry.okhttp.SentryOkHttpEventListener$proxySelectEnd$1.1
                            @Override // defpackage.dp2
                            public final Object invoke(Object obj2) {
                                Proxy proxy = (Proxy) obj2;
                                js3.p(proxy, "proxy");
                                String string = proxy.toString();
                                js3.o(string, "toString(...)");
                                return string;
                            }
                        }, 31), "proxies");
                    }
                    return tx8.a;
                }
            });
        }
    }

    @Override // defpackage.z32
    public final void p(xv6 xv6Var, se3 se3Var) {
        a aVar;
        js3.p(se3Var, "url");
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.p(xv6Var, se3Var);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.onEventStart("http.client.proxy_select_ms");
        }
    }

    @Override // defpackage.z32
    public final void q(xv6 xv6Var, final long j) {
        a aVar;
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.q(xv6Var, j);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.b("http.connection.request_body_ms", new dp2() { // from class: io.sentry.okhttp.SentryOkHttpEventListener$requestBodyEnd$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    k1 k1Var = (k1) obj;
                    js3.p(k1Var, "it");
                    long j2 = j;
                    if (j2 > 0) {
                        k1Var.p(Long.valueOf(j2), "http.request_content_length");
                    }
                    return tx8.a;
                }
            });
            if (j > -1) {
                aVar.c.c(Long.valueOf(j), "request_content_length");
                k1 k1Var = aVar.d;
                if (k1Var != null) {
                    k1Var.p(Long.valueOf(j), "http.request_content_length");
                }
            }
        }
    }

    @Override // defpackage.z32
    public final void r(xv6 xv6Var) {
        a aVar;
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.r(xv6Var);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.onEventStart("http.connection.request_body_ms");
        }
    }

    @Override // defpackage.z32
    public final void s(xv6 xv6Var, final IOException iOException) {
        a aVar;
        js3.p(iOException, "ioe");
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.s(xv6Var, iOException);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.c(iOException.getMessage());
            aVar.b("http.connection.request_headers_ms", new dp2() { // from class: io.sentry.okhttp.SentryOkHttpEventListener$requestFailed$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    k1 k1Var = (k1) obj;
                    js3.p(k1Var, "it");
                    if (!k1Var.f()) {
                        k1Var.a(SpanStatus.INTERNAL_ERROR);
                        k1Var.i(iOException);
                    }
                    return tx8.a;
                }
            });
            aVar.b("http.connection.request_body_ms", new dp2() { // from class: io.sentry.okhttp.SentryOkHttpEventListener$requestFailed$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    k1 k1Var = (k1) obj;
                    js3.p(k1Var, "it");
                    k1Var.a(SpanStatus.INTERNAL_ERROR);
                    k1Var.i(iOException);
                    return tx8.a;
                }
            });
        }
    }

    @Override // defpackage.z32
    public final void t(xv6 xv6Var, w47 w47Var) {
        a aVar;
        js3.p(w47Var, "request");
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.t(xv6Var, w47Var);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.b("http.connection.request_headers_ms", null);
        }
    }

    @Override // defpackage.z32
    public final void u(xv6 xv6Var) {
        a aVar;
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.u(xv6Var);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.onEventStart("http.connection.request_headers_ms");
        }
    }

    @Override // defpackage.z32
    public final void v(xv6 xv6Var, final long j) {
        a aVar;
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.v(xv6Var, j);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            if (j > -1) {
                aVar.c.c(Long.valueOf(j), "response_content_length");
                k1 k1Var = aVar.d;
                if (k1Var != null) {
                    k1Var.p(Long.valueOf(j), "http.response_content_length");
                }
            }
            aVar.b("http.connection.response_body_ms", new dp2() { // from class: io.sentry.okhttp.SentryOkHttpEventListener$responseBodyEnd$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    k1 k1Var2 = (k1) obj;
                    js3.p(k1Var2, "it");
                    long j2 = j;
                    if (j2 > 0) {
                        k1Var2.p(Long.valueOf(j2), "http.response_content_length");
                    }
                    return tx8.a;
                }
            });
        }
    }

    @Override // defpackage.z32
    public final void w(xv6 xv6Var) {
        a aVar;
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.w(xv6Var);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.onEventStart("http.connection.response_body_ms");
        }
    }

    @Override // defpackage.z32
    public final void x(xv6 xv6Var, final IOException iOException) {
        a aVar;
        js3.p(iOException, "ioe");
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.x(xv6Var, iOException);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.c(iOException.getMessage());
            aVar.b("http.connection.response_headers_ms", new dp2() { // from class: io.sentry.okhttp.SentryOkHttpEventListener$responseFailed$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    k1 k1Var = (k1) obj;
                    js3.p(k1Var, "it");
                    if (!k1Var.f()) {
                        k1Var.a(SpanStatus.INTERNAL_ERROR);
                        k1Var.i(iOException);
                    }
                    return tx8.a;
                }
            });
            aVar.b("http.connection.response_body_ms", new dp2() { // from class: io.sentry.okhttp.SentryOkHttpEventListener$responseFailed$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    k1 k1Var = (k1) obj;
                    js3.p(k1Var, "it");
                    k1Var.a(SpanStatus.INTERNAL_ERROR);
                    k1Var.i(iOException);
                    return tx8.a;
                }
            });
        }
    }

    @Override // defpackage.z32
    public final void y(xv6 xv6Var, final g77 g77Var) {
        a aVar;
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.y(xv6Var, g77Var);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.e = g77Var;
            f fVar = aVar.c;
            Protocol protocol = g77Var.b;
            fVar.c(protocol.name(), "protocol");
            int i = g77Var.d;
            fVar.c(Integer.valueOf(i), "status_code");
            k1 k1Var = aVar.d;
            if (k1Var != null) {
                k1Var.p(protocol.name(), "protocol");
            }
            if (k1Var != null) {
                k1Var.p(Integer.valueOf(i), "http.response.status_code");
            }
            aVar.b("http.connection.response_headers_ms", new dp2() { // from class: io.sentry.okhttp.SentryOkHttpEventListener$responseHeadersEnd$1
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    k1 k1Var2 = (k1) obj;
                    js3.p(k1Var2, "it");
                    g77 g77Var2 = g77Var;
                    k1Var2.p(Integer.valueOf(g77Var2.d), "http.response.status_code");
                    if (k1Var2.d() == null) {
                        k1Var2.a(SpanStatus.fromHttpStatusCode(g77Var2.d));
                    }
                    return tx8.a;
                }
            });
        }
    }

    @Override // defpackage.z32
    public final void z(xv6 xv6Var) {
        a aVar;
        z32 z32Var = this.c;
        if (z32Var != null) {
            z32Var.z(xv6Var);
        }
        if (D() && (aVar = (a) d.get(xv6Var)) != null) {
            aVar.onEventStart("http.connection.response_headers_ms");
        }
    }
}
