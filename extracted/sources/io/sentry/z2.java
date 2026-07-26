package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
public final class z2 implements g1 {
    public static final z2 a = new z2();

    @Override // io.sentry.g1
    public final void a(long j) {
    }

    @Override // io.sentry.g1
    public final void b() {
    }

    @Override // io.sentry.g1
    public final Future c(Runnable runnable, long j) {
        return new FutureTask(new i0(1));
    }

    @Override // io.sentry.g1
    public final boolean isClosed() {
        return false;
    }

    @Override // io.sentry.g1
    public final Future submit(Runnable runnable) {
        return new FutureTask(new i0(1));
    }
}
