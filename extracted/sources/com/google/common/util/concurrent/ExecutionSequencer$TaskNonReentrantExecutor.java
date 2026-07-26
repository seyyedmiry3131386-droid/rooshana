package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class ExecutionSequencer$TaskNonReentrantExecutor extends AtomicReference<ExecutionSequencer$RunningState> implements Executor, Runnable {
    public Thread a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == ExecutionSequencer$RunningState.a) {
            return;
        }
        this.a = Thread.currentThread();
        try {
            throw null;
        } catch (Throwable th) {
            this.a = null;
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Thread.currentThread() == this.a) {
            throw null;
        }
        throw null;
    }
}
