package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class gs5 {
    public int A;
    public int B;
    public long C;
    public c35 D;
    public gf8 E;
    public pt2 b;
    public f09 e;
    public boolean f;
    public boolean g;
    public g10 h;
    public boolean i;
    public boolean j;
    public th0 k;
    public fk0 l;
    public pq1 m;
    public ProxySelector n;
    public f10 o;
    public SocketFactory p;
    public SSLSocketFactory q;
    public X509TrustManager r;
    public List s;
    public List t;
    public HostnameVerifier u;
    public io0 v;
    public at2 w;
    public int x;
    public int y;
    public int z;
    public vp7 a = new vp7(14);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public gs5() {
        TimeZone timeZone = ih9.a;
        this.e = new f09(10, z32.a);
        this.f = true;
        this.g = true;
        f10 f10Var = g10.a;
        this.h = f10Var;
        this.i = true;
        this.j = true;
        this.k = th0.g;
        this.m = pq1.g0;
        this.o = f10Var;
        SocketFactory socketFactory = SocketFactory.getDefault();
        js3.o(socketFactory, "getDefault(...)");
        this.p = socketFactory;
        this.s = hs5.G;
        this.t = hs5.F;
        this.u = bs5.a;
        this.v = io0.c;
        this.y = 10000;
        this.z = 10000;
        this.A = 10000;
        this.B = 60000;
        this.C = 1024L;
    }
}
