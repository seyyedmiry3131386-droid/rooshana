package io.sentry.logger;

import defpackage.gg1;
import io.sentry.SentryLogLevel;
import io.sentry.b6;
import io.sentry.g5;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements a, b, c {
    public static final e a = new e();
    public static final e b = new e();

    @Override // io.sentry.logger.c
    public b b(b6 b6Var, gg1 gg1Var) {
        return new d(b6Var, gg1Var);
    }

    @Override // io.sentry.logger.b
    public void a(boolean z) {
    }

    @Override // io.sentry.logger.b
    public void c(long j) {
    }

    @Override // io.sentry.logger.b
    public void d(g5 g5Var) {
    }

    @Override // io.sentry.logger.a
    public void e(SentryLogLevel sentryLogLevel, io.sentry.d dVar, String str, Object... objArr) {
    }
}
