package defpackage;

import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class sc {
    public final pq1 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final io0 e;
    public final g10 f;
    public final ProxySelector g;
    public final se3 h;
    public final List i;
    public final List j;

    public sc(String str, int i, pq1 pq1Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, io0 io0Var, f10 f10Var, List list, List list2, ProxySelector proxySelector) {
        js3.p(str, "uriHost");
        js3.p(pq1Var, "dns");
        js3.p(socketFactory, "socketFactory");
        js3.p(f10Var, "proxyAuthenticator");
        js3.p(list, "protocols");
        js3.p(list2, "connectionSpecs");
        js3.p(proxySelector, "proxySelector");
        this.a = pq1Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = io0Var;
        this.f = f10Var;
        this.g = proxySelector;
        re3 re3Var = new re3(0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            re3Var.c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            re3Var.c = "https";
        }
        String strB = eh9.b(hs9.O(str, 0, 0, 7));
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        re3Var.f = strB;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(rm7.n(i, "unexpected port: ").toString());
        }
        re3Var.b = i;
        this.h = re3Var.b();
        this.i = ih9.j(list);
        this.j = ih9.j(list2);
    }

    public final boolean a(sc scVar) {
        js3.p(scVar, "that");
        return js3.i(this.a, scVar.a) && js3.i(this.f, scVar.f) && js3.i(this.i, scVar.i) && js3.i(this.j, scVar.j) && js3.i(this.g, scVar.g) && js3.i(this.c, scVar.c) && js3.i(this.d, scVar.d) && js3.i(this.e, scVar.e) && this.h.e == scVar.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sc)) {
            return false;
        }
        sc scVar = (sc) obj;
        return js3.i(this.h, scVar.h) && a(scVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + rm7.i(rm7.i((this.f.hashCode() + ((this.a.hashCode() + rm7.k(this.h.i, 527, 31)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        se3 se3Var = this.h;
        sb.append(se3Var.d);
        sb.append(':');
        sb.append(se3Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
