package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.HandlerThread;
import defpackage.f09;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.r2;
import java.io.Closeable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackShakeIntegration implements io.sentry.q1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application a;
    public SentryAndroidOptions c;
    public volatile WeakReference d;
    public volatile Runnable f;
    public volatile boolean e = false;
    public final l1 b = new l1(r2.a);

    public FeedbackShakeIntegration(Application application) {
        this.a = application;
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.c = sentryAndroidOptions;
        if (sentryAndroidOptions.getFeedbackOptions().g) {
            l1 l1Var = this.b;
            Application application = this.a;
            l1Var.f = this.c.getLogger();
            l1Var.a(application);
            io.sentry.config.a.a("FeedbackShake");
            this.a.registerActivityLifecycleCallbacks(this);
            this.c.getLogger().i(SentryLevel.DEBUG, "FeedbackShakeIntegration installed.", new Object[0]);
            Activity activityA = j0.b.a();
            if (activityA != null) {
                this.d = new WeakReference(activityA);
                l1 l1Var2 = this.b;
                if (this.c == null) {
                    return;
                }
                l1Var2.c();
                l1Var2.b(activityA, new f09(13, this));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.unregisterActivityLifecycleCallbacks(this);
        l1 l1Var = this.b;
        l1Var.c();
        HandlerThread handlerThread = l1Var.c;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            l1Var.c = null;
            l1Var.d = null;
        }
        if (this.e) {
            this.e = false;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().h = this.f;
            }
            this.f = null;
        }
        this.d = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
        Activity activity3 = this.d != null ? (Activity) this.d.get() : null;
        if (this.e && activity2 == activity3) {
            this.e = false;
            this.d = null;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().h = this.f;
            }
            this.f = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
        if (activity2 == (this.d != null ? (Activity) this.d.get() : null)) {
            this.b.c();
            if (this.e) {
                return;
            }
            this.d = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
        Activity activity3 = this.d != null ? (Activity) this.d.get() : null;
        if (this.e && activity3 != null && activity3 != activity2) {
            this.e = false;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().h = this.f;
            }
            this.f = null;
        }
        this.d = new WeakReference(activity2);
        l1 l1Var = this.b;
        if (this.c == null) {
            return;
        }
        l1Var.c();
        l1Var.b(activity2, new f09(13, this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity2) {
    }
}
