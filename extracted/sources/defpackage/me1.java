package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class me1 extends f42 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final me1 j;
    public static final long k;

    static {
        Long l;
        me1 me1Var = new me1();
        j = me1Var;
        me1Var.R0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        k = timeUnit.toNanos(l.longValue());
    }

    @Override // defpackage.g42
    public final Thread N0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(j.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.g42
    public final void a1(long j2, d42 d42Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.f42
    public final void b1(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.b1(runnable);
    }

    @Override // defpackage.f42, defpackage.qi1
    public final bq1 d(long j2, Runnable runnable, w61 w61Var) {
        long jL = tv8.l(j2);
        if (jL >= 4611686018427387903L) {
            return lo5.a;
        }
        long jNanoTime = System.nanoTime();
        c42 c42Var = new c42(runnable, jL + jNanoTime);
        l1(jNanoTime, c42Var);
        return c42Var;
    }

    public final synchronized void o1() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            f42.g.set(this, null);
            f42.h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zJ1;
        tk8.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zJ1) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jU0 = U0();
                    if (jU0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = k + jNanoTime;
                        }
                        long j3 = j2 - jNanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            o1();
                            if (j1()) {
                                return;
                            }
                            N0();
                            return;
                        }
                        if (jU0 > j3) {
                            jU0 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (jU0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            o1();
                            if (j1()) {
                                return;
                            }
                            N0();
                            return;
                        }
                        LockSupport.parkNanos(this, jU0);
                    }
                }
            }
        } finally {
            _thread = null;
            o1();
            if (!j1()) {
                N0();
            }
        }
    }

    @Override // defpackage.f42, defpackage.g42
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.y61
    public final String toString() {
        return "DefaultExecutor";
    }
}
