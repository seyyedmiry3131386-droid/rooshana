package io.sentry.backpressure;

import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.c4;
import io.sentry.g1;
import io.sentry.r;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b, Runnable {
    public final b6 a;
    public final c4 b;
    public int c;
    public volatile Future d;
    public final AutoClosableReentrantLock e;

    public a(b6 b6Var) {
        c4 c4Var = c4.a;
        this.c = 0;
        this.d = null;
        this.e = new AutoClosableReentrantLock();
        this.a = b6Var;
        this.b = c4Var;
    }

    @Override // io.sentry.backpressure.b
    public final int a() {
        return this.c;
    }

    public final void b(int i) {
        g1 executorService = this.a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        r rVarA = this.e.a();
        try {
            try {
                this.d = executorService.c(this, i);
            } catch (RejectedExecutionException e) {
                this.a.getLogger().f(SentryLevel.WARNING, "Backpressure monitor reschedule task rejected", e);
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

    @Override // io.sentry.backpressure.b
    public final void close() {
        Future future = this.d;
        if (future != null) {
            r rVarA = this.e.a();
            try {
                future.cancel(true);
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

    @Override // java.lang.Runnable
    public final void run() {
        boolean zF = this.b.f();
        b6 b6Var = this.a;
        if (zF) {
            if (this.c > 0) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.c = 0;
        } else {
            int i = this.c;
            if (i < 10) {
                this.c = i + 1;
                b6Var.getLogger().i(SentryLevel.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.c));
            }
        }
        b(10000);
    }

    @Override // io.sentry.backpressure.b
    public final void start() {
        b(500);
    }
}
