package io.sentry.metrics;

import defpackage.gg1;
import defpackage.kb8;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.j5;
import io.sentry.k2;
import io.sentry.k5;
import io.sentry.r;
import io.sentry.transport.q;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.z4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class c implements a {
    public final b6 a;
    public final gg1 b;
    public final z4 d;
    public final AutoClosableReentrantLock e = new AutoClosableReentrantLock();
    public final q f = new q();
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();

    public c(b6 b6Var, gg1 gg1Var) {
        this.a = b6Var;
        this.b = gg1Var;
        this.d = new z4(b6Var);
    }

    @Override // io.sentry.metrics.a
    public void a(boolean z) {
        z4 z4Var = this.d;
        if (z) {
            e(true);
            z4Var.submit(new kb8(22, this));
        } else {
            z4Var.a(this.a.getShutdownTimeoutMillis());
            while (!this.c.isEmpty()) {
                d();
            }
        }
    }

    @Override // io.sentry.metrics.a
    public final void c(long j) {
        e(true);
        try {
            q qVar = this.f;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            qVar.getClass();
            qVar.a.tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e) {
            this.a.getLogger().f(SentryLevel.ERROR, "Failed to flush metrics events", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList(1000);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
            j5 j5Var = (j5) concurrentLinkedQueue.poll();
            if (j5Var != null) {
                arrayList.add(j5Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        k5 k5Var = new k5(arrayList);
        gg1 gg1Var = this.b;
        gg1Var.getClass();
        try {
            gg1Var.z(gg1Var.q(k5Var), null);
        } catch (IOException e) {
            ((b6) gg1Var.b).getLogger().e(SentryLevel.WARNING, e, "Capturing metrics failed.", new Object[0]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            this.f.a();
        }
    }

    public final void e(boolean z) {
        r rVarA = this.e.a();
        try {
            try {
                this.d.c(new k2(8, this), z ? 0 : 5000);
            } catch (RejectedExecutionException e) {
                this.a.getLogger().f(SentryLevel.WARNING, "Metrics batch processor flush task rejected", e);
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
