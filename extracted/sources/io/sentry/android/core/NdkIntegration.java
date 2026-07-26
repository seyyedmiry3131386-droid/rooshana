package io.sentry.android.core;

import io.sentry.SentryLevel;
import io.sentry.b6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class NdkIntegration implements io.sentry.q1, Closeable {
    public final Class a;
    public SentryAndroidOptions b;

    public NdkIntegration(Class cls) {
        this.a = cls;
    }

    public static void b(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        Class cls;
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.b = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        io.sentry.u0 logger = this.b.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.i(sentryLevel, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.a) == null) {
            b(this.b);
            return;
        }
        if (this.b.getCacheDirPath() == null) {
            this.b.getLogger().i(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            b(this.b);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.b);
            this.b.getLogger().i(sentryLevel, "NdkIntegration installed.", new Object[0]);
            io.sentry.config.a.a("Ndk");
        } catch (NoSuchMethodException e) {
            b(this.b);
            this.b.getLogger().f(SentryLevel.ERROR, "Failed to invoke the SentryNdk.init method.", e);
        } catch (Throwable th) {
            b(this.b);
            this.b.getLogger().f(SentryLevel.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.a;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.b.getLogger().i(SentryLevel.DEBUG, "NdkIntegration removed.", new Object[0]);
                        b(this.b);
                    } catch (NoSuchMethodException e) {
                        this.b.getLogger().f(SentryLevel.ERROR, "Failed to invoke the SentryNdk.close method.", e);
                        b(this.b);
                    }
                } catch (Throwable th) {
                    this.b.getLogger().f(SentryLevel.ERROR, "Failed to close SentryNdk.", th);
                    b(this.b);
                }
            }
        } catch (Throwable th2) {
            b(this.b);
            throw th2;
        }
    }
}
