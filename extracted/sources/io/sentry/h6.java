package io.sentry;

import defpackage.f09;
import defpackage.um;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public final class h6 implements m1 {
    public final j6 b;
    public final b4 d;
    public final String e;
    public volatile f6 g;
    public volatile f6 h;
    public volatile Timer i;
    public final AutoClosableReentrantLock j;
    public final AutoClosableReentrantLock k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final TransactionNameSource n;
    public final Instrumenter o;
    public final io.sentry.protocol.e p;
    public final l q;
    public final r6 r;
    public final io.sentry.protocol.v a = new io.sentry.protocol.v();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public g6 f = g6.c;

    public h6(q6 q6Var, b4 b4Var, r6 r6Var, l lVar) {
        this.i = null;
        AutoClosableReentrantLock autoClosableReentrantLock = new AutoClosableReentrantLock();
        this.j = autoClosableReentrantLock;
        this.k = new AutoClosableReentrantLock();
        this.l = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.m = atomicBoolean;
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        this.p = eVar;
        j6 j6Var = new j6(q6Var, this, b4Var, r6Var);
        this.b = j6Var;
        this.e = q6Var.p;
        this.o = q6Var.l;
        this.d = b4Var;
        Boolean bool = Boolean.TRUE;
        lVar = bool.equals(J()) ? lVar : null;
        this.q = lVar;
        this.n = q6Var.q;
        this.r = r6Var;
        K(j6Var);
        io.sentry.protocol.v vVarI = I();
        if (!vVarI.equals(io.sentry.protocol.v.b) && bool.equals(J())) {
            eVar.k(new o3(vVarI), "profile");
        }
        if (lVar != null) {
            lVar.e(this);
        }
        if (r6Var.i == null && r6Var.j == null) {
            return;
        }
        boolean z = true;
        this.i = new Timer(true);
        Long l = r6Var.j;
        if (l != null) {
            r rVarA = autoClosableReentrantLock.a();
            try {
                if (this.i != null) {
                    D();
                    atomicBoolean.set(true);
                    this.h = new f6(this, 1);
                    try {
                        this.i.schedule(this.h, l.longValue());
                    } catch (Throwable th) {
                        this.d.m().getLogger().f(SentryLevel.WARNING, "Failed to schedule finish timer", th);
                        SpanStatus spanStatusD = d();
                        if (spanStatusD == null) {
                            spanStatusD = SpanStatus.DEADLINE_EXCEEDED;
                        }
                        if (this.r.i == null) {
                            z = false;
                        }
                        g(spanStatusD, z, null);
                        this.m.set(false);
                    }
                }
                rVarA.close();
            } catch (Throwable th2) {
                try {
                    rVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        v();
    }

    @Override // io.sentry.k1
    public final k1 A(String str, String str2) {
        return G(str, str2, null, Instrumenter.SENTRY, new um());
    }

    @Override // io.sentry.k1
    public final n4 B() {
        return this.b.a;
    }

    @Override // io.sentry.k1
    public final k1 C(String str, String str2, n4 n4Var, Instrumenter instrumenter, um umVar) {
        return G(str, str2, n4Var, instrumenter, umVar);
    }

    public final void D() {
        r rVarA = this.j.a();
        try {
            if (this.h != null) {
                this.h.cancel();
                this.m.set(false);
                this.h = null;
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

    public final void E() {
        r rVarA = this.j.a();
        try {
            if (this.g != null) {
                this.g.cancel();
                this.l.set(false);
                this.g = null;
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

    public final k1 F(k6 k6Var, um umVar) {
        boolean z = this.b.g;
        c3 c3Var = c3.a;
        if (!z && this.o.equals(k6Var.l)) {
            b4 b4Var = this.d;
            if (!io.sentry.util.j.a((String) umVar.b, b4Var.m().getIgnoredSpanOrigins())) {
                m6 m6Var = k6Var.c;
                String str = k6Var.e;
                String str2 = k6Var.f;
                CopyOnWriteArrayList copyOnWriteArrayList = this.c;
                if (copyOnWriteArrayList.size() >= b4Var.m().getMaxSpans()) {
                    b4Var.m().getLogger().i(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
                    return c3Var;
                }
                io.sentry.config.a.W(m6Var, "parentSpanId is required");
                io.sentry.config.a.W(str, "operation is required");
                E();
                j6 j6Var = new j6(this, this.d, k6Var, umVar, new f09(11, this));
                K(j6Var);
                copyOnWriteArrayList.add(j6Var);
                l lVar = this.q;
                if (lVar != null) {
                    lVar.d(j6Var);
                }
                return j6Var;
            }
        }
        return c3Var;
    }

    public final k1 G(String str, String str2, n4 n4Var, Instrumenter instrumenter, um umVar) {
        boolean z = this.b.g;
        c3 c3Var = c3.a;
        if (z || !this.o.equals(instrumenter)) {
            return c3Var;
        }
        int size = this.c.size();
        b4 b4Var = this.d;
        if (size < b4Var.m().getMaxSpans()) {
            return this.b.C(str, str2, n4Var, instrumenter, umVar);
        }
        b4Var.m().getLogger().i(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return c3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(io.sentry.SpanStatus r7, io.sentry.n4 r8, boolean r9, io.sentry.h0 r10) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.h6.H(io.sentry.SpanStatus, io.sentry.n4, boolean, io.sentry.h0):void");
    }

    public final io.sentry.protocol.v I() {
        j6 j6Var = this.b;
        return !j6Var.c.o.equals(io.sentry.protocol.v.b) ? j6Var.c.o : this.d.m().getContinuousProfiler().e();
    }

    public final Boolean J() {
        p6 p6Var = this.b.c.d;
        if (p6Var == null) {
            return null;
        }
        return p6Var.a;
    }

    public final void K(j6 j6Var) {
        io.sentry.util.thread.a threadChecker = this.d.m().getThreadChecker();
        io.sentry.protocol.v vVarI = I();
        if (!vVarI.equals(io.sentry.protocol.v.b)) {
            Boolean bool = Boolean.TRUE;
            p6 p6Var = j6Var.c.d;
            if (bool.equals(p6Var == null ? null : p6Var.a)) {
                j6Var.p(vVarI.toString(), "profiler_id");
            }
        }
        j6Var.p(String.valueOf(threadChecker.b()), "thread.id");
        j6Var.p(threadChecker.a(), "thread.name");
    }

    public final void L(c cVar) {
        j6 j6Var = this.b;
        b4 b4Var = this.d;
        r rVarA = this.k.a();
        try {
            if (cVar.f) {
                AtomicReference atomicReference = new AtomicReference();
                if (b4Var.isEnabled()) {
                    try {
                        atomicReference.set(b4Var.e.b(null).k());
                    } catch (Throwable th) {
                        b4Var.m().getLogger().f(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th);
                    }
                } else {
                    b4Var.m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                }
                cVar.e(j6Var.c.a, (io.sentry.protocol.v) atomicReference.get(), b4Var.m(), j6Var.c.d, this.e, this.n);
                cVar.f = false;
            }
            rVarA.close();
        } finally {
        }
    }

    @Override // io.sentry.k1
    public final void a(SpanStatus spanStatus) {
        j6 j6Var = this.b;
        if (j6Var.g) {
            this.d.m().getLogger().i(SentryLevel.DEBUG, "The transaction is already finished. Status %s cannot be set", spanStatus == null ? Ssh2PublicKeyAlgorithmName.NULL : spanStatus.name());
        } else {
            j6Var.c.g = spanStatus;
        }
    }

    @Override // io.sentry.k1
    public final n6 b() {
        c cVar;
        if (!this.d.m().isTraceSampling() || (cVar = this.b.c.m) == null) {
            return null;
        }
        L(cVar);
        return cVar.f();
    }

    @Override // io.sentry.k1
    public final String c() {
        return this.b.c.f;
    }

    @Override // io.sentry.k1
    public final SpanStatus d() {
        return this.b.c.g;
    }

    @Override // io.sentry.k1
    public final e6 e() {
        return this.b.e();
    }

    @Override // io.sentry.k1
    public final boolean f() {
        return this.b.g;
    }

    @Override // io.sentry.m1
    public final void g(SpanStatus spanStatus, boolean z, h0 h0Var) {
        if (this.b.g) {
            return;
        }
        n4 n4VarA = this.d.m().getDateProvider().a();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            j6 j6Var = (j6) listIterator.previous();
            j6Var.j = null;
            j6Var.z(spanStatus, n4VarA);
        }
        H(spanStatus, n4VarA, z, h0Var);
    }

    @Override // io.sentry.m1
    public final String getName() {
        return this.e;
    }

    @Override // io.sentry.k1
    public final void h(Number number, String str) {
        this.b.h(number, str);
    }

    @Override // io.sentry.k1
    public final void i(Throwable th) {
        j6 j6Var = this.b;
        if (j6Var.g) {
            this.d.m().getLogger().i(SentryLevel.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            j6Var.e = th;
        }
    }

    @Override // io.sentry.k1
    public final boolean j() {
        return false;
    }

    @Override // io.sentry.k1
    public final void k(SpanStatus spanStatus) {
        z(spanStatus, null);
    }

    @Override // io.sentry.k1
    public final d l(List list) {
        c cVar;
        if (!this.d.m().isTraceSampling() || (cVar = this.b.c.m) == null) {
            return null;
        }
        L(cVar);
        return d.a(cVar, list);
    }

    @Override // io.sentry.k1
    public final k1 m(String str, String str2, n4 n4Var, Instrumenter instrumenter) {
        return G(str, str2, n4Var, instrumenter, new um());
    }

    @Override // io.sentry.k1
    public final void n() {
        z(d(), null);
    }

    @Override // io.sentry.k1
    public final k1 o(String str, String str2, um umVar) {
        return G(str, str2, null, Instrumenter.SENTRY, umVar);
    }

    @Override // io.sentry.k1
    public final void p(Object obj, String str) {
        j6 j6Var = this.b;
        if (j6Var.g) {
            this.d.m().getLogger().i(SentryLevel.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            j6Var.p(obj, str);
        }
    }

    @Override // io.sentry.k1
    public final void q() {
        b4 b4Var = this.d;
        if (!b4Var.isEnabled()) {
            b4Var.m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            b4Var.e.b(null).J(this);
        } catch (Throwable th) {
            b4Var.m().getLogger().f(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.m1
    public final k1 r() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            j6 j6Var = (j6) listIterator.previous();
            if (!j6Var.g) {
                return j6Var;
            }
        }
        return null;
    }

    @Override // io.sentry.k1
    public final void s(String str) {
        j6 j6Var = this.b;
        if (j6Var.g) {
            this.d.m().getLogger().i(SentryLevel.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            j6Var.c.f = str;
        }
    }

    @Override // io.sentry.m1
    public final io.sentry.protocol.v t() {
        return this.a;
    }

    @Override // io.sentry.k1
    public final k1 u(String str) {
        return A(str, null);
    }

    @Override // io.sentry.m1
    public final void v() {
        Long l;
        r rVarA = this.j.a();
        try {
            if (this.i != null && (l = this.r.i) != null) {
                E();
                this.l.set(true);
                this.g = new f6(this, 0);
                try {
                    this.i.schedule(this.g, l.longValue());
                } catch (Throwable th) {
                    this.d.m().getLogger().f(SentryLevel.WARNING, "Failed to schedule finish timer", th);
                    SpanStatus spanStatusD = d();
                    if (spanStatusD == null) {
                        spanStatusD = SpanStatus.OK;
                    }
                    k(spanStatusD);
                    this.l.set(false);
                }
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.k1
    public final void w(String str, Long l, j2 j2Var) {
        this.b.w(str, l, j2Var);
    }

    @Override // io.sentry.k1
    public final k6 x() {
        return this.b.c;
    }

    @Override // io.sentry.k1
    public final n4 y() {
        return this.b.b;
    }

    @Override // io.sentry.k1
    public final void z(SpanStatus spanStatus, n4 n4Var) {
        H(spanStatus, n4Var, true, null);
    }
}
