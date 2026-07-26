package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.app.FrameMetricsAggregator;
import defpackage.f09;
import defpackage.k31;
import defpackage.kb8;
import defpackage.r59;
import defpackage.um;
import defpackage.ur4;
import io.sentry.Instrumenter;
import io.sentry.MeasurementUnit$Duration;
import io.sentry.SentryLevel;
import io.sentry.SpanStatus;
import io.sentry.android.core.performance.AppStartMetrics$AppStartType;
import io.sentry.b6;
import io.sentry.c4;
import io.sentry.e3;
import io.sentry.i5;
import io.sentry.l5;
import io.sentry.n4;
import io.sentry.p6;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.q6;
import io.sentry.r6;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityLifecycleIntegration implements io.sentry.q1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application a;
    public final j0 b;
    public c4 c;
    public SentryAndroidOptions d;
    public final boolean g;
    public io.sentry.k1 j;
    public final d q;
    public boolean e = false;
    public boolean f = false;
    public boolean h = false;
    public io.sentry.g0 i = null;
    public final WeakHashMap k = new WeakHashMap();
    public final WeakHashMap l = new WeakHashMap();
    public final WeakHashMap m = new WeakHashMap();
    public n4 n = new l5(new Date(0), 0);
    public Future o = null;
    public final WeakHashMap p = new WeakHashMap();
    public final AutoClosableReentrantLock r = new AutoClosableReentrantLock();
    public final AutoClosableReentrantLock s = new AutoClosableReentrantLock();

    public ActivityLifecycleIntegration(Application application, j0 j0Var, d dVar) {
        this.a = application;
        this.b = j0Var;
        this.q = dVar;
        if (Build.VERSION.SDK_INT >= 29) {
            this.g = true;
        }
    }

    public static void d(io.sentry.k1 k1Var, io.sentry.k1 k1Var2) {
        if (k1Var == null || k1Var.f()) {
            return;
        }
        String strC = k1Var.c();
        if (strC == null || !strC.endsWith(" - Deadline Exceeded")) {
            strC = k1Var.c() + " - Deadline Exceeded";
        }
        k1Var.s(strC);
        n4 n4VarY = k1Var2 != null ? k1Var2.y() : null;
        if (n4VarY == null) {
            n4VarY = k1Var.B();
        }
        g(k1Var, n4VarY, SpanStatus.DEADLINE_EXCEEDED);
    }

    public static void g(io.sentry.k1 k1Var, n4 n4Var, SpanStatus spanStatus) {
        if (k1Var == null || k1Var.f()) {
            return;
        }
        if (spanStatus == null) {
            spanStatus = k1Var.d() != null ? k1Var.d() : SpanStatus.OK;
        }
        k1Var.z(spanStatus, n4Var);
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.d = sentryAndroidOptions;
        this.c = c4.a;
        this.e = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.i = this.d.getFullyDisplayedReporter();
        this.f = this.d.isEnableTimeToFullDisplayTracing();
        this.a.registerActivityLifecycleCallbacks(this);
        this.d.getLogger().i(SentryLevel.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.config.a.a("ActivityLifecycle");
    }

    public final void b() {
        i5 i5Var;
        io.sentry.android.core.performance.h hVarB = io.sentry.android.core.performance.g.c().b(this.d);
        if (hVarB.d != 0) {
            i5Var = new i5((hVarB.b() ? hVarB.b + hVarB.a() : 0L) * 1000000);
        } else {
            i5Var = null;
        }
        if (!this.e || i5Var == null) {
            return;
        }
        g(this.j, i5Var, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        d dVar = this.q;
        io.sentry.r rVarA = dVar.f.a();
        try {
            if (dVar.c()) {
                dVar.d(new kb8(9, dVar), "FrameMetricsAggregator.stop");
                ((FrameMetricsAggregator) dVar.a.a()).a.z();
            }
            dVar.c.clear();
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

    public final void k(io.sentry.m1 m1Var, io.sentry.k1 k1Var, io.sentry.k1 k1Var2) {
        if (m1Var == null || m1Var.f()) {
            return;
        }
        SpanStatus spanStatus = SpanStatus.DEADLINE_EXCEEDED;
        if (k1Var != null && !k1Var.f()) {
            k1Var.k(spanStatus);
        }
        d(k1Var2, k1Var);
        Future future = this.o;
        if (future != null) {
            future.cancel(false);
            this.o = null;
        }
        SpanStatus spanStatusD = m1Var.d();
        if (spanStatusD == null) {
            spanStatusD = SpanStatus.OK;
        }
        m1Var.k(spanStatusD);
        c4 c4Var = this.c;
        if (c4Var != null) {
            c4Var.s(new f09(this, m1Var, 12));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
        io.sentry.g0 g0Var;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.g) {
            onActivityPreCreated(activity2, bundle);
        }
        io.sentry.r rVarA = this.r.a();
        try {
            if (this.c != null && (sentryAndroidOptions = this.d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                this.c.s(new k31(io.sentry.config.a.y(activity2), 4));
            }
            y(activity2);
            io.sentry.k1 k1Var = (io.sentry.k1) this.k.get(activity2);
            io.sentry.k1 k1Var2 = (io.sentry.k1) this.l.get(activity2);
            this.h = true;
            if (this.e && k1Var != null && k1Var2 != null && (g0Var = this.i) != null) {
                g0Var.a.add(new io.sentry.u1(8));
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
        WeakHashMap weakHashMap = this.l;
        WeakHashMap weakHashMap2 = this.k;
        WeakHashMap weakHashMap3 = this.m;
        io.sentry.r rVarA = this.r.a();
        try {
            io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) weakHashMap3.remove(activity2);
            if (bVar != null) {
                io.sentry.k1 k1Var = bVar.d;
                if (k1Var != null && !k1Var.f()) {
                    bVar.d.k(SpanStatus.CANCELLED);
                }
                bVar.d = null;
                io.sentry.k1 k1Var2 = bVar.e;
                if (k1Var2 != null && !k1Var2.f()) {
                    bVar.e.k(SpanStatus.CANCELLED);
                }
                bVar.e = null;
            }
            boolean z = this.e;
            WeakHashMap weakHashMap4 = this.p;
            if (z) {
                io.sentry.k1 k1Var3 = this.j;
                SpanStatus spanStatus = SpanStatus.CANCELLED;
                if (k1Var3 != null && !k1Var3.f()) {
                    k1Var3.k(spanStatus);
                }
                io.sentry.k1 k1Var4 = (io.sentry.k1) weakHashMap2.get(activity2);
                io.sentry.k1 k1Var5 = (io.sentry.k1) weakHashMap.get(activity2);
                SpanStatus spanStatus2 = SpanStatus.DEADLINE_EXCEEDED;
                if (k1Var4 != null && !k1Var4.f()) {
                    k1Var4.k(spanStatus2);
                }
                d(k1Var5, k1Var4);
                Future future = this.o;
                if (future != null) {
                    future.cancel(false);
                    this.o = null;
                }
                if (this.e) {
                    k((io.sentry.m1) weakHashMap4.get(activity2), null, null);
                }
                this.j = null;
                weakHashMap2.remove(activity2);
                weakHashMap.remove(activity2);
            }
            weakHashMap4.remove(activity2);
            if (weakHashMap4.isEmpty() && !activity2.isChangingConfigurations()) {
                this.h = false;
                this.n = new l5(new Date(0L), 0L);
                weakHashMap3.clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
        io.sentry.r rVarA = this.r.a();
        try {
            if (!this.g) {
                onActivityPrePaused(activity2);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity2, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.m.get(activity2);
        if (bVar != null) {
            io.sentry.k1 k1Var = this.j;
            if (k1Var == null) {
                k1Var = (io.sentry.k1) this.p.get(activity2);
            }
            if (bVar.b == null || k1Var == null) {
                return;
            }
            io.sentry.k1 k1VarA = io.sentry.android.core.performance.b.a(k1Var, bVar.a.concat(".onCreate"), bVar.b);
            bVar.d = k1VarA;
            k1VarA.n();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity2) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.m.get(activity2);
        if (bVar != null) {
            io.sentry.k1 k1Var = this.j;
            if (k1Var == null) {
                k1Var = (io.sentry.k1) this.p.get(activity2);
            }
            if (bVar.c != null && k1Var != null) {
                io.sentry.k1 k1VarA = io.sentry.android.core.performance.b.a(k1Var, bVar.a.concat(".onStart"), bVar.c);
                bVar.e = k1VarA;
                k1VarA.n();
            }
            io.sentry.k1 k1Var2 = bVar.d;
            if (k1Var2 == null || bVar.e == null) {
                return;
            }
            n4 n4VarY = k1Var2.y();
            n4 n4VarY2 = bVar.e.y();
            if (n4VarY == null || n4VarY2 == null) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            j.a.getClass();
            l5 l5Var = new l5();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long millis = timeUnit.toMillis(l5Var.b(bVar.d.B()));
            long millis2 = timeUnit.toMillis(l5Var.b(n4VarY));
            long millis3 = timeUnit.toMillis(l5Var.b(bVar.e.B()));
            long millis4 = timeUnit.toMillis(l5Var.b(n4VarY2));
            io.sentry.android.core.performance.c cVar = new io.sentry.android.core.performance.c();
            String strC = bVar.d.c();
            long millis5 = timeUnit.toMillis(bVar.d.B().d());
            io.sentry.android.core.performance.h hVar = cVar.a;
            hVar.a = strC;
            hVar.b = millis5;
            hVar.c = jUptimeMillis - millis;
            hVar.d = jUptimeMillis - millis2;
            String strC2 = bVar.e.c();
            long millis6 = timeUnit.toMillis(bVar.e.B().d());
            io.sentry.android.core.performance.h hVar2 = cVar.b;
            hVar2.a = strC2;
            hVar2.b = millis6;
            hVar2.c = jUptimeMillis - millis3;
            hVar2.d = jUptimeMillis - millis4;
            io.sentry.android.core.performance.g.c().h.add(cVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity2, Bundle bundle) {
        n4 l5Var;
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity2.getClass().getName());
        this.m.put(activity2, bVar);
        if (this.h) {
            return;
        }
        c4 c4Var = this.c;
        if (c4Var != null) {
            l5Var = c4Var.m().getDateProvider().a();
        } else {
            j.a.getClass();
            l5Var = new l5();
        }
        this.n = l5Var;
        bVar.b = l5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity2) {
        n4 l5Var;
        this.h = true;
        c4 c4Var = this.c;
        if (c4Var != null) {
            l5Var = c4Var.m().getDateProvider().a();
        } else {
            j.a.getClass();
            l5Var = new l5();
        }
        this.n = l5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity2) {
        n4 l5Var;
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.m.get(activity2);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.d;
            if (sentryAndroidOptions != null) {
                l5Var = sentryAndroidOptions.getDateProvider().a();
            } else {
                j.a.getClass();
                l5Var = new l5();
            }
            bVar.c = l5Var;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
        io.sentry.r rVarA = this.r.a();
        try {
            if (!this.g) {
                onActivityPostStarted(activity2);
            }
            if (this.e) {
                final io.sentry.k1 k1Var = (io.sentry.k1) this.k.get(activity2);
                final io.sentry.k1 k1Var2 = (io.sentry.k1) this.l.get(activity2);
                if (activity2.getWindow() != null) {
                    final int i = 0;
                    io.sentry.android.core.internal.util.j.a(activity2, new Runnable(this) { // from class: io.sentry.android.core.e
                        public final /* synthetic */ ActivityLifecycleIntegration b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    this.b.u(k1Var2, k1Var);
                                    break;
                                default:
                                    this.b.u(k1Var2, k1Var);
                                    break;
                            }
                        }
                    }, this.b);
                } else {
                    final int i2 = 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.e
                        public final /* synthetic */ ActivityLifecycleIntegration b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    this.b.u(k1Var2, k1Var);
                                    break;
                                default:
                                    this.b.u(k1Var2, k1Var);
                                    break;
                            }
                        }
                    });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity2) {
        io.sentry.r rVarA = this.r.a();
        try {
            if (!this.g) {
                onActivityPostCreated(activity2, null);
                onActivityPreStarted(activity2);
            }
            if (this.e) {
                this.q.a(activity2);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity2) {
    }

    public final void u(io.sentry.k1 k1Var, io.sentry.k1 k1Var2) {
        io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
        io.sentry.android.core.performance.h hVar = gVarC.d;
        io.sentry.android.core.performance.h hVar2 = gVarC.e;
        if (hVar.b() && hVar.d == 0) {
            hVar.d = SystemClock.uptimeMillis();
        }
        if (hVar2.b() && hVar2.d == 0) {
            hVar2.d = SystemClock.uptimeMillis();
        }
        b();
        io.sentry.r rVarA = this.s.a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.d;
            if (sentryAndroidOptions != null && k1Var2 != null) {
                n4 n4VarA = sentryAndroidOptions.getDateProvider().a();
                k1Var2.w("time_to_initial_display", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(n4VarA.b(k1Var2.B()))), MeasurementUnit$Duration.MILLISECOND);
                g(k1Var2, n4VarA, null);
            } else if (k1Var2 != null && !k1Var2.f()) {
                k1Var2.n();
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

    public final void y(Activity activity2) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        Boolean boolValueOf;
        i5 i5Var;
        n4 n4Var;
        um umVar;
        io.sentry.m1 m1Var;
        WeakReference weakReference = new WeakReference(activity2);
        if (this.c != null) {
            WeakHashMap weakHashMap3 = this.p;
            if (weakHashMap3.containsKey(activity2)) {
                return;
            }
            if (!this.e) {
                weakHashMap3.put(activity2, e3.a);
                if (this.d.isEnableAutoTraceIdGeneration()) {
                    this.c.x(new io.sentry.u1(29));
                    return;
                }
                return;
            }
            Iterator it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                weakHashMap = this.l;
                weakHashMap2 = this.k;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                k((io.sentry.m1) entry.getValue(), (io.sentry.k1) weakHashMap2.get(entry.getKey()), (io.sentry.k1) weakHashMap.get(entry.getKey()));
            }
            String simpleName = activity2.getClass().getSimpleName();
            io.sentry.android.core.performance.h hVarB = io.sentry.android.core.performance.g.c().b(this.d);
            p6 p6Var = null;
            if (i0.i() && hVarB.b()) {
                i5 i5Var2 = hVarB.b() ? new i5(hVarB.b * 1000000) : null;
                boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.g.c().a == AppStartMetrics$AppStartType.COLD);
                i5Var = i5Var2;
            } else {
                boolValueOf = null;
                i5Var = null;
            }
            r6 r6Var = new r6();
            long deadlineTimeout = this.d.getDeadlineTimeout();
            r6Var.j = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
            if (this.d.isEnableActivityLifecycleTracingAutoFinish()) {
                r6Var.i = this.d.getIdleTimeout();
                r6Var.d = true;
            }
            r6Var.h = true;
            r6Var.k = new f(this, weakReference, simpleName);
            if (this.h || i5Var == null || boolValueOf == null) {
                n4Var = this.n;
            } else {
                p6 p6Var2 = io.sentry.android.core.performance.g.c().k;
                io.sentry.android.core.performance.g.c().k = null;
                p6Var = p6Var2;
                n4Var = i5Var;
            }
            r6Var.f = n4Var;
            r6Var.g = p6Var != null;
            r6Var.b = "auto.ui.activity";
            io.sentry.m1 m1VarN = this.c.n(new q6(simpleName, TransactionNameSource.COMPONENT, "ui.load", p6Var), r6Var);
            um umVar2 = new um();
            umVar2.b = "auto.ui.activity";
            if (this.h || i5Var == null || boolValueOf == null) {
                umVar = umVar2;
            } else {
                io.sentry.k1 k1VarC = m1VarN.C(boolValueOf.booleanValue() ? "app.start.cold" : "app.start.warm", boolValueOf.booleanValue() ? "Cold Start" : "Warm Start", i5Var, Instrumenter.SENTRY, umVar2);
                m1VarN = m1VarN;
                umVar = umVar2;
                this.j = k1VarC;
                b();
            }
            String strConcat = simpleName.concat(" initial display");
            Instrumenter instrumenter = Instrumenter.SENTRY;
            n4 n4Var2 = n4Var;
            io.sentry.k1 k1VarC2 = m1VarN.C("ui.load.initial_display", strConcat, n4Var2, instrumenter, umVar);
            weakHashMap2.put(activity2, k1VarC2);
            if (!this.f || this.i == null || this.d == null) {
                m1Var = m1VarN;
            } else {
                io.sentry.k1 k1VarC3 = m1VarN.C("ui.load.full_display", simpleName.concat(" full display"), n4Var2, instrumenter, umVar);
                m1Var = m1VarN;
                try {
                    weakHashMap.put(activity2, k1VarC3);
                    this.o = this.d.getExecutorService().c(new r59(this, k1VarC3, k1VarC2), 25000L);
                } catch (RejectedExecutionException e) {
                    this.d.getLogger().f(SentryLevel.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e);
                }
            }
            this.c.s(new ur4(this, m1Var, 22));
            weakHashMap3.put(activity2, m1Var);
        }
    }
}
