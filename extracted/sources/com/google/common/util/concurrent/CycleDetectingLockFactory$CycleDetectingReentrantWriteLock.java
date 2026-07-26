package com.google.common.util.concurrent;

import defpackage.mi;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
class CycleDetectingLockFactory$CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {
    @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
    public final void lock() {
        mi miVar = d.a;
        throw null;
    }

    @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
    public final void lockInterruptibly() {
        mi miVar = d.a;
        throw null;
    }

    @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
    public final boolean tryLock() {
        mi miVar = d.a;
        throw null;
    }

    @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
    public final void unlock() {
        super.unlock();
        d.a(null);
        throw null;
    }

    @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
    public final boolean tryLock(long j, TimeUnit timeUnit) {
        mi miVar = d.a;
        throw null;
    }
}
