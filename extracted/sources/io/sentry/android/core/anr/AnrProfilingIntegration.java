package io.sentry.android.core.anr;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.kb8;
import defpackage.r59;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.a0;
import io.sentry.android.core.c0;
import io.sentry.b6;
import io.sentry.q1;
import io.sentry.r;
import io.sentry.r2;
import io.sentry.u0;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.i;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class AnrProfilingIntegration implements q1, Closeable, a0, Runnable {
    public volatile d h;
    public volatile SentryAndroidOptions j;
    public volatile Handler n;
    public volatile Thread o;
    public final AtomicBoolean a = new AtomicBoolean(true);
    public final kb8 b = new kb8(15, this);
    public final AutoClosableReentrantLock c = new AutoClosableReentrantLock();
    public final AutoClosableReentrantLock d = new AutoClosableReentrantLock();
    public volatile long e = SystemClock.uptimeMillis();
    public final AtomicInteger f = new AtomicInteger();
    public volatile MainThreadState g = MainThreadState.IDLE;
    public volatile u0 i = r2.a;
    public volatile Thread k = null;
    public volatile boolean l = false;
    public volatile boolean m = false;

    public enum MainThreadState {
        IDLE,
        SUSPICIOUS,
        ANR_DETECTED
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.j = sentryAndroidOptions;
        this.i = b6Var.getLogger();
        if (this.j.isAnrProfilingEnabled()) {
            if (this.j.getCacheDirPath() == null) {
                this.i.i(SentryLevel.WARNING, "ANR Profiling is enabled but cacheDirPath is not set", new Object[0]);
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            this.o = mainLooper.getThread();
            this.n = new Handler(mainLooper);
            io.sentry.config.a.a("AnrProfiling");
            c0.e.b(this);
        }
    }

    @Override // io.sentry.android.core.a0
    public final void b() {
        if (this.a.get()) {
            r rVarA = this.c.a();
            try {
                if (this.m) {
                    rVarA.close();
                    return;
                }
                this.m = true;
                this.b.run();
                Thread thread = this.k;
                if (thread != null && thread.isAlive()) {
                    synchronized (this) {
                        notifyAll();
                    }
                }
                if (thread == null || !thread.isAlive()) {
                    Thread thread2 = new Thread(this, "AnrProfilingIntegration");
                    thread2.setDaemon(true);
                    thread2.start();
                    this.k = thread2;
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
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.set(false);
        c0.e.k(this);
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacks(this.b);
        }
        Thread thread = this.k;
        if (thread != null) {
            synchronized (this) {
                notifyAll();
            }
            thread.interrupt();
        }
        SentryAndroidOptions sentryAndroidOptions = this.j;
        r rVarA = this.d.a();
        try {
            d dVar = this.h;
            this.h = null;
            rVarA.close();
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new r59(this, dVar, 10));
                } catch (Throwable unused) {
                    this.i.i(SentryLevel.WARNING, "Failed to submit AnrProfileManager close", new Object[0]);
                }
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

    public final void d(Thread thread) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.e;
        if (jUptimeMillis < 1000) {
            this.g = MainThreadState.IDLE;
            this.l = false;
        }
        if (this.g == MainThreadState.IDLE && jUptimeMillis > 1000) {
            u0 u0Var = this.i;
            SentryLevel sentryLevel = SentryLevel.DEBUG;
            if (u0Var.l(sentryLevel)) {
                this.i.i(sentryLevel, "ANR: main thread is suspicious", new Object[0]);
            }
            this.g = MainThreadState.SUSPICIOUS;
            SentryAndroidOptions sentryAndroidOptions = this.j;
            Double anrProfilingSampleRate = sentryAndroidOptions != null ? sentryAndroidOptions.getAnrProfilingSampleRate() : null;
            if (anrProfilingSampleRate != null && i.a().c() < anrProfilingSampleRate.doubleValue()) {
                this.l = true;
            }
            if (this.l) {
                this.f.set(0);
                k().a.clear();
            }
        }
        if (this.l && (this.g == MainThreadState.SUSPICIOUS || this.g == MainThreadState.ANR_DETECTED)) {
            if (this.f.get() < 151) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                f fVar = new f(System.currentTimeMillis(), thread.getStackTrace());
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
                u0 u0Var2 = this.i;
                SentryLevel sentryLevel2 = SentryLevel.DEBUG;
                if (u0Var2.l(sentryLevel2)) {
                    this.i.i(sentryLevel2, "AnrWatchdog: capturing main thread stacktrace took " + jUptimeMillis3 + "ms", new Object[0]);
                }
                if (this.a.get()) {
                    this.f.incrementAndGet();
                    k().a.d(fVar);
                }
            } else {
                u0 u0Var3 = this.i;
                SentryLevel sentryLevel3 = SentryLevel.DEBUG;
                if (u0Var3.l(sentryLevel3)) {
                    this.i.i(sentryLevel3, "ANR: reached maximum number of collected stack traces, skipping further collection", new Object[0]);
                }
            }
        }
        if (this.g != MainThreadState.SUSPICIOUS || jUptimeMillis <= 4000) {
            return;
        }
        u0 u0Var4 = this.i;
        SentryLevel sentryLevel4 = SentryLevel.DEBUG;
        if (u0Var4.l(sentryLevel4)) {
            this.i.i(sentryLevel4, "ANR: main thread ANR threshold reached", new Object[0]);
        }
        this.g = MainThreadState.ANR_DETECTED;
    }

    @Override // io.sentry.android.core.a0
    public final void g() {
        if (this.a.get()) {
            r rVarA = this.c.a();
            try {
                this.m = false;
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
    }

    public final d k() {
        r rVarA = this.d.a();
        try {
            if (this.h == null) {
                SentryAndroidOptions sentryAndroidOptions = this.j;
                io.sentry.config.a.W(sentryAndroidOptions, "Options can't be null");
                String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
                if (cacheDirPath == null) {
                    throw new IllegalStateException("cacheDirPath is required for ANR profiling");
                }
                File file = new File(cacheDirPath);
                e.b(file);
                this.h = new d(sentryAndroidOptions, new File(file, "anr_profile"));
            }
            d dVar = this.h;
            rVarA.close();
            return dVar;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.n;
        Thread thread = this.o;
        if (handler == null || thread == null) {
            return;
        }
        while (this.a.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    if (this.m) {
                        d(thread);
                        handler.removeCallbacks(this.b);
                        handler.post(this.b);
                        Thread.sleep(66L);
                    } else {
                        synchronized (this) {
                            while (!this.m && this.a.get()) {
                                try {
                                    wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        this.b.run();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable th2) {
                this.i.f(SentryLevel.WARNING, "Failed to execute AnrStacktraceIntegration", th2);
                return;
            }
        }
    }
}
