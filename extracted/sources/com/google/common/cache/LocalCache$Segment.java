package com.google.common.cache;

import com.google.common.cache.LocalCache$Strength;
import defpackage.c27;
import defpackage.ec4;
import defpackage.gk0;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
class LocalCache$Segment<K, V> extends ReentrantLock {
    public final d a;
    public volatile int b;
    public long c;
    public int d;
    public int e;
    public volatile AtomicReferenceArray f;
    public final long g;
    public final ReferenceQueue h;
    public final ReferenceQueue i;
    public final AbstractQueue j;
    public final AtomicInteger k = new AtomicInteger();
    public final AbstractQueue l;
    public final AbstractQueue m;
    public final gk0 n;

    public LocalCache$Segment(d dVar, int i, long j, gk0 gk0Var) {
        this.a = dVar;
        this.g = j;
        gk0Var.getClass();
        this.n = gk0Var;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.e = length;
        if (dVar.j == CacheBuilder$OneWeigher.a && length == j) {
            this.e = length + 1;
        }
        this.f = atomicReferenceArray;
        LocalCache$Strength localCache$Strength = dVar.g;
        LocalCache$Strength.AnonymousClass1 anonymousClass1 = LocalCache$Strength.a;
        this.h = localCache$Strength != anonymousClass1 ? new ReferenceQueue() : null;
        this.i = dVar.h != anonymousClass1 ? new ReferenceQueue() : null;
        this.j = (dVar.b() || dVar.a()) ? new ConcurrentLinkedQueue() : d.v;
        this.l = dVar.c() ? new b(1) : d.v;
        this.m = (dVar.b() || dVar.a()) ? new b(0) : d.v;
    }

    public final c27 a(c27 c27Var, c27 c27Var2) {
        Object key = c27Var.getKey();
        if (key == null) {
            return null;
        }
        ec4 ec4VarB = c27Var.b();
        Object obj = ec4VarB.get();
        if (obj == null && ec4VarB.b()) {
            return null;
        }
        c27 c27VarB = this.a.p.b(this, c27Var, c27Var2, key);
        c27VarB.f(ec4VarB.f(this.i, obj, c27VarB));
        return c27VarB;
    }

