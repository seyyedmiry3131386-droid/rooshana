package io.sentry.transport;

import defpackage.d1;
import io.sentry.SentryLevel;
import io.sentry.j0;
import io.sentry.n4;
import io.sentry.o4;
import io.sentry.u0;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends ThreadPoolExecutor implements AutoCloseable {
    public final int a;
    public n4 b;
    public final u0 c;
    public final o4 d;
    public final q e;

    public n(int i, j0 j0Var, a aVar, u0 u0Var, o4 o4Var) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), j0Var, aVar);
        this.b = null;
        this.e = new q();
        this.a = i;
        this.c = u0Var;
        this.d = o4Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        q qVar = this.e;
        try {
            super.afterExecute(runnable, th);
        } finally {
            qVar.a();
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        d1.l(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        q qVar = this.e;
        int iA = ReusableCountLatch$Sync.a(qVar.a);
        int i = this.a;
        u0 u0Var = this.c;
        o4 o4Var = this.d;
        if (iA >= i) {
            this.b = o4Var.a();
            u0Var.i(SentryLevel.WARNING, "Submit cancelled", new Object[0]);
            return new m();
        }
        qVar.c();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e) {
            qVar.a();
            this.b = o4Var.a();
            u0Var.f(SentryLevel.WARNING, "Submit rejected by thread pool executor", e);
            return new m();
        }
    }
}
