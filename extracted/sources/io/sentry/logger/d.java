package io.sentry.logger;

import defpackage.gg1;
import defpackage.kb8;
import io.sentry.DataCategory;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.clientreport.DiscardReason;
import io.sentry.g5;
import io.sentry.h5;
import io.sentry.k2;
import io.sentry.r;
import io.sentry.transport.q;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.z4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class d implements b {
    public final b6 a;
    public final gg1 b;
    public final ConcurrentLinkedQueue c;
    public final z4 d;
    public volatile Future e;
    public final AutoClosableReentrantLock f;
    public volatile boolean g;
    public volatile boolean h;
    public final q i;

    public d(b6 b6Var, gg1 gg1Var) {
        z4 z4Var = new z4(b6Var);
        this.f = new AutoClosableReentrantLock();
        this.g = false;
        this.h = false;
        this.i = new q();
        this.a = b6Var;
        this.b = gg1Var;
        this.c = new ConcurrentLinkedQueue();
        this.d = z4Var;
    }

    @Override // io.sentry.logger.b
    public void a(boolean z) {
        this.h = true;
        if (z) {
            f(true, true);
            this.d.submit(new kb8(21, this));
        } else {
            this.d.a(this.a.getShutdownTimeoutMillis());
            while (!this.c.isEmpty()) {
                e();
            }
        }
    }

    @Override // io.sentry.logger.b
    public final void c(long j) {
        f(true, true);
        try {
            q qVar = this.i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            qVar.getClass();
            qVar.a.tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e) {
            this.a.getLogger().f(SentryLevel.ERROR, "Failed to flush log events", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.logger.b
    public final void d(g5 g5Var) {
        if (this.h) {
            return;
        }
        if (this.i.b() < 1000) {
            this.i.c();
            this.c.offer(g5Var);
            f(false, false);
        } else {
            io.sentry.clientreport.e clientReportRecorder = this.a.getClientReportRecorder();
            DiscardReason discardReason = DiscardReason.QUEUE_OVERFLOW;
            clientReportRecorder.a(discardReason, DataCategory.LogItem);
            this.a.getClientReportRecorder().h(discardReason, DataCategory.LogByte, io.sentry.util.c.a(this.a.getSerializer(), this.a.getLogger(), g5Var));
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList(100);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
            g5 g5Var = (g5) concurrentLinkedQueue.poll();
            if (g5Var != null) {
                arrayList.add(g5Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        h5 h5Var = new h5(arrayList);
        gg1 gg1Var = this.b;
        gg1Var.getClass();
        try {
            gg1Var.z(gg1Var.p(h5Var), null);
        } catch (IOException e) {
            ((b6) gg1Var.b).getLogger().e(SentryLevel.WARNING, e, "Capturing logs failed.", new Object[0]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            this.i.a();
        }
    }

    public final void f(boolean z, boolean z2) {
        if (!this.g || z) {
            r rVarA = this.f.a();
            try {
                Future future = this.e;
                if (z || future == null || future.isDone() || future.isCancelled()) {
                    this.g = true;
                    try {
                        this.e = this.d.c(new k2(7, this), z2 ? 0 : 5000);
                    } catch (RejectedExecutionException e) {
                        this.g = false;
                        this.a.getLogger().f(SentryLevel.WARNING, "Logs batch processor flush task rejected", e);
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
    }
}
