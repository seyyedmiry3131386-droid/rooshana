package io.sentry.android.core;

import io.sentry.SentryLevel;
import io.sentry.b6;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends io.sentry.metrics.c implements a0 {
    @Override // io.sentry.metrics.c, io.sentry.metrics.a
    public final void a(boolean z) {
        c0.e.k(this);
        super.a(z);
    }

    @Override // io.sentry.android.core.a0
    public final void b() {
    }

    @Override // io.sentry.android.core.a0
    public final void g() {
        b6 b6Var = this.a;
        try {
            b6Var.getExecutorService().submit(new l(this, 1));
        } catch (Throwable th) {
            b6Var.getLogger().e(SentryLevel.ERROR, th, "Failed to submit metrics flush in onBackground()", new Object[0]);
        }
    }
}
