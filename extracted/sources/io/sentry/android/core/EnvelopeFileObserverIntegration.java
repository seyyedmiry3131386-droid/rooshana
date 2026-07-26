package io.sentry.android.core;

import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.c4;
import io.sentry.j3;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EnvelopeFileObserverIntegration implements io.sentry.q1, Closeable {
    public p0 a;
    public io.sentry.u0 b;
    public boolean c = false;
    public final AutoClosableReentrantLock d = new AutoClosableReentrantLock();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        public /* synthetic */ OutboxEnvelopeFileObserverIntegration(int i) {
            this();
        }
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        this.b = b6Var.getLogger();
        String outboxPath = b6Var.getOutboxPath();
        if (outboxPath == null) {
            this.b.i(SentryLevel.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.b.i(SentryLevel.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            b6Var.getExecutorService().submit(new e1(this, b6Var, outboxPath, 3));
        } catch (Throwable th) {
            this.b.f(SentryLevel.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }

    public final void b(b6 b6Var, String str) {
        p0 p0Var = new p0(str, new j3(c4.a, b6Var.getEnvelopeReader(), b6Var.getSerializer(), b6Var.getLogger(), b6Var.getFlushTimeoutMillis(), b6Var.getMaxQueueSize()), b6Var.getLogger(), b6Var.getFlushTimeoutMillis());
        this.a = p0Var;
        try {
            p0Var.startWatching();
            b6Var.getLogger().i(SentryLevel.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.config.a.a("EnvelopeFileObserver");
        } catch (Throwable th) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r rVarA = this.d.a();
        try {
            this.c = true;
            rVarA.close();
            p0 p0Var = this.a;
            if (p0Var != null) {
                p0Var.stopWatching();
                io.sentry.u0 u0Var = this.b;
                if (u0Var != null) {
                    u0Var.i(SentryLevel.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
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
}
