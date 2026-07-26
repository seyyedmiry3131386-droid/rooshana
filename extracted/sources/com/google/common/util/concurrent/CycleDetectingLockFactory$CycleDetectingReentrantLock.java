package com.google.common.util.concurrent;

import defpackage.l91;
import defpackage.mi;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
final class CycleDetectingLockFactory$CycleDetectingReentrantLock extends ReentrantLock implements l91 {
    @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
    public final void lock() {
        mi miVar = d.a;
        throw null;
    }

    @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
    public final void lockInterruptibly() {
        mi miVar = d.a;
        throw null;
    }

    @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
    public final boolean tryLock() {
        mi miVar = d.a;
        throw null;
    }

    @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
    public final void unlock() {
        try {
            super.unlock();
        } finally {
            d.a(this);
        }
    }

    @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
    public final boolean tryLock(long j, TimeUnit timeUnit) {
        mi miVar = d.a;
        throw null;
    }
}
