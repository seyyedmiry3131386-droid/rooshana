package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkBreadcrumbsIntegration implements io.sentry.q1, Closeable {
    public final Context a;
    public final j0 b;
    public final AutoClosableReentrantLock c = new AutoClosableReentrantLock();
    public volatile x0 d;

    public NetworkBreadcrumbsIntegration(Context context, j0 j0Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = j0Var;
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        io.sentry.u0 logger = b6Var.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.i(sentryLevel, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            this.b.getClass();
            if (Build.VERSION.SDK_INT < 24) {
                b6Var.getLogger().i(sentryLevel, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            io.sentry.r rVarA = this.c.a();
            try {
                this.d = new x0(this.b, b6Var.getDateProvider());
                if (io.sentry.android.core.internal.util.c.d(this.a, b6Var.getLogger(), this.b, this.d)) {
                    b6Var.getLogger().i(sentryLevel, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.config.a.a("NetworkBreadcrumbs");
                } else {
                    b6Var.getLogger().i(sentryLevel, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r rVarA = this.c.a();
        try {
            x0 x0Var = this.d;
            this.d = null;
            rVarA.close();
            if (x0Var != null) {
                io.sentry.r rVarA2 = io.sentry.android.core.internal.util.c.n.a();
                try {
                    io.sentry.android.core.internal.util.c.o.remove(x0Var);
                    rVarA2.close();
                } catch (Throwable th) {
                    try {
                        rVarA2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                rVarA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
