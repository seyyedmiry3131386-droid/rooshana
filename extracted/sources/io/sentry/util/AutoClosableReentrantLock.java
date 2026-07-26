package io.sentry.util;

import io.sentry.r;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoClosableReentrantLock extends ReentrantLock {
    private static final long serialVersionUID = -3283069816958445549L;

    public final r a() {
        lock();
        return new r(1, this);
    }
}
