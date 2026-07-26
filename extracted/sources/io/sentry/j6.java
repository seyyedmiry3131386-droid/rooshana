package io.sentry;

import defpackage.f09;
import defpackage.um;
import io.sentry.util.AutoClosableReentrantLock;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class j6 implements k1 {
    public n4 a;
    public n4 b;
    public final k6 c;
    public final h6 d;
    public Throwable e;
    public final c1 f;
    public final um i;
    public l6 j;
    public boolean g = false;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final ConcurrentHashMap l = new ConcurrentHashMap();

    public j6(h6 h6Var, b4 b4Var, k6 k6Var, um umVar, f09 f09Var) {
        new ConcurrentHashMap();
        new AutoClosableReentrantLock();
        this.c = k6Var;
        k6Var.i = (String) umVar.b;
        this.d = h6Var;
        io.sentry.config.a.W(b4Var, "Scopes are required");
        this.f = b4Var;
        this.i = umVar;
        this.j = f09Var;
        n4 n4Var = (n4) umVar.f;
        if (n4Var != null) {
            this.a = n4Var;
        } else {
            this.a = b4Var.m().getDateProvider().a();
        }
    }

    @Override // io.sentry.k1
    public final k1 A(String str, String str2) {
        if (this.g) {
            return c3.a;
        }
        m6 m6Var = this.c.b;
        h6 h6Var = this.d;
        h6Var.getClass();
        um umVar = new um();
        k6 k6Var = h6Var.b.c;
        k6 k6Var2 = new k6(k6Var.a, new m6(), m6Var, str, null, k6Var.d, null, "manual");
        k6Var2.f = str2;
        k6Var2.l = Instrumenter.SENTRY;
        return h6Var.F(k6Var2, umVar);
    }

    @Override // io.sentry.k1
    public final n4 B() {
        return this.a;
    }

    @Override // io.sentry.k1
    public final k1 C(String str, String str2, n4 n4Var, Instrumenter instrumenter, um umVar) {
        if (this.g) {
            return c3.a;
        }
        m6 m6Var = this.c.b;
        h6 h6Var = this.d;
        k6 k6Var = h6Var.b.c;
        k6 k6Var2 = new k6(k6Var.a, new m6(), m6Var, str, null, k6Var.d, null, "manual");
        k6Var2.f = str2;
        k6Var2.l = instrumenter;
        umVar.f = n4Var;
        return h6Var.F(k6Var2, umVar);
    }

    @Override // io.sentry.k1
    public final void a(SpanStatus spanStatus) {
        this.c.g = spanStatus;
    }

    @Override // io.sentry.k1
    public final String c() {
        return this.c.f;
    }

    @Override // io.sentry.k1
    public final SpanStatus d() {
        return this.c.g;
    }

    @Override // io.sentry.k1
    public final e6 e() {
        k6 k6Var = this.c;
        io.sentry.protocol.v vVar = k6Var.a;
        m6 m6Var = k6Var.b;
        p6 p6Var = k6Var.d;
        return new e6(vVar, m6Var, p6Var == null ? null : p6Var.a);
    }

    @Override // io.sentry.k1
    public final boolean f() {
        return this.g;
    }

    @Override // io.sentry.k1
    public final void h(Number number, String str) {
        if (this.g) {
            this.f.m().getLogger().i(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new io.sentry.protocol.m(number, (String) null));
        h6 h6Var = this.d;
        j6 j6Var = h6Var.b;
        if (j6Var == this || j6Var.l.containsKey(str)) {
            return;
        }
        h6Var.h(number, str);
    }

    @Override // io.sentry.k1
    public final void i(Throwable th) {
        this.e = th;
    }

    @Override // io.sentry.k1
    public final boolean j() {
        return false;
    }

    @Override // io.sentry.k1
    public final void k(SpanStatus spanStatus) {
        z(spanStatus, this.f.m().getDateProvider().a());
    }

    @Override // io.sentry.k1
    public final d l(List list) {
        return this.d.l(list);
    }

    @Override // io.sentry.k1
    public final k1 m(String str, String str2, n4 n4Var, Instrumenter instrumenter) {
        return C(str, str2, n4Var, instrumenter, new um());
    }

    @Override // io.sentry.k1
    public final void n() {
        k(this.c.g);
    }

    @Override // io.sentry.k1
    public final k1 o(String str, String str2, um umVar) {
        if (this.g) {
            return c3.a;
        }
        m6 m6Var = this.c.b;
        h6 h6Var = this.d;
        k6 k6Var = h6Var.b.c;
        k6 k6Var2 = new k6(k6Var.a, new m6(), m6Var, str, null, k6Var.d, null, "manual");
        k6Var2.f = str2;
        k6Var2.l = Instrumenter.SENTRY;
        return h6Var.F(k6Var2, umVar);
    }

    @Override // io.sentry.k1
    public final void p(Object obj, String str) {
        ConcurrentHashMap concurrentHashMap = this.k;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // io.sentry.k1
    public final void s(String str) {
        this.c.f = str;
    }

    @Override // io.sentry.k1
    public final k1 u(String str) {
        return A(str, null);
    }

    @Override // io.sentry.k1
    public final void w(String str, Long l, j2 j2Var) {
        if (this.g) {
            this.f.m().getLogger().i(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new io.sentry.protocol.m(l, j2Var.apiName()));
        h6 h6Var = this.d;
        j6 j6Var = h6Var.b;
        if (j6Var == this || j6Var.l.containsKey(str)) {
            return;
        }
        h6Var.w(str, l, j2Var);
    }

    @Override // io.sentry.k1
    public final k6 x() {
        return this.c;
    }

    @Override // io.sentry.k1
    public final n4 y() {
        return this.b;
    }

    @Override // io.sentry.k1
    public final void z(SpanStatus spanStatus, n4 n4Var) {
        n4 n4Var2;
        n4 n4Var3;
        if (this.g || !this.h.compareAndSet(false, true)) {
            return;
        }
        k6 k6Var = this.c;
        k6Var.g = spanStatus;
        m6 m6Var = k6Var.b;
        c1 c1Var = this.f;
        if (n4Var == null) {
            n4Var = c1Var.m().getDateProvider().a();
        }
        this.b = n4Var;
        um umVar = this.i;
        boolean z = umVar.c;
        h6 h6Var = this.d;
        if (z || umVar.d) {
            j6 j6Var = h6Var.b;
            CopyOnWriteArrayList<j6> copyOnWriteArrayList = h6Var.c;
            List<j6> list = copyOnWriteArrayList;
            if (!j6Var.c.b.equals(m6Var)) {
                ArrayList arrayList = new ArrayList();
                for (j6 j6Var2 : copyOnWriteArrayList) {
                    m6 m6Var2 = j6Var2.c.c;
                    if (m6Var2 != null && m6Var2.equals(m6Var)) {
                        arrayList.add(j6Var2);
                    }
                }
                list = arrayList;
            }
            n4 n4Var4 = null;
            n4 n4Var5 = null;
            for (j6 j6Var3 : list) {
                if (n4Var4 == null || j6Var3.a.b(n4Var4) < 0) {
                    n4Var4 = j6Var3.a;
                }
                if (n4Var5 == null || ((n4Var3 = j6Var3.b) != null && n4Var3.b(n4Var5) > 0)) {
                    n4Var5 = j6Var3.b;
                }
            }
            if (umVar.c && n4Var4 != null && this.a.b(n4Var4) < 0) {
                this.a = n4Var4;
            }
            if (umVar.d && n4Var5 != null && (((n4Var2 = this.b) == null || n4Var2.b(n4Var5) > 0) && this.b != null)) {
                this.b = n4Var5;
            }
        }
        Throwable th = this.e;
        if (th != null) {
            c1Var.g(th, this, h6Var.e);
        }
        l6 l6Var = this.j;
        if (l6Var != null) {
            l6Var.d(this);
        }
        this.g = true;
    }

    public j6(q6 q6Var, h6 h6Var, b4 b4Var, r6 r6Var) {
        new ConcurrentHashMap();
        new AutoClosableReentrantLock();
        this.c = q6Var;
        q6Var.i = (String) r6Var.b;
        this.d = h6Var;
        this.f = b4Var;
        this.j = null;
        n4 n4Var = (n4) r6Var.f;
        if (n4Var != null) {
            this.a = n4Var;
        } else {
            this.a = b4Var.m().getDateProvider().a();
        }
        this.i = r6Var;
    }
}
