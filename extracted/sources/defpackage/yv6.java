package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
public final class yv6 extends xd3 implements n42 {
    public final gf8 b;
    public final ta7 c;
    public final Socket d;
    public final Socket e;
    public final ww2 f;
    public final Protocol g;
    public final wv8 h;
    public ae3 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public yv6(gf8 gf8Var, lz1 lz1Var, ta7 ta7Var, Socket socket, Socket socket2, ww2 ww2Var, Protocol protocol, wv8 wv8Var) {
        js3.p(gf8Var, "taskRunner");
        js3.p(lz1Var, "connectionPool");
        js3.p(ta7Var, "route");
        js3.p(socket, "rawSocket");
        js3.p(socket2, "javaNetSocket");
        js3.p(protocol, "protocol");
        js3.p(wv8Var, "socket");
        this.b = gf8Var;
        this.c = ta7Var;
        this.d = socket;
        this.e = socket2;
        this.f = ww2Var;
        this.g = protocol;
        this.h = wv8Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void c(hs5 hs5Var, ta7 ta7Var, IOException iOException) {
        js3.p(ta7Var, "failedRoute");
        js3.p(iOException, "failure");
        if (ta7Var.b.type() != Proxy.Type.DIRECT) {
            sc scVar = ta7Var.a;
            scVar.g.connectFailed(scVar.h.i(), ta7Var.b.address(), iOException);
        }
        c35 c35Var = hs5Var.C;
        synchronized (c35Var) {
            ((LinkedHashSet) c35Var.b).add(ta7Var);
        }
    }

    @Override // defpackage.xd3
    public final void a(ae3 ae3Var, lr7 lr7Var) {
        js3.p(lr7Var, "settings");
        synchronized (this) {
            this.o = (lr7Var.a & 8) != 0 ? lr7Var.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // defpackage.xd3
    public final void b(he3 he3Var) {
        he3Var.d(ErrorCode.g, null);
    }

    @Override // defpackage.n42
    public final void cancel() {
        ih9.c(this.d);
    }

    public final void d() {
        synchronized (this) {
            this.m++;
        }
    }

    @Override // defpackage.n42
    public final void e() {
        synchronized (this) {
            this.j = true;
        }
    }

    @Override // defpackage.n42
    public final void f(xv6 xv6Var, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.i != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.j = true;
                        if (this.m == 0) {
                            if (iOException != null) {
                                c(xv6Var.a, this.c, iOException);
                            }
                            this.l++;
                        }
                    }
                } else if (((StreamResetException) iOException).a == ErrorCode.g) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i > 1) {
                        this.j = true;
                        this.l++;
                    }
                } else if (((StreamResetException) iOException).a != ErrorCode.h || !xv6Var.q) {
                    this.j = true;
                    this.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(defpackage.sc r11, java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv6.g(sc, java.util.List):boolean");
    }

    @Override // defpackage.n42
    public final ta7 h() {
        return this.c;
    }

    public final boolean i(boolean z) {
        long j;
        TimeZone timeZone = ih9.a;
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        ae3 ae3Var = this.i;
        if (ae3Var != null) {
            return ae3Var.g(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        tv6 tv6Var = (tv6) this.h.c;
        js3.p(socket, "<this>");
        js3.p(tv6Var, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !tv6Var.b();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void j() throws SocketException {
        this.q = System.nanoTime();
        Protocol protocol = this.g;
        if (protocol == Protocol.f || protocol == Protocol.g) {
            this.e.setSoTimeout(0);
            fz1 fz1Var = fz1.e;
            af2 af2Var = af2.a;
            rb4 rb4Var = new rb4(this.b);
            wv8 wv8Var = this.h;
            String str = this.c.a.h.d;
            js3.p(wv8Var, "socket");
            js3.p(str, "peerName");
            rb4Var.c = wv8Var;
            String str2 = ih9.b + ' ' + str;
            js3.p(str2, "<set-?>");
            rb4Var.d = str2;
            rb4Var.e = this;
            rb4Var.f = af2Var;
            ae3 ae3Var = new ae3(rb4Var);
            this.i = ae3Var;
            lr7 lr7Var = ae3.z;
            this.o = (lr7Var.a & 8) != 0 ? lr7Var.b[3] : Integer.MAX_VALUE;
            ie3 ie3Var = ae3Var.w;
            synchronized (ie3Var) {
                try {
                    if (ie3Var.d) {
                        throw new IOException("closed");
                    }
                    Logger logger = ie3.f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(ih9.d(">> CONNECTION " + sd3.a.f(), new Object[0]));
                    }
                    ie3Var.a.T0(sd3.a);
                    ie3Var.a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            ae3Var.w.I(ae3Var.q);
            if (ae3Var.q.a() != 65535) {
                ae3Var.w.J(0, r2 - 65535);
            }
            ff8.c(ae3Var.g.d(), ae3Var.c, ae3Var.x);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        ta7 ta7Var = this.c;
        sb.append(ta7Var.a.h.d);
        sb.append(':');
        sb.append(ta7Var.a.h.e);
        sb.append(", proxy=");
        sb.append(ta7Var.b);
        sb.append(" hostAddress=");
        sb.append(ta7Var.c);
        sb.append(" cipherSuite=");
        ww2 ww2Var = this.f;
        if (ww2Var == null || (obj = ww2Var.b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
