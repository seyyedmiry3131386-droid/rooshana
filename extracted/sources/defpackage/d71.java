package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;

/* JADX INFO: loaded from: classes3.dex */
public final class d71 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(d71.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(d71.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(d71.class, "_isTerminated$volatile");
    public static final mu3 k = new mu3("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final st2 e;
    public final st2 f;
    public final e67 g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public d71(int i2, int i3, long j2, String str) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(bl4.q(i2, "Core pool size ", " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(dw1.j(i3, i2, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(bl4.q(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.e = new st2();
        this.f = new st2();
        this.g = new e67((i2 + 1) * 2);
        this.controlState$volatile = ((long) i2) << 42;
    }

    public static /* synthetic */ void g(d71 d71Var, Runnable runnable, int i2) {
        d71Var.d(runnable, false, (i2 & 4) == 0);
    }

    public final int b() {
        synchronized (this.g) {
            try {
                if (j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.a) {
                    return 0;
                }
                if (i2 >= this.b) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.g.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c71 c71Var = new c71(this, i4);
                this.g.c(i4, c71Var);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                c71Var.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.d71.j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.c71
            r3 = 0
            if (r1 == 0) goto L17
            c71 r0 = (defpackage.c71) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            d71 r1 = r0.h
            boolean r1 = defpackage.js3.i(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            e67 r1 = r8.g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.d71.i     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            e67 r5 = r8.g
            java.lang.Object r5 = r5.b(r1)
            defpackage.js3.m(r5)
            c71 r5 = (defpackage.c71) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            lg9 r5 = r5.a
            st2 r6 = r8.f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.lg9.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            ze8 r7 = (defpackage.ze8) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            ze8 r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            st2 r1 = r8.f
            r1.b()
            st2 r1 = r8.e
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            ze8 r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            st2 r1 = r8.e
            java.lang.Object r1 = r1.d()
            ze8 r1 = (defpackage.ze8) r1
            if (r1 != 0) goto Lb2
            st2 r1 = r8.f
            java.lang.Object r1 = r1.d()
            ze8 r1 = (defpackage.ze8) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState.e
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.d71.h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.d71.i
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d71.close():void");
    }

    public final void d(Runnable runnable, boolean z, boolean z2) {
        ze8 ef8Var;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState;
        if8.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof ze8) {
            ef8Var = (ze8) runnable;
            ef8Var.a = jNanoTime;
            ef8Var.b = z;
        } else {
            ef8Var = new ef8(runnable, jNanoTime, z);
        }
        boolean z3 = ef8Var.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        c71 c71Var = threadCurrentThread instanceof c71 ? (c71) threadCurrentThread : null;
        if (c71Var == null || !js3.i(c71Var.h, this)) {
            c71Var = null;
        }
        if (c71Var != null && (coroutineScheduler$WorkerState = c71Var.c) != CoroutineScheduler$WorkerState.e && (ef8Var.b || coroutineScheduler$WorkerState != CoroutineScheduler$WorkerState.b)) {
            c71Var.g = true;
            lg9 lg9Var = c71Var.a;
            if (z2) {
                ef8Var = lg9Var.a(ef8Var);
            } else {
                lg9Var.getClass();
                ze8 ze8Var = (ze8) lg9.b.getAndSet(lg9Var, ef8Var);
                ef8Var = ze8Var == null ? null : lg9Var.a(ze8Var);
            }
        }
        if (ef8Var != null) {
            if (!(ef8Var.b ? this.f.a(ef8Var) : this.e.a(ef8Var))) {
                throw new RejectedExecutionException(dw1.s(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z3) {
            if (y() || u(jAddAndGet)) {
                return;
            }
            y();
            return;
        }
        if (y() || u(atomicLongFieldUpdater.get(this))) {
            return;
        }
        y();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(this, runnable, 6);
    }

    public final void k(c71 c71Var, int i2, int i3) {
        while (true) {
            long j2 = h.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object objC = c71Var.c();
                    while (true) {
                        if (objC == k) {
                            i4 = -1;
                            break;
                        }
                        if (objC == null) {
                            i4 = 0;
                            break;
                        }
                        c71 c71Var2 = (c71) objC;
                        int iB = c71Var2.b();
                        if (iB != 0) {
                            i4 = iB;
                            break;
                        }
                        objC = c71Var2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (h.compareAndSet(this, j2, ((long) i4) | j3)) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        e67 e67Var = this.g;
        int iA = e67Var.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iA; i7++) {
            c71 c71Var = (c71) e67Var.b(i7);
            if (c71Var != null) {
                lg9 lg9Var = c71Var.a;
                lg9Var.getClass();
                int i8 = lg9.b.get(lg9Var) != null ? (lg9.c.get(lg9Var) - lg9.d.get(lg9Var)) + 1 : lg9.c.get(lg9Var) - lg9.d.get(lg9Var);
                int iOrdinal = c71Var.c.ordinal();
                if (iOrdinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i4++;
                } else if (iOrdinal == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6++;
                }
            }
        }
        long j2 = i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(ub1.v(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.a;
        sb4.append(i9);
        sb4.append(", max = ");
        o40.J(sb4, this.b, "}, Worker States {CPU = ", i2, ", blocking = ");
        o40.J(sb4, i3, ", parked = ", i4, ", dormant = ");
        o40.J(sb4, i5, ", terminated = ", i6, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean u(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.a;
        if (i2 < i3) {
            int iB = b();
            if (iB == 1 && i3 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        mu3 mu3Var;
        int iB;
        while (true) {
            long j2 = h.get(this);
            c71 c71Var = (c71) this.g.b((int) (2097151 & j2));
            if (c71Var == null) {
                c71Var = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object objC = c71Var.c();
                while (true) {
                    mu3Var = k;
                    if (objC == mu3Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    c71 c71Var2 = (c71) objC;
                    iB = c71Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = c71Var2.c();
                }
                if (iB >= 0) {
                    if (h.compareAndSet(this, j2, ((long) iB) | j3)) {
                        c71Var.g(mu3Var);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c71Var == null) {
                return false;
            }
            if (c71.i.compareAndSet(c71Var, -1, 0)) {
                LockSupport.unpark(c71Var);
                return true;
            }
        }
    }
}
