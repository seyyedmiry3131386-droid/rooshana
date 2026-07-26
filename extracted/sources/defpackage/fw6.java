package defpackage;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes3.dex */
public final class fw6 {
    public final gf8 a;
    public final lz1 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final sc i;
    public final c35 j;
    public final xv6 k;
    public final boolean l;
    public gn3 m;
    public wa7 n;
    public ta7 o;
    public final ov p;

    public fw6(gf8 gf8Var, lz1 lz1Var, int i, int i2, int i3, int i4, boolean z, boolean z2, sc scVar, c35 c35Var, xv6 xv6Var, w47 w47Var) {
        js3.p(gf8Var, "taskRunner");
        js3.p(lz1Var, "connectionPool");
        js3.p(c35Var, "routeDatabase");
        this.a = gf8Var;
        this.b = lz1Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = scVar;
        this.j = c35Var;
        this.k = xv6Var;
        this.l = !js3.i(w47Var.b, "GET");
        this.p = new ov();
    }

    public final boolean a(yv6 yv6Var) {
        wa7 wa7Var;
        ta7 ta7Var;
        if (this.p.isEmpty() && this.o == null) {
            if (yv6Var != null) {
                synchronized (yv6Var) {
                    ta7Var = null;
                    if (yv6Var.l == 0 && yv6Var.j && ih9.a(yv6Var.c.a.h, this.i.h)) {
                        ta7Var = yv6Var.c;
                    }
                }
                if (ta7Var != null) {
                    this.o = ta7Var;
                    return true;
                }
            }
            gn3 gn3Var = this.m;
            if ((gn3Var == null || gn3Var.a >= gn3Var.b.size()) && (wa7Var = this.n) != null) {
                return wa7Var.a();
            }
        }
        return true;
    }

