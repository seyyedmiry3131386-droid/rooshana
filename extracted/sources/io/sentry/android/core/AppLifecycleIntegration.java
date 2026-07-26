package io.sentry.android.core;

import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLifecycleIntegration implements io.sentry.q1, Closeable {
    public final AutoClosableReentrantLock a = new AutoClosableReentrantLock();
    public volatile s0 b;
    public SentryAndroidOptions c;

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.c = sentryAndroidOptions;
        io.sentry.u0 logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.i(sentryLevel, "enableSessionTracking enabled: %s", Boolean.valueOf(this.c.isEnableAutoSessionTracking()));
        this.c.getLogger().i(sentryLevel, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.c.isEnableAppLifecycleBreadcrumbs()));
        if (this.c.isEnableAutoSessionTracking() || this.c.isEnableAppLifecycleBreadcrumbs()) {
            io.sentry.r rVarA = this.a.a();
            try {
                if (this.b != null) {
                    rVarA.close();
                    return;
                }
                this.b = new s0(this.c.isEnableAutoSessionTracking(), this.c.isEnableAppLifecycleBreadcrumbs(), this.c.getSessionTrackingIntervalMillis());
                c0.e.b(this.b);
                rVarA.close();
                b6Var.getLogger().i(sentryLevel, "AppLifecycleIntegration installed.", new Object[0]);
                io.sentry.config.a.a("AppLifecycle");
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
        io.sentry.r rVarA = this.a.a();
        try {
            s0 s0Var = this.b;
            this.b = null;
            rVarA.close();
            if (s0Var != null) {
                c0.e.k(s0Var);
                SentryAndroidOptions sentryAndroidOptions = this.c;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            c0.e.u();
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
