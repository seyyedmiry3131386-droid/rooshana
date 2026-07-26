package io.sentry;

import defpackage.rm7;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 {
    public final /* synthetic */ int a;
    public final io.sentry.android.core.p b;

    public /* synthetic */ e4(io.sentry.android.core.p pVar, int i) {
        this.a = i;
        this.b = pVar;
    }

    public final d4 a(c1 c1Var, b6 b6Var) {
        switch (this.a) {
            case 0:
                io.sentry.config.a.W(c1Var, "Scopes are required");
                io.sentry.config.a.W(b6Var, "SentryOptions is required");
                String cacheDirPath = this.b.b.getCacheDirPath();
                if (cacheDirPath == null || !rm7.c(b6Var.getLogger(), cacheDirPath)) {
                    b6Var.getLogger().i(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
                }
                break;
            default:
                io.sentry.config.a.W(c1Var, "Scopes are required");
                io.sentry.config.a.W(b6Var, "SentryOptions is required");
                String outboxPath = this.b.b.getOutboxPath();
                if (outboxPath == null || !rm7.c(b6Var.getLogger(), outboxPath)) {
                    b6Var.getLogger().i(SentryLevel.ERROR, "No outbox dir path is defined in options.", new Object[0]);
                }
                break;
        }
        return null;
    }
}
