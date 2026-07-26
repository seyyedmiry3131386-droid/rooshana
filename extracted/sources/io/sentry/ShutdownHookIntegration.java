package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShutdownHookIntegration implements q1, Closeable {
    public final Runtime a;
    public Thread b;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        io.sentry.config.a.W(runtime, "Runtime is required");
        this.a = runtime;
    }

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        if (!b6Var.isEnableShutdownHook()) {
            b6Var.getLogger().i(SentryLevel.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.b = new Thread(new f4(b6Var, 3), "sentry-shutdownhook");
        try {
            this.a.addShutdownHook(this.b);
            b6Var.getLogger().i(SentryLevel.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            io.sentry.config.a.a("ShutdownHook");
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != null) {
            try {
                this.a.removeShutdownHook(this.b);
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e;
                }
            }
        }
    }
}
