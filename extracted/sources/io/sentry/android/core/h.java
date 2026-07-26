package io.sentry.android.core;

import defpackage.i48;
import defpackage.kb8;
import io.sentry.DataCategory;
import io.sentry.IConnectionStatusProvider$ConnectionStatus;
import io.sentry.ProfileLifecycle;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.h4;
import io.sentry.l5;
import io.sentry.m3;
import io.sentry.n4;
import io.sentry.o6;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.v2;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements io.sentry.p0, io.sentry.transport.o {
    public final io.sentry.u0 a;
    public final String b;
    public final int c;
    public final io.sentry.util.d d;
    public final j0 e;
    public final io.sentry.android.core.internal.util.s g;
    public io.sentry.c1 j;
    public Future k;
    public io.sentry.l l;
    public io.sentry.protocol.v n;
    public io.sentry.protocol.v o;
    public final AtomicBoolean p;
    public n4 q;
    public volatile boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public final AutoClosableReentrantLock v;
    public final AutoClosableReentrantLock w;
    public boolean f = false;
    public s h = null;
    public boolean i = false;
    public final ArrayList m = new ArrayList();

    public h(j0 j0Var, io.sentry.android.core.internal.util.s sVar, io.sentry.u0 u0Var, String str, int i, io.sentry.util.d dVar) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.b;
        this.n = vVar;
        this.o = vVar;
        this.p = new AtomicBoolean(false);
        this.q = new l5();
        this.r = true;
        this.s = false;
        this.t = false;
        this.u = 0;
        this.v = new AutoClosableReentrantLock();
        this.w = new AutoClosableReentrantLock();
        this.a = u0Var;
        this.g = sVar;
        this.e = j0Var;
        this.b = str;
        this.c = i;
        this.d = dVar;
    }

    @Override // io.sentry.transport.o
    public final void I(io.sentry.transport.p pVar) {
        if (pVar.d(DataCategory.All) || pVar.d(DataCategory.ProfileChunkUi)) {
            this.a.i(SentryLevel.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            h(false);
        }
    }

    @Override // io.sentry.p0
    public final void a(boolean z) {
        io.sentry.r rVarA = this.v.a();
        try {
            this.u = 0;
            this.s = true;
            if (z) {
                h(false);
                this.p.set(true);
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

    @Override // io.sentry.p0
    public final void b(ProfileLifecycle profileLifecycle) {
        io.sentry.r rVarA = this.v.a();
        try {
            int i = g.a[profileLifecycle.ordinal()];
            if (i == 1) {
                int i2 = this.u - 1;
                this.u = i2;
                if (i2 > 0) {
                    rVarA.close();
                    return;
                } else {
                    if (i2 < 0) {
                        this.u = 0;
                    }
                    this.s = true;
                }
            } else if (i == 2) {
                this.s = true;
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

    @Override // io.sentry.p0
    public final void c(ProfileLifecycle profileLifecycle, o6 o6Var) {
        io.sentry.r rVarA = this.v.a();
        try {
            if (this.r) {
                double dC = io.sentry.util.i.a().c();
                Double profileSessionSampleRate = o6Var.a.getProfileSessionSampleRate();
                this.t = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dC;
                this.r = false;
            }
            if (!this.t) {
                this.a.i(SentryLevel.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                rVarA.close();
                return;
            }
            int i = g.a[profileLifecycle.ordinal()];
            if (i == 1) {
                if (this.u < 0) {
                    this.u = 0;
                }
                this.u++;
            } else if (i == 2 && this.i) {
                this.a.i(SentryLevel.DEBUG, "Profiler is already running.", new Object[0]);
                rVarA.close();
                return;
            }
            if (!this.i) {
                this.a.i(SentryLevel.DEBUG, "Started Profiler.", new Object[0]);
                g();
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

    @Override // io.sentry.p0
    public final void d() {
        this.r = true;
    }

    @Override // io.sentry.p0
    public final io.sentry.protocol.v e() {
        return this.n;
    }

    public final void f() {
        io.sentry.c1 c1Var = this.j;
        if ((c1Var == null || c1Var == v2.b) && h4.b() != v2.b) {
            this.j = h4.b();
            this.l = h4.b().m().getCompositePerformanceCollector();
            io.sentry.transport.p pVarE = this.j.e();
            if (pVarE != null) {
                pVarE.d.add(this);
            }
        }
    }

    public final void g() {
        f();
        this.e.getClass();
        boolean z = this.f;
        io.sentry.u0 u0Var = this.a;
        if (!z) {
            this.f = true;
            String str = this.b;
            if (str == null) {
                u0Var.i(SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i = this.c;
                if (i <= 0) {
                    u0Var.i(SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                } else {
                    this.h = new s(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i, this.g, null, this.a);
                }
            }
        }
        if (this.h == null) {
            return;
        }
        io.sentry.c1 c1Var = this.j;
        if (c1Var != null) {
            io.sentry.transport.p pVarE = c1Var.e();
            if (pVarE != null && (pVarE.d(DataCategory.All) || pVarE.d(DataCategory.ProfileChunkUi))) {
                u0Var.i(SentryLevel.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                h(false);
                return;
            } else {
                if (this.j.m().getConnectionStatusProvider().A0() == IConnectionStatusProvider$ConnectionStatus.DISCONNECTED) {
                    u0Var.i(SentryLevel.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    h(false);
                    return;
                }
                this.q = this.j.m().getDateProvider().a();
            }
        } else {
            this.q = new l5();
        }
        if (this.h.c() == null) {
            return;
        }
        this.i = true;
        io.sentry.protocol.v vVar = this.n;
        io.sentry.protocol.v vVar2 = io.sentry.protocol.v.b;
        if (vVar.equals(vVar2)) {
            this.n = new io.sentry.protocol.v();
        }
        if (this.o.equals(vVar2)) {
            this.o = new io.sentry.protocol.v();
        }
        io.sentry.l lVar = this.l;
        if (lVar != null) {
            lVar.a(this.o.toString());
        }
        try {
            this.k = ((io.sentry.g1) this.d.c()).c(new kb8(10, this), 60000L);
        } catch (RejectedExecutionException e) {
            u0Var.f(SentryLevel.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
            this.s = true;
        }
    }

    public final void h(boolean z) {
        f();
        io.sentry.r rVarA = this.v.a();
        try {
            Future future = this.k;
            if (future != null) {
                future.cancel(true);
            }
            if (this.h != null && this.i) {
                this.e.getClass();
                io.sentry.l lVar = this.l;
                i48 i48VarA = this.h.a(lVar != null ? lVar.c(this.o.toString()) : null, false);
                io.sentry.u0 u0Var = this.a;
                if (i48VarA == null) {
                    u0Var.i(SentryLevel.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    io.sentry.r rVarA2 = this.w.a();
                    try {
                        this.m.add(new m3(this.n, this.o, (Map) i48VarA.e, (File) i48VarA.d, this.q));
                        rVarA2.close();
                    } finally {
                    }
                }
                this.i = false;
                this.o = io.sentry.protocol.v.b;
                io.sentry.c1 c1Var = this.j;
                if (c1Var != null) {
                    b6 b6VarM = c1Var.m();
                    try {
                        b6VarM.getExecutorService().submit(new e1(this, b6VarM, c1Var, 2));
                    } catch (Throwable th) {
                        b6VarM.getLogger().f(SentryLevel.DEBUG, "Failed to send profile chunks.", th);
                    }
                }
                if (!z || this.s) {
                    this.n = io.sentry.protocol.v.b;
                    u0Var.i(SentryLevel.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    u0Var.i(SentryLevel.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    g();
                }
                rVarA.close();
                return;
            }
            io.sentry.protocol.v vVar = io.sentry.protocol.v.b;
            this.n = vVar;
            this.o = vVar;
            rVarA.close();
        } finally {
        }
    }
}
