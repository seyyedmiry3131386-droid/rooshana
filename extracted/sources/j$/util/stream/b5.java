package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b5 extends a implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new e6(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new l(this, v6.m | v6.t);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) H0(g0.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) H0(g0.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new e6(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return H0(new y3(w6.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return H0(new y3(w6.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        H0(new n0(consumer, false));
    }

    @Override // j$.util.stream.Stream
    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        H0(new n0(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.a
    public final w6 L0() {
        return w6.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) H0(new w3(w6.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.a
    public final d2 J0(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return t3.b0(aVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.a
    public final Spliterator S0(a aVar, Supplier supplier, boolean z) {
        return new z7(aVar, supplier, z);
    }

    @Override // j$.util.stream.a
    public final boolean K0(Spliterator spliterator, j5 j5Var) {
        boolean zE;
        do {
            zE = j5Var.e();
            if (zE) {
                break;
            }
        } while (spliterator.tryAdvance(j5Var));
        return zE;
    }

    @Override // j$.util.stream.t3
    public final v1 A0(long j, IntFunction intFunction) {
        return t3.Z(j, intFunction);
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.g1(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new o(this, v6.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new o(this, v6.p | v6.n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new s0(this, v6.p | v6.n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return H0(new y3(w6.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final j1 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new c1(this, v6.p | v6.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final a0 mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new p(this, v6.p | v6.n, toDoubleFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) H0(new a4(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream d(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new o(this, v6.p | v6.n | v6.t, pVar, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream o(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new s0(this, v6.p | v6.n | v6.t, pVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final a0 z(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new p(this, v6.p | v6.n | v6.t, pVar, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0154  */
    @Override // j$.util.stream.Stream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(j$.util.stream.h r10) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.b5.h(j$.util.stream.h):java.lang.Object");
    }

    @Override // j$.util.stream.Stream
    public final j1 m(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new c1(this, v6.p | v6.n | v6.t, pVar, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new o(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return t3.C0(this, 0L, j);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : t3.C0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = v8.a;
        Objects.requireNonNull(predicate);
        return new e8(this, v8.a, predicate, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = v8.a;
        Objects.requireNonNull(predicate);
        return new e8(this, v8.b, predicate, 1);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return t3.n0(I0(intFunction), intFunction).m(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new e2(8));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) H0(t3.B0(q1.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) H0(t3.B0(q1.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) H0(t3.B0(q1.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
