package io.sentry.android.core;

import defpackage.rm7;
import io.sentry.IConnectionStatusProvider$ConnectionStatus;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.c4;
import io.sentry.d4;
import io.sentry.e4;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class SendCachedEnvelopeIntegration implements io.sentry.q1, io.sentry.n0, Closeable {
    public final e4 a;
    public final io.sentry.util.e b;
    public io.sentry.o0 d;
    public c4 e;
    public SentryAndroidOptions f;
    public d4 g;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final AutoClosableReentrantLock j = new AutoClosableReentrantLock();

    public SendCachedEnvelopeIntegration(e4 e4Var, io.sentry.util.e eVar) {
        this.a = e4Var;
        this.b = eVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0020. Please report as an issue. */
    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        c4 c4Var = c4.a;
        this.e = c4Var;
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f = sentryAndroidOptions;
        String cacheDirPath = b6Var.getCacheDirPath();
        io.sentry.u0 logger = b6Var.getLogger();
        switch (this.a.a) {
        }
        if (!rm7.c(logger, cacheDirPath)) {
            b6Var.getLogger().i(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.config.a.a("SendCachedEnvelope");
            b(c4Var, this.f);
        }
    }

    public final void b(c4 c4Var, SentryAndroidOptions sentryAndroidOptions) {
        try {
            io.sentry.r rVarA = this.j.a();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new e1(this, sentryAndroidOptions, c4Var, 0));
                if (((Boolean) this.b.a()).booleanValue() && this.c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                rVarA.close();
            } finally {
            }
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i.set(true);
        io.sentry.o0 o0Var = this.d;
        if (o0Var != null) {
            o0Var.S0(this);
        }
    }

    @Override // io.sentry.n0
    public final void g(IConnectionStatusProvider$ConnectionStatus iConnectionStatusProvider$ConnectionStatus) {
        SentryAndroidOptions sentryAndroidOptions;
        c4 c4Var = this.e;
        if (c4Var == null || (sentryAndroidOptions = this.f) == null || iConnectionStatusProvider$ConnectionStatus == IConnectionStatusProvider$ConnectionStatus.DISCONNECTED) {
            return;
        }
        b(c4Var, sentryAndroidOptions);
    }
}
