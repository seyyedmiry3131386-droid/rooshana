package kotlinx.coroutines.sync;

import defpackage.at2;
import defpackage.gc9;
import defpackage.ib7;
import defpackage.jm7;
import defpackage.mu3;
import defpackage.nm0;
import defpackage.qn7;
import defpackage.rm7;
import defpackage.rn7;
import defpackage.tx8;
import defpackage.va;
import defpackage.wl7;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(b.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(b.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final va b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public b(int i) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(rm7.n(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(rm7.n(i, "The number of acquired permits should be in 0..").toString());
        }
        rn7 rn7Var = new rn7(0L, null, 2);
        this.head$volatile = rn7Var;
        this.tail$volatile = rn7Var;
        this._availablePermits$volatile = i;
        this.b = new va(10, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.j(r3, r4.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.b.g
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.a
            if (r1 > r2) goto L0
            tx8 r3 = defpackage.tx8.a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            g51 r5 = defpackage.ok4.I(r5)
            om0 r5 = defpackage.s7.z(r5)
            boolean r1 = r4.c(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            va r0 = r4.b     // Catch: java.lang.Throwable -> L3f
            r5.j(r3, r0)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.c(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r5 = r5.u()
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            if (r5 != r0) goto L3a
            goto L3b
        L3a:
            r5 = r3
        L3b:
            if (r5 != r0) goto L3e
            return r5
        L3e:
            return r3
        L3f:
            r0 = move-exception
            r5.C()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean c(gc9 gc9Var) {
        Object objZ;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        rn7 rn7Var = (rn7) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.a;
        long j = andIncrement / ((long) qn7.f);
        loop0: while (true) {
            objZ = at2.Z(rn7Var, j, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!ib7.o(objZ)) {
                wl7 wl7VarM = ib7.m(objZ);
                while (true) {
                    wl7 wl7Var = (wl7) atomicReferenceFieldUpdater.get(this);
                    if (wl7Var.c >= wl7VarM.c) {
                        break loop0;
                    }
                    if (!wl7VarM.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, wl7Var, wl7VarM)) {
                        if (atomicReferenceFieldUpdater.get(this) != wl7Var) {
                            if (wl7VarM.f()) {
                                wl7VarM.e();
                            }
                        }
                    }
                    if (wl7Var.f()) {
                        wl7Var.e();
                    }
                }
            } else {
                break;
            }
        }
        rn7 rn7Var2 = (rn7) ib7.m(objZ);
        AtomicReferenceArray atomicReferenceArray = rn7Var2.e;
        int i = (int) (andIncrement % ((long) qn7.f));
        while (!atomicReferenceArray.compareAndSet(i, null, gc9Var)) {
            if (atomicReferenceArray.get(i) != null) {
                mu3 mu3Var = qn7.b;
                mu3 mu3Var2 = qn7.c;
                while (!atomicReferenceArray.compareAndSet(i, mu3Var, mu3Var2)) {
                    if (atomicReferenceArray.get(i) != mu3Var) {
                        return false;
                    }
                }
                boolean z = gc9Var instanceof nm0;
                tx8 tx8Var = tx8.a;
                if (z) {
                    ((nm0) gc9Var).j(tx8Var, this.b);
                    return true;
                }
                if (gc9Var instanceof jm7) {
                    ((jm7) gc9Var).e(tx8Var);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + gc9Var).toString());
            }
        }
        gc9Var.a(rn7Var2, i);
        return true;
    }

    public final void e() {
        int i;
        Object objZ;
        boolean zB;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            rn7 rn7Var = (rn7) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j = andIncrement2 / ((long) qn7.f);
            SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.a;
            while (true) {
                objZ = at2.Z(rn7Var, j, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
                if (ib7.o(objZ)) {
                    break;
                }
                wl7 wl7VarM = ib7.m(objZ);
                while (true) {
                    wl7 wl7Var = (wl7) atomicReferenceFieldUpdater.get(this);
                    if (wl7Var.c >= wl7VarM.c) {
                        break;
                    }
                    if (!wl7VarM.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, wl7Var, wl7VarM)) {
                        if (atomicReferenceFieldUpdater.get(this) != wl7Var) {
                            if (wl7VarM.f()) {
                                wl7VarM.e();
                            }
                        }
                    }
                    if (wl7Var.f()) {
                        wl7Var.e();
                    }
                }
            }
            rn7 rn7Var2 = (rn7) ib7.m(objZ);
            AtomicReferenceArray atomicReferenceArray = rn7Var2.e;
            rn7Var2.a();
            zB = false;
            if (rn7Var2.c <= j) {
                int i3 = (int) (andIncrement2 % ((long) qn7.f));
                Object andSet = atomicReferenceArray.getAndSet(i3, qn7.b);
                if (andSet == null) {
                    int i4 = qn7.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == qn7.c) {
                            zB = true;
                            break;
                        }
                    }
                    mu3 mu3Var = qn7.b;
                    mu3 mu3Var2 = qn7.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, mu3Var, mu3Var2)) {
                            if (atomicReferenceArray.get(i3) != mu3Var) {
                                break;
                            }
                        } else {
                            zB = true;
                            break;
                        }
                    }
                    zB = !zB;
                } else if (andSet != qn7.e) {
                    boolean z = andSet instanceof nm0;
                    tx8 tx8Var = tx8.a;
                    if (z) {
                        nm0 nm0Var = (nm0) andSet;
                        mu3 mu3VarF = nm0Var.f(tx8Var, this.b);
                        if (mu3VarF != null) {
                            nm0Var.p(mu3VarF);
                            zB = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof jm7)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zB = ((jm7) andSet).b(this, tx8Var);
                    }
                }
            }
        } while (!zB);
    }
}
