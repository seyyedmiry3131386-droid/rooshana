package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.c4;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityBreadcrumbsIntegration implements io.sentry.q1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application a;
    public c4 b;
    public boolean c;
    public final AutoClosableReentrantLock d = new AutoClosableReentrantLock();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.a = application;
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.b = c4.a;
        this.c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        io.sentry.u0 logger = b6Var.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.i(sentryLevel, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.c));
        if (this.c) {
            this.a.registerActivityLifecycleCallbacks(this);
            b6Var.getLogger().i(sentryLevel, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.config.a.a("ActivityBreadcrumbs");
        }
    }

    public final void b(Activity activity2, String str) {
        if (this.b == null) {
            return;
        }
        io.sentry.f fVar = new io.sentry.f();
        fVar.e = "navigation";
        fVar.c(str, "state");
        fVar.c(activity2.getClass().getSimpleName(), "screen");
        fVar.g = "ui.lifecycle";
        fVar.i = SentryLevel.INFO;
        io.sentry.h0 h0Var = new io.sentry.h0();
        h0Var.d(activity2, "android:activity");
        this.b.h(fVar, h0Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            this.a.unregisterActivityLifecycleCallbacks(this);
            c4 c4Var = this.b;
            if (c4Var != null) {
                c4Var.m().getLogger().i(SentryLevel.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
        io.sentry.r rVarA = this.d.a();
        try {
            b(activity2, "created");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
        io.sentry.r rVarA = this.d.a();
        try {
            b(activity2, "destroyed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
        io.sentry.r rVarA = this.d.a();
        try {
            b(activity2, "paused");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
        io.sentry.r rVarA = this.d.a();
        try {
            b(activity2, "resumed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
        io.sentry.r rVarA = this.d.a();
        try {
            b(activity2, "saveInstanceState");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity2) {
        io.sentry.r rVarA = this.d.a();
        try {
            b(activity2, "started");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity2) {
        io.sentry.r rVarA = this.d.a();
        try {
            b(activity2, "stopped");
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
