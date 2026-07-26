package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import defpackage.fv1;
import defpackage.q59;
import defpackage.s59;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.c4;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppComponentsBreadcrumbsIntegration implements io.sentry.q1, Closeable, ComponentCallbacks2 {
    public static final io.sentry.h0 e = new io.sentry.h0();
    public final Context a;
    public c4 b;
    public SentryAndroidOptions c;
    public final fv1 d = new fv1(0, 60000);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        this.b = c4.a;
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.c = sentryAndroidOptions;
        io.sentry.u0 logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.i(sentryLevel, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.c.isEnableAppComponentBreadcrumbs()));
        if (this.c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.a.registerComponentCallbacks(this);
                b6Var.getLogger().i(sentryLevel, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.config.a.a("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.c.setEnableAppComponentBreadcrumbs(false);
                b6Var.getLogger().e(SentryLevel.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    public final void b(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.c.getLogger().e(SentryLevel.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().e(SentryLevel.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().i(SentryLevel.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        b(new q59(this, System.currentTimeMillis(), configuration));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 40 && !this.d.a()) {
            b(new s59(this, System.currentTimeMillis(), i, 2));
        }
    }
}
