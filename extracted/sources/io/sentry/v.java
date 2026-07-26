package io.sentry;

import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements io.sentry.hints.d, io.sentry.hints.g, io.sentry.hints.j, io.sentry.hints.e {
    public boolean a = false;
    public boolean b = false;
    public final CountDownLatch c = new CountDownLatch(1);
    public final long d;
    public final u0 e;
    public final String f;
    public final Queue g;

    public v(long j, u0 u0Var, String str, Queue queue) {
        this.d = j;
        this.f = str;
        this.g = queue;
        this.e = u0Var;
    }

    @Override // io.sentry.hints.g
    public final boolean a() {
        return this.a;
    }

    @Override // io.sentry.hints.j
    public final void b(boolean z) {
        this.b = z;
        this.c.countDown();
    }

    @Override // io.sentry.hints.g
    public final void c(boolean z) {
        this.a = z;
    }

    @Override // io.sentry.hints.e
    public final boolean d() {
        try {
            return this.c.await(this.d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.e.f(SentryLevel.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.j
    public final boolean e() {
        return this.b;
    }
}
