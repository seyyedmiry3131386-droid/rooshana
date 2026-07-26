package io.sentry.android.ndk;

import defpackage.kb8;
import defpackage.r59;
import io.sentry.SentryLevel;
import io.sentry.a4;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b6;
import io.sentry.f;
import io.sentry.k6;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.g0;
import io.sentry.y3;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a4 {
    public final b6 a;
    public final NativeScope b;

    public b(SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        io.sentry.config.a.W(sentryAndroidOptions, "The SentryOptions object is required.");
        this.a = sentryAndroidOptions;
        this.b = nativeScope;
    }

    @Override // io.sentry.b1
    public final void k(f fVar) {
        b6 b6Var = this.a;
        try {
            b6Var.getExecutorService().submit(new r59(this, fVar, 12));
        } catch (Throwable th) {
            b6Var.getLogger().e(SentryLevel.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.b1
    public final void n(g0 g0Var) {
        b6 b6Var = this.a;
        try {
            b6Var.getExecutorService().submit(new r59(this, g0Var, 13));
        } catch (Throwable th) {
            b6Var.getLogger().e(SentryLevel.ERROR, th, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.a4, io.sentry.b1
    public final void o() {
        b6 b6Var = this.a;
        try {
            b6Var.getExecutorService().submit(new kb8(18, this));
        } catch (Throwable th) {
            b6Var.getLogger().e(SentryLevel.ERROR, th, "Scope sync clearAttachments has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.b1
    public final void p(k6 k6Var, y3 y3Var) {
        b6 b6Var = this.a;
        if (k6Var == null) {
            return;
        }
        try {
            b6Var.getExecutorService().submit(new r59(this, k6Var, 14));
        } catch (Throwable th) {
            b6Var.getLogger().e(SentryLevel.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
        }
    }
}
