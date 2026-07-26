package io.sentry.android.core;

import android.content.Context;
import defpackage.r59;
import defpackage.ur4;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class AnrIntegration implements io.sentry.q1, Closeable {
    public static a e;
    public static final AutoClosableReentrantLock f = new AutoClosableReentrantLock();
    public final Context a;
    public boolean b = false;
    public final AutoClosableReentrantLock c = new AutoClosableReentrantLock();
    public b6 d;

    public AnrIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        this.d = b6Var;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) b6Var;
        sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.config.a.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new r59(this, sentryAndroidOptions, 5));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().f(SentryLevel.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }

    public final void b(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.r rVarA = f.a();
        try {
            if (e == null) {
                io.sentry.u0 logger = sentryAndroidOptions.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                logger.i(sentryLevel, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                a aVar = new a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new ur4(this, sentryAndroidOptions, 23), sentryAndroidOptions.getLogger(), this.a);
                e = aVar;
                aVar.start();
                sentryAndroidOptions.getLogger().i(sentryLevel, "AnrIntegration installed.", new Object[0]);
            }
            rVarA.close();
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r rVarA = this.c.a();
        try {
            this.b = true;
            rVarA.close();
            rVarA = f.a();
            try {
                a aVar = e;
                if (aVar != null) {
                    aVar.interrupt();
                    e = null;
                    b6 b6Var = this.d;
                    if (b6Var != null) {
                        b6Var.getLogger().i(SentryLevel.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                rVarA.close();
            } finally {
                try {
                    rVarA.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