    public final va7 b() {
        Socket socketI;
        q87 q87Var;
        yv6 yv6Var = this.k.i;
        if (yv6Var == null) {
            q87Var = null;
        } else {
            boolean zI = yv6Var.i(this.l);
            synchronized (yv6Var) {
                try {
                    if (zI) {
                        socketI = (yv6Var.j || !f(yv6Var.c.a.h)) ? this.k.i() : null;
                    } else {
                        yv6Var.j = true;
                        socketI = this.k.i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.i == null) {
                if (socketI != null) {
                    ih9.c(socketI);
                }
                xv6 xv6Var = this.k;
                xv6Var.d.l(xv6Var, yv6Var);
                q87Var = null;
            } else {
                if (socketI != null) {
                    throw new IllegalStateException("Check failed.");
                }
                q87Var = new q87(yv6Var);
            }
        }
        if (q87Var != null) {
            return q87Var;
        }
        q87 q87VarE = e(null, null);
        if (q87VarE != null) {
            return q87VarE;
        }
        if (!this.p.isEmpty()) {
            return (va7) this.p.removeFirst();
        }
        j11 j11VarC = c();
        q87 q87VarE2 = e(j11VarC, j11VarC.k);
        return q87VarE2 != null ? q87VarE2 : j11VarC;
    }

    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, java.util.List] */
    public final j11 c() throws IOException {
        String hostAddress;
        int port;
        List listQ;
        boolean zContains;
        ta7 ta7Var = this.o;
        if (ta7Var != null) {
            this.o = null;
            return d(ta7Var, null);
        }
        gn3 gn3Var = this.m;
        if (gn3Var != null && gn3Var.a < gn3Var.b.size()) {
            int i = gn3Var.a;
            ArrayList arrayList = gn3Var.b;
            if (i >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i2 = gn3Var.a;
            gn3Var.a = i2 + 1;
            return d((ta7) arrayList.get(i2), null);
        }
        wa7 wa7Var = this.n;
        if (wa7Var == null) {
            wa7Var = new wa7(this.i, this.j, this.k, this.h);
            this.n = wa7Var;
        }
        if (!wa7Var.a()) {
            throw new IOException("exhausted all routes");
        }
        if (!wa7Var.a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (wa7Var.f < wa7Var.e.size()) {
            sc scVar = wa7Var.a;
            if (wa7Var.f >= wa7Var.e.size()) {
                throw new SocketException("No route to " + scVar.h.d + "; exhausted proxy configurations: " + wa7Var.e);
            }
            List list = wa7Var.e;
            int i3 = wa7Var.f;
            wa7Var.f = i3 + 1;
            Proxy proxy = (Proxy) list.get(i3);
            xv6 xv6Var = wa7Var.c;
            ArrayList arrayList3 = new ArrayList();
            wa7Var.g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                se3 se3Var = scVar.h;
                hostAddress = se3Var.d;
                port = se3Var.e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    js3.o(hostAddress, "getHostName(...)");
                } else {
                    hostAddress = address.getHostAddress();
                    js3.o(hostAddress, "getHostAddress(...)");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                Regex regex = eh9.a;
                js3.p(hostAddress, "<this>");
                if (eh9.a.f(hostAddress)) {
                    listQ = br9.B(InetAddress.getByName(hostAddress));
                } else {
                    xv6Var.d.n(xv6Var, hostAddress);
                    List listG = scVar.a.g(hostAddress);
                    if (listG.isEmpty()) {
                        throw new UnknownHostException(scVar.a + " returned no addresses for " + hostAddress);
                    }
                    xv6Var.d.m(xv6Var, hostAddress, listG);
                    listQ = listG;
                }
                if (wa7Var.d && listQ.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : listQ) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = gh9.a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        ListBuilder listBuilderS = br9.s();
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                listBuilderS.add(it.next());
                            }
                            if (it2.hasNext()) {
                                listBuilderS.add(it2.next());
                            }
                        }
                        listQ = br9.q(listBuilderS);
                    }
                }
                Iterator it3 = listQ.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), port));
                }
            }
            Iterator it4 = wa7Var.g.iterator();
            while (it4.hasNext()) {
                ta7 ta7Var2 = new ta7(wa7Var.a, proxy, (InetSocketAddress) it4.next());
                c35 c35Var = wa7Var.b;
                synchronized (c35Var) {
                    zContains = ((LinkedHashSet) c35Var.b).contains(ta7Var2);
                }
                if (zContains) {
                    wa7Var.h.add(ta7Var2);
                } else {
                    arrayList2.add(ta7Var2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            a.b0(wa7Var.h, arrayList2);
            wa7Var.h.clear();
        }
        gn3 gn3Var2 = new gn3();
        gn3Var2.b = arrayList2;
        this.m = gn3Var2;
        if (this.k.q) {
            throw new IOException("Canceled");
        }
        if (gn3Var2.a >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i4 = gn3Var2.a;
        gn3Var2.a = i4 + 1;
        return d((ta7) arrayList2.get(i4), arrayList2);
    }

    public final j11 d(ta7 ta7Var, ArrayList arrayList) throws UnknownServiceException {
        js3.p(ta7Var, "route");
        sc scVar = ta7Var.a;
        if (scVar.c == null) {
            if (!scVar.j.contains(y11.g)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = ta7Var.a.h.d;
            k96 k96Var = k96.a;
            if (!k96.a.i(str)) {
                throw new UnknownServiceException(o40.y("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (scVar.i.contains(Protocol.g)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        w47 w47Var = null;
        if (ta7Var.b.type() == Proxy.Type.HTTP) {
            sc scVar2 = ta7Var.a;
            if (scVar2.c != null || scVar2.i.contains(Protocol.g)) {
                rb4 rb4Var = new rb4(15);
                se3 se3Var = ta7Var.a.h;
                js3.p(se3Var, "url");
                rb4Var.b = se3Var;
                rb4Var.F("CONNECT", null);
                sc scVar3 = ta7Var.a;
                rb4Var.B("Host", ih9.i(scVar3.h, true));
                rb4Var.B("Proxy-Connection", "Keep-Alive");
                rb4Var.B("User-Agent", "okhttp/5.3.2");
                w47 w47Var2 = new w47(rb4Var);
                i77 i77Var = j77.a;
                sl3 sl3Var = aq8.n0;
                ay2 ay2Var = new ay2(0);
                Protocol protocol = Protocol.d;
                ay2Var.j("Proxy-Authenticate", "OkHttp-Preemptive");
                w47 w47VarA = scVar3.f.a(ta7Var, new g77(w47Var2, protocol, "Preemptive Authenticate", 407, null, ay2Var.e(), i77Var, null, null, null, null, -1L, -1L, null, sl3Var));
                w47Var = w47VarA == null ? w47Var2 : w47VarA;
            }
        }
        return new j11(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, ta7Var, arrayList, 0, w47Var, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x0038, B:22:0x0045, B:25:0x004c), top: B:51:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.q87 e(defpackage.j11 r11, java.util.List r12) {
        /*
            r10 = this;
            lz1 r0 = r10.b
            boolean r1 = r10.l
            sc r2 = r10.i
            xv6 r3 = r10.k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.b()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.lang.Object r0 = r0.d
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r7 = "iterator(...)"
            defpackage.js3.o(r0, r7)
        L25:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r0.next()
            yv6 r7 = (defpackage.yv6) r7
            defpackage.js3.m(r7)
            monitor-enter(r7)
            if (r6 == 0) goto L45
            ae3 r9 = r7.i     // Catch: java.lang.Throwable -> L43
            if (r9 == 0) goto L3e
            r9 = r5
            goto L3f
        L3e:
            r9 = r4
        L3f:
            if (r9 != 0) goto L45
        L41:
            r9 = r4
            goto L50
        L43:
            r11 = move-exception
            goto L6b
        L45:
            boolean r9 = r7.g(r2, r12)     // Catch: java.lang.Throwable -> L43
            if (r9 != 0) goto L4c
            goto L41
        L4c:
            r3.a(r7)     // Catch: java.lang.Throwable -> L43
            r9 = r5
        L50:
            monitor-exit(r7)
            if (r9 == 0) goto L25
            boolean r9 = r7.i(r1)
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            monitor-enter(r7)
            r7.j = r5     // Catch: java.lang.Throwable -> L68
            java.net.Socket r8 = r3.i()     // Catch: java.lang.Throwable -> L68
            monitor-exit(r7)
            if (r8 == 0) goto L25
            defpackage.ih9.c(r8)
            goto L25
        L68:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L6b:
            monitor-exit(r7)
            throw r11
        L6d:
            r7 = r8
        L6e:
            if (r7 != 0) goto L71
            return r8
        L71:
            if (r11 == 0) goto L7e
            ta7 r12 = r11.j
            r10.o = r12
            java.net.Socket r11 = r11.r
            if (r11 == 0) goto L7e
            defpackage.ih9.c(r11)
        L7e:
            xv6 r11 = r10.k
            z32 r12 = r11.d
            r12.k(r11, r7)
            q87 r11 = new q87
            r11.<init>(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw6.e(j11, java.util.List):q87");
    }

    public final boolean f(se3 se3Var) {
        js3.p(se3Var, "url");
        se3 se3Var2 = this.i.h;
        return se3Var.e == se3Var2.e && js3.i(se3Var.d, se3Var2.d);
    }
}
