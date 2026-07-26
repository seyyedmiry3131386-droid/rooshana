package io.sentry.hints;

import io.sentry.SentryLevel;
import io.sentry.protocol.v;
import io.sentry.u0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements e {
    public final CountDownLatch a = new CountDownLatch(1);
    public final long b;
    public final u0 c;

    public c(long j, u0 u0Var) {
        this.b = j;
        this.c = u0Var;
    }

    @Override // io.sentry.hints.e
    public final boolean d() {
        try {
            return this.a.await(this.b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.c.f(SentryLevel.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
            return false;
        }
    }

    public abstract boolean f(v vVar);

    public abstract void g(v vVar);
}
