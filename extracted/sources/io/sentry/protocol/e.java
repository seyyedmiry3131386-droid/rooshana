package io.sentry.protocol;

import io.sentry.g2;
import io.sentry.i3;
import io.sentry.k6;
import io.sentry.o3;
import io.sentry.u0;
import io.sentry.util.AutoClosableReentrantLock;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class e implements g2 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final AutoClosableReentrantLock b = new AutoClosableReentrantLock();

    public e() {
    }

    public boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.a.containsKey(obj);
    }

    public Set b() {
        return this.a.entrySet();
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.a.get(obj);
    }

    public a d() {
        return (a) w("app", a.class);
    }

    public g e() {
        return (g) w("device", g.class);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        return this.a.equals(((e) obj).a);
    }

    public i f() {
        return (i) w("flags", i.class);
    }

    public p g() {
        return (p) w("os", p.class);
    }

    public x h() {
        return (x) w("runtime", x.class);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public k6 i() {
        return (k6) w("trace", k6.class);
    }

    public Enumeration j() {
        return this.a.keys();
    }

    public Object k(Object obj, String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
    }

    public void l(e eVar) {
        if (eVar == null) {
            return;
        }
        this.a.putAll(eVar.a);
    }

    public void m(a aVar) {
        k(aVar, "app");
    }

    public void n(d dVar) {
        k(dVar, "browser");
    }

    public void o(g gVar) {
        k(gVar, "device");
    }

    public void p(i iVar) {
        k(iVar, "flags");
    }

    public void q(l lVar) {
        k(lVar, "gpu");
    }

    public void r(p pVar) {
        k(pVar, "os");
    }

    public void s(r rVar) {
        io.sentry.r rVarA = this.b.a();
        try {
            k(rVar, "response");
            rVarA.close();
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.g2
    public void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        ArrayList<String> list = Collections.list(j());
        Collections.sort(list);
        for (String str : list) {
            Object objC = c(str);
            if (objC != null) {
                cVar.q(str);
                cVar.w(u0Var, objC);
            }
        }
        cVar.n();
    }

    public void t(x xVar) {
        k(xVar, "runtime");
    }

    public void u(e0 e0Var) {
        k(e0Var, "spring");
    }

    public void v(k6 k6Var) {
        io.sentry.config.a.W(k6Var, "traceContext is required");
        k(k6Var, "trace");
    }

    public final Object w(String str, Class cls) {
        Object objC = c(str);
        if (cls.isInstance(objC)) {
            return cls.cast(objC);
        }
        return null;
    }

    public e(e eVar) {
        for (Map.Entry entry : eVar.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof a)) {
                    a aVar = (a) value;
                    a aVar2 = new a();
                    aVar2.g = aVar.g;
                    aVar2.a = aVar.a;
                    aVar2.e = aVar.e;
                    aVar2.b = aVar.b;
                    aVar2.f = aVar.f;
                    aVar2.d = aVar.d;
                    aVar2.c = aVar.c;
                    aVar2.h = io.sentry.config.a.Q(aVar.h);
                    aVar2.k = aVar.k;
                    List list = aVar.i;
                    aVar2.i = list != null ? new ArrayList(list) : null;
                    aVar2.j = aVar.j;
                    aVar2.l = aVar.l;
                    aVar2.m = aVar.m;
                    aVar2.n = io.sentry.config.a.Q(aVar.n);
                    m(aVar2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof d)) {
                    d dVar = (d) value;
                    d dVar2 = new d();
                    dVar2.a = dVar.a;
                    dVar2.b = dVar.b;
                    dVar2.c = io.sentry.config.a.Q(dVar.c);
                    n(dVar2);
                } else if ("device".equals(entry.getKey()) && (value instanceof g)) {
                    g gVar = (g) value;
                    g gVar2 = new g();
                    gVar2.a = gVar.a;
                    gVar2.b = gVar.b;
                    gVar2.c = gVar.c;
                    gVar2.d = gVar.d;
                    gVar2.e = gVar.e;
                    gVar2.f = gVar.f;
                    gVar2.i = gVar.i;
                    gVar2.j = gVar.j;
                    gVar2.k = gVar.k;
                    gVar2.l = gVar.l;
                    gVar2.m = gVar.m;
                    gVar2.n = gVar.n;
                    gVar2.o = gVar.o;
                    gVar2.p = gVar.p;
                    gVar2.q = gVar.q;
                    gVar2.r = gVar.r;
                    gVar2.s = gVar.s;
                    gVar2.t = gVar.t;
                    gVar2.u = gVar.u;
                    gVar2.v = gVar.v;
                    gVar2.w = gVar.w;
                    gVar2.x = gVar.x;
                    gVar2.y = gVar.y;
                    gVar2.A = gVar.A;
                    gVar2.C = gVar.C;
                    gVar2.D = gVar.D;
                    gVar2.h = gVar.h;
                    String[] strArr = gVar.g;
                    gVar2.g = strArr != null ? (String[]) strArr.clone() : null;
                    gVar2.B = gVar.B;
                    TimeZone timeZone = gVar.z;
                    gVar2.z = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    gVar2.E = gVar.E;
                    gVar2.F = gVar.F;
                    gVar2.G = gVar.G;
                    gVar2.H = gVar.H;
                    gVar2.I = io.sentry.config.a.Q(gVar.I);
                    o(gVar2);
                } else if ("os".equals(entry.getKey()) && (value instanceof p)) {
                    p pVar = (p) value;
                    p pVar2 = new p();
                    pVar2.a = pVar.a;
                    pVar2.b = pVar.b;
                    pVar2.c = pVar.c;
                    pVar2.d = pVar.d;
                    pVar2.e = pVar.e;
                    pVar2.f = pVar.f;
                    pVar2.g = io.sentry.config.a.Q(pVar.g);
                    r(pVar2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof x)) {
                    x xVar = (x) value;
                    x xVar2 = new x();
                    xVar2.a = xVar.a;
                    xVar2.b = xVar.b;
                    xVar2.c = xVar.c;
                    xVar2.d = io.sentry.config.a.Q(xVar.d);
                    t(xVar2);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof j)) {
                    j jVar = (j) value;
                    j jVar2 = new j();
                    jVar2.a = jVar.a;
                    jVar2.b = jVar.b;
                    jVar2.c = jVar.c;
                    jVar2.d = jVar.d;
                    jVar2.e = jVar.e;
                    jVar2.f = jVar.f;
                    jVar2.g = io.sentry.config.a.Q(jVar.g);
                    k(jVar2, "feedback");
                } else if ("gpu".equals(entry.getKey()) && (value instanceof l)) {
                    l lVar = (l) value;
                    l lVar2 = new l();
                    lVar2.a = lVar.a;
                    lVar2.b = lVar.b;
                    lVar2.c = lVar.c;
                    lVar2.d = lVar.d;
                    lVar2.e = lVar.e;
                    lVar2.f = lVar.f;
                    lVar2.g = lVar.g;
                    lVar2.h = lVar.h;
                    lVar2.i = lVar.i;
                    lVar2.j = io.sentry.config.a.Q(lVar.j);
                    q(lVar2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof k6)) {
                    v(new k6((k6) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof o3)) {
                    o3 o3Var = (o3) value;
                    o3 o3Var2 = new o3();
                    o3Var2.a = o3Var.a;
                    ConcurrentHashMap concurrentHashMapQ = io.sentry.config.a.Q(o3Var.b);
                    if (concurrentHashMapQ != null) {
                        o3Var2.b = concurrentHashMapQ;
                    }
                    k(o3Var2, "profile");
                } else if ("response".equals(entry.getKey()) && (value instanceof r)) {
                    r rVar = (r) value;
                    r rVar2 = new r();
                    rVar2.a = rVar.a;
                    rVar2.b = io.sentry.config.a.Q(rVar.b);
                    rVar2.f = io.sentry.config.a.Q(rVar.f);
                    rVar2.c = rVar.c;
                    rVar2.d = rVar.d;
                    rVar2.e = rVar.e;
                    s(rVar2);
                } else if ("spring".equals(entry.getKey()) && (value instanceof e0)) {
                    e0 e0Var = (e0) value;
                    e0 e0Var2 = new e0();
                    e0Var2.a = e0Var.a;
                    e0Var2.b = io.sentry.config.a.Q(e0Var.b);
                    u(e0Var2);
                } else if ("art".equals(entry.getKey()) && (value instanceof c)) {
                    c cVar = (c) value;
                    c cVar2 = new c();
                    cVar2.a = cVar.a;
                    cVar2.b = cVar.b;
                    cVar2.c = cVar.c;
                    cVar2.d = cVar.d;
                    cVar2.e = cVar.e;
                    cVar2.f = cVar.f;
                    cVar2.g = cVar.g;
                    cVar2.h = cVar.h;
                    cVar2.i = cVar.i;
                    cVar2.j = cVar.j;
                    cVar2.k = cVar.k;
                    cVar2.l = io.sentry.config.a.Q(cVar.l);
                    k(cVar2, "art");
                } else {
                    k(value, (String) entry.getKey());
                }
            }
        }
    }
}
