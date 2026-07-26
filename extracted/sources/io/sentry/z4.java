package io.sentry;

import defpackage.ad;
import defpackage.kb8;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class z4 implements g1 {
    public final ScheduledThreadPoolExecutor a;
    public final AutoClosableReentrantLock b;
    public final ad c;
    public final b6 d;

    public z4(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, b6 b6Var) {
        this.b = new AutoClosableReentrantLock();
        this.c = new ad(2);
        this.a = scheduledThreadPoolExecutor;
        this.d = b6Var;
    }

    @Override // io.sentry.g1
    public final void a(long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        r rVarA = this.b.a();
        try {
            if (!scheduledThreadPoolExecutor.isShutdown()) {
                scheduledThreadPoolExecutor.shutdown();
                try {
                    if (!scheduledThreadPoolExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        scheduledThreadPoolExecutor.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    Thread.currentThread().interrupt();
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

    @Override // io.sentry.g1
    public final void b() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        try {
            scheduledThreadPoolExecutor.submit(new kb8(7, this));
        } catch (RejectedExecutionException e) {
            b6 b6Var = this.d;
            if (b6Var != null) {
                b6Var.getLogger().f(SentryLevel.WARNING, "Prewarm task rejected from " + scheduledThreadPoolExecutor, e);
            }
        }
    }

    @Override // io.sentry.g1
    public final Future c(Runnable runnable, long j) {
        return this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.g1
    public final boolean isClosed() {
        r rVarA = this.b.a();
        try {
            boolean zIsShutdown = this.a.isShutdown();
            rVarA.close();
            return zIsShutdown;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.g1
    public final Future submit(Runnable runnable) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        if (scheduledThreadPoolExecutor.getQueue().size() >= 271) {
            scheduledThreadPoolExecutor.purge();
        }
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.submit(runnable);
        }
        b6 b6Var = this.d;
        if (b6Var != null) {
            b6Var.getLogger().i(SentryLevel.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new y4();
    }

    public z4(b6 b6Var) {
        this(new ScheduledThreadPoolExecutor(1, new j0(1)), b6Var);
    }

    public z4() {
        this(new ScheduledThreadPoolExecutor(1, new j0(1)), null);
    }
}