    public final void b() {
        while (true) {
            c27 c27Var = (c27) this.j.poll();
            if (c27Var == null) {
                return;
            }
            AbstractQueue abstractQueue = this.m;
            if (abstractQueue.contains(c27Var)) {
                abstractQueue.add(c27Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r1.d++;
        r2 = r1.o(r3, r3, r3.getKey(), r3.b().get(), r3.b(), r7);
        r3 = r1.b - 1;
        r11.set(r12, r2);
        r1.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        r1.q();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.c():void");
    }

    public final void e(Object obj, Object obj2, int i, RemovalCause removalCause) {
        this.c -= (long) i;
        if (removalCause.a()) {
            this.n.getClass();
        }
        d dVar = this.a;
        if (dVar.m != d.v) {
            dVar.m.offer(new RemovalNotification(obj, obj2));
        }
    }

    public final void f(c27 c27Var) {
        if (this.a.a()) {
            b();
            long jE = c27Var.b().e();
            long j = this.g;
            RemovalCause removalCause = RemovalCause.e;
            if (jE > j && !n(c27Var, c27Var.c(), removalCause)) {
                throw new AssertionError();
            }
            while (this.c > j) {
                for (c27 c27Var2 : this.m) {
                    if (c27Var2.b().e() > 0) {
                        if (!n(c27Var2, c27Var2.c(), removalCause)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    public final void g() {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.e = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            c27 c27VarA = (c27) atomicReferenceArray.get(i2);
            if (c27VarA != null) {
                c27 c27VarA2 = c27VarA.a();
                int iC = c27VarA.c() & length2;
                if (c27VarA2 == null) {
                    atomicReferenceArray2.set(iC, c27VarA);
                } else {
                    c27 c27Var = c27VarA;
                    while (c27VarA2 != null) {
                        int iC2 = c27VarA2.c() & length2;
                        if (iC2 != iC) {
                            c27Var = c27VarA2;
                            iC = iC2;
                        }
                        c27VarA2 = c27VarA2.a();
                    }
                    atomicReferenceArray2.set(iC, c27Var);
                    while (c27VarA != c27Var) {
                        int iC3 = c27VarA.c() & length2;
                        c27 c27VarA3 = a(c27VarA, (c27) atomicReferenceArray2.get(iC3));
                        if (c27VarA3 != null) {
                            atomicReferenceArray2.set(iC3, c27VarA3);
                        } else {
                            m(c27VarA);
                            i--;
                        }
                        c27VarA = c27VarA.a();
                    }
                }
            }
        }
        this.f = atomicReferenceArray2;
        this.b = i;
    }

    public final void h(long j) {
        c27 c27Var;
        RemovalCause removalCause;
        c27 c27Var2;
        b();
        do {
            c27Var = (c27) this.l.peek();
            removalCause = RemovalCause.d;
            d dVar = this.a;
            if (c27Var == null || !dVar.e(c27Var, j)) {
                do {
                    c27Var2 = (c27) this.m.peek();
                    if (c27Var2 == null || !dVar.e(c27Var2, j)) {
                        return;
                    }
                } while (n(c27Var2, c27Var2.c(), removalCause));
                throw new AssertionError();
            }
        } while (n(c27Var, c27Var.c(), removalCause));
        throw new AssertionError();
    }

    public final c27 i(int i, Object obj) {
        for (c27 c27VarA = (c27) this.f.get((r0.length() - 1) & i); c27VarA != null; c27VarA = c27VarA.a()) {
            if (c27VarA.c() == i) {
                Object key = c27VarA.getKey();
                if (key == null) {
                    s();
                } else if (this.a.e.e(obj, key)) {
                    return c27VarA;
                }
            }
        }
        return null;
    }

    public final void j() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            p(this.a.o.a());
            q();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        unlock();
        q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(int r10, java.lang.Object r11, java.lang.Object r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache$Segment.k(int, java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    public final void l(c27 c27Var, long j) {
        if (this.a.b()) {
            c27Var.j(j);
        }
        this.m.add(c27Var);
    }

    public final void m(c27 c27Var) {
        Object key = c27Var.getKey();
        c27Var.c();
        e(key, c27Var.b().get(), c27Var.b().e(), RemovalCause.c);
        this.l.remove(c27Var);
        this.m.remove(c27Var);
    }

    public final boolean n(c27 c27Var, int i, RemovalCause removalCause) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = i & (atomicReferenceArray.length() - 1);
        c27 c27Var2 = (c27) atomicReferenceArray.get(length);
        for (c27 c27VarA = c27Var2; c27VarA != null; c27VarA = c27VarA.a()) {
            if (c27VarA == c27Var) {
                this.d++;
                c27 c27VarO = o(c27Var2, c27VarA, c27VarA.getKey(), c27VarA.b().get(), c27VarA.b(), removalCause);
                int i2 = this.b - 1;
                atomicReferenceArray.set(length, c27VarO);
                this.b = i2;
                return true;
            }
        }
        return false;
    }

    public final c27 o(c27 c27Var, c27 c27Var2, Object obj, Object obj2, ec4 ec4Var, RemovalCause removalCause) {
        e(obj, obj2, ec4Var.e(), removalCause);
        this.l.remove(c27Var2);
        this.m.remove(c27Var2);
        if (ec4Var.a()) {
            ec4Var.d(null);
            return c27Var;
        }
        int i = this.b;
        c27 c27VarA = c27Var2.a();
        while (c27Var != c27Var2) {
            c27 c27VarA2 = a(c27Var, c27VarA);
            if (c27VarA2 != null) {
                c27VarA = c27VarA2;
            } else {
                m(c27Var);
                i--;
            }
            c27Var = c27Var.a();
        }
        this.b = i;
        return c27VarA;
    }

    public final void p(long j) {
        if (tryLock()) {
            try {
                c();
                h(j);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    public final void q() {
        if (isHeldByCurrentThread()) {
            return;
        }
        while (true) {
            d dVar = this.a;
            if (((RemovalNotification) dVar.m.poll()) == null) {
                return;
            }
            try {
                dVar.n.getClass();
            } catch (Throwable th) {
                d.t.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    public final void r(c27 c27Var, Object obj, long j) {
        ec4 ec4VarB = c27Var.b();
        d dVar = this.a;
        dVar.j.getClass();
        c27Var.f(dVar.h.b(this, c27Var, obj));
        b();
        this.c += (long) 1;
        if (dVar.b()) {
            c27Var.j(j);
        }
        if (dVar.c()) {
            c27Var.n(j);
        }
        this.m.add(c27Var);
        this.l.add(c27Var);
        ec4VarB.d(obj);
    }

    public final void s() {
        if (tryLock()) {
            try {
                c();
            } finally {
                unlock();
            }
        }
    }
}
