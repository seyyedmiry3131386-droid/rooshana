package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public interface g1 {
    void a(long j);

    void b();

    Future c(Runnable runnable, long j);

    boolean isClosed();

    Future submit(Runnable runnable);
}
