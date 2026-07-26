package com.google.common.util.concurrent;

import defpackage.b02;
import defpackage.bl4;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {
    public static final b02 a;
    public static final b02 b;

    public static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {
        public final InterruptibleTask a;

        public Blocker(TrustedListenableFutureTask$TrustedFutureInterruptibleTask trustedListenableFutureTask$TrustedFutureInterruptibleTask) {
            this.a = trustedListenableFutureTask$TrustedFutureInterruptibleTask;
        }

        public static void a(Blocker blocker, Thread thread) {
            blocker.setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    static {
        int i = 1;
        a = new b02(i);
        b = new b02(i);
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public abstract boolean c();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof Blocker;
            b02 b02Var = b;
            if (!z2 && runnable != b02Var) {
                break;
            }
            if (z2) {
                blocker = (Blocker) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == b02Var || compareAndSet(runnable, b02Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(blocker);
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zC = c();
            b02 b02Var = a;
            if (!zC) {
                try {
                    objE = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, b02Var)) {
                            g(threadCurrentThread);
                        }
                        if (zC) {
                            return;
                        }
                        a(th);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, b02Var)) {
                            g(threadCurrentThread);
                        }
                        if (!zC) {
                            b(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbE = bl4.E(str, ", ");
        sbE.append(f());
        return sbE.toString();
    }
}
