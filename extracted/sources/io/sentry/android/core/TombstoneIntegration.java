package io.sentry.android.core;

import android.content.Context;
import io.sentry.SentryLevel;
import io.sentry.b6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public class TombstoneIntegration implements io.sentry.q1, Closeable {
    public final Context a;
    public final io.sentry.transport.d b;
    public SentryAndroidOptions c;

    public TombstoneIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = io.sentry.transport.d.a;
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.c.isTombstoneEnabled()));
        if (this.c.isTombstoneEnabled()) {
            if (this.c.getCacheDirPath() == null) {
                this.c.getLogger().i(SentryLevel.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                io.sentry.g1 executorService = b6Var.getExecutorService();
                Context context = this.a;
                SentryAndroidOptions sentryAndroidOptions2 = this.c;
                executorService.submit(new g0(context, sentryAndroidOptions2, this.b, new w1(context, sentryAndroidOptions2)));
            } catch (Throwable th) {
                b6Var.getLogger().f(SentryLevel.DEBUG, "Failed to start tombstone processor.", th);
            }
            b6Var.getLogger().i(SentryLevel.DEBUG, "TombstoneIntegration installed.", new Object[0]);
            io.sentry.config.a.a("Tombstone");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }
}
