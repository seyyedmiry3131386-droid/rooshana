package com.google.common.util.concurrent;

import defpackage.l91;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
final class CycleDetectingLockFactory$CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements l91 {
    @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
    public final /* bridge */ /* synthetic */ Lock readLock() {
        return null;
    }

    @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
    public final /* bridge */ /* synthetic */ Lock writeLock() {
        return null;
    }

    @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
    public final ReentrantReadWriteLock.ReadLock readLock() {
        return null;
    }

    @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
    public final ReentrantReadWriteLock.WriteLock writeLock() {
        return null;
    }
}
