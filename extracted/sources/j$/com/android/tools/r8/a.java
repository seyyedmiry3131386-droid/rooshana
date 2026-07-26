package j$.com.android.tools.r8;

import j$.time.ZoneOffset;
import j$.time.c;
import j$.time.chrono.b0;
import j$.time.chrono.h0;
import j$.time.chrono.i;
import j$.time.chrono.j;
import j$.time.chrono.m;
import j$.time.chrono.n;
import j$.time.chrono.w;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.s;
import j$.util.Comparator;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.a0;
import j$.util.b1;
import j$.util.c0;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.concurrent.l;
import j$.util.concurrent.t;
import j$.util.d0;
import j$.util.e0;
import j$.util.f0;
import j$.util.function.b;
import j$.util.function.e;
import j$.util.function.f;
import j$.util.j0;
import j$.util.n0;
import j$.util.u1;
import j$.util.v0;
import j$.util.y0;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void I(Map map, BiConsumer biConsumer) {
        if (map instanceof j$.util.Map) {
            ((j$.util.Map) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            ConcurrentMap.CC.$default$forEach((java.util.concurrent.ConcurrentMap) map, biConsumer);
        } else {
            Map.CC.$default$forEach(map, biConsumer);
        }
    }

    public static /* synthetic */ Object L(java.util.Map map, Object obj, Object obj2) {
        return map instanceof j$.util.Map ? ((j$.util.Map) map).getOrDefault(obj, obj2) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$getOrDefault((java.util.concurrent.ConcurrentMap) map, obj, obj2) : Map.CC.$default$getOrDefault(map, obj, obj2);
    }

    public static /* synthetic */ long M(long j, int i) {
        long j2 = i;
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j2 != Long.MIN_VALUE) | (j >= 0)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long N(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ Map.Entry O(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(obj), Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ boolean P(Unsafe unsafe, Object obj, long j, l lVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j2 = j;
            l lVar2 = lVar;
            if (unsafe2.compareAndSwapObject(obj2, j2, (Object) null, lVar2)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j2) != null) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j = j2;
            lVar = lVar2;
        }
    }

    public static /* synthetic */ long Q(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long R(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ long S(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ Comparator V(Comparator comparator, Comparator comparator2) {
        return comparator instanceof j$.util.Comparator ? ((j$.util.Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public static Optional E(j$.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        Object obj = optional.a;
        if (obj != null) {
            return Optional.of(obj);
        }
        throw new NoSuchElementException("No value present");
    }

    public static j$.util.Optional A(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (!optional.isPresent()) {
            return j$.util.Optional.b;
        }
        return new j$.util.Optional(optional.get());
    }

    public static c0 B(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return c0.c;
        }
        return new c0(optionalDouble.getAsDouble());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b d(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.d(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    public static e e(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.e
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return j$.com.android.tools.r8.a.e(this, intConsumer3);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                intConsumer.accept(i);
                intConsumer2.accept(i);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static f f(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.f(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                longConsumer.accept(j);
                longConsumer2.accept(j);
            }
        };
    }

    public static e0 D(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return e0.c;
        }
        return new e0(optionalLong.getAsLong());
    }

    public static t b(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new t(1, biConsumer, biConsumer2);
    }

    public static t c(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new t(biFunction, function);
    }

    public static d0 C(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return d0.c;
        }
        return new d0(optionalInt.getAsInt());
    }

    public static String T(Object obj, Object obj2) {
        String string;
        String string2;
        String str = Ssh2PublicKeyAlgorithmName.NULL;
        if (obj == null || (string = obj.toString()) == null) {
            string = Ssh2PublicKeyAlgorithmName.NULL;
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static void J(Iterator it, Consumer consumer) {
        if (it instanceof a0) {
            ((a0) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static OptionalDouble F(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        boolean z = c0Var.a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(c0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalInt G(d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        boolean z = d0Var.a;
        if (!z) {
            return OptionalInt.empty();
        }
        if (z) {
            return OptionalInt.of(d0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalLong H(e0 e0Var) {
        if (e0Var == null) {
            return null;
        }
        boolean z = e0Var.a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(e0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static boolean q(n nVar, p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.ERA : pVar != null && pVar.i(nVar);
    }

    public static m K(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Object objRequireNonNull = (m) temporalAccessor.l(q.b);
        j$.time.chrono.t tVar = j$.time.chrono.t.c;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(tVar, "defaultObj");
        }
        return (m) objRequireNonNull;
    }

    public static int m(j jVar, p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = i.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 1) {
                throw new s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i != 2) {
                return jVar.p().i(pVar);
            }
            return jVar.g().a;
        }
        return q.a(jVar, pVar);
    }

    public static int n(n nVar, p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        return q.a(nVar, pVar);
    }

    public static long o(n nVar, p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new s(c.a("Unsupported field: ", pVar));
        }
        return pVar.l(nVar);
    }

    public static m U(String str) {
        ConcurrentHashMap concurrentHashMap = j$.time.chrono.a.a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = j$.time.chrono.a.a;
            m mVar = (m) concurrentHashMap2.get(str);
            if (mVar == null) {
                mVar = (m) j$.time.chrono.a.b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                for (m mVar2 : ServiceLoader.load(m.class)) {
                    if (str.equals(mVar2.h()) || str.equals(mVar2.n())) {
                        return mVar2;
                    }
                }
                throw new j$.time.b("Unknown chronology: " + str);
            }
            j$.time.chrono.p pVar = j$.time.chrono.p.l;
            pVar.getClass();
            j$.time.chrono.a.i(pVar, "Hijrah-umalqura");
            w wVar = w.c;
            wVar.getClass();
            j$.time.chrono.a.i(wVar, "Japanese");
            b0 b0Var = b0.c;
            b0Var.getClass();
            j$.time.chrono.a.i(b0Var, "Minguo");
            h0 h0Var = h0.c;
            h0Var.getClass();
            j$.time.chrono.a.i(h0Var, "ThaiBuddhist");
            try {
                for (j$.time.chrono.a aVar : Arrays.asList(new j$.time.chrono.a[0])) {
                    if (!aVar.h().equals("ISO")) {
                        j$.time.chrono.a.i(aVar, aVar.h());
                    }
                }
                j$.time.chrono.t tVar = j$.time.chrono.t.c;
                tVar.getClass();
                j$.time.chrono.a.i(tVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static Object u(n nVar, j$.time.format.a aVar) {
        if (aVar == q.c) {
            return j$.time.temporal.b.ERAS;
        }
        return q.c(nVar, aVar);
    }

    public static Object s(j$.time.chrono.e eVar, j$.time.format.a aVar) {
        if (aVar == q.a || aVar == q.e || aVar == q.d) {
            return null;
        }
        if (aVar == q.g) {
            return eVar.b();
        }
        if (aVar == q.b) {
            return eVar.a();
        }
        if (aVar == q.c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(eVar);
    }

    public static boolean p(j$.time.chrono.b bVar, p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).isDateBased();
        }
        return pVar != null && pVar.i(bVar);
    }

    public static long v(j$.time.chrono.e eVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((eVar.f().x() * 86400) + ((long) eVar.b().O())) - ((long) zoneOffset.a);
    }

    public static Object t(j jVar, j$.time.format.a aVar) {
        if (aVar == q.e || aVar == q.a) {
            return jVar.v();
        }
        if (aVar == q.d) {
            return jVar.g();
        }
        if (aVar == q.g) {
            return jVar.b();
        }
        if (aVar == q.b) {
            return jVar.a();
        }
        if (aVar == q.c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(jVar);
    }

    public static int h(j$.time.chrono.e eVar, j$.time.chrono.e eVar2) {
        int iA = eVar.f().compareTo(eVar2.f());
        return (iA == 0 && (iA = eVar.b().compareTo(eVar2.b())) == 0) ? ((j$.time.chrono.a) eVar.a()).h().compareTo(eVar2.a().h()) : iA;
    }

    public static Object r(j$.time.chrono.b bVar, j$.time.format.a aVar) {
        if (aVar == q.a || aVar == q.e || aVar == q.d || aVar == q.g) {
            return null;
        }
        if (aVar == q.b) {
            return bVar.a();
        }
        if (aVar == q.c) {
            return j$.time.temporal.b.DAYS;
        }
        return aVar.a(bVar);
    }

    public static j$.time.temporal.m a(j$.time.chrono.b bVar, j$.time.temporal.m mVar) {
        return mVar.c(bVar.x(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long w(j jVar) {
        return ((jVar.f().x() * 86400) + ((long) jVar.b().O())) - ((long) jVar.g().a);
    }

    public static int i(j jVar, j jVar2) {
        int iCompare = Long.compare(jVar.B(), jVar2.B());
        return (iCompare == 0 && (iCompare = jVar.b().d - jVar2.b().d) == 0 && (iCompare = jVar.p().z(jVar2.p())) == 0 && (iCompare = jVar.v().h().compareTo(jVar2.v().h())) == 0) ? ((j$.time.chrono.a) jVar.a()).h().compareTo(jVar2.a().h()) : iCompare;
    }

    public static boolean y(y0 y0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return y0Var.tryAdvance((IntConsumer) consumer);
        }
        if (u1.a) {
            u1.a(y0Var.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return y0Var.tryAdvance((IntConsumer) new j0(consumer, 0));
    }

    public static void k(y0 y0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            y0Var.forEachRemaining((IntConsumer) consumer);
        } else {
            if (u1.a) {
                u1.a(y0Var.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            y0Var.forEachRemaining((IntConsumer) new j0(consumer, 0));
        }
    }

    public static int g(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int iCompare = Long.compare(bVar.x(), bVar2.x());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((j$.time.chrono.a) bVar.a()).h().compareTo(bVar2.a().h());
    }

    public static boolean z(b1 b1Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return b1Var.tryAdvance((LongConsumer) consumer);
        }
        if (u1.a) {
            u1.a(b1Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return b1Var.tryAdvance((LongConsumer) new n0(consumer, 0));
    }

    public static void l(b1 b1Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            b1Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (u1.a) {
                u1.a(b1Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            b1Var.forEachRemaining((LongConsumer) new n0(consumer, 0));
        }
    }

    public static boolean x(v0 v0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return v0Var.tryAdvance((DoubleConsumer) consumer);
        }
        if (u1.a) {
            u1.a(v0Var.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return v0Var.tryAdvance((DoubleConsumer) new f0(consumer, 0));
    }

    public static void j(v0 v0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            v0Var.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (u1.a) {
                u1.a(v0Var.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            v0Var.forEachRemaining((DoubleConsumer) new f0(consumer, 0));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
