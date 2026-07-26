package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public final class ta7 {
    public final sc a;
    public final Proxy b;
    public final InetSocketAddress c;

    public ta7(sc scVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        js3.p(inetSocketAddress, "socketAddress");
        this.a = scVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ta7)) {
            return false;
        }
        ta7 ta7Var = (ta7) obj;
        return js3.i(ta7Var.a, this.a) && js3.i(ta7Var.b, this.b) && js3.i(ta7Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        se3 se3Var = this.a.h;
        String str = se3Var.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        String strB = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : eh9.b(hostAddress);
        if (f88.d0(str, ':')) {
            t61.y(sb, "[", str, "]");
        } else {
            sb.append(str);
        }
        if (se3Var.e != inetSocketAddress.getPort() || str.equals(strB)) {
            sb.append(":");
            sb.append(se3Var.e);
        }
        if (!str.equals(strB)) {
            if (this.b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strB == null) {
                sb.append("<unresolved>");
            } else if (f88.d0(strB, ':')) {
                t61.y(sb, "[", strB, "]");
            } else {
                sb.append(strB);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
