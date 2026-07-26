package defpackage;

import android.os.Trace;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.PausedCompositionState;
import androidx.compose.runtime.collection.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.collections.EmptySet;

/* JADX INFO: loaded from: classes.dex */
public final class j01 implements ny6, c01 {
    public final d01 a;
    public final sk6 b;
    public final AtomicReference c = new AtomicReference(null);
    public final Object d = new Object();
    public final tb5 e;
    public final cz7 f;
    public final rb5 g;
    public final sb5 h;
    public final sb5 i;
    public final rb5 j;
    public final uo0 k;
    public final uo0 l;
    public final rb5 m;
    public rb5 n;
    public boolean o;
    public lv7 p;
    public w36 q;
    public j01 r;
    public int s;
    public final r79 t;
    public final l37 u;
    public final qz0 v;
    public int w;

    public j01(d01 d01Var, sk6 sk6Var) {
        this.a = d01Var;
        this.b = sk6Var;
        tb5 tb5Var = new tb5(new sb5());
        this.e = tb5Var;
        cz7 cz7Var = new cz7();
        if (d01Var.e()) {
            cz7Var.k = new ya5();
        }
        if (d01Var.g()) {
            cz7Var.c();
        }
        this.f = cz7Var;
        this.g = b47.b();
        this.h = new sb5();
        this.i = new sb5();
        this.j = b47.b();
        uo0 uo0Var = new uo0();
        this.k = uo0Var;
        uo0 uo0Var2 = new uo0();
        this.l = uo0Var2;
        this.m = b47.b();
        this.n = b47.b();
        r79 r79Var = new r79(13, d01Var);
        this.t = r79Var;
        this.u = new l37();
        qz0 qz0Var = new qz0(sk6Var, d01Var, cz7Var, tb5Var, uo0Var, uo0Var2, r79Var, this);
        d01Var.s(qz0Var);
        this.v = qz0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(a aVar) {
        Object obj;
        while (true) {
            Object obj2 = this.c.get();
            if (obj2 == null || obj2.equals(yq2.c)) {
                obj = aVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, aVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.c).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = aVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.c;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.d) {
                    r();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.d
            monitor-enter(r0)
            r14.x(r15)     // Catch: java.lang.Throwable -> L4f
            rb5 r1 = r14.j     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof defpackage.sb5     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            sb5 r15 = (defpackage.sb5) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            ck1 r10 = (defpackage.ck1) r10     // Catch: java.lang.Throwable -> L4f
            r14.x(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            ck1 r15 = (defpackage.ck1) r15     // Catch: java.lang.Throwable -> L4f
            r14.x(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j01.B(java.lang.Object):void");
    }

    public final void C(qp2 qp2Var) {
        boolean zL = l();
        t();
        d01 d01Var = this.a;
        if (!zL) {
            d01Var.a(this, qp2Var);
            return;
        }
        qz0 qz0Var = this.v;
        qz0Var.z = 100;
        qz0Var.y = true;
        d01Var.a(this, qp2Var);
        qz0Var.t();
    }

    @Override // defpackage.ny6
    public final void a() {
        this.o = true;
        this.t.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // defpackage.ny6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j01.b(java.lang.Object):void");
    }

    @Override // defpackage.ny6
    public final InvalidationResult c(my6 my6Var, Object obj) {
        j01 j01Var;
        int i = my6Var.b;
        if ((i & 2) != 0) {
            my6Var.b = i | 4;
        }
        ge geVar = my6Var.c;
        if (geVar == null || !geVar.a()) {
            return InvalidationResult.a;
        }
        if (this.f.f(geVar)) {
            if (my6Var.d == null) {
                return InvalidationResult.a;
            }
            InvalidationResult invalidationResultW = w(my6Var, geVar, obj);
            if (invalidationResultW != InvalidationResult.a) {
                this.t.i();
            }
            return invalidationResultW;
        }
        synchronized (this.d) {
            j01Var = this.r;
        }
        if (j01Var != null) {
            qz0 qz0Var = j01Var.v;
            if (qz0Var.F && qz0Var.g0(my6Var, obj)) {
                return InvalidationResult.d;
            }
        }
        return InvalidationResult.a;
    }

    public final void d() {
        this.c.set(null);
        this.k.g.z0();
        this.l.g.z0();
        tb5 tb5Var = this.e;
        if (tb5Var.a.b()) {
            return;
        }
        l37 l37Var = this.u;
        try {
            l37Var.h(tb5Var, this.v.A());
            l37Var.c();
        } finally {
            l37Var.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            rb5 r2 = r0.g
            java.lang.Object r2 = r2.g(r1)
            if (r2 == 0) goto L9a
            boolean r3 = r2 instanceof defpackage.sb5
            sb5 r4 = r0.h
            sb5 r5 = r0.i
            rb5 r6 = r0.m
            if (r3 == 0) goto L7d
            sb5 r2 = (defpackage.sb5) r2
            java.lang.Object[] r3 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L9a
            r9 = 0
        L22:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3c:
            if (r14 >= r12) goto L75
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L6c
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r3[r15]
            my6 r15 = (defpackage.my6) r15
            boolean r16 = defpackage.b47.m(r6, r1, r15)
            if (r16 != 0) goto L6c
            androidx.compose.runtime.InvalidationResult r8 = r15.c(r1)
            r17 = r13
            androidx.compose.runtime.InvalidationResult r13 = androidx.compose.runtime.InvalidationResult.a
            if (r8 == r13) goto L6e
            rb5 r8 = r15.g
            if (r8 == 0) goto L68
            if (r21 != 0) goto L68
            r5.d(r15)
            goto L6e
        L68:
            r4.d(r15)
            goto L6e
        L6c:
            r17 = r13
        L6e:
            long r10 = r10 >> r17
            int r14 = r14 + 1
            r13 = r17
            goto L3c
        L75:
            r8 = r13
            if (r12 != r8) goto L9a
        L78:
            if (r9 == r7) goto L9a
            int r9 = r9 + 1
            goto L22
        L7d:
            my6 r2 = (defpackage.my6) r2
            boolean r3 = defpackage.b47.m(r6, r1, r2)
            if (r3 != 0) goto L9a
            androidx.compose.runtime.InvalidationResult r1 = r2.c(r1)
            androidx.compose.runtime.InvalidationResult r3 = androidx.compose.runtime.InvalidationResult.a
            if (r1 == r3) goto L9a
            rb5 r1 = r2.g
            if (r1 == 0) goto L97
            if (r21 != 0) goto L97
            r5.d(r2)
            return
        L97:
            r4.d(r2)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j01.e(java.lang.Object, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.Set r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j01.f(java.util.Set, boolean):void");
    }

    public final void g() {
        synchronized (this.d) {
            try {
                h(this.k);
                r();
            } catch (Throwable th) {
                try {
                    if (!this.e.a.b()) {
                        l37 l37Var = this.u;
                        try {
                            l37Var.h(this.e, this.v.A());
                            l37Var.c();
                            l37Var.b();
                        } catch (Throwable th2) {
                            l37Var.b();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    d();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.uo0 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j01.h(uo0):void");
    }

    public final void i() {
        synchronized (this.d) {
            try {
                if (this.l.g.C0()) {
                    h(this.l);
                }
            } catch (Throwable th) {
                try {
                    if (!this.e.a.b()) {
                        l37 l37Var = this.u;
                        try {
                            l37Var.h(this.e, this.v.A());
                            l37Var.c();
                            l37Var.b();
                        } catch (Throwable th2) {
                            l37Var.b();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void j() {
        l37 l37Var;
        synchronized (this.d) {
            try {
                this.v.v = null;
                if (!this.e.a.b()) {
                    l37Var = this.u;
                    try {
                        l37Var.h(this.e, this.v.A());
                        l37Var.c();
                        l37Var.b();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.e.a.b()) {
                        l37Var = this.u;
                        try {
                            l37Var.h(this.e, this.v.A());
                            l37Var.c();
                            l37Var.b();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    d();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j01.k():void");
    }

    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (this.w != 1) {
                z = false;
            }
            if (z) {
                this.w = 0;
            }
        }
        return z;
    }

    public final void m(qp2 qp2Var) {
        try {
            synchronized (this.d) {
                q();
                rb5 rb5Var = this.n;
                this.n = b47.b();
                try {
                    qz0 qz0Var = this.v;
                    lv7 lv7Var = this.p;
                    if (!qz0Var.e.g.B0()) {
                        sz0.a("Expected applyChanges() to have been called");
                    }
                    qz0Var.P = lv7Var;
                    try {
                        qz0Var.o(rb5Var, qp2Var);
                    } finally {
                        qz0Var.P = null;
                    }
                } catch (Throwable th) {
                    this.n = rb5Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.e.a.b()) {
                    l37 l37Var = this.u;
                    try {
                        l37Var.h(this.e, this.v.A());
                        l37Var.c();
                        l37Var.b();
                    } catch (Throwable th3) {
                        l37Var.b();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                d();
                throw th4;
            }
        }
    }

    public final w36 n(boolean z, qp2 qp2Var) {
        if (this.q != null) {
            wi6.b("A pausable composition is in progress");
        }
        w36 w36Var = new w36(this, this.a, this.v, this.e, qp2Var, z, this.b, this.d);
        this.q = w36Var;
        return w36Var;
    }

    public final void o() {
        synchronized (this.d) {
            try {
                if (this.q != null) {
                    wi6.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f.b > 0;
                if (z || !this.e.a.b()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        l37 l37Var = this.u;
                        try {
                            l37Var.h(this.e, this.v.A());
                            if (z) {
                                fz7 fz7VarE = this.f.e();
                                try {
                                    fz7VarE.n(fz7VarE.t, new iz(this.u, fz7VarE, 4));
                                    fz7VarE.e(true);
                                    this.b.n();
                                    l37Var.d();
                                } catch (Throwable th) {
                                    fz7VarE.e(false);
                                    throw th;
                                }
                            }
                            l37Var.c();
                            l37Var.b();
                        } catch (Throwable th2) {
                            l37Var.b();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.g.a();
                this.j.a();
                this.n.a();
                this.k.g.z0();
                this.l.g.z0();
                qz0 qz0Var = this.v;
                qz0Var.E.clear();
                qz0Var.s.clear();
                qz0Var.e.g.z0();
                qz0Var.v = null;
                this.w = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void p() {
        synchronized (this.d) {
            try {
                if (this.v.F) {
                    wi6.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.w != 3) {
                    this.w = 3;
                    uo0 uo0Var = this.v.L;
                    if (uo0Var != null) {
                        h(uo0Var);
                    }
                    boolean z = this.f.b > 0;
                    if (z || !this.e.a.b()) {
                        l37 l37Var = this.u;
                        try {
                            l37Var.h(this.e, this.v.A());
                            if (z) {
                                fz7 fz7VarE = this.f.e();
                                try {
                                    fz7VarE.n(fz7VarE.t, new g8(4, this.u));
                                    fz7VarE.J();
                                    fz7VarE.e(true);
                                    this.b.p();
                                    this.b.n();
                                    l37Var.d();
                                } catch (Throwable th) {
                                    fz7VarE.e(false);
                                    throw th;
                                }
                            }
                            l37Var.c();
                            l37Var.b();
                        } catch (Throwable th2) {
                            l37Var.b();
                            throw th2;
                        }
                    }
                    qz0 qz0Var = this.v;
                    qz0Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        qz0Var.b.x(qz0Var);
                        qz0Var.E.clear();
                        qz0Var.s.clear();
                        qz0Var.e.g.z0();
                        qz0Var.v = null;
                        qz0Var.a.p();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.a.y(this);
    }

    public final void q() {
        Object obj = yq2.c;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                sz0.b("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                f((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                sz0.b("corrupt pendingModifications drain: " + atomicReference);
                throw new KotlinNothingValueException();
            }
            for (Set set : (Set[]) andSet) {
                f(set, true);
            }
        }
    }

    public final void r() {
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (js3.i(andSet, yq2.c)) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                f(set, false);
            }
            return;
        }
        if (andSet != null) {
            sz0.b("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        if (this.q == null) {
            sz0.a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void s() {
        EmptySet emptySet = EmptySet.a;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(emptySet);
        if (js3.i(andSet, yq2.c) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            sz0.b("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        for (Set set : (Set[]) andSet) {
            f(set, false);
        }
    }

    public final void t() {
        int i = this.w;
        if (i != 0) {
            wi6.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.q == null) {
            return;
        }
        wi6.b("A pausable composition is in progress");
    }

    public final void u(ArrayList arrayList) {
        tb5 tb5Var = this.e;
        qz0 qz0Var = this.v;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!((lz4) ((Pair) arrayList.get(i)).a).c.equals(this)) {
                    sz0.a("Check failed");
                    break;
                }
                i++;
            }
        }
        try {
            qz0Var.getClass();
            try {
                qz0Var.C(arrayList);
                qz0Var.i();
            } catch (Throwable th) {
                qz0Var.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!tb5Var.a.b()) {
                    l37 l37Var = this.u;
                    try {
                        l37Var.h(tb5Var, qz0Var.A());
                        l37Var.c();
                        l37Var.b();
                    } catch (Throwable th3) {
                        l37Var.b();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                d();
                throw th4;
            }
        }
    }

    public final void v() {
        ny6 ny6Var;
        synchronized (this.d) {
            try {
                for (Object obj : this.f.c) {
                    my6 my6Var = obj instanceof my6 ? (my6) obj : null;
                    if (my6Var != null && (ny6Var = my6Var.a) != null) {
                        ny6Var.c(my6Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5 A[Catch: all -> 0x0042, EDGE_INSN: B:80:0x00d5->B:65:0x00d5 BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], EDGE_INSN: B:81:0x00d5->B:65:0x00d5 BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007c, B:44:0x0080, B:47:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b2, B:57:0x00c1, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.InvalidationResult w(defpackage.my6 r21, defpackage.ge r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j01.w(my6, ge, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    public final void x(Object obj) {
        Object objG = this.g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof sb5;
        rb5 rb5Var = this.m;
        if (!z) {
            my6 my6Var = (my6) objG;
            if (my6Var.c(obj) == InvalidationResult.d) {
                b47.a(rb5Var, obj, my6Var);
                return;
            }
            return;
        }
        sb5 sb5Var = (sb5) objG;
        Object[] objArr = sb5Var.b;
        long[] jArr = sb5Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        my6 my6Var2 = (my6) objArr[(i << 3) + i3];
                        if (my6Var2.c(obj) == InvalidationResult.d) {
                            b47.a(rb5Var, obj, my6Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof androidx.compose.runtime.collection.a
            rb5 r3 = r0.j
            rb5 r4 = r0.g
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            androidx.compose.runtime.collection.a r1 = (androidx.compose.runtime.collection.a) r1
            androidx.collection.e r1 = r1.a
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j01.y(java.util.Set):boolean");
    }

    public final boolean z() {
        synchronized (this.d) {
            w36 w36Var = this.q;
            boolean zC0 = false;
            if (w36Var != null && (w36Var.h.get() != PausedCompositionState.e || w36Var.i != o37.c())) {
                AtomicReference atomicReference = w36Var.h;
                PausedCompositionState pausedCompositionState = PausedCompositionState.f;
                PausedCompositionState pausedCompositionState2 = PausedCompositionState.d;
                while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2) && atomicReference.get() == pausedCompositionState) {
                }
                w36Var.l.a.a(9);
                return false;
            }
            q();
            try {
                rb5 rb5Var = this.n;
                this.n = b47.b();
                try {
                    qz0 qz0Var = this.v;
                    lv7 lv7Var = this.p;
                    mv5 mv5Var = qz0Var.e.g;
                    if (!mv5Var.B0()) {
                        sz0.a("Expected applyChanges() to have been called");
                    }
                    if (rb5Var.e > 0 || !qz0Var.s.isEmpty()) {
                        qz0Var.P = lv7Var;
                        try {
                            qz0Var.o(rb5Var, null);
                            qz0Var.P = null;
                            zC0 = mv5Var.C0();
                        } catch (Throwable th) {
                            qz0Var.P = null;
                            throw th;
                        }
                    }
                    if (!zC0) {
                        r();
                    }
                    return zC0;
                } catch (Throwable th2) {
                    this.n = rb5Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.e.a.b()) {
                        l37 l37Var = this.u;
                        try {
                            l37Var.h(this.e, this.v.A());
                            l37Var.c();
                            l37Var.b();
                        } catch (Throwable th4) {
                            l37Var.b();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    d();
                    throw th5;
                }
            }
        }
    }
}
