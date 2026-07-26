package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f42 extends g42 implements qi1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(f42.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(f42.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(f42.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // defpackage.y61
    public final void U(w61 w61Var, Runnable runnable) {
        b1(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // defpackage.g42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long U0() {
        /*
            r10 = this;
            mu3 r0 = defpackage.tv8.c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.f42.g
            boolean r2 = r10.Y0()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.e1()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof defpackage.gd4
            if (r6 == 0) goto L3e
            r6 = r2
            gd4 r6 = (defpackage.gd4) r6
            java.lang.Object r7 = r6.d()
            mu3 r8 = defpackage.gd4.g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            gd4 r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            ov r2 = r10.e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof defpackage.gd4
            if (r2 == 0) goto L8d
            gd4 r1 = (defpackage.gd4) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.gd4.f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.f42.h
            java.lang.Object r0 = r0.get(r10)
            e42 r0 = (defpackage.e42) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            d42[] r1 = r0.a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.a
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f42.U0():long");
    }

    public void b1(Runnable runnable) {
        e1();
        if (!h1(runnable)) {
            me1.j.b1(runnable);
            return;
        }
        Thread threadN0 = N0();
        if (Thread.currentThread() != threadN0) {
            LockSupport.unpark(threadN0);
        }
    }

    @Override // defpackage.qi1
    public bq1 d(long j, Runnable runnable, w61 w61Var) {
        return ne1.a.d(j, runnable, w61Var);
    }

    public final void e1() {
        d42 d42VarC;
        e42 e42Var = (e42) h.get(this);
        if (e42Var == null || wk8.b.get(e42Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (e42Var) {
                try {
                    d42[] d42VarArr = e42Var.a;
                    d42 d42Var = d42VarArr != null ? d42VarArr[0] : null;
                    if (d42Var != null) {
                        d42VarC = ((jNanoTime - d42Var.a) > 0L ? 1 : ((jNanoTime - d42Var.a) == 0L ? 0 : -1)) >= 0 ? h1(d42Var) : false ? e42Var.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (d42VarC != null);
    }

    public final boolean h1(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (i.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof gd4)) {
                        if (obj != tv8.c) {
                            gd4 gd4Var = new gd4(8, true);
                            gd4Var.a((Runnable) obj);
                            gd4Var.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gd4Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    gd4 gd4Var2 = (gd4) obj;
                    int iA = gd4Var2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        gd4 gd4VarC = gd4Var2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gd4VarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j1() {
        /*
            r7 = this;
            ov r0 = r7.e
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.f42.h
            java.lang.Object r0 = r0.get(r7)
            e42 r0 = (defpackage.e42) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.wk8.b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.f42.g
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof defpackage.gd4
            if (r3 == 0) goto L4f
            gd4 r0 = (defpackage.gd4) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.gd4.f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            mu3 r3 = defpackage.tv8.c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f42.j1():boolean");
    }

    public final void l1(long j, d42 d42Var) {
        int iD;
        Thread threadN0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        if (i.get(this) == 1) {
            iD = 1;
        } else {
            e42 e42Var = (e42) atomicReferenceFieldUpdater.get(this);
            if (e42Var == null) {
                e42 e42Var2 = new e42();
                e42Var2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, e42Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                js3.m(obj);
                e42Var = (e42) obj;
            }
            iD = d42Var.d(j, e42Var, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                a1(j, d42Var);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        e42 e42Var3 = (e42) atomicReferenceFieldUpdater.get(this);
        if (e42Var3 != null) {
            synchronized (e42Var3) {
                d42[] d42VarArr = e42Var3.a;
                d42Var = d42VarArr != null ? d42VarArr[0] : null;
            }
        }
        if (d42Var != d42Var || Thread.currentThread() == (threadN0 = N0())) {
            return;
        }
        LockSupport.unpark(threadN0);
    }

    @Override // defpackage.g42
    public void shutdown() {
        d42 d42VarC;
        tk8.a.set(null);
        i.set(this, 1);
        mu3 mu3Var = tv8.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof gd4)) {
                    if (obj != mu3Var) {
                        gd4 gd4Var = new gd4(8, true);
                        gd4Var.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gd4Var)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((gd4) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mu3Var)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (U0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            e42 e42Var = (e42) h.get(this);
            if (e42Var == null) {
                return;
            }
            synchronized (e42Var) {
                d42VarC = wk8.b.get(e42Var) > 0 ? e42Var.c(0) : null;
            }
            if (d42VarC == null) {
                return;
            } else {
                a1(jNanoTime, d42VarC);
            }
        }
    }

    @Override // defpackage.qi1
    public final void u(long j, om0 om0Var) {
        long jL = tv8.l(j);
        if (jL < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            b42 b42Var = new b42(this, jL + jNanoTime, om0Var);
            l1(jNanoTime, b42Var);
            om0Var.y(new im0(2, b42Var));
        }
    }
}
