package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.lifecycle.Lifecycle$State;
import defpackage.g64;
import io.sentry.SentryLevel;
import io.sentry.SpanStatus;
import io.sentry.b6;
import io.sentry.c4;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class UserInteractionIntegration implements io.sentry.q1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application a;
    public c4 b;
    public final WeakHashMap e = new WeakHashMap();
    public final Object f = new Object();
    public SentryAndroidOptions c;
    public final boolean d = io.sentry.hints.i.i(this.c, "androidx.lifecycle.Lifecycle");

    public UserInteractionIntegration(Application application) {
        this.a = application;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.c = sentryAndroidOptions;
        this.b = c4.a;
        boolean z = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.c.isEnableUserInteractionTracing();
        io.sentry.u0 logger = this.c.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.i(sentryLevel, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            this.a.registerActivityLifecycleCallbacks(this);
            this.c.getLogger().i(sentryLevel, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.config.a.a("UserInteraction");
            if (this.d) {
                Activity activityA = j0.b.a();
                if ((activityA instanceof g64) && ((g64) activityA).D().d == Lifecycle$State.e) {
                    b(activityA);
                }
            }
        }
    }

    public final void b(Activity activity2) {
        Window window = activity2.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().i(SentryLevel.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.b == null || this.c == null) {
            return;
        }
        synchronized (this.f) {
            try {
                WeakReference weakReference = (WeakReference) this.e.get(window);
                if (weakReference == null || weakReference.get() == null) {
                    Window.Callback callback = window.getCallback();
                    if (callback == null) {
                        callback = new io.sentry.android.core.internal.gestures.b();
                    }
                    io.sentry.android.core.internal.gestures.g gVar = new io.sentry.android.core.internal.gestures.g(callback, activity2, new io.sentry.android.core.internal.gestures.f(activity2, this.b, this.c), this.c);
                    window.setCallback(gVar);
                    synchronized (this.f) {
                        this.e.put(window, new WeakReference(gVar));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList<Window> arrayList;
        this.a.unregisterActivityLifecycleCallbacks(this);
        synchronized (this.f) {
            arrayList = new ArrayList(this.e.keySet());
        }
        for (Window window : arrayList) {
            if (window != null) {
                d(window);
            }
        }
        synchronized (this.f) {
            this.e.clear();
        }
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    public final void d(Window window) {
        io.sentry.android.core.internal.gestures.g gVar;
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.g) {
            io.sentry.android.core.internal.gestures.g gVar2 = (io.sentry.android.core.internal.gestures.g) callback;
            gVar2.g = true;
            gVar2.c.d(SpanStatus.CANCELLED);
            gVar2.d.a();
            Window.Callback callback2 = gVar2.b;
            if (callback2 instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
            synchronized (this.f) {
                this.e.remove(window);
            }
            return;
        }
        synchronized (this.f) {
            try {
                WeakReference weakReference = (WeakReference) this.e.remove(window);
                gVar = weakReference != null ? (io.sentry.android.core.internal.gestures.g) weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gVar != null) {
            gVar.g = true;
            gVar.c.d(SpanStatus.CANCELLED);
            gVar.d.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
        Window window = activity2.getWindow();
        if (window != null) {
            d(window);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().i(SentryLevel.INFO, "Window was null in stopTracking", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
        b(activity2);
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
