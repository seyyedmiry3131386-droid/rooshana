package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.HandlerThread;
import defpackage.kb8;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.c4;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemEventsBreadcrumbsIntegration implements io.sentry.q1, Closeable, a0 {
    public final Context a;
    public volatile u1 b;
    public SentryAndroidOptions c;
    public c4 d;
    public final String[] e;
    public volatile boolean f = false;
    public volatile boolean g = false;
    public volatile IntentFilter h = null;
    public volatile HandlerThread i = null;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final AutoClosableReentrantLock k = new AutoClosableReentrantLock();
    public t1 l;

    public SystemEventsBreadcrumbsIntegration(Context context) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext == null ? context : applicationContext;
        this.e = strArr;
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.c = sentryAndroidOptions;
        this.d = c4.a;
        sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.c.isEnableSystemEventBreadcrumbs()));
        if (this.c.isEnableSystemEventBreadcrumbs()) {
            c0.e.b(this);
            if (i0.i()) {
                d(this.d, this.c);
            }
        }
    }

    @Override // io.sentry.android.core.a0
    public final void b() {
        if (this.d == null || this.c == null) {
            return;
        }
        this.g = false;
        d(this.d, this.c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r rVarA = this.k.a();
        try {
            this.f = true;
            this.h = null;
            if (this.i != null) {
                this.i.quit();
            }
            this.i = null;
            rVarA.close();
            c0.e.k(this);
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new kb8(14, this));
                } catch (RejectedExecutionException unused) {
                    k(this.c);
                }
            }
            SentryAndroidOptions sentryAndroidOptions2 = this.c;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().i(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(c4 c4Var, SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f && !this.g && this.b == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new e1(this, c4Var, sentryAndroidOptions));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().i(SentryLevel.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.android.core.a0
    public final void g() {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new kb8(14, this));
        } catch (RejectedExecutionException unused) {
            k(this.c);
        }
    }

    public final void k(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.r rVarA = this.k.a();
        try {
            this.g = true;
            u1 u1Var = this.b;
            this.b = null;
            rVarA.close();
            if (u1Var != null) {
                try {
                    this.a.unregisterReceiver(u1Var);
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().e(SentryLevel.ERROR, th, "Failed to unregister SystemEventsBroadcastReceiver", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
