package io.sentry.android.replay;

import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Closeable {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AutoClosableReentrantLock b = new AutoClosableReentrantLock();
    public final RootViewsSpy$listeners$1 c = new RootViewsSpy$listeners$1(this);
    public final RootViewsSpy$delegatingViewList$1 d = new RootViewsSpy$delegatingViewList$1(this);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.set(true);
        this.c.clear();
    }
}
