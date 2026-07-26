package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap.Segment;
import defpackage.ai4;
import defpackage.gu9;
import defpackage.oh4;
import defpackage.sh4;
import defpackage.uh4;
import defpackage.wn5;
import defpackage.xh4;
import defpackage.zh4;
import j$.util.concurrent.ConcurrentMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class MapMakerInternalMap<K, V, E extends sh4, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, j$.util.concurrent.ConcurrentMap {
    public static final oh4 j = new oh4();
    private static final long serialVersionUID = 5;
    public final transient int a;
    public final transient int b;
    public final transient Segment[] c;
    public final int d;
    public final com.google.common.base.a e;
    public final transient d1 f;
    public transient b1 g;
    public transient b0 h;
    public transient b1 i;

    public static abstract class AbstractSerializationProxy<K, V> extends f0 implements Serializable {
        private static final long serialVersionUID = 3;
        public final Strength s;
        public final Strength t;
        public final com.google.common.base.a u;
        public final int v;
        public transient AbstractMap w;

        /* JADX WARN: Multi-variable type inference failed */
        public AbstractSerializationProxy(Strength strength, Strength strength2, com.google.common.base.a aVar, int i, ConcurrentMap concurrentMap) {
            super(16);
            this.s = strength;
            this.t = strength2;
            this.u = aVar;
            this.v = i;
            this.w = (AbstractMap) concurrentMap;
        }

        @Override // defpackage.hs9
        /* JADX INFO: renamed from: A */
        public final Object Y() {
            return this.w;
        }

        @Override // defpackage.yj2
        public final Map Y() {
            return this.w;
        }
    }

    public static abstract class Segment<K, V, E extends sh4, S extends Segment<K, V, E, S>> extends ReentrantLock {
        public static final /* synthetic */ int g = 0;
        public final MapMakerInternalMap a;
        public volatile int b;
        public int c;
        public int d;
        public volatile AtomicReferenceArray e;
        public final AtomicInteger f = new AtomicInteger();

        public Segment(MapMakerInternalMap mapMakerInternalMap, int i) {
            this.a = mapMakerInternalMap;
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
            this.d = (atomicReferenceArray.length() * 3) / 4;
            this.e = atomicReferenceArray;
        }

        public final void a(ReferenceQueue referenceQueue) {
            int i = 0;
            do {
                Object objPoll = referenceQueue.poll();
                if (objPoll == null) {
                    return;
                }
                sh4 sh4Var = (sh4) objPoll;
                MapMakerInternalMap mapMakerInternalMap = this.a;
                mapMakerInternalMap.getClass();
                int iC = sh4Var.c();
                Segment segmentB = mapMakerInternalMap.b(iC);
                segmentB.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segmentB.e;
                    int length = iC & (atomicReferenceArray.length() - 1);
                    sh4 sh4Var2 = (sh4) atomicReferenceArray.get(length);
                    sh4 sh4VarA = sh4Var2;
                    while (true) {
                        if (sh4VarA == null) {
                            break;
                        }
                        if (sh4VarA == sh4Var) {
                            segmentB.c++;
                            sh4 sh4VarJ = segmentB.j(sh4Var2, sh4VarA);
                            int i2 = segmentB.b - 1;
                            atomicReferenceArray.set(length, sh4VarJ);
                            segmentB.b = i2;
                            break;
                        }
                        sh4VarA = sh4VarA.a();
                    }
                    i++;
                } finally {
                    segmentB.unlock();
                }
            } while (i != 16);
        }

        public final void b(ReferenceQueue referenceQueue) {
            int i = 0;
            do {
                Object objPoll = referenceQueue.poll();
                if (objPoll == null) {
                    return;
                }
                ai4 ai4Var = (ai4) objPoll;
                MapMakerInternalMap mapMakerInternalMap = this.a;
                mapMakerInternalMap.getClass();
                sh4 sh4VarC = ai4Var.c();
                int iC = sh4VarC.c();
                Segment segmentB = mapMakerInternalMap.b(iC);
                Object key = sh4VarC.getKey();
                segmentB.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segmentB.e;
                    int length = (atomicReferenceArray.length() - 1) & iC;
                    sh4 sh4Var = (sh4) atomicReferenceArray.get(length);
                    sh4 sh4VarA = sh4Var;
                    while (true) {
                        if (sh4VarA == null) {
                            break;
                        }
                        Object key2 = sh4VarA.getKey();
                        if (sh4VarA.c() != iC || key2 == null || !segmentB.a.e.e(key, key2)) {
                            sh4VarA = sh4VarA.a();
                        } else if (((zh4) sh4VarA).b() == ai4Var) {
                            segmentB.c++;
                            sh4 sh4VarJ = segmentB.j(sh4Var, sh4VarA);
                            int i2 = segmentB.b - 1;
                            atomicReferenceArray.set(length, sh4VarJ);
                            segmentB.b = i2;
                        }
                    }
                    i++;
                } finally {
                    segmentB.unlock();
                }
            } while (i != 16);
        }

        public final void c() {
            AtomicReferenceArray atomicReferenceArray = this.e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.b;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
            this.d = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                sh4 sh4VarA = (sh4) atomicReferenceArray.get(i2);
                if (sh4VarA != null) {
                    sh4 sh4VarA2 = sh4VarA.a();
                    int iC = sh4VarA.c() & length2;
                    if (sh4VarA2 == null) {
                        atomicReferenceArray2.set(iC, sh4VarA);
                    } else {
                        sh4 sh4Var = sh4VarA;
                        while (sh4VarA2 != null) {
                            int iC2 = sh4VarA2.c() & length2;
                            if (iC2 != iC) {
                                sh4Var = sh4VarA2;
                                iC = iC2;
                            }
                            sh4VarA2 = sh4VarA2.a();
                        }
                        atomicReferenceArray2.set(iC, sh4Var);
                        while (sh4VarA != sh4Var) {
                            int iC3 = sh4VarA.c() & length2;
                            sh4 sh4VarF = this.a.f.f(l(), sh4VarA, (sh4) atomicReferenceArray2.get(iC3));
                            if (sh4VarF != null) {
                                atomicReferenceArray2.set(iC3, sh4VarF);
                            } else {
                                i--;
                            }
                            sh4VarA = sh4VarA.a();
                        }
                    }
                }
            }
            this.e = atomicReferenceArray2;
            this.b = i;
        }

        public final sh4 e(int i, Object obj) {
            if (this.b == 0) {
                return null;
            }
            for (sh4 sh4VarA = (sh4) this.e.get((r0.length() - 1) & i); sh4VarA != null; sh4VarA = sh4VarA.a()) {
                if (sh4VarA.c() == i) {
                    Object key = sh4VarA.getKey();
                    if (key == null) {
                        n();
                    } else if (this.a.e.e(obj, key)) {
                        return sh4VarA;
                    }
                }
            }
            return null;
        }

        public void f() {
        }

        public void g() {
        }

        public final void h() {
            if ((this.f.incrementAndGet() & 63) == 0) {
                k();
            }
        }

        public final Object i(int i, Object obj, Object obj2, boolean z) {
            lock();
            try {
                k();
                int i2 = this.b + 1;
                if (i2 > this.d) {
                    c();
                    i2 = this.b + 1;
                }
                AtomicReferenceArray atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                sh4 sh4Var = (sh4) atomicReferenceArray.get(length);
                for (sh4 sh4VarA = sh4Var; sh4VarA != null; sh4VarA = sh4VarA.a()) {
                    Object key = sh4VarA.getKey();
                    if (sh4VarA.c() == i && key != null && this.a.e.e(obj, key)) {
                        Object value = sh4VarA.getValue();
                        if (value == null) {
                            this.c++;
                            m(sh4VarA, obj2);
                            this.b = this.b;
                            unlock();
                            return null;
                        }
                        if (z) {
                            unlock();
                            return value;
                        }
                        this.c++;
                        m(sh4VarA, obj2);
                        unlock();
                        return value;
                    }
                }
                this.c++;
                sh4 sh4VarE = this.a.f.e(l(), obj, i, sh4Var);
                m(sh4VarE, obj2);
                atomicReferenceArray.set(length, sh4VarE);
                this.b = i2;
                unlock();
                return null;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        public final sh4 j(sh4 sh4Var, sh4 sh4Var2) {
            int i = this.b;
            sh4 sh4VarA = sh4Var2.a();
            while (sh4Var != sh4Var2) {
                sh4 sh4VarF = this.a.f.f(l(), sh4Var, sh4VarA);
                if (sh4VarF != null) {
                    sh4VarA = sh4VarF;
                } else {
                    i--;
                }
                sh4Var = sh4Var.a();
            }
            this.b = i;
            return sh4VarA;
        }

        public final void k() {
            if (tryLock()) {
                try {
                    g();
                    this.f.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract Segment l();

        public final void m(sh4 sh4Var, Object obj) {
            this.a.f.c(l(), sh4Var, obj);
        }

        public final void n() {
            if (tryLock()) {
                try {
                    g();
                } finally {
                    unlock();
                }
            }
        }
    }

    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        /* JADX WARN: Multi-variable type inference failed */
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            int i = objectInputStream.readInt();
            a1 a1Var = new a1();
            wn5.j(i >= 0);
            a1Var.b = i;
            Strength strength = a1Var.d;
            wn5.q(strength, "Key strength was already set to %s", strength == null);
            Strength strength2 = this.s;
            strength2.getClass();
            a1Var.d = strength2;
            Strength.AnonymousClass1 anonymousClass1 = Strength.a;
            if (strength2 != anonymousClass1) {
                a1Var.a = true;
            }
            Strength strength3 = a1Var.e;
            wn5.q(strength3, "Value strength was already set to %s", strength3 == null);
            Strength strength4 = this.t;
            strength4.getClass();
            a1Var.e = strength4;
            if (strength4 != anonymousClass1) {
                a1Var.a = true;
            }
            com.google.common.base.a aVar = a1Var.f;
            wn5.q(aVar, "key equivalence was already set to %s", aVar == null);
            com.google.common.base.a aVar2 = this.u;
            aVar2.getClass();
            a1Var.f = aVar2;
            a1Var.a = true;
            int i2 = a1Var.c;
            wn5.r("concurrency level was already set to %s", i2, i2 == -1);
            int i3 = this.v;
            wn5.j(i3 > 0);
            a1Var.c = i3;
            this.w = (AbstractMap) a1Var.a();
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                } else {
                    this.w.put(object, objectInputStream.readObject());
                }
            }
        }

        private Object readResolve() {
            return this.w;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.w.size());
            for (Map.Entry<K, V> entry : this.w.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Strength {
        public static final AnonymousClass1 a;
        public static final AnonymousClass2 b;
        public static final /* synthetic */ Strength[] c;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.MapMakerInternalMap$Strength$1] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.collect.MapMakerInternalMap$Strength$2] */
        static {
            ?? r0 = new Strength() { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
                @Override // com.google.common.collect.MapMakerInternalMap.Strength
                public final com.google.common.base.a a() {
                    return com.google.common.base.a.c();
                }
            };
            a = r0;
            ?? r1 = new Strength() { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
                @Override // com.google.common.collect.MapMakerInternalMap.Strength
                public final com.google.common.base.a a() {
                    return com.google.common.base.a.f();
                }
            };
            b = r1;
            c = new Strength[]{r0, r1};
        }

        public static Strength valueOf(String str) {
            return (Strength) Enum.valueOf(Strength.class, str);
        }

        public static Strength[] values() {
            return (Strength[]) c.clone();
        }

        public abstract com.google.common.base.a a();
    }

    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker$Dummy, Object, StrongKeyDummyValueSegment<K>> {
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment l() {
            return this;
        }
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, uh4, StrongKeyStrongValueSegment<K, V>> {
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment l() {
            return this;
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, g1, StrongKeyWeakValueSegment<K, V>> {
        public final ReferenceQueue h;

        public StrongKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.h = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            while (this.h.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void g() {
            b(this.h);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment l() {
            return this;
        }
    }

    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker$Dummy, Object, WeakKeyDummyValueSegment<K>> {
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            throw null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void g() {
            a(null);
            throw null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment l() {
            return this;
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, xh4, WeakKeyStrongValueSegment<K, V>> {
        public final ReferenceQueue h;

        public WeakKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.h = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            while (this.h.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void g() {
            a(this.h);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment l() {
            return this;
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, j1, WeakKeyWeakValueSegment<K, V>> {
        public final ReferenceQueue h;
        public final ReferenceQueue i;

        public WeakKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.h = new ReferenceQueue();
            this.i = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            while (this.h.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void g() {
            a(this.h);
            b(this.i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment l() {
            return this;
        }
    }

    public MapMakerInternalMap(a1 a1Var, d1 d1Var) {
        int i = a1Var.c;
        this.d = Math.min(i == -1 ? 4 : i, 65536);
        this.e = (com.google.common.base.a) gu9.p(a1Var.f, ((Strength) gu9.p(a1Var.d, Strength.a)).a());
        this.f = d1Var;
        int i2 = a1Var.b;
        int iMin = Math.min(i2 == -1 ? 16 : i2, 1073741824);
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        while (i6 < this.d) {
            i5++;
            i6 <<= 1;
        }
        this.b = 32 - i5;
        this.a = i6 - 1;
        this.c = new Segment[i6];
        int i7 = iMin / i6;
        while (i4 < (i6 * i7 < iMin ? i7 + 1 : i7)) {
            i4 <<= 1;
        }
        while (true) {
            Segment[] segmentArr = this.c;
            if (i3 >= segmentArr.length) {
                return;
            }
            segmentArr[i3] = this.f.a(this, i4);
            i3++;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public final int a(Object obj) {
        int iB = this.e.b(obj);
        int i = iB + ((iB << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    public final Segment b(int i) {
        return this.c[(i >>> this.b) & this.a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (Segment segment : this.c) {
            if (segment.b != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segment.e;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    segment.f();
                    segment.f.set(0);
                    segment.c++;
                    segment.b = 0;
                    segment.unlock();
                } catch (Throwable th) {
                    segment.unlock();
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

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.getClass();
        try {
            if (segmentB.b == 0) {
                return false;
            }
            sh4 sh4VarE = segmentB.e(iA, obj);
            if (sh4VarE != null) {
                if (sh4VarE.getValue() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            segmentB.h();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object value;
        if (obj != null) {
            Segment[] segmentArr = this.c;
            long j2 = -1;
            int i = 0;
            while (i < 3) {
                int length = segmentArr.length;
                long j3 = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    Segment segment = segmentArr[i2];
                    int i3 = segment.b;
                    AtomicReferenceArray atomicReferenceArray = segment.e;
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        for (sh4 sh4VarA = (sh4) atomicReferenceArray.get(i4); sh4VarA != null; sh4VarA = sh4VarA.a()) {
                            if (sh4VarA.getKey() == null || (value = sh4VarA.getValue()) == null) {
                                segment.n();
                                value = null;
                            }
                            if (value != null && this.f.d().a().e(obj, value)) {
                                return true;
                            }
                        }
                    }
                    j3 += (long) segment.c;
                }
                if (j3 == j2) {
                    return false;
                }
                i++;
                j2 = j3;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b1 b1Var = this.i;
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1(this, 0);
        this.i = b1Var2;
        return b1Var2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.getClass();
        try {
            sh4 sh4VarE = segmentB.e(iA, obj);
            if (sh4VarE == null) {
                return null;
            }
            Object value = sh4VarE.getValue();
            if (value == null) {
                segmentB.n();
            }
            return value;
        } finally {
            segmentB.h();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Segment[] segmentArr = this.c;
        long j2 = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].b != 0) {
                return false;
            }
            j2 += (long) segmentArr[i].c;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].b != 0) {
                return false;
            }
            j2 -= (long) segmentArr[i2].c;
        }
        return j2 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        b1 b1Var = this.g;
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1(this, 1);
        this.g = b1Var2;
        return b1Var2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).i(iA, obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).i(iA, obj, obj2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.k();
            AtomicReferenceArray atomicReferenceArray = segmentB.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            sh4 sh4Var = (sh4) atomicReferenceArray.get(length);
            for (sh4 sh4VarA = sh4Var; sh4VarA != null; sh4VarA = sh4VarA.a()) {
                Object key = sh4VarA.getKey();
                if (sh4VarA.c() == iA && key != null && segmentB.a.e.e(obj, key)) {
                    Object value = sh4VarA.getValue();
                    if (value == null && sh4VarA.getValue() != null) {
                        return null;
                    }
                    segmentB.c++;
                    sh4 sh4VarJ = segmentB.j(sh4Var, sh4VarA);
                    int i = segmentB.b - 1;
                    atomicReferenceArray.set(length, sh4VarJ);
                    segmentB.b = i;
                    return value;
                }
            }
            return null;
        } finally {
            segmentB.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.k();
            AtomicReferenceArray atomicReferenceArray = segmentB.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            sh4 sh4Var = (sh4) atomicReferenceArray.get(length);
            for (sh4 sh4VarA = sh4Var; sh4VarA != null; sh4VarA = sh4VarA.a()) {
                Object key = sh4VarA.getKey();
                if (sh4VarA.c() == iA && key != null && segmentB.a.e.e(obj, key)) {
                    Object value = sh4VarA.getValue();
                    if (value != null) {
                        segmentB.c++;
                        segmentB.m(sh4VarA, obj2);
                        return value;
                    }
                    if (sh4VarA.getValue() == null) {
                        segmentB.c++;
                        sh4 sh4VarJ = segmentB.j(sh4Var, sh4VarA);
                        int i = segmentB.b - 1;
                        atomicReferenceArray.set(length, sh4VarJ);
                        segmentB.b = i;
                    }
                    return null;
                }
            }
            return null;
        } finally {
            segmentB.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j2 = 0;
        for (Segment segment : this.c) {
            j2 += (long) segment.b;
        }
        return com.google.common.primitives.a.f(j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        b0 b0Var = this.h;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this, 1);
        this.h = b0Var2;
        return b0Var2;
    }

    public Object writeReplace() {
        d1 d1Var = this.f;
        Strength strengthB = d1Var.b();
        Strength strengthD = d1Var.d();
        d1Var.d().a();
        return new SerializationProxy(strengthB, strengthD, this.e, this.d, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.k();
            AtomicReferenceArray atomicReferenceArray = segmentB.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            sh4 sh4Var = (sh4) atomicReferenceArray.get(length);
            for (sh4 sh4VarA = sh4Var; sh4VarA != null; sh4VarA = sh4VarA.a()) {
                Object key = sh4VarA.getKey();
                if (sh4VarA.c() == iA && key != null && segmentB.a.e.e(obj, key)) {
                    if (segmentB.a.f.d().a().e(obj2, sh4VarA.getValue())) {
                        z = true;
                    } else if (sh4VarA.getValue() != null) {
                        return false;
                    }
                    segmentB.c++;
                    sh4 sh4VarJ = segmentB.j(sh4Var, sh4VarA);
                    int i = segmentB.b - 1;
                    atomicReferenceArray.set(length, sh4VarJ);
                    segmentB.b = i;
                    return z;
                }
            }
            return false;
        } finally {
            segmentB.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.k();
            AtomicReferenceArray atomicReferenceArray = segmentB.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            sh4 sh4Var = (sh4) atomicReferenceArray.get(length);
            for (sh4 sh4VarA = sh4Var; sh4VarA != null; sh4VarA = sh4VarA.a()) {
                Object key = sh4VarA.getKey();
                if (sh4VarA.c() == iA && key != null && segmentB.a.e.e(obj, key)) {
                    Object value = sh4VarA.getValue();
                    if (value == null) {
                        if (sh4VarA.getValue() == null) {
                            segmentB.c++;
                            sh4 sh4VarJ = segmentB.j(sh4Var, sh4VarA);
                            int i = segmentB.b - 1;
                            atomicReferenceArray.set(length, sh4VarJ);
                            segmentB.b = i;
                        }
                        return false;
                    }
                    if (!segmentB.a.f.d().a().e(obj2, value)) {
                        return false;
                    }
                    segmentB.c++;
                    segmentB.m(sh4VarA, obj3);
                    return true;
                }
            }
            return false;
        } finally {
            segmentB.unlock();
        }
    }
}
