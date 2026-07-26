package kotlinx.coroutines.channels;

import defpackage.at2;
import defpackage.bl4;
import defpackage.cp0;
import defpackage.d48;
import defpackage.dp2;
import defpackage.g51;
import defpackage.gc9;
import defpackage.hc9;
import defpackage.hp0;
import defpackage.ib7;
import defpackage.ip0;
import defpackage.jm7;
import defpackage.jp0;
import defpackage.js3;
import defpackage.kp0;
import defpackage.lh0;
import defpackage.mh0;
import defpackage.mu3;
import defpackage.nm0;
import defpackage.o77;
import defpackage.ok4;
import defpackage.om0;
import defpackage.ow6;
import defpackage.s7;
import defpackage.tx8;
import defpackage.wl7;
import defpackage.wu8;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* JADX INFO: loaded from: classes3.dex */
public class a implements cp0 {
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(a.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(a.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(a.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(a.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public a(int i2) {
        this.a = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(bl4.q(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        kp0 kp0Var = mh0.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
        kp0 kp0Var2 = new kp0(0L, null, this, 3);
        this.sendSegment$volatile = kp0Var2;
        this.receiveSegment$volatile = kp0Var2;
        if (D()) {
            kp0Var2 = mh0.a;
            js3.n(kp0Var2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kp0Var2;
        this._closeCause$volatile = mh0.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object G(kotlinx.coroutines.channels.a r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            kotlin.b.b(r14)
            jp0 r14 = (defpackage.jp0) r14
            java.lang.Object r13 = r14.a
            return r13
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            kotlin.b.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = kotlinx.coroutines.channels.a.g
            java.lang.Object r14 = r14.get(r13)
            kp0 r14 = (defpackage.kp0) r14
        L40:
            boolean r1 = r13.A()
            if (r1 == 0) goto L50
            java.lang.Throwable r13 = r13.u()
            hp0 r14 = new hp0
            r14.<init>(r13)
            return r14
        L50:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.a.c
            long r4 = r1.getAndIncrement(r13)
            int r1 = defpackage.mh0.b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.c
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            kp0 r1 = r13.t(r9, r14)
            if (r1 != 0) goto L6b
            goto L40
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r14
        L6e:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.M(r8, r9, r10, r12)
            r1 = r7
            mu3 r14 = defpackage.mh0.m
            if (r13 == r14) goto La0
            mu3 r14 = defpackage.mh0.o
            if (r13 != r14) goto L8d
            long r13 = r1.x()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8a
            r8.a()
        L8a:
            r13 = r1
            r14 = r8
            goto L40
        L8d:
            mu3 r14 = defpackage.mh0.n
            if (r13 != r14) goto L9c
            r6.c = r2
            r2 = r8
            java.lang.Object r13 = r1.H(r2, r3, r4, r6)
            if (r13 != r0) goto L9b
            return r0
        L9b:
            return r13
        L9c:
            r8.a()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.a.G(kotlinx.coroutines.channels.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final kp0 b(a aVar, long j2, kp0 kp0Var) {
        Object objZ;
        a aVar2;
        kp0 kp0Var2 = mh0.a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.a;
        loop0: while (true) {
            objZ = at2.Z(kp0Var, j2, bufferedChannelKt$createSegmentFunction$1);
            if (!ib7.o(objZ)) {
                wl7 wl7VarM = ib7.m(objZ);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    wl7 wl7Var = (wl7) atomicReferenceFieldUpdater.get(aVar);
                    if (wl7Var.c >= wl7VarM.c) {
                        break loop0;
                    }
                    if (!wl7VarM.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(aVar, wl7Var, wl7VarM)) {
                        if (atomicReferenceFieldUpdater.get(aVar) != wl7Var) {
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
        boolean zO = ib7.o(objZ);
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (zO) {
            aVar.B();
            if (kp0Var.c * ((long) mh0.b) < atomicLongFieldUpdater.get(aVar)) {
                kp0Var.a();
                return null;
            }
        } else {
            kp0 kp0Var3 = (kp0) ib7.m(objZ);
            long j3 = kp0Var3.c;
            if (j3 <= j2) {
                return kp0Var3;
            }
            long j4 = ((long) mh0.b) * j3;
            while (true) {
                long j5 = b.get(aVar);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    aVar2 = aVar;
                    break;
                }
                aVar2 = aVar;
                if (b.compareAndSet(aVar2, j5, (((long) ((int) (j5 >> 60))) << 60) + j6)) {
                    break;
                }
                aVar = aVar2;
            }
            if (j3 * ((long) mh0.b) < atomicLongFieldUpdater.get(aVar2)) {
                kp0Var3.a();
            }
        }
        return null;
    }

    public static final void d(a aVar, Object obj, om0 om0Var) {
        om0Var.resumeWith(kotlin.b.a(aVar.w()));
    }

    public static final void f(a aVar, jm7 jm7Var) {
        kp0 kp0Var;
        a aVar2;
        jm7 jm7Var2;
        int i2;
        aVar.getClass();
        kp0 kp0Var2 = (kp0) g.get(aVar);
        while (!aVar.A()) {
            long andIncrement = c.getAndIncrement(aVar);
            long j2 = mh0.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (kp0Var2.c != j3) {
                kp0 kp0VarT = aVar.t(j3, kp0Var2);
                if (kp0VarT == null) {
                    continue;
                } else {
                    kp0Var = kp0VarT;
                    jm7Var2 = jm7Var;
                    i2 = i3;
                    aVar2 = aVar;
                }
            } else {
                kp0Var = kp0Var2;
                aVar2 = aVar;
                jm7Var2 = jm7Var;
                i2 = i3;
            }
            Object objM = aVar2.M(kp0Var, i2, andIncrement, jm7Var2);
            kp0Var2 = kp0Var;
            if (objM == mh0.m) {
                gc9 gc9Var = jm7Var2 != null ? jm7Var2 : null;
                if (gc9Var != null) {
                    gc9Var.a(kp0Var2, i2);
                    return;
                }
                return;
            }
            if (objM != mh0.o) {
                if (objM == mh0.n) {
                    throw new IllegalStateException("unexpected");
                }
                kp0Var2.a();
                jm7Var2.e(objM);
                return;
            }
            if (andIncrement < aVar2.x()) {
                kp0Var2.a();
            }
            aVar = aVar2;
            jm7Var = jm7Var2;
        }
        jm7Var.e(mh0.l);
    }

    public static final int j(a aVar, kp0 kp0Var, int i2, Object obj, long j2, Object obj2, boolean z) {
        kp0Var.n(i2, obj);
        if (z) {
            return aVar.N(kp0Var, i2, obj, j2, obj2, z);
        }
        Object objL = kp0Var.l(i2);
        if (objL == null) {
            if (aVar.k(j2)) {
                if (kp0Var.k(i2, null, mh0.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kp0Var.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof gc9) {
            kp0Var.n(i2, null);
            if (aVar.K(objL, obj)) {
                kp0Var.o(i2, mh0.i);
                return 0;
            }
            mu3 mu3Var = mh0.k;
            if (kp0Var.f.getAndSet((i2 * 2) + 1, mu3Var) == mu3Var) {
                return 5;
            }
            kp0Var.m(i2, true);
            return 5;
        }
        return aVar.N(kp0Var, i2, obj, j2, obj2, z);
    }

    public static void y(a aVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(aVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(aVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        return z(b.get(this), true);
    }

    public boolean B() {
        return z(b.get(this), false);
    }

    public boolean C() {
        return false;
    }

    public final boolean D() {
        long j2 = d.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(long r5, defpackage.kp0 r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            a11 r0 = r7.b()
            kp0 r0 = (defpackage.kp0) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            a11 r5 = r7.b()
            kp0 r5 = (defpackage.kp0) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.channels.a.h
            java.lang.Object r6 = r5.get(r4)
            wl7 r6 = (defpackage.wl7) r6
            long r0 = r6.c
            long r2 = r7.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.a.E(long, kp0):void");
    }

    public final Object F(g51 g51Var, Object obj) {
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        om0Var.resumeWith(kotlin.b.a(w()));
        Object objU = om0Var.u();
        return objU == CoroutineSingletons.a ? objU : tx8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H(defpackage.kp0 r15, int r16, long r17, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.a.H(kp0, int, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public void I(jm7 jm7Var, Object obj) {
        kp0 kp0Var;
        kp0 kp0Var2 = (kp0) f.get(this);
        while (true) {
            long andIncrement = b.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean z = z(andIncrement, false);
            int i2 = mh0.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (kp0Var2.c != j4) {
                kp0 kp0VarB = b(this, j4, kp0Var2);
                if (kp0VarB != null) {
                    kp0Var = kp0VarB;
                } else if (z) {
                    jm7Var.e(mh0.l);
                    return;
                }
            } else {
                kp0Var = kp0Var2;
            }
            jm7 jm7Var2 = jm7Var;
            Object obj2 = obj;
            int iJ = j(this, kp0Var, i3, obj2, j2, jm7Var2, z);
            kp0Var2 = kp0Var;
            tx8 tx8Var = tx8.a;
            if (iJ == 0) {
                kp0Var2.a();
                jm7Var2.e(tx8Var);
                return;
            }
            if (iJ == 1) {
                jm7Var2.e(tx8Var);
                return;
            }
            if (iJ == 2) {
                if (z) {
                    kp0Var2.i();
                    jm7Var2.e(mh0.l);
                    return;
                } else {
                    gc9 gc9Var = jm7Var2 != null ? jm7Var2 : null;
                    if (gc9Var != null) {
                        gc9Var.a(kp0Var2, i3 + i2);
                        return;
                    }
                    return;
                }
            }
            if (iJ == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iJ == 4) {
                if (j2 < c.get(this)) {
                    kp0Var2.a();
                }
                jm7Var2.e(mh0.l);
                return;
            } else {
                if (iJ == 5) {
                    kp0Var2.a();
                }
                obj = obj2;
                jm7Var = jm7Var2;
            }
        }
    }

    public final void J(gc9 gc9Var, boolean z) {
        if (gc9Var instanceof nm0) {
            ((g51) gc9Var).resumeWith(kotlin.b.a(z ? v() : w()));
            return;
        }
        if (gc9Var instanceof ow6) {
            ((ow6) gc9Var).a.resumeWith(new jp0(new hp0(u())));
            return;
        }
        if (!(gc9Var instanceof lh0)) {
            if (gc9Var instanceof jm7) {
                ((jm7) gc9Var).b(this, mh0.l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + gc9Var).toString());
            }
        }
        lh0 lh0Var = (lh0) gc9Var;
        om0 om0Var = lh0Var.b;
        js3.m(om0Var);
        lh0Var.b = null;
        lh0Var.a = mh0.l;
        Throwable thU = lh0Var.c.u();
        if (thU == null) {
            om0Var.resumeWith(Boolean.FALSE);
        } else {
            om0Var.resumeWith(kotlin.b.a(thU));
        }
    }

    public final boolean K(Object obj, Object obj2) {
        if (obj instanceof jm7) {
            return ((jm7) obj).b(this, obj2);
        }
        if (obj instanceof ow6) {
            return mh0.a(((ow6) obj).a, new jp0(obj2), null);
        }
        if (!(obj instanceof lh0)) {
            if (obj instanceof nm0) {
                return mh0.a((nm0) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        lh0 lh0Var = (lh0) obj;
        om0 om0Var = lh0Var.b;
        js3.m(om0Var);
        lh0Var.b = null;
        lh0Var.a = obj2;
        Boolean bool = Boolean.TRUE;
        lh0Var.c.getClass();
        return mh0.a(om0Var, bool, null);
    }

    public final boolean L(Object obj, kp0 kp0Var, int i2) {
        TrySelectDetailedResult trySelectDetailedResult;
        boolean z = obj instanceof nm0;
        tx8 tx8Var = tx8.a;
        if (z) {
            return mh0.a((nm0) obj, tx8Var, null);
        }
        if (!(obj instanceof jm7)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int iL = ((kotlinx.coroutines.selects.b) obj).l(this, tx8Var);
        if (iL == 0) {
            trySelectDetailedResult = TrySelectDetailedResult.a;
        } else if (iL == 1) {
            trySelectDetailedResult = TrySelectDetailedResult.b;
        } else if (iL == 2) {
            trySelectDetailedResult = TrySelectDetailedResult.c;
        } else {
            if (iL != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iL).toString());
            }
            trySelectDetailedResult = TrySelectDetailedResult.d;
        }
        if (trySelectDetailedResult == TrySelectDetailedResult.b) {
            kp0Var.n(i2, null);
        }
        return trySelectDetailedResult == TrySelectDetailedResult.a;
    }

    public final Object M(kp0 kp0Var, int i2, long j2, Object obj) {
        Object objL = kp0Var.l(i2);
        AtomicReferenceArray atomicReferenceArray = kp0Var.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (objL == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return mh0.n;
                }
                if (kp0Var.k(i2, objL, obj)) {
                    s();
                    return mh0.m;
                }
            }
        } else if (objL == mh0.d && kp0Var.k(i2, objL, mh0.i)) {
            s();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            kp0Var.n(i2, null);
            return obj2;
        }
        while (true) {
            Object objL2 = kp0Var.l(i2);
            if (objL2 == null || objL2 == mh0.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kp0Var.k(i2, objL2, mh0.h)) {
                        s();
                        return mh0.o;
                    }
                } else {
                    if (obj == null) {
                        return mh0.n;
                    }
                    if (kp0Var.k(i2, objL2, obj)) {
                        s();
                        return mh0.m;
                    }
                }
            } else if (objL2 != mh0.d) {
                mu3 mu3Var = mh0.j;
                if (objL2 == mu3Var) {
                    return mh0.o;
                }
                if (objL2 == mh0.h) {
                    return mh0.o;
                }
                if (objL2 == mh0.l) {
                    s();
                    return mh0.o;
                }
                if (objL2 != mh0.g && kp0Var.k(i2, objL2, mh0.f)) {
                    boolean z = objL2 instanceof hc9;
                    if (z) {
                        objL2 = ((hc9) objL2).a;
                    }
                    if (L(objL2, kp0Var, i2)) {
                        kp0Var.o(i2, mh0.i);
                        s();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        kp0Var.n(i2, null);
                        return obj3;
                    }
                    kp0Var.o(i2, mu3Var);
                    kp0Var.i();
                    if (z) {
                        s();
                    }
                    return mh0.o;
                }
            } else if (kp0Var.k(i2, objL2, mh0.i)) {
                s();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                kp0Var.n(i2, null);
                return obj4;
            }
        }
    }

    public final int N(kp0 kp0Var, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objL = kp0Var.l(i2);
            if (objL == null) {
                if (!k(j2) || z) {
                    if (z) {
                        if (kp0Var.k(i2, null, mh0.j)) {
                            kp0Var.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kp0Var.k(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kp0Var.k(i2, null, mh0.d)) {
                    break;
                }
            } else {
                if (objL != mh0.e) {
                    mu3 mu3Var = mh0.k;
                    if (objL == mu3Var) {
                        kp0Var.n(i2, null);
                        return 5;
                    }
                    if (objL == mh0.h) {
                        kp0Var.n(i2, null);
                        return 5;
                    }
                    if (objL == mh0.l) {
                        kp0Var.n(i2, null);
                        B();
                        return 4;
                    }
                    kp0Var.n(i2, null);
                    if (objL instanceof hc9) {
                        objL = ((hc9) objL).a;
                    }
                    if (K(objL, obj)) {
                        kp0Var.o(i2, mh0.i);
                        return 0;
                    }
                    if (kp0Var.f.getAndSet((i2 * 2) + 1, mu3Var) != mu3Var) {
                        kp0Var.m(i2, true);
                    }
                    return 5;
                }
                if (kp0Var.k(i2, objL, mh0.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void O(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        a aVar = this;
        if (aVar.D()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(aVar) > j2) {
                break;
            } else {
                aVar = this;
            }
        }
        int i2 = mh0.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(aVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(aVar)) && j3 == atomicLongFieldUpdater.get(aVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(aVar);
                    if (atomicLongFieldUpdater2.compareAndSet(aVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        aVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(aVar);
                    long j6 = atomicLongFieldUpdater2.get(aVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(aVar)) {
                        break;
                    }
                    if (z) {
                        aVar = this;
                    } else {
                        aVar = this;
                        atomicLongFieldUpdater2.compareAndSet(aVar, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(aVar);
                    if (atomicLongFieldUpdater2.compareAndSet(aVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        aVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.wn7
    public final void a(dp2 dp2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, dp2Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            mu3 mu3Var = mh0.q;
            if (obj != mu3Var) {
                if (obj == mh0.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            mu3 mu3Var2 = mh0.r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mu3Var, mu3Var2)) {
                if (atomicReferenceFieldUpdater.get(this) != mu3Var) {
                    break;
                }
            }
            dp2Var.invoke(u());
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173 A[RETURN] */
    @Override // defpackage.wn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(defpackage.g51 r24, java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.a.c(g51, java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.pw6
    public final o77 e() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.a;
        js3.n(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        wu8.i(3, bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.a;
        js3.n(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        wu8.i(3, bufferedChannel$onReceive$2);
        return new o77(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, null);
    }

    @Override // defpackage.pw6
    public final void g(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        p(cancellationException, true);
    }

    @Override // defpackage.pw6
    public final o77 h() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.a;
        js3.n(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        wu8.i(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.a;
        js3.n(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        wu8.i(3, bufferedChannel$onReceiveCatching$2);
        return new o77(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, null);
    }

    @Override // defpackage.pw6
    public final Object i() {
        kp0 kp0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        long j2 = atomicLongFieldUpdater.get(this);
        long j3 = b.get(this);
        if (z(j3, true)) {
            return new hp0(u());
        }
        long j4 = j3 & 1152921504606846975L;
        ip0 ip0Var = jp0.b;
        if (j2 >= j4) {
            return ip0Var;
        }
        Object obj = mh0.k;
        kp0 kp0Var2 = (kp0) g.get(this);
        while (!A()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = mh0.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (kp0Var2.c != j6) {
                kp0 kp0VarT = t(j6, kp0Var2);
                if (kp0VarT == null) {
                    continue;
                } else {
                    kp0Var = kp0VarT;
                }
            } else {
                kp0Var = kp0Var2;
            }
            Object objM = M(kp0Var, i2, andIncrement, obj);
            kp0 kp0Var3 = kp0Var;
            if (objM == mh0.m) {
                gc9 gc9Var = obj instanceof gc9 ? (gc9) obj : null;
                if (gc9Var != null) {
                    gc9Var.a(kp0Var3, i2);
                }
                O(andIncrement);
                kp0Var3.i();
                return ip0Var;
            }
            if (objM != mh0.o) {
                if (objM == mh0.n) {
                    throw new IllegalStateException("unexpected");
                }
                kp0Var3.a();
                return objM;
            }
            if (andIncrement < x()) {
                kp0Var3.a();
            }
            kp0Var2 = kp0Var3;
        }
        return new hp0(u());
    }

    @Override // defpackage.pw6
    public final lh0 iterator() {
        return new lh0(this);
    }

    public final boolean k(long j2) {
        return j2 < d.get(this) || j2 < c.get(this) + ((long) this.a);
    }

    @Override // defpackage.pw6
    public final Object l(g51 g51Var) throws Throwable {
        kp0 kp0Var;
        Throwable th;
        kp0 kp0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        kp0 kp0Var3 = (kp0) atomicReferenceFieldUpdater.get(this);
        while (!A()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = mh0.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (kp0Var3.c != j3) {
                kp0 kp0VarT = t(j3, kp0Var3);
                if (kp0VarT == null) {
                    continue;
                } else {
                    kp0Var = kp0VarT;
                }
            } else {
                kp0Var = kp0Var3;
            }
            Object objM = M(kp0Var, i2, andIncrement, null);
            mu3 mu3Var = mh0.m;
            if (objM == mu3Var) {
                throw new IllegalStateException("unexpected");
            }
            mu3 mu3Var2 = mh0.o;
            if (objM == mu3Var2) {
                if (andIncrement < x()) {
                    kp0Var.a();
                }
                kp0Var3 = kp0Var;
            } else {
                if (objM != mh0.n) {
                    kp0Var.a();
                    return objM;
                }
                om0 om0VarZ = s7.z(ok4.I(g51Var));
                a aVar = this;
                try {
                    Object objM2 = aVar.M(kp0Var, i2, andIncrement, om0VarZ);
                    if (objM2 == mu3Var) {
                        om0VarZ.a(kp0Var, i2);
                    } else {
                        if (objM2 == mu3Var2) {
                            if (andIncrement < x()) {
                                kp0Var.a();
                            }
                            kp0 kp0Var4 = (kp0) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (A()) {
                                    om0VarZ.resumeWith(kotlin.b.a(v()));
                                    break;
                                }
                                om0 om0Var = om0VarZ;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j4 = mh0.b;
                                    long j5 = andIncrement2 / j4;
                                    int i3 = (int) (andIncrement2 % j4);
                                    if (kp0Var4.c != j5) {
                                        try {
                                            kp0 kp0VarT2 = t(j5, kp0Var4);
                                            if (kp0VarT2 == null) {
                                                om0VarZ = om0Var;
                                            } else {
                                                kp0Var2 = kp0VarT2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            om0VarZ = om0Var;
                                            om0VarZ.C();
                                            throw th;
                                        }
                                    } else {
                                        kp0Var2 = kp0Var4;
                                    }
                                    objM2 = aVar.M(kp0Var2, i3, andIncrement2, om0Var);
                                    kp0 kp0Var5 = kp0Var2;
                                    om0VarZ = om0Var;
                                    if (objM2 == mh0.m) {
                                        om0VarZ.a(kp0Var5, i3);
                                        break;
                                    }
                                    if (objM2 == mh0.o) {
                                        if (andIncrement2 < x()) {
                                            kp0Var5.a();
                                        }
                                        aVar = this;
                                        kp0Var4 = kp0Var5;
                                    } else {
                                        if (objM2 == mh0.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kp0Var5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    om0VarZ = om0Var;
                                    th = th;
                                    om0VarZ.C();
                                    throw th;
                                }
                            }
                        } else {
                            kp0Var.a();
                        }
                        om0VarZ.j(objM2, null);
                    }
                    Object objU = om0VarZ.u();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                    return objU;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thV = v();
        int i4 = d48.a;
        throw thV;
    }

    @Override // defpackage.pw6
    public final Object m(ContinuationImpl continuationImpl) {
        return G(this, continuationImpl);
    }

    public final boolean n(Throwable th) {
        return p(th, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be A[SYNTHETIC] */
    @Override // defpackage.wn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.channels.a.b
            long r1 = r8.get(r0)
            r9 = 0
            boolean r3 = r0.z(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L17
            r1 = r9
            goto L1d
        L17:
            long r1 = r1 & r11
            boolean r1 = r0.k(r1)
            r1 = r1 ^ r10
        L1d:
            ip0 r13 = defpackage.jp0.b
            if (r1 == 0) goto L22
            return r13
        L22:
            mu3 r6 = defpackage.mh0.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.a.f
            java.lang.Object r1 = r1.get(r0)
            kp0 r1 = (defpackage.kp0) r1
        L2c:
            long r2 = r8.getAndIncrement(r0)
            long r4 = r2 & r11
            boolean r7 = r0.z(r2, r9)
            int r2 = defpackage.mh0.b
            long r14 = (long) r2
            long r14 = r4 / r14
            long r2 = (long) r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r11 = r1.c
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 == 0) goto L5e
            kp0 r3 = b(r0, r14, r1)
            if (r3 != 0) goto L5d
            if (r7 == 0) goto L57
            java.lang.Throwable r1 = r0.w()
            hp0 r2 = new hp0
            r2.<init>(r1)
            return r2
        L57:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2c
        L5d:
            r1 = r3
        L5e:
            r3 = r17
            int r11 = j(r0, r1, r2, r3, r4, r6, r7)
            tx8 r3 = defpackage.tx8.a
            if (r11 == 0) goto Lbe
            if (r11 == r10) goto Lbd
            r3 = 2
            if (r11 == r3) goto L9a
            r2 = 3
            if (r11 == r2) goto L92
            r2 = 4
            if (r11 == r2) goto L7b
            r2 = 5
            if (r11 == r2) goto L77
            goto L57
        L77:
            r1.a()
            goto L57
        L7b:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.a.c
            long r2 = r2.get(r0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L88
            r1.a()
        L88:
            java.lang.Throwable r1 = r0.w()
            hp0 r2 = new hp0
            r2.<init>(r1)
            return r2
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9a:
            if (r7 == 0) goto La9
            r1.i()
            java.lang.Throwable r1 = r0.w()
            hp0 r2 = new hp0
            r2.<init>(r1)
            return r2
        La9:
            boolean r3 = r6 instanceof defpackage.gc9
            if (r3 == 0) goto Lb0
            gc9 r6 = (defpackage.gc9) r6
            goto Lb1
        Lb0:
            r6 = 0
        Lb1:
            if (r6 == 0) goto Lb9
            int r3 = defpackage.mh0.b
            int r2 = r2 + r3
            r6.a(r1, r2)
        Lb9:
            r1.i()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.a.o(java.lang.Object):java.lang.Object");
    }

    public final boolean p(Throwable th, boolean z) {
        a aVar;
        boolean z2;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (!z) {
            aVar = this;
            break;
        }
        do {
            j6 = atomicLongFieldUpdater.get(this);
            if (((int) (j6 >> 60)) != 0) {
                aVar = this;
                break;
            }
            kp0 kp0Var = mh0.a;
            aVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(aVar, j6, (j6 & 1152921504606846975L) + (((long) 1) << 60)));
        mu3 mu3Var = mh0.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, mu3Var, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != mu3Var) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(aVar, j5, (((long) 3) << 60) + (j5 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j4 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j2 & 1152921504606846975L;
                    j4 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(aVar, j2, (j4 << 60) + j3));
        }
        B();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                obj = atomicReferenceFieldUpdater2.get(this);
                mu3 mu3Var2 = obj == null ? mh0.q : mh0.r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, mu3Var2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                wu8.i(1, obj);
                ((dp2) obj).invoke(u());
                return z2;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (defpackage.kp0) ((defpackage.a11) defpackage.a11.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.kp0 q(long r13) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.a.q(long):kp0");
    }

    public final void r(long j2) {
        kp0 kp0Var = (kp0) g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.a) + j3, d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = mh0.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (kp0Var.c != j5) {
                    kp0 kp0VarT = t(j5, kp0Var);
                    if (kp0VarT != null) {
                        kp0Var = kp0VarT;
                    }
                }
                kp0 kp0Var2 = kp0Var;
                if (M(kp0Var2, i2, j3, null) != mh0.o || j3 < x()) {
                    kp0Var2.a();
                }
                kp0Var = kp0Var2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        y(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.a.s():void");
    }

    public final kp0 t(long j2, kp0 kp0Var) {
        Object objZ;
        long j3;
        kp0 kp0Var2 = mh0.a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.a;
        loop0: while (true) {
            objZ = at2.Z(kp0Var, j2, bufferedChannelKt$createSegmentFunction$1);
            if (!ib7.o(objZ)) {
                wl7 wl7VarM = ib7.m(objZ);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
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
        if (ib7.o(objZ)) {
            B();
            if (kp0Var.c * ((long) mh0.b) < x()) {
                kp0Var.a();
                return null;
            }
        } else {
            kp0 kp0Var3 = (kp0) ib7.m(objZ);
            long j4 = kp0Var3.c;
            if (!D() && j2 <= d.get(this) / ((long) mh0.b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    wl7 wl7Var2 = (wl7) atomicReferenceFieldUpdater2.get(this);
                    if (wl7Var2.c >= j4 || !kp0Var3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, wl7Var2, kp0Var3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != wl7Var2) {
                            if (kp0Var3.f()) {
                                kp0Var3.e();
                            }
                        }
                    }
                    if (wl7Var2.f()) {
                        wl7Var2.e();
                    }
                }
            }
            if (j4 <= j2) {
                return kp0Var3;
            }
            long j5 = j4 * ((long) mh0.b);
            do {
                j3 = c.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!c.compareAndSet(this, j3, j5));
            if (j4 * ((long) mh0.b) < x()) {
                kp0Var3.a();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b7, code lost:
    
        r16 = r7;
        r3 = (defpackage.kp0) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c0, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.a.toString():java.lang.String");
    }

    public final Throwable u() {
        return (Throwable) i.get(this);
    }

    public final Throwable v() {
        Throwable thU = u();
        return thU == null ? new ClosedReceiveChannelException("Channel was closed") : thU;
    }

    public final Throwable w() {
        Throwable thU = u();
        return thU == null ? new ClosedSendChannelException("Channel was closed") : thU;
    }

    public final long x() {
        return b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (defpackage.kp0) ((defpackage.a11) defpackage.a11.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z(long r14, boolean r16) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.a.z(long, boolean):boolean");
    }
}
