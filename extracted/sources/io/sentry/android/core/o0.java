package io.sentry.android.core;

import io.sentry.SentryLevel;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements io.sentry.hints.d, io.sentry.hints.g, io.sentry.hints.j, io.sentry.hints.e {
    public final long d;
    public final io.sentry.u0 e;
    public CountDownLatch c = new CountDownLatch(1);
    public boolean a = false;
    public boolean b = false;

    public o0(long j, io.sentry.u0 u0Var) {
        this.d = j;
        io.sentry.config.a.W(u0Var, "ILogger is required.");
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
