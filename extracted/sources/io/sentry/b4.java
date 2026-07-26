package io.sentry;

import defpackage.r59;
import defpackage.rm7;
import io.sentry.clientreport.DiscardReason;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class b4 implements c1 {
    public final a1 a;
    public final a1 b;
    public final a1 c;
    public final l d;
    public final k e;
    public final e0 f;
    public final e0 g;

    public b4(a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.e = new k(a1Var3, a1Var2, a1Var, 0);
        this.a = a1Var;
        this.b = a1Var2;
        this.c = a1Var3;
        b6 b6VarM = m();
        io.sentry.config.a.W(b6VarM, "SentryOptions is required.");
        if (b6VarM.getDsn() == null || b6VarM.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
        this.d = b6VarM.getCompositePerformanceCollector();
        this.f = new e0(this);
        this.g = new e0(this);
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v A(io.sentry.protocol.d0 d0Var, n6 n6Var, h0 h0Var, p3 p3Var) {
        io.sentry.protocol.d0 d0Var2;
        a1 a1Var = this.e;
        ArrayList arrayList = d0Var.s;
        io.sentry.protocol.v vVar = io.sentry.protocol.v.b;
        if (!isEnabled()) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return vVar;
        }
        if (d0Var.r == null) {
            m().getLogger().i(SentryLevel.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", d0Var.a);
            return vVar;
        }
        Boolean bool = Boolean.TRUE;
        k6 k6VarI = d0Var.b.i();
        p6 p6Var = k6VarI == null ? null : k6VarI.d;
        if (!bool.equals(Boolean.valueOf(p6Var == null ? false : p6Var.a.booleanValue()))) {
            m().getLogger().i(SentryLevel.DEBUG, "Transaction %s was dropped due to sampling decision.", d0Var.a);
            if (m().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.e clientReportRecorder = m().getClientReportRecorder();
                DiscardReason discardReason = DiscardReason.BACKPRESSURE;
                clientReportRecorder.a(discardReason, DataCategory.Transaction);
                m().getClientReportRecorder().h(discardReason, DataCategory.Span, arrayList.size() + 1);
                return vVar;
            }
            io.sentry.clientreport.e clientReportRecorder2 = m().getClientReportRecorder();
            DiscardReason discardReason2 = DiscardReason.SAMPLE_RATE;
            clientReportRecorder2.a(discardReason2, DataCategory.Transaction);
            m().getClientReportRecorder().h(discardReason2, DataCategory.Span, arrayList.size() + 1);
            return vVar;
        }
        try {
            d0Var2 = d0Var;
            try {
                return a1Var.z().j(d0Var2, n6Var, a1Var, h0Var, p3Var);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                m().getLogger().f(SentryLevel.ERROR, "Error while capturing transaction with id: " + d0Var2.a, th2);
                return vVar;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var2 = d0Var;
        }
    }

    @Override // io.sentry.c1
    public final c1 B(String str) {
        return new b4(this.a.clone(), this.b.clone(), this.c);
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v C(w4 w4Var, h0 h0Var) {
        a1 a1Var = this.e;
        io.sentry.protocol.v vVarM = io.sentry.protocol.v.b;
        if (!isEnabled()) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return vVarM;
        }
        try {
            a1Var.D(w4Var);
            vVarM = a1Var.z().m(w4Var, a1Var, h0Var);
            a1Var.I(vVarM);
            return vVarM;
        } catch (Throwable th) {
            m().getLogger().f(SentryLevel.ERROR, "Error while capturing event with id: " + w4Var.a, th);
            return vVarM;
        }
    }

    @Override // io.sentry.c1
    public final void a(boolean z) {
        if (!isEnabled()) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (q1 q1Var : m().getIntegrations()) {
                if (q1Var instanceof Closeable) {
                    try {
                        ((Closeable) q1Var).close();
                    } catch (Throwable th) {
                        m().getLogger().i(SentryLevel.WARNING, "Failed to close the integration {}.", q1Var, th);
                    }
                }
            }
            for (b0 b0Var : m().getEventProcessors()) {
                if (b0Var instanceof Closeable) {
                    try {
                        ((Closeable) b0Var).close();
                    } catch (Throwable th2) {
                        m().getLogger().i(SentryLevel.WARNING, "Failed to close the event processor {}.", b0Var, th2);
                    }
                }
            }
            boolean zIsEnabled = isEnabled();
            k kVar = this.e;
            if (zIsEnabled) {
                try {
                    kVar.b(null).clear();
                } catch (Throwable th3) {
                    m().getLogger().f(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th3);
                }
            } else {
                m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            ScopeType scopeType = ScopeType.ISOLATION;
            if (isEnabled()) {
                try {
                    kVar.b(scopeType).clear();
                } catch (Throwable th4) {
                    m().getLogger().f(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th4);
                }
            } else {
                m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            m().getBackpressureMonitor().close();
            m().getTransactionProfiler().close();
            m().getContinuousProfiler().a(true);
            m().getCompositePerformanceCollector().close();
            m().getConnectionStatusProvider().close();
            g1 executorService = m().getExecutorService();
            if (z) {
                try {
                    executorService.submit(new r59(this, executorService, 3));
                } catch (RejectedExecutionException e) {
                    m().getLogger().f(SentryLevel.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e);
                    executorService.a(m().getShutdownTimeoutMillis());
                }
            } else {
                executorService.a(m().getShutdownTimeoutMillis());
            }
            ScopeType scopeType2 = ScopeType.CURRENT;
            if (isEnabled()) {
                try {
                    kVar.b(scopeType2).z().a(z);
                } catch (Throwable th5) {
                    m().getLogger().f(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            ScopeType scopeType3 = ScopeType.ISOLATION;
            if (isEnabled()) {
                try {
                    kVar.b(scopeType3).z().a(z);
                } catch (Throwable th6) {
                    m().getLogger().f(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th6);
                }
            } else {
                m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            ScopeType scopeType4 = ScopeType.GLOBAL;
            if (!isEnabled()) {
                m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                kVar.b(scopeType4).z().a(z);
            } catch (Throwable th7) {
                m().getLogger().f(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th7);
            }
        } catch (Throwable th8) {
            m().getLogger().f(SentryLevel.ERROR, "Error while closing the Scopes.", th8);
        }
    }

    @Override // io.sentry.c1
    public final a1 b() {
        return this.a;
    }

    @Override // io.sentry.c1
    public final void c(long j) {
        if (!isEnabled()) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.e.z().c(j);
        } catch (Throwable th) {
            m().getLogger().f(SentryLevel.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.c1
    public final k1 d() {
        if (isEnabled()) {
            return this.e.d();
        }
        m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.c1
    public final io.sentry.transport.p e() {
        return this.e.z().e();
    }

    @Override // io.sentry.c1
    public final boolean f() {
        return this.e.z().f();
    }

    @Override // io.sentry.c1
    public final void g(Throwable th, j6 j6Var, String str) {
        this.e.g(th, j6Var, str);
    }

    @Override // io.sentry.c1
    public final void h(f fVar, h0 h0Var) {
        if (!isEnabled()) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (fVar == null) {
            m().getLogger().i(SentryLevel.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.e.h(fVar, h0Var);
        }
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v i(io.sentry.internal.debugmeta.c cVar, h0 h0Var) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.b;
        if (!isEnabled()) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return vVar;
        }
        try {
            io.sentry.protocol.v vVarI = this.e.z().i(cVar, h0Var);
            return vVarI != null ? vVarI : vVar;
        } catch (Throwable th) {
            m().getLogger().f(SentryLevel.ERROR, "Error while capturing envelope.", th);
            return vVar;
        }
    }

    @Override // io.sentry.c1
    public final boolean isEnabled() {
        return this.e.z().isEnabled();
    }

    @Override // io.sentry.c1
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // io.sentry.c1
    public final void k(f fVar) {
        h(fVar, new h0());
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v l(n3 n3Var) {
        io.sentry.config.a.W(n3Var, "profilingContinuousData is required");
        io.sentry.protocol.v vVar = io.sentry.protocol.v.b;
        if (!isEnabled()) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return vVar;
        }
        try {
            return this.e.z().l(n3Var);
        } catch (Throwable th) {
            m().getLogger().f(SentryLevel.ERROR, "Error while capturing profile chunk with id: " + n3Var.c, th);
            return vVar;
        }
    }

    @Override // io.sentry.c1
    public final b6 m() {
        return ((a1) this.e.b).m();
    }

    @Override // io.sentry.c1
    public final m1 n(q6 q6Var, r6 r6Var) {
        Double dValueOf;
        q6Var.i = (String) r6Var.b;
        boolean zIsEnabled = isEnabled();
        m1 m1VarA = e3.a;
        if (!zIsEnabled) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        } else if (io.sentry.util.j.a(q6Var.i, m().getIgnoredSpanOrigins())) {
            m().getLogger().i(SentryLevel.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", q6Var.i);
        } else if (!m().getInstrumenter().equals(q6Var.l)) {
            m().getLogger().i(SentryLevel.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", q6Var.l, m().getInstrumenter());
        } else if (m().isTracingEnabled()) {
            c cVar = q6Var.m;
            if (cVar == null || (dValueOf = cVar.d) == null) {
                Double d = ((c) this.e.w().d).d;
                dValueOf = Double.valueOf(d == null ? 0.0d : d.doubleValue());
            }
            p6 p6VarA = m().getInternalTracesSampler().a(new io.sentry.internal.debugmeta.c(q6Var, dValueOf));
            Boolean bool = p6VarA.a;
            q6Var.a(p6VarA);
            l1 spanFactory = m().getSpanFactory();
            if (bool.booleanValue() && m().isContinuousProfilingEnabled()) {
                ProfileLifecycle profileLifecycle = m().getProfileLifecycle();
                ProfileLifecycle profileLifecycle2 = ProfileLifecycle.TRACE;
                if (profileLifecycle == profileLifecycle2 && q6Var.o.equals(io.sentry.protocol.v.b)) {
                    m().getContinuousProfiler().c(profileLifecycle2, m().getInternalTracesSampler());
                }
            }
            m1VarA = spanFactory.a(q6Var, this, r6Var, this.d);
            if (bool.booleanValue() && p6VarA.d.booleanValue()) {
                n1 transactionProfiler = m().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.g(m1VarA);
                } else if (r6Var.g) {
                    transactionProfiler.g(m1VarA);
                }
            }
        } else {
            m().getLogger().i(SentryLevel.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        }
        if (ScopeBindingMode.ON == ((ScopeBindingMode) r6Var.a)) {
            m1VarA.q();
        }
        return m1VarA;
    }

    @Override // io.sentry.c1
    public final m1 o() {
        if (isEnabled()) {
            return this.e.o();
        }
        m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.c1
    public final void p() {
        if (!isEnabled()) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        k kVar = this.e;
        i6 i6VarP = kVar.p();
        if (i6VarP != null) {
            kVar.z().b(i6VarP, io.sentry.config.a.o(new io.sentry.hints.i()));
        }
    }

    @Override // io.sentry.c1
    public final void q() {
        if (!isEnabled()) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        k kVar = this.e;
        io.sentry.internal.debugmeta.c cVarQ = kVar.q();
        if (cVarQ == null) {
            m().getLogger().i(SentryLevel.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        i6 i6Var = (i6) cVarQ.b;
        if (i6Var != null) {
            kVar.z().b(i6Var, io.sentry.config.a.o(new io.sentry.hints.i()));
        }
        kVar.z().b((i6) cVarQ.c, io.sentry.config.a.o(new io.sentry.hints.i()));
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v r(io.sentry.protocol.d0 d0Var, n6 n6Var, h0 h0Var) {
        return A(d0Var, n6Var, h0Var, null);
    }

    @Override // io.sentry.c1
    public final void s(z3 z3Var) {
        if (!isEnabled()) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            z3Var.g(this.e.b(null));
        } catch (Throwable th) {
            m().getLogger().f(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.c1
    public final io.sentry.logger.a t() {
        return this.f;
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v u(c6 c6Var, h0 h0Var) {
        a1 a1Var = this.e;
        io.sentry.protocol.v vVar = io.sentry.protocol.v.b;
        if (!isEnabled()) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return vVar;
        }
        try {
            return a1Var.z().g(c6Var, a1Var, h0Var);
        } catch (Throwable th) {
            m().getLogger().f(SentryLevel.ERROR, "Error while capturing replay", th);
            return vVar;
        }
    }

    @Override // io.sentry.c1
    public final s0 v() {
        return this.g;
    }

    @Override // io.sentry.c1
    public final /* synthetic */ void w(String str) {
        rm7.a(this, str);
    }

    @Override // io.sentry.c1
    public final void x(z3 z3Var) {
        s(z3Var);
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v y(Throwable th) {
        return z(th, new h0());
    }

    @Override // io.sentry.c1
    public final io.sentry.protocol.v z(Throwable th, h0 h0Var) {
        io.sentry.protocol.v vVarM = io.sentry.protocol.v.b;
        boolean zIsEnabled = isEnabled();
        a1 a1Var = this.e;
        if (!zIsEnabled) {
            m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th == null) {
            m().getLogger().i(SentryLevel.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                w4 w4Var = new w4(th);
                a1Var.D(w4Var);
                vVarM = a1Var.z().m(w4Var, a1Var, h0Var);
            } catch (Throwable th2) {
                m().getLogger().f(SentryLevel.ERROR, "Error while capturing exception: " + th.getMessage(), th2);
            }
        }
        a1Var.I(vVarM);
        return vVarM;
    }

    @Override // io.sentry.c1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final t0 m28clone() {
        if (!isEnabled()) {
            m().getLogger().i(SentryLevel.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new m0((b4) B("scopes clone"));
    }
}
