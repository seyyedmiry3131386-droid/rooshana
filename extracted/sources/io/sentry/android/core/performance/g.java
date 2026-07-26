package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.content.ContentProvider;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.j;
import io.sentry.android.core.j0;
import io.sentry.android.core.u;
import io.sentry.p6;
import io.sentry.r;
import io.sentry.r2;
import io.sentry.util.AutoClosableReentrantLock;
import ir.mservices.market.version2.ApplicationLauncher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends a {
    public static volatile g q;
    public static long p = SystemClock.uptimeMillis();
    public static final AutoClosableReentrantLock r = new AutoClosableReentrantLock();
    public AppStartMetrics$AppStartType a = AppStartMetrics$AppStartType.UNKNOWN;
    public final io.sentry.util.e b = new io.sentry.util.e(new io.sentry.hints.i());
    public volatile long c = -1;
    public u i = null;
    public io.sentry.android.core.h j = null;
    public p6 k = null;
    public boolean l = false;
    public boolean m = true;
    public final AtomicInteger n = new AtomicInteger();
    public final AtomicBoolean o = new AtomicBoolean(false);
    public final h d = new h();
    public final h e = new h();
    public final h f = new h();
    public final HashMap g = new HashMap();
    public final ArrayList h = new ArrayList();

    public static void a(g gVar) {
        if (gVar.n.get() == 0) {
            gVar.b.c(Boolean.FALSE);
            u uVar = gVar.i;
            if (uVar != null && uVar.i.get()) {
                gVar.i.close();
                gVar.i = null;
            }
            io.sentry.android.core.h hVar = gVar.j;
            if (hVar == null || !hVar.i) {
                return;
            }
            hVar.a(true);
            gVar.j = null;
        }
    }

    public static g c() {
        if (q == null) {
            r rVarA = r.a();
            try {
                if (q == null) {
                    q = new g();
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
        return q;
    }

    public static void d(ApplicationLauncher applicationLauncher) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        h hVar = c().f;
        if (hVar.d == 0) {
            hVar.a = applicationLauncher.getClass().getName().concat(".onCreate");
            hVar.d = jUptimeMillis;
        }
    }

    public static void e(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        h hVar = new h();
        hVar.c(jUptimeMillis);
        c().g.put(contentProvider, hVar);
    }

    public static void f(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        h hVar = (h) c().g.get(contentProvider);
        if (hVar == null || hVar.d != 0) {
            return;
        }
        hVar.a = contentProvider.getClass().getName().concat(".onCreate");
        hVar.d = jUptimeMillis;
    }

    public final h b(SentryAndroidOptions sentryAndroidOptions) {
        if (this.a != AppStartMetrics$AppStartType.UNKNOWN && ((Boolean) this.b.a()).booleanValue()) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                h hVar = this.d;
                if (hVar.b() && hVar.a() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return hVar;
                }
            }
            h hVar2 = this.e;
            if (hVar2.b() && hVar2.a() <= TimeUnit.MINUTES.toMillis(1L)) {
                return hVar2;
            }
        }
        return new h();
    }

    public final synchronized void g() {
        if (!this.o.getAndSet(true)) {
            g gVarC = c();
            h hVar = gVarC.e;
            hVar.getClass();
            hVar.d = SystemClock.uptimeMillis();
            h hVar2 = gVarC.d;
            hVar2.getClass();
            hVar2.d = SystemClock.uptimeMillis();
        }
    }

    public final void h(Application application) {
        ActivityManager activityManager;
        if (this.l) {
            return;
        }
        this.l = true;
        this.b.b();
        application.registerActivityLifecycleCallbacks(q);
        if (Build.VERSION.SDK_INT >= 35 && (activityManager = (ActivityManager) application.getSystemService("activity")) != null) {
            List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
            if (!historicalProcessStartReasons.isEmpty()) {
                ApplicationStartInfo applicationStartInfo = (ApplicationStartInfo) historicalProcessStartReasons.get(0);
                if (applicationStartInfo.getStartupState() == 0) {
                    if (applicationStartInfo.getStartType() == 1) {
                        this.a = AppStartMetrics$AppStartType.COLD;
                    } else {
                        this.a = AppStartMetrics$AppStartType.WARM;
                    }
                }
            }
        }
        AppStartMetrics$AppStartType appStartMetrics$AppStartType = this.a;
        AppStartMetrics$AppStartType appStartMetrics$AppStartType2 = AppStartMetrics$AppStartType.UNKNOWN;
        if (appStartMetrics$AppStartType == appStartMetrics$AppStartType2) {
            Looper.getMainLooper().getQueue().addIdleHandler(new e(this));
        } else if (appStartMetrics$AppStartType == appStartMetrics$AppStartType2) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new f(this, handler));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        j0.b.c(activity2);
        if (this.n.incrementAndGet() == 1 && !this.o.get()) {
            long jUptimeMillis2 = SystemClock.uptimeMillis() - this.d.c;
            if (!((Boolean) this.b.a()).booleanValue() || jUptimeMillis2 > TimeUnit.MINUTES.toMillis(1L)) {
                this.a = AppStartMetrics$AppStartType.WARM;
                this.m = true;
                h hVar = this.d;
                hVar.a = null;
                hVar.c = 0L;
                hVar.d = 0L;
                hVar.b = 0L;
                hVar.c(jUptimeMillis);
                p = jUptimeMillis;
                this.g.clear();
                h hVar2 = this.f;
                hVar2.a = null;
                hVar2.c = 0L;
                hVar2.d = 0L;
                hVar2.b = 0L;
            } else if (this.a == AppStartMetrics$AppStartType.UNKNOWN) {
                if (bundle != null) {
                    this.a = AppStartMetrics$AppStartType.WARM;
                } else if (this.c == -1 || jUptimeMillis <= this.c) {
                    this.a = AppStartMetrics$AppStartType.COLD;
                } else {
                    this.a = AppStartMetrics$AppStartType.WARM;
                }
            }
        }
        this.b.c(Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
        j0 j0Var = j0.b;
        WeakReference weakReference = (WeakReference) j0Var.a;
        if (weakReference == null || weakReference.get() == activity2) {
            j0Var.a = null;
        }
        if (this.n.decrementAndGet() != 0 || activity2.isChangingConfigurations()) {
            return;
        }
        this.a = AppStartMetrics$AppStartType.WARM;
        this.b.c(Boolean.TRUE);
        this.m = true;
        this.o.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
        j0 j0Var = j0.b;
        WeakReference weakReference = (WeakReference) j0Var.a;
        if (weakReference == null || weakReference.get() == activity2) {
            j0Var.a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
        j0.b.c(activity2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity2) {
        j0.b.c(activity2);
        if (this.o.get()) {
            return;
        }
        if (activity2.getWindow() != null) {
            final int i = 0;
            j.a(activity2, new Runnable(this) { // from class: io.sentry.android.core.performance.d
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            this.b.g();
                            break;
                        default:
                            this.b.g();
                            break;
                    }
                }
            }, new j0(r2.a));
        } else {
            final int i2 = 1;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.performance.d
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.b.g();
                            break;
                        default:
                            this.b.g();
                            break;
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity2) {
        j0 j0Var = j0.b;
        WeakReference weakReference = (WeakReference) j0Var.a;
        if (weakReference == null || weakReference.get() == activity2) {
            j0Var.a = null;
        }
    }
}
