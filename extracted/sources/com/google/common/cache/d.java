package com.google.common.cache;

import com.google.common.cache.LocalCache$Strength;
import defpackage.c27;
import defpackage.ec4;
import defpackage.fc4;
import defpackage.gk0;
import defpackage.gu9;
import defpackage.jl8;
import defpackage.od9;
import defpackage.r37;
import defpackage.sb4;
import defpackage.tb4;
import defpackage.vb8;
import defpackage.yb4;
import j$.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractMap implements ConcurrentMap, j$.util.concurrent.ConcurrentMap {
    public static final Logger t = Logger.getLogger(d.class.getName());
    public static final sb4 u = new sb4();
    public static final tb4 v = new tb4();
    public final int a;
    public final int b;
    public final LocalCache$Segment[] c;
    public final int d;
    public final com.google.common.base.a e;
    public final com.google.common.base.a f;
    public final LocalCache$Strength g;
    public final LocalCache$Strength h;
    public final long i;
    public final od9 j;
    public final long k;
    public final long l;
    public final AbstractQueue m;
    public final r37 n;
    public final jl8 o;
    public final LocalCache$EntryFactory p;
    public yb4 q;
    public fc4 r;
    public yb4 s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.cache.d, java.util.AbstractMap] */
    public d(a aVar) {
        ?? abstractMap = new AbstractMap();
        int i = aVar.b;
        vb8 vb8Var = aVar.n;
        abstractMap.d = Math.min(i == -1 ? 4 : i, 65536);
        LocalCache$Strength localCache$Strength = aVar.f;
        LocalCache$Strength.AnonymousClass1 anonymousClass1 = LocalCache$Strength.a;
        LocalCache$Strength localCache$Strength2 = (LocalCache$Strength) gu9.p(localCache$Strength, anonymousClass1);
        abstractMap.g = localCache$Strength2;
        abstractMap.h = (LocalCache$Strength) gu9.p(aVar.g, anonymousClass1);
        abstractMap.e = (com.google.common.base.a) gu9.p(aVar.j, ((LocalCache$Strength) gu9.p(aVar.f, anonymousClass1)).a());
        abstractMap.f = (com.google.common.base.a) gu9.p(aVar.k, ((LocalCache$Strength) gu9.p(aVar.g, anonymousClass1)).a());
        long j = (aVar.h == 0 || aVar.i == 0) ? 0L : aVar.e == null ? aVar.c : aVar.d;
        abstractMap.i = j;
        od9 od9Var = aVar.e;
        CacheBuilder$OneWeigher cacheBuilder$OneWeigher = CacheBuilder$OneWeigher.a;
        od9 od9Var2 = (od9) gu9.p(od9Var, cacheBuilder$OneWeigher);
        abstractMap.j = od9Var2;
        long j2 = aVar.i;
        abstractMap.k = j2 == -1 ? 0L : j2;
        long j3 = aVar.h;
        abstractMap.l = j3 != -1 ? j3 : 0L;
        r37 r37Var = aVar.l;
        CacheBuilder$NullListener cacheBuilder$NullListener = CacheBuilder$NullListener.a;
        r37 r37Var2 = (r37) gu9.p(r37Var, cacheBuilder$NullListener);
        abstractMap.n = r37Var2;
        abstractMap.m = r37Var2 == cacheBuilder$NullListener ? v : new ConcurrentLinkedQueue();
        int i2 = 0;
        int i3 = 1;
        boolean z = abstractMap.c() || abstractMap.b();
        jl8 jl8Var = aVar.m;
        abstractMap.o = jl8Var == null ? z ? jl8.a : a.p : jl8Var;
        abstractMap.p = LocalCache$EntryFactory.a[((abstractMap.b() || abstractMap.a() || abstractMap.b()) ? (char) 1 : (char) 0) | (localCache$Strength2 != LocalCache$Strength.b ? (char) 0 : (char) 4) | (abstractMap.c() || abstractMap.c() ? 2 : 0)];
        int iMin = Math.min(16, 1073741824);
        if (abstractMap.a() && od9Var2 == cacheBuilder$OneWeigher) {
            iMin = (int) Math.min(iMin, j);
        }
        int i4 = 0;
        int i5 = 1;
        while (i5 < abstractMap.d && (!abstractMap.a() || ((long) i5) * 20 <= abstractMap.i)) {
            i4++;
            i5 <<= 1;
        }
        abstractMap.b = 32 - i4;
        abstractMap.a = i5 - 1;
        abstractMap.c = new LocalCache$Segment[i5];
        int i6 = iMin / i5;
        while (i3 < (i6 * i5 < iMin ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        if (abstractMap.a()) {
            long j4 = abstractMap.i;
            long j5 = i5;
            long j6 = (j4 / j5) + 1;
            long j7 = j4 % j5;
            while (true) {
                LocalCache$Segment[] localCache$SegmentArr = abstractMap.c;
                if (i2 >= localCache$SegmentArr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                localCache$SegmentArr[i2] = new LocalCache$Segment(abstractMap, i3, j8, (gk0) vb8Var.get());
                i2++;
                j6 = j8;
            }
        } else {
            int i7 = i3;
            d dVar = abstractMap;
            while (true) {
                LocalCache$Segment[] localCache$SegmentArr2 = dVar.c;
                if (i2 >= localCache$SegmentArr2.length) {
                    return;
                }
                localCache$SegmentArr2[i2] = new LocalCache$Segment(dVar, i7, -1L, (gk0) vb8Var.get());
                i2++;
                dVar = this;
            }
        }
    }

    public final boolean a() {
        return this.i >= 0;
    }

    public final boolean b() {
        return this.k > 0;
    }

    public final boolean c() {
        return this.l > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        LocalCache$Strength.AnonymousClass1 anonymousClass1 = LocalCache$Strength.a;
        for (LocalCache$Segment localCache$Segment : this.c) {
            if (localCache$Segment.b != 0) {
                localCache$Segment.lock();
                try {
                    localCache$Segment.p(localCache$Segment.a.o.a());
                    AtomicReferenceArray atomicReferenceArray = localCache$Segment.f;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (c27 c27VarA = (c27) atomicReferenceArray.get(i); c27VarA != null; c27VarA = c27VarA.a()) {
                            if (c27VarA.b().b()) {
                                Object key = c27VarA.getKey();
                                Object obj = c27VarA.b().get();
                                RemovalCause removalCause = (key == null || obj == null) ? RemovalCause.c : RemovalCause.a;
                                c27VarA.c();
                                localCache$Segment.e(key, obj, c27VarA.b().e(), removalCause);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    d dVar = localCache$Segment.a;
                    if (dVar.g != anonymousClass1) {
                        while (localCache$Segment.h.poll() != null) {
                        }
                    }
                    if (dVar.h != anonymousClass1) {
                        while (localCache$Segment.i.poll() != null) {
                        }
                    }
                    localCache$Segment.l.clear();
                    localCache$Segment.m.clear();
                    localCache$Segment.k.set(0);
                    localCache$Segment.d++;
                    localCache$Segment.b = 0;
                    localCache$Segment.unlock();
                    localCache$Segment.q();
                } catch (Throwable th) {
                    localCache$Segment.unlock();
                    localCache$Segment.q();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:6:0x000f, B:8:0x0013, B:24:0x0044, B:11:0x0023, B:13:0x002b, B:16:0x0034, B:19:0x003a, B:20:0x003d, B:15:0x0031), top: B:35:0x000f, inners: #1 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = r6.d(r7)
            com.google.common.cache.LocalCache$Segment r2 = r6.f(r1)
            r2.getClass()
            int r3 = r2.b     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L55
            com.google.common.cache.d r3 = r2.a     // Catch: java.lang.Throwable -> L53
            jl8 r3 = r3.o     // Catch: java.lang.Throwable -> L53
            long r3 = r3.a()     // Catch: java.lang.Throwable -> L53
            c27 r7 = r2.i(r1, r7)     // Catch: java.lang.Throwable -> L53
            r1 = 0
            if (r7 != 0) goto L23
            goto L37
        L23:
            com.google.common.cache.d r5 = r2.a     // Catch: java.lang.Throwable -> L53
            boolean r5 = r5.e(r7, r3)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L3e
            boolean r7 = r2.tryLock()     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L37
            r2.h(r3)     // Catch: java.lang.Throwable -> L39
            r2.unlock()     // Catch: java.lang.Throwable -> L53
        L37:
            r7 = r1
            goto L3e
        L39:
            r7 = move-exception
            r2.unlock()     // Catch: java.lang.Throwable -> L53
            throw r7     // Catch: java.lang.Throwable -> L53
        L3e:
            if (r7 != 0) goto L44
            r2.j()
            return r0
        L44:
            ec4 r7 = r7.b()     // Catch: java.lang.Throwable -> L53
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L4f
            r0 = 1
        L4f:
            r2.j()
            return r0
        L53:
            r7 = move-exception
            goto L59
        L55:
            r2.j()
            return r0
        L59:
            r2.j()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.d.containsKey(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0080 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            jl8 r3 = r1.o
            long r3 = r3.a()
            com.google.common.cache.LocalCache$Segment[] r5 = r1.c
            r6 = -1
            r8 = r2
        L13:
            r9 = 3
            if (r8 >= r9) goto La9
            int r9 = r5.length
            r10 = 0
            r12 = r2
        L1a:
            if (r12 >= r9) goto L97
            r13 = r5[r12]
            int r14 = r13.b
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r13.f
            r15 = r2
            r16 = r15
        L25:
            int r2 = r14.length()
            if (r15 >= r2) goto L8c
            java.lang.Object r2 = r14.get(r15)
            c27 r2 = (defpackage.c27) r2
        L31:
            if (r2 == 0) goto L87
            r13.getClass()
            java.lang.Object r17 = r2.getKey()
            r18 = 0
            if (r17 != 0) goto L46
            r13.s()
        L41:
            r19 = r5
        L43:
            r5 = r18
            goto L72
        L46:
            ec4 r17 = r2.b()
            java.lang.Object r17 = r17.get()
            if (r17 != 0) goto L54
            r13.s()
            goto L41
        L54:
            r19 = r5
            com.google.common.cache.d r5 = r13.a
            boolean r5 = r5.e(r2, r3)
            if (r5 == 0) goto L70
            boolean r5 = r13.tryLock()
            if (r5 == 0) goto L43
            r13.h(r3)     // Catch: java.lang.Throwable -> L6b
            r13.unlock()
            goto L43
        L6b:
            r0 = move-exception
            r13.unlock()
            throw r0
        L70:
            r5 = r17
        L72:
            r17 = r2
            if (r5 == 0) goto L80
            com.google.common.base.a r2 = r1.f
            boolean r2 = r2.e(r0, r5)
            if (r2 == 0) goto L80
            r0 = 1
            return r0
        L80:
            c27 r2 = r17.a()
            r5 = r19
            goto L31
        L87:
            r19 = r5
            int r15 = r15 + 1
            goto L25
        L8c:
            r19 = r5
            int r2 = r13.d
            long r13 = (long) r2
            long r10 = r10 + r13
            int r12 = r12 + 1
            r2 = r16
            goto L1a
        L97:
            r16 = r2
            r19 = r5
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 != 0) goto La0
            goto Lab
        La0:
            int r8 = r8 + 1
            r6 = r10
            r2 = r16
            r5 = r19
            goto L13
        La9:
            r16 = r2
        Lab:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.d.containsValue(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        int iB;
        com.google.common.base.a aVar = this.e;
        if (obj == null) {
            aVar.getClass();
            iB = 0;
        } else {
            iB = aVar.b(obj);
        }
        int i = iB + ((iB << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    public final boolean e(c27 c27Var, long j) {
        c27Var.getClass();
        if (!b() || j - c27Var.m() < this.k) {
            return c() && j - c27Var.g() >= this.l;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        yb4 yb4Var = this.s;
        if (yb4Var != null) {
            return yb4Var;
        }
        yb4 yb4Var2 = new yb4(this, 0);
        this.s = yb4Var2;
        return yb4Var2;
    }

    public final LocalCache$Segment f(int i) {
        return this.c[(i >>> this.b) & this.a];
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[Catch: all -> 0x006e, TRY_ENTER, TryCatch #1 {all -> 0x006e, blocks: (B:6:0x000f, B:8:0x0013, B:24:0x0043, B:26:0x004d, B:28:0x0055, B:29:0x0058, B:34:0x0070, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:19:0x0039, B:20:0x003c, B:15:0x0030), top: B:41:0x000f, inners: #0 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            int r1 = r5.d(r6)
            com.google.common.cache.LocalCache$Segment r2 = r5.f(r1)
            r2.getClass()
            int r3 = r2.b     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L73
            com.google.common.cache.d r3 = r2.a     // Catch: java.lang.Throwable -> L6e
            jl8 r3 = r3.o     // Catch: java.lang.Throwable -> L6e
            long r3 = r3.a()     // Catch: java.lang.Throwable -> L6e
            c27 r6 = r2.i(r1, r6)     // Catch: java.lang.Throwable -> L6e
            if (r6 != 0) goto L22
            goto L36
        L22:
            com.google.common.cache.d r1 = r2.a     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r1.e(r6, r3)     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L3d
            boolean r6 = r2.tryLock()     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L36
            r2.h(r3)     // Catch: java.lang.Throwable -> L38
            r2.unlock()     // Catch: java.lang.Throwable -> L6e
        L36:
            r6 = r0
            goto L3d
        L38:
            r6 = move-exception
            r2.unlock()     // Catch: java.lang.Throwable -> L6e
            throw r6     // Catch: java.lang.Throwable -> L6e
        L3d:
            if (r6 != 0) goto L43
            r2.j()
            return r0
        L43:
            ec4 r1 = r6.b()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L70
            com.google.common.cache.d r0 = r2.a     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L58
            r6.j(r3)     // Catch: java.lang.Throwable -> L6e
        L58:
            java.util.AbstractQueue r0 = r2.j     // Catch: java.lang.Throwable -> L6e
            r0.add(r6)     // Catch: java.lang.Throwable -> L6e
            r6.getKey()     // Catch: java.lang.Throwable -> L6e
            com.google.common.cache.d r6 = r2.a     // Catch: java.lang.Throwable -> L6e
            r6.getClass()     // Catch: java.lang.Throwable -> L6e
            com.google.common.cache.d r6 = r2.a     // Catch: java.lang.Throwable -> L6e
            r6.getClass()     // Catch: java.lang.Throwable -> L6e
            r2.j()
            return r1
        L6e:
            r6 = move-exception
            goto L77
        L70:
            r2.s()     // Catch: java.lang.Throwable -> L6e
        L73:
            r2.j()
            return r0
        L77:
            r2.j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.d.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        LocalCache$Segment[] localCache$SegmentArr = this.c;
        long j = 0;
        for (LocalCache$Segment localCache$Segment : localCache$SegmentArr) {
            if (localCache$Segment.b != 0) {
                return false;
            }
            j += (long) localCache$Segment.d;
        }
        if (j == 0) {
            return true;
        }
        for (LocalCache$Segment localCache$Segment2 : localCache$SegmentArr) {
            if (localCache$Segment2.b != 0) {
                return false;
            }
            j -= (long) localCache$Segment2.d;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        yb4 yb4Var = this.q;
        if (yb4Var != null) {
            return yb4Var;
        }
        yb4 yb4Var2 = new yb4(this, 1);
        this.q = yb4Var2;
        return yb4Var2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iD = d(obj);
        return f(iD).k(iD, obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iD = d(obj);
        return f(iD).k(iD, obj, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r7 = r4.b();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r12 = com.google.common.cache.RemovalCause.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r7.b() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r12 = com.google.common.cache.RemovalCause.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r2.d++;
        r12 = r2.o(r3, r4, r5, r6, r7, r8);
        r0 = r2.b - 1;
        r9.set(r10, r12);
        r2.b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r2.unlock();
        r2.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        return r6;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            int r1 = r11.d(r12)
            com.google.common.cache.LocalCache$Segment r2 = r11.f(r1)
            r2.lock()
            com.google.common.cache.d r3 = r2.a     // Catch: java.lang.Throwable -> L51
            jl8 r3 = r3.o     // Catch: java.lang.Throwable -> L51
            long r3 = r3.a()     // Catch: java.lang.Throwable -> L51
            r2.p(r3)     // Catch: java.lang.Throwable -> L51
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r2.f     // Catch: java.lang.Throwable -> L51
            int r3 = r9.length()     // Catch: java.lang.Throwable -> L51
            int r3 = r3 + (-1)
            r10 = r1 & r3
            java.lang.Object r3 = r9.get(r10)     // Catch: java.lang.Throwable -> L51
            c27 r3 = (defpackage.c27) r3     // Catch: java.lang.Throwable -> L51
            r4 = r3
        L2b:
            if (r4 == 0) goto L77
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L51
            int r6 = r4.c()     // Catch: java.lang.Throwable -> L51
            if (r6 != r1) goto L7e
            if (r5 == 0) goto L7e
            com.google.common.cache.d r6 = r2.a     // Catch: java.lang.Throwable -> L51
            com.google.common.base.a r6 = r6.e     // Catch: java.lang.Throwable -> L51
            boolean r6 = r6.e(r12, r5)     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L7e
            ec4 r7 = r4.b()     // Catch: java.lang.Throwable -> L51
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L54
            com.google.common.cache.RemovalCause r12 = com.google.common.cache.RemovalCause.a     // Catch: java.lang.Throwable -> L51
        L4f:
            r8 = r12
            goto L5d
        L51:
            r0 = move-exception
            r12 = r0
            goto L83
        L54:
            boolean r12 = r7.b()     // Catch: java.lang.Throwable -> L51
            if (r12 == 0) goto L77
            com.google.common.cache.RemovalCause r12 = com.google.common.cache.RemovalCause.c     // Catch: java.lang.Throwable -> L51
            goto L4f
        L5d:
            int r12 = r2.d     // Catch: java.lang.Throwable -> L51
            int r12 = r12 + 1
            r2.d = r12     // Catch: java.lang.Throwable -> L51
            c27 r12 = r2.o(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L51
            int r0 = r2.b     // Catch: java.lang.Throwable -> L51
            int r0 = r0 + (-1)
            r9.set(r10, r12)     // Catch: java.lang.Throwable -> L51
            r2.b = r0     // Catch: java.lang.Throwable -> L51
            r2.unlock()
            r2.q()
            return r6
        L77:
            r2.unlock()
            r2.q()
            return r0
        L7e:
            c27 r4 = r4.a()     // Catch: java.lang.Throwable -> L51
            goto L2b
        L83:
            r2.unlock()
            r2.q()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.d.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object replace(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            r14.getClass()
            r15.getClass()
            int r0 = r13.d(r14)
            com.google.common.cache.LocalCache$Segment r1 = r13.f(r0)
            r1.lock()
            com.google.common.cache.d r2 = r1.a     // Catch: java.lang.Throwable -> L6f
            jl8 r2 = r2.o     // Catch: java.lang.Throwable -> L6f
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L6f
            r1.p(r2)     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r1.f     // Catch: java.lang.Throwable -> L6f
            int r4 = r8.length()     // Catch: java.lang.Throwable -> L6f
            int r4 = r4 + (-1)
            r9 = r0 & r4
            java.lang.Object r4 = r8.get(r9)     // Catch: java.lang.Throwable -> L6f
            c27 r4 = (defpackage.c27) r4     // Catch: java.lang.Throwable -> L6f
            r5 = r2
            r3 = r4
        L2e:
            r10 = 0
            if (r3 == 0) goto L72
            r2 = r4
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L6f
            int r7 = r3.c()     // Catch: java.lang.Throwable -> L6f
            if (r7 != r0) goto L95
            if (r4 == 0) goto L95
            com.google.common.cache.d r7 = r1.a     // Catch: java.lang.Throwable -> L6f
            com.google.common.base.a r7 = r7.e     // Catch: java.lang.Throwable -> L6f
            boolean r7 = r7.e(r14, r4)     // Catch: java.lang.Throwable -> L6f
            if (r7 == 0) goto L95
            r11 = r5
            ec4 r6 = r3.b()     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r5 = r6.get()     // Catch: java.lang.Throwable -> L6f
            if (r5 != 0) goto L79
            boolean r14 = r6.b()     // Catch: java.lang.Throwable -> L6f
            if (r14 == 0) goto L72
            int r14 = r1.d     // Catch: java.lang.Throwable -> L6f
            int r14 = r14 + 1
            r1.d = r14     // Catch: java.lang.Throwable -> L6f
            com.google.common.cache.RemovalCause r7 = com.google.common.cache.RemovalCause.c     // Catch: java.lang.Throwable -> L6f
            c27 r14 = r1.o(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6f
            int r15 = r1.b     // Catch: java.lang.Throwable -> L6f
            int r15 = r15 + (-1)
            r8.set(r9, r14)     // Catch: java.lang.Throwable -> L6f
            r1.b = r15     // Catch: java.lang.Throwable -> L6f
            goto L72
        L6f:
            r0 = move-exception
            r14 = r0
            goto L9d
        L72:
            r1.unlock()
            r1.q()
            return r10
        L79:
            int r0 = r1.d     // Catch: java.lang.Throwable -> L6f
            int r0 = r0 + 1
            r1.d = r0     // Catch: java.lang.Throwable -> L6f
            int r0 = r6.e()     // Catch: java.lang.Throwable -> L6f
            com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.b     // Catch: java.lang.Throwable -> L6f
            r1.e(r14, r5, r0, r2)     // Catch: java.lang.Throwable -> L6f
            r1.r(r3, r15, r11)     // Catch: java.lang.Throwable -> L6f
            r1.f(r3)     // Catch: java.lang.Throwable -> L6f
            r1.unlock()
            r1.q()
            return r5
        L95:
            r11 = r5
            c27 r3 = r3.a()     // Catch: java.lang.Throwable -> L6f
            r4 = r2
            r5 = r11
            goto L2e
        L9d:
            r1.unlock()
            r1.q()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.d.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (LocalCache$Segment localCache$Segment : this.c) {
            jMax += (long) Math.max(0, localCache$Segment.b);
        }
        return com.google.common.primitives.a.f(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        fc4 fc4Var = this.r;
        if (fc4Var != null) {
            return fc4Var;
        }
        fc4 fc4Var2 = new fc4(this);
        this.r = fc4Var2;
        return fc4Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r7 = r4.b();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r2.a.f.e(r15, r6) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r7.b() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r8 = com.google.common.cache.RemovalCause.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r2.d++;
        r14 = r2.o(r3, r4, r5, r6, r7, r8);
        r15 = r2.b - 1;
        r10.set(r12, r14);
        r2.b = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r8 != r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        r0 = true;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L91
            if (r15 != 0) goto L7
            goto L91
        L7:
            int r1 = r13.d(r14)
            com.google.common.cache.LocalCache$Segment r2 = r13.f(r1)
            com.google.common.cache.RemovalCause r9 = com.google.common.cache.RemovalCause.a
            r2.lock()
            com.google.common.cache.d r3 = r2.a     // Catch: java.lang.Throwable -> L82
            jl8 r3 = r3.o     // Catch: java.lang.Throwable -> L82
            long r3 = r3.a()     // Catch: java.lang.Throwable -> L82
            r2.p(r3)     // Catch: java.lang.Throwable -> L82
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r2.f     // Catch: java.lang.Throwable -> L82
            int r3 = r10.length()     // Catch: java.lang.Throwable -> L82
            r11 = 1
            int r3 = r3 - r11
            r12 = r1 & r3
            java.lang.Object r3 = r10.get(r12)     // Catch: java.lang.Throwable -> L82
            c27 r3 = (defpackage.c27) r3     // Catch: java.lang.Throwable -> L82
            r4 = r3
        L30:
            if (r4 == 0) goto L7b
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L82
            int r6 = r4.c()     // Catch: java.lang.Throwable -> L82
            if (r6 != r1) goto L85
            if (r5 == 0) goto L85
            com.google.common.cache.d r6 = r2.a     // Catch: java.lang.Throwable -> L82
            com.google.common.base.a r6 = r6.e     // Catch: java.lang.Throwable -> L82
            boolean r6 = r6.e(r14, r5)     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L85
            ec4 r7 = r4.b()     // Catch: java.lang.Throwable -> L82
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L82
            com.google.common.cache.d r14 = r2.a     // Catch: java.lang.Throwable -> L82
            com.google.common.base.a r14 = r14.f     // Catch: java.lang.Throwable -> L82
            boolean r14 = r14.e(r15, r6)     // Catch: java.lang.Throwable -> L82
            if (r14 == 0) goto L5c
            r8 = r9
            goto L67
        L5c:
            if (r6 != 0) goto L7b
            boolean r14 = r7.b()     // Catch: java.lang.Throwable -> L82
            if (r14 == 0) goto L7b
            com.google.common.cache.RemovalCause r14 = com.google.common.cache.RemovalCause.c     // Catch: java.lang.Throwable -> L82
            r8 = r14
        L67:
            int r14 = r2.d     // Catch: java.lang.Throwable -> L82
            int r14 = r14 + r11
            r2.d = r14     // Catch: java.lang.Throwable -> L82
            c27 r14 = r2.o(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L82
            int r15 = r2.b     // Catch: java.lang.Throwable -> L82
            int r15 = r15 - r11
            r10.set(r12, r14)     // Catch: java.lang.Throwable -> L82
            r2.b = r15     // Catch: java.lang.Throwable -> L82
            if (r8 != r9) goto L7b
            r0 = r11
        L7b:
            r2.unlock()
            r2.q()
            return r0
        L82:
            r0 = move-exception
            r14 = r0
            goto L8a
        L85:
            c27 r4 = r4.a()     // Catch: java.lang.Throwable -> L82
            goto L30
        L8a:
            r2.unlock()
            r2.q()
            throw r14
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.d.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean z;
        obj.getClass();
        obj3.getClass();
        boolean z2 = false;
        if (obj2 == null) {
            return false;
        }
        int iD = d(obj);
        LocalCache$Segment localCache$SegmentF = f(iD);
        localCache$SegmentF.lock();
        try {
            long jA = localCache$SegmentF.a.o.a();
            localCache$SegmentF.p(jA);
            AtomicReferenceArray atomicReferenceArray = localCache$SegmentF.f;
            int length = iD & (atomicReferenceArray.length() - 1);
            c27 c27Var = (c27) atomicReferenceArray.get(length);
            long j = jA;
            c27 c27VarA = c27Var;
            while (true) {
                if (c27VarA == null) {
                    z = z2;
                    break;
                }
                c27 c27Var2 = c27Var;
                Object key = c27VarA.getKey();
                if (c27VarA.c() == iD && key != null && localCache$SegmentF.a.e.e(obj, key)) {
                    z = z2;
                    long j2 = j;
                    ec4 ec4VarB = c27VarA.b();
                    Object obj4 = ec4VarB.get();
                    if (obj4 == null) {
                        if (ec4VarB.b()) {
                            localCache$SegmentF.d++;
                            c27 c27VarO = localCache$SegmentF.o(c27Var2, c27VarA, key, obj4, ec4VarB, RemovalCause.c);
                            int i = localCache$SegmentF.b - 1;
                            atomicReferenceArray.set(length, c27VarO);
                            localCache$SegmentF.b = i;
                        }
                    } else {
                        if (localCache$SegmentF.a.f.e(obj2, obj4)) {
                            localCache$SegmentF.d++;
                            localCache$SegmentF.e(obj, obj4, ec4VarB.e(), RemovalCause.b);
                            localCache$SegmentF.r(c27VarA, obj3, j2);
                            localCache$SegmentF.f(c27VarA);
                            return true;
                        }
                        localCache$SegmentF.l(c27VarA, j2);
                    }
                } else {
                    boolean z3 = z2;
                    c27Var = c27Var2;
                    long j3 = j;
                    int i2 = iD;
                    c27VarA = c27VarA.a();
                    iD = i2;
                    j = j3;
                    z2 = z3;
                }
            }
            return z;
        } finally {
            localCache$SegmentF.unlock();
            localCache$SegmentF.q();
        }
    }
}
