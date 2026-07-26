package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import okhttp3.Protocol;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class j11 implements va7, n42 {
    public final gf8 a;
    public final lz1 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final xv6 h;
    public final fw6 i;
    public final ta7 j;
    public final List k;
    public final int l;
    public final w47 m;
    public final int n;
    public final boolean o;
    public volatile boolean p;
    public Socket q;
    public Socket r;
    public ww2 s;
    public Protocol t;
    public wv8 u;
    public yv6 v;

    public j11(gf8 gf8Var, lz1 lz1Var, int i, int i2, int i3, int i4, boolean z, xv6 xv6Var, fw6 fw6Var, ta7 ta7Var, List list, int i5, w47 w47Var, int i6, boolean z2) {
        js3.p(gf8Var, "taskRunner");
        js3.p(lz1Var, "connectionPool");
        js3.p(ta7Var, "route");
        this.a = gf8Var;
        this.b = lz1Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = xv6Var;
        this.i = fw6Var;
        this.j = ta7Var;
        this.k = list;
        this.l = i5;
        this.m = w47Var;
        this.n = i6;
        this.o = z2;
    }

    public static j11 l(j11 j11Var, int i, w47 w47Var, int i2, boolean z, int i3) {
        return new j11(j11Var.a, j11Var.b, j11Var.c, j11Var.d, j11Var.e, j11Var.f, j11Var.g, j11Var.h, j11Var.i, j11Var.j, j11Var.k, (i3 & 1) != 0 ? j11Var.l : i, (i3 & 2) != 0 ? j11Var.m : w47Var, (i3 & 4) != 0 ? j11Var.n : i2, (i3 & 8) != 0 ? j11Var.o : z);
    }

    @Override // defpackage.va7
    public final va7 a() {
        return new j11(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    @Override // defpackage.va7
    public final boolean b() {
        return this.t != null;
    }

    @Override // defpackage.va7
    public final yv6 c() {
        this.h.a.C.c(this.j);
        yv6 yv6Var = this.v;
        js3.m(yv6Var);
        js3.p(this.j, "route");
        q87 q87VarE = this.i.e(this, this.k);
        if (q87VarE != null) {
            return q87VarE.a;
        }
        synchronized (yv6Var) {
            lz1 lz1Var = this.b;
            lz1Var.getClass();
            TimeZone timeZone = ih9.a;
            ((ConcurrentLinkedQueue) lz1Var.d).add(yv6Var);
            ((ff8) lz1Var.b).d((jp1) lz1Var.c, 0L);
            this.h.a(yv6Var);
        }
        xv6 xv6Var = this.h;
        xv6Var.d.k(xv6Var, yv6Var);
        return yv6Var;
    }

    @Override // defpackage.va7, defpackage.n42
    public final void cancel() {
        this.p = true;
        Socket socket = this.q;
        if (socket != null) {
            ih9.c(socket);
        }
    }

    @Override // defpackage.va7
    public final ua7 d() {
        Socket socket;
        Socket socket2;
        lz1 lz1Var = this.b;
        ta7 ta7Var = this.j;
        xv6 xv6Var = this.h;
        CopyOnWriteArrayList copyOnWriteArrayList = xv6Var.s;
        if (this.q != null) {
            throw new IllegalStateException("TCP already connected");
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                xv6Var.d.j(xv6Var, ta7Var.c, ta7Var.b);
                lz1Var.getClass();
                i();
                z = true;
                ua7 ua7Var = new ua7(this, null, null, 6);
                copyOnWriteArrayList.remove(this);
                return ua7Var;
            } catch (IOException e) {
                sc scVar = ta7Var.a;
                if (ta7Var.b.type() != Proxy.Type.DIRECT) {
                    sc scVar2 = ta7Var.a;
                    scVar2.g.connectFailed(scVar2.h.i(), ta7Var.b.address(), e);
                }
                xv6Var.d.i(xv6Var, ta7Var.c, ta7Var.b, e);
                lz1Var.getClass();
                ua7 ua7Var2 = new ua7(this, null, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z && (socket = this.q) != null) {
                    ih9.c(socket);
                }
                return ua7Var2;
            }
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(this);
            if (!z && (socket2 = this.q) != null) {
                ih9.c(socket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [va7] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // defpackage.va7
    public final ua7 g() throws Throwable {
        lz1 lz1Var;
        j11 j11Var;
        lz1 lz1Var2;
        ta7 ta7Var;
        Socket socket;
        ww2 ww2Var;
        Protocol protocol;
        wv8 wv8Var;
        lz1 lz1Var3 = this.b;
        xv6 xv6Var = this.h;
        z32 z32Var = xv6Var.d;
        CopyOnWriteArrayList copyOnWriteArrayList = xv6Var.s;
        Socket socket2 = this.q;
        if (socket2 == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (b()) {
            throw new IllegalStateException("already connected");
        }
        ta7 ta7Var2 = this.j;
        sc scVar = ta7Var2.a;
        Proxy proxy = ta7Var2.b;
        InetSocketAddress inetSocketAddress = ta7Var2.c;
        sc scVar2 = ta7Var2.a;
        List list = scVar.j;
        copyOnWriteArrayList.add(this);
        boolean z = false;
        j11 j11Var2 = null;
        try {
            try {
                if (this.m != null) {
                    ua7 ua7VarK = k();
                    if (ua7VarK.b != null || ua7VarK.c != null) {
                        copyOnWriteArrayList.remove(this);
                        Socket socket3 = this.r;
                        if (socket3 != null) {
                            ih9.c(socket3);
                        }
                        ih9.c(socket2);
                        return ua7VarK;
                    }
                }
                if (scVar2.c != null) {
                    wv8 wv8Var2 = this.u;
                    if (wv8Var2 == null) {
                        js3.V("socket");
                        throw null;
                    }
                    if (((tv6) wv8Var2.c).b.u()) {
                        wv8 wv8Var3 = this.u;
                        if (wv8Var3 == null) {
                            js3.V("socket");
                            throw null;
                        }
                        if (((sv6) wv8Var3.d).b.u()) {
                            z32Var.C(xv6Var);
                            SSLSocketFactory sSLSocketFactory = scVar2.c;
                            se3 se3Var = scVar2.h;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket2, se3Var.d, se3Var.e, true);
                            js3.n(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            j11 j11VarN = n(list, sSLSocket);
                            y11 y11Var = (y11) list.get(j11VarN.n);
                            j11 j11VarM = j11VarN.m(list, sSLSocket);
                            try {
                                y11Var.a(sSLSocket, j11VarN.o);
                                j(sSLSocket, y11Var);
                                z32Var.B(xv6Var, this.s);
                                j11Var = j11VarM;
                            } catch (IOException e) {
                                e = e;
                                lz1Var = lz1Var3;
                                lz1Var3 = null;
                                j11Var2 = j11VarM;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.r = socket2;
                List list2 = scVar2.i;
                Protocol protocol2 = Protocol.g;
                if (!list2.contains(protocol2)) {
                    protocol2 = Protocol.d;
                }
                this.t = protocol2;
                j11Var = null;
                try {
                    gf8 gf8Var = this.a;
                    try {
                        lz1Var2 = this.b;
                        try {
                            ta7Var = this.j;
                            socket = this.r;
                            js3.m(socket);
                            ww2Var = this.s;
                            try {
                                protocol = this.t;
                                js3.m(protocol);
                                wv8Var = this.u;
                            } catch (IOException e2) {
                                e = e2;
                                lz1Var = lz1Var3;
                                lz1Var3 = null;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            lz1Var = lz1Var3;
                            lz1Var3 = null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        lz1Var = lz1Var3;
                        lz1Var3 = null;
                    }
                    try {
                        if (wv8Var == null) {
                            js3.V("socket");
                            throw null;
                        }
                        lz1Var3.getClass();
                        lz1Var = lz1Var3;
                        lz1Var3 = null;
                        yv6 yv6Var = new yv6(gf8Var, lz1Var2, ta7Var, socket2, socket, ww2Var, protocol, wv8Var);
                        this.v = yv6Var;
                        yv6Var.j();
                        z32Var.h(xv6Var, inetSocketAddress, proxy, this.t);
                        try {
                            ua7 ua7Var = new ua7(this, null, null, 6);
                            copyOnWriteArrayList.remove(this);
                            return ua7Var;
                        } catch (IOException e5) {
                            e = e5;
                            j11Var2 = j11Var;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            copyOnWriteArrayList.remove(this);
                            if (!z) {
                                Socket socket4 = this.r;
                                if (socket4 != null) {
                                    ih9.c(socket4);
                                }
                                ih9.c(socket2);
                            }
                            throw th;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        j11Var2 = j11Var;
                    }
                } catch (IOException e7) {
                    e = e7;
                    lz1Var = lz1Var3;
                    lz1Var3 = null;
                }
                j11Var2 = j11Var;
            } catch (IOException e8) {
                e = e8;
                lz1Var = lz1Var3;
                lz1Var3 = null;
            }
            xv6Var.d.i(xv6Var, inetSocketAddress, proxy, e);
            lz1Var.getClass();
            ua7 ua7Var2 = new ua7(this, (!this.g || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException)) ? lz1Var3 : j11Var2, e);
            copyOnWriteArrayList.remove(this);
            if (!z) {
                Socket socket5 = this.r;
                if (socket5 != null) {
                    ih9.c(socket5);
                }
                ih9.c(socket2);
            }
            return ua7Var2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.n42
    public final ta7 h() {
        return this.j;
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.j.b.type();
        int i = type == null ? -1 : i11.a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.j.a.b.createSocket();
            js3.m(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(this.j.b);
        }
        this.q = socketCreateSocket;
        if (this.p) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            k96 k96Var = k96.a;
            k96.a.f(socketCreateSocket, this.j.c, this.e);
            try {
                this.u = new wv8(new vp7(socketCreateSocket));
            } catch (NullPointerException e) {
                if (js3.i(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, y11 y11Var) {
        String strG;
        Protocol protocolY;
        sc scVar = this.j.a;
        try {
            if (y11Var.b) {
                k96 k96Var = k96.a;
                k96.a.e(sSLSocket, scVar.h.d, scVar.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            js3.m(session);
            ww2 ww2VarL = wn5.L(session);
            HostnameVerifier hostnameVerifier = scVar.d;
            js3.m(hostnameVerifier);
            if (hostnameVerifier.verify(scVar.h.d, session)) {
                io0 io0Var = scVar.e;
                js3.m(io0Var);
                this.s = new ww2(ww2VarL.a, ww2VarL.b, ww2VarL.c, new f8(io0Var, ww2VarL, scVar, 8));
                js3.p(scVar.h.d, "hostname");
                Set set = io0Var.a;
                EmptyList emptyList = EmptyList.a;
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                emptyList.getClass();
                if (y11Var.b) {
                    k96 k96Var2 = k96.a;
                    strG = k96.a.g(sSLSocket);
                } else {
                    strG = null;
                }
                this.r = sSLSocket;
                this.u = new wv8(new vp7(sSLSocket));
                if (strG != null) {
                    Protocol.b.getClass();
                    protocolY = rl3.y(strG);
                } else {
                    protocolY = Protocol.d;
                }
                this.t = protocolY;
                k96 k96Var3 = k96.a;
                k96.a.getClass();
                return;
            }
            List listA = ww2VarL.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + scVar.h.d + " not verified (no certificates)");
            }
            Object obj = listA.get(0);
            js3.n(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(scVar.h.d);
            sb.append(" not verified:\n            |    certificate: ");
            io0 io0Var2 = io0.c;
            StringBuilder sb2 = new StringBuilder("sha256/");
            ByteString byteString = ByteString.d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            js3.o(encoded, "getEncoded(...)");
            sb2.append(fv.C(encoded).c("SHA-256").a());
            sb.append(sb2.toString());
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(a.z0(bs5.a(x509Certificate, 2), bs5.a(x509Certificate, 7)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(g88.P(sb.toString()));
        } catch (Throwable th) {
            k96 k96Var4 = k96.a;
            k96.a.getClass();
            ih9.c(sSLSocket);
            throw th;
        }
    }

    public final ua7 k() throws IOException {
        w47 w47VarA;
        w47 w47Var = this.m;
        js3.m(w47Var);
        ta7 ta7Var = this.j;
        sc scVar = ta7Var.a;
        Proxy proxy = ta7Var.b;
        InetSocketAddress inetSocketAddress = ta7Var.c;
        String str = "CONNECT " + ih9.i(scVar.h, true) + " HTTP/1.1";
        while (true) {
            wv8 wv8Var = this.u;
            if (wv8Var == null) {
                js3.V("socket");
                throw null;
            }
            rd3 rd3Var = new rd3(null, this, wv8Var);
            wv8 wv8Var2 = this.u;
            if (wv8Var2 == null) {
                js3.V("socket");
                throw null;
            }
            dm8 dm8VarI = ((tv6) wv8Var2.c).a.i();
            long j = this.c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dm8VarI.g(j);
            wv8 wv8Var3 = this.u;
            if (wv8Var3 == null) {
                js3.V("socket");
                throw null;
            }
            ((sv6) wv8Var3.d).a.i().g(this.d);
            rd3Var.l(w47Var.c, str);
            rd3Var.a();
            f77 f77VarD = rd3Var.d(false);
            js3.m(f77VarD);
            f77VarD.a = w47Var;
            g77 g77VarA = f77VarD.a();
            int i = g77VarA.d;
            long jE = ih9.e(g77VarA);
            if (jE != -1) {
                pd3 pd3VarK = rd3Var.k(g77VarA.a.a, jE);
                ih9.g(pd3VarK, Integer.MAX_VALUE);
                pd3VarK.close();
            }
            if (i == 200) {
                w47VarA = null;
                break;
            }
            if (i != 407) {
                throw new IOException(rm7.n(i, "Unexpected response code for CONNECT: "));
            }
            w47VarA = ta7Var.a.f.a(ta7Var, g77VarA);
            if (w47VarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            String strA = g77VarA.f.a("Connection");
            if (strA == null) {
                strA = null;
            }
            if ("close".equalsIgnoreCase(strA)) {
                break;
            }
            w47Var = w47VarA;
        }
        if (w47VarA == null) {
            return new ua7(this, null, null, 6);
        }
        Socket socket = this.q;
        if (socket != null) {
            ih9.c(socket);
        }
        int i2 = this.l + 1;
        xv6 xv6Var = this.h;
        if (i2 < 21) {
            xv6Var.d.h(xv6Var, inetSocketAddress, proxy, null);
            return new ua7(this, l(this, i2, w47VarA, 0, false, 12), null, 4);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        xv6Var.d.i(xv6Var, inetSocketAddress, proxy, protocolException);
        this.b.getClass();
        return new ua7(this, null, protocolException, 2);
    }

    public final j11 m(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        js3.p(list, "connectionSpecs");
        int i = this.n;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            y11 y11Var = (y11) list.get(i2);
            y11Var.getClass();
            if (y11Var.a && (((strArr = y11Var.d) == null || gh9.g(strArr, sSLSocket.getEnabledProtocols(), yh5.b)) && ((strArr2 = y11Var.c) == null || gh9.g(strArr2, sSLSocket.getEnabledCipherSuites(), gr0.c)))) {
                return l(this, 0, null, i2, i != -1, 3);
            }
        }
        return null;
    }

    public final j11 n(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        js3.p(list, "connectionSpecs");
        if (this.n != -1) {
            return this;
        }
        j11 j11VarM = m(list, sSLSocket);
        if (j11VarM != null) {
            return j11VarM;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.o);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        js3.m(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        js3.o(string, "toString(...)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // defpackage.n42
    public final void e() {
    }

    @Override // defpackage.n42
    public final void f(xv6 xv6Var, IOException iOException) {
    }
}
