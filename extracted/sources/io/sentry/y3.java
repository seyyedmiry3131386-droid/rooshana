package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class y3 implements a1 {
    public m1 a;
    public final WeakReference b;
    public io.sentry.protocol.g0 c;
    public String d;
    public io.sentry.protocol.q e;
    public final ArrayList f;
    public volatile Object g;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public final CopyOnWriteArrayList k;
    public volatile b6 l;
    public volatile i6 m;
    public final AutoClosableReentrantLock n;
    public final AutoClosableReentrantLock o;
    public final AutoClosableReentrantLock p;
    public final io.sentry.protocol.e q;
    public final CopyOnWriteArrayList r;
    public k s;
    public io.sentry.protocol.v t;
    public f1 u;
    public final Map v;
    public final io.sentry.featureflags.b w;

    public y3(b6 b6Var) {
        this.b = new WeakReference(null);
        this.f = new ArrayList();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new CopyOnWriteArrayList();
        this.n = new AutoClosableReentrantLock();
        this.o = new AutoClosableReentrantLock();
        this.p = new AutoClosableReentrantLock();
        this.q = new io.sentry.protocol.e();
        this.r = new CopyOnWriteArrayList();
        this.t = io.sentry.protocol.v.b;
        this.u = y2.a;
        this.v = DesugarCollections.synchronizedMap(new WeakHashMap());
        io.sentry.config.a.W(b6Var, "SentryOptions is required.");
        this.l = b6Var;
        this.g = b(this.l.getMaxBreadcrumbs());
        int maxFeatureFlags = b6Var.getMaxFeatureFlags();
        this.w = maxFeatureFlags > 0 ? new io.sentry.featureflags.a(maxFeatureFlags) : io.sentry.featureflags.c.a;
        this.s = new k();
    }

    public static Queue b(int i) {
        return i > 0 ? new SynchronizedQueue(new CircularFifoQueue(i)) : new DisabledQueue();
    }

    @Override // io.sentry.a1
    public final Map A() {
        return io.sentry.config.a.Q(this.h);
    }

    @Override // io.sentry.a1
    public final List B() {
        return this.k;
    }

    @Override // io.sentry.a1
    public final List C() {
        return new CopyOnWriteArrayList(this.r);
    }

    @Override // io.sentry.a1
    public final void D(w4 w4Var) {
        k1 k1Var;
        if (!this.l.isTracingEnabled() || w4Var.a() == null) {
            return;
        }
        Map map = this.v;
        Throwable thA = w4Var.a();
        io.sentry.config.a.W(thA, "throwable cannot be null");
        while (thA.getCause() != null && thA.getCause() != thA) {
            thA = thA.getCause();
        }
        io.sentry.util.g gVar = (io.sentry.util.g) map.get(thA);
        if (gVar != null) {
            WeakReference weakReference = gVar.a;
            if (w4Var.b.i() == null && (k1Var = (k1) weakReference.get()) != null) {
                w4Var.b.v(k1Var.x());
            }
            String str = (String) gVar.b;
            if (w4Var.v != null || str == null) {
                return;
            }
            w4Var.v = str;
        }
    }

    @Override // io.sentry.a1
    public final io.sentry.protocol.e E() {
        return this.q;
    }

    @Override // io.sentry.a1
    public final k F(v3 v3Var) {
        r rVarA = this.p.a();
        try {
            v3Var.b(this.s);
            k kVar = new k(this.s);
            rVarA.close();
            return kVar;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.a1
    public final String G() {
        return this.d;
    }

    @Override // io.sentry.a1
    public final void H(x3 x3Var) {
        r rVarA = this.o.a();
        try {
            x3Var.c(this.a);
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

    @Override // io.sentry.a1
    public final void I(io.sentry.protocol.v vVar) {
    }

    @Override // io.sentry.a1
    public final void J(m1 m1Var) {
        r rVarA = this.o.a();
        try {
            this.a = m1Var;
            for (b1 b1Var : this.l.getScopeObservers()) {
                if (m1Var != null) {
                    b1Var.r(m1Var.getName());
                    b1Var.p(m1Var.x(), this);
                } else {
                    b1Var.r(null);
                    b1Var.p(null, this);
                }
            }
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

    @Override // io.sentry.a1
    public final List K() {
        return this.f;
    }

    @Override // io.sentry.a1
    public final io.sentry.protocol.g0 L() {
        return this.c;
    }

    @Override // io.sentry.a1
    public final List M() {
        return io.sentry.config.a.d0(this.k);
    }

    @Override // io.sentry.a1
    public final String N() {
        m1 m1Var = this.a;
        if (m1Var != null) {
            return m1Var.getName();
        }
        return null;
    }

    @Override // io.sentry.a1
    public final io.sentry.protocol.q a() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    @Override // io.sentry.a1
    public final void clear() {
        this.c = null;
        this.e = null;
        this.d = null;
        this.f.clear();
        this.g.clear();
        Iterator<b1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().m(this.g);
        }
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.k.clear();
        r();
        this.r.clear();
        Iterator<b1> it2 = this.l.getScopeObservers().iterator();
        while (it2.hasNext()) {
            it2.next().o();
        }
        this.w.clear();
    }

    @Override // io.sentry.a1
    public final a1 clone() {
        return new y3(this);
    }

    @Override // io.sentry.a1
    public final k1 d() {
        k1 k1VarR;
        k1 k1Var = (k1) this.b.get();
        if (k1Var != null) {
            return k1Var;
        }
        m1 m1Var = this.a;
        return (m1Var == null || (k1VarR = m1Var.r()) == null) ? m1Var : k1VarR;
    }

    @Override // io.sentry.a1
    public final void g(Throwable th, j6 j6Var, String str) {
        io.sentry.config.a.W(th, "throwable is required");
        io.sentry.config.a.W(str, "transactionName is required");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        Map map = this.v;
        if (map.containsKey(th)) {
            return;
        }
        map.put(th, new io.sentry.util.g(new WeakReference(j6Var), str));
    }

    @Override // io.sentry.a1
    public final Map getAttributes() {
        return io.sentry.config.a.Q(this.i);
    }

    @Override // io.sentry.a1
    public final Map getExtras() {
        return this.j;
    }

    @Override // io.sentry.a1
    public final SentryLevel getLevel() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.a1
    public final void h(f fVar, h0 h0Var) {
        if (fVar == null || (this.g instanceof DisabledQueue)) {
            return;
        }
        if (h0Var == null) {
            h0Var = new h0();
        }
        n5 beforeBreadcrumb = this.l.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            try {
                fVar = beforeBreadcrumb.b(fVar, h0Var);
            } catch (Throwable th) {
                this.l.getLogger().f(SentryLevel.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th);
                if (th.getMessage() != null) {
                    fVar.c(th.getMessage(), "sentry:message");
                }
            }
        }
        if (fVar == null) {
            this.l.getLogger().i(SentryLevel.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.g.add(fVar);
        for (b1 b1Var : this.l.getScopeObservers()) {
            b1Var.k(fVar);
            b1Var.m(this.g);
        }
    }

    @Override // io.sentry.a1
    public final io.sentry.protocol.i i() {
        return this.w.i();
    }

    @Override // io.sentry.a1
    public final io.sentry.protocol.v k() {
        return this.t;
    }

    @Override // io.sentry.a1
    public final void l(io.sentry.protocol.v vVar) {
        this.t = vVar;
        Iterator<b1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().l(vVar);
        }
    }

    @Override // io.sentry.a1
    public final b6 m() {
        return this.l;
    }

    @Override // io.sentry.a1
    public final void n(io.sentry.protocol.g0 g0Var) {
        this.c = g0Var;
        Iterator<b1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().n(g0Var);
        }
    }

    @Override // io.sentry.a1
    public final m1 o() {
        return this.a;
    }

    @Override // io.sentry.a1
    public final i6 p() {
        r rVarA = this.n.a();
        try {
            i6 i6Var = null;
            if (this.m != null) {
                i6 i6Var2 = this.m;
                i6Var2.getClass();
                i6Var2.b(io.sentry.config.a.z());
                this.l.getContinuousProfiler().d();
                i6 i6VarClone = this.m.clone();
                this.m = null;
                i6Var = i6VarClone;
            }
            rVarA.close();
            return i6Var;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.a1
    public final io.sentry.internal.debugmeta.c q() {
        r rVarA = this.n.a();
        try {
            if (this.m != null) {
                i6 i6Var = this.m;
                i6Var.getClass();
                i6Var.b(io.sentry.config.a.z());
                this.l.getContinuousProfiler().d();
            }
            i6 i6Var2 = this.m;
            io.sentry.internal.debugmeta.c cVar = null;
            if (this.l.getRelease() != null) {
                String distinctId = this.l.getDistinctId();
                io.sentry.protocol.g0 g0Var = this.c;
                this.m = new i6(Session$State.Ok, io.sentry.config.a.z(), io.sentry.config.a.z(), 0, distinctId, io.sentry.config.a.x(), Boolean.TRUE, null, null, g0Var != null ? g0Var.d : null, null, this.l.getEnvironment(), this.l.getRelease(), null);
                cVar = new io.sentry.internal.debugmeta.c(this.m.clone(), i6Var2 != null ? i6Var2.clone() : null, 5);
            } else {
                this.l.getLogger().i(SentryLevel.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            rVarA.close();
            return cVar;
        } catch (Throwable th) {
            try {
                rVarA.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.a1
    public final void r() {
        r rVarA = this.o.a();
        try {
            this.a = null;
            rVarA.close();
            for (b1 b1Var : this.l.getScopeObservers()) {
                b1Var.r(null);
                b1Var.p(null, this);
            }
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.a1
    public final io.sentry.featureflags.b s() {
        return this.w;
    }

    @Override // io.sentry.a1
    public final i6 t() {
        return this.m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.a1
    public final Queue u() {
        return this.g;
    }

    @Override // io.sentry.a1
    public final void v(k kVar) {
        this.s = kVar;
        k6 k6Var = new k6((io.sentry.protocol.v) kVar.b, (m6) kVar.c, "default", null);
        k6Var.i = "auto";
        Iterator<b1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().p(k6Var, this);
        }
    }

    @Override // io.sentry.a1
    public final k w() {
        return this.s;
    }

    @Override // io.sentry.a1
    public final i6 x(w3 w3Var) {
        r rVarA = this.n.a();
        try {
            w3Var.a(this.m);
            i6 i6VarClone = this.m != null ? this.m.clone() : null;
            rVarA.close();
            return i6VarClone;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.a1
    public final void y(String str) {
        this.d = str;
        io.sentry.protocol.e eVar = this.q;
        io.sentry.protocol.a aVarD = eVar.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
            eVar.m(aVarD);
        }
        if (str == null) {
            aVarD.i = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            aVarD.i = arrayList;
        }
        Iterator<b1> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().q(eVar);
        }
    }

    @Override // io.sentry.a1
    public final f1 z() {
        return this.u;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m38clone() {
        return new y3(this);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Collection] */
    public y3(y3 y3Var) {
        io.sentry.protocol.g0 g0Var;
        io.sentry.protocol.q qVar;
        this.b = new WeakReference(null);
        this.f = new ArrayList();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new CopyOnWriteArrayList();
        this.n = new AutoClosableReentrantLock();
        this.o = new AutoClosableReentrantLock();
        this.p = new AutoClosableReentrantLock();
        this.q = new io.sentry.protocol.e();
        this.r = new CopyOnWriteArrayList();
        this.t = io.sentry.protocol.v.b;
        this.u = y2.a;
        this.v = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.a = y3Var.a;
        this.b = y3Var.b;
        this.m = y3Var.m;
        this.l = y3Var.l;
        this.u = y3Var.u;
        io.sentry.protocol.g0 g0Var2 = y3Var.c;
        if (g0Var2 != null) {
            g0Var = new io.sentry.protocol.g0();
            g0Var.a = g0Var2.a;
            g0Var.c = g0Var2.c;
            g0Var.b = g0Var2.b;
            g0Var.d = g0Var2.d;
            g0Var.e = g0Var2.e;
            g0Var.f = g0Var2.f;
            g0Var.g = io.sentry.config.a.Q(g0Var2.g);
            g0Var.h = io.sentry.config.a.Q(g0Var2.h);
        } else {
            g0Var = null;
        }
        this.c = g0Var;
        this.d = y3Var.d;
        this.t = y3Var.t;
        io.sentry.protocol.q qVar2 = y3Var.e;
        if (qVar2 != null) {
            qVar = new io.sentry.protocol.q();
            qVar.a = qVar2.a;
            qVar.e = qVar2.e;
            qVar.b = qVar2.b;
            qVar.c = qVar2.c;
            qVar.f = io.sentry.config.a.Q(qVar2.f);
            qVar.g = io.sentry.config.a.Q(qVar2.g);
            qVar.i = io.sentry.config.a.Q(qVar2.i);
            qVar.l = io.sentry.config.a.Q(qVar2.l);
            qVar.d = qVar2.d;
            qVar.j = qVar2.j;
            qVar.h = qVar2.h;
            qVar.k = qVar2.k;
        } else {
            qVar = null;
        }
        this.e = qVar;
        this.f = new ArrayList(y3Var.f);
        this.k = new CopyOnWriteArrayList(y3Var.k);
        f[] fVarArr = (f[]) y3Var.g.toArray(new f[0]);
        Queue queueB = b(y3Var.l.getMaxBreadcrumbs());
        for (f fVar : fVarArr) {
            queueB.add(new f(fVar));
        }
        this.g = queueB;
        ConcurrentHashMap concurrentHashMap = y3Var.h;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.h = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = y3Var.i;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                String str = (String) entry2.getKey();
                if (entry2.getValue() != null) {
                    throw new ClassCastException();
                }
                concurrentHashMap4.put(str, null);
            }
        }
        this.i = concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5 = y3Var.j;
        ConcurrentHashMap concurrentHashMap6 = new ConcurrentHashMap();
        for (Map.Entry entry3 : concurrentHashMap5.entrySet()) {
            if (entry3 != null) {
                concurrentHashMap6.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        this.j = concurrentHashMap6;
        this.q = new io.sentry.protocol.e(y3Var.q);
        this.r = new CopyOnWriteArrayList(y3Var.r);
        this.w = y3Var.w.clone();
        this.s = new k(y3Var.s);
    }
}
