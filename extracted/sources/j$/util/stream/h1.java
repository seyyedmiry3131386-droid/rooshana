package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h1 implements j1 {
    public final /* synthetic */ LongStream a;

    public /* synthetic */ h1(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ j1 f(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof i1 ? ((i1) longStream).a : new h1(longStream);
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ IntStream B() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j1 a() {
        return f(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ a0 asDoubleStream() {
        return y.f(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j$.util.c0 average() {
        return j$.com.android.tools.r8.a.B(this.a.average());
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j1 b() {
        return f(this.a.filter(null));
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ Stream boxed() {
        return Stream.VivifiedWrapper.convert(this.a.boxed());
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j1 c() {
        return f(this.a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j1 distinct() {
        return f(this.a.distinct());
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j1 e() {
        return f(this.a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.a;
        if (obj instanceof h1) {
            obj = ((h1) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j$.util.e0 findAny() {
        return j$.com.android.tools.r8.a.D(this.a.findAny());
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j$.util.e0 findFirst() {
        return j$.com.android.tools.r8.a.D(this.a.findFirst());
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.j1, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.q0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.p0 ? ((j$.util.p0) it).a : new j$.util.o0(it);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ a0 k() {
        return y.f(this.a.mapToDouble(null));
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j1 limit(long j) {
        return f(this.a.limit(j));
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return Stream.VivifiedWrapper.convert(this.a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j$.util.e0 max() {
        return j$.com.android.tools.r8.a.D(this.a.max());
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j$.util.e0 min() {
        return j$.com.android.tools.r8.a.D(this.a.min());
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ boolean n() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return e.f(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return e.f(this.a.parallel());
    }

    @Override // j$.util.stream.j1, j$.util.stream.BaseStream
    public final /* synthetic */ j1 parallel() {
        return f(this.a.parallel());
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j1 peek(LongConsumer longConsumer) {
        return f(this.a.peek(longConsumer));
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ boolean r() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j$.util.e0 reduce(LongBinaryOperator longBinaryOperator) {
        return j$.com.android.tools.r8.a.D(this.a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return e.f(this.a.sequential());
    }

    @Override // j$.util.stream.j1, j$.util.stream.BaseStream
    public final /* synthetic */ j1 sequential() {
        return f(this.a.sequential());
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j1 skip(long j) {
        return f(this.a.skip(j));
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ j1 sorted() {
        return f(this.a.sorted());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.f1.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.j1, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.b1 spliterator() {
        return j$.util.z0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return e.f(this.a.unordered());
    }

    @Override // j$.util.stream.j1
    public final /* synthetic */ boolean x() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.j1
    public final j$.util.b0 summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.j1
    public final j1 d(j$.util.p pVar) {
        LongStream longStream = this.a;
        j$.util.p pVar2 = new j$.util.p(6);
        pVar2.b = pVar;
        return f(longStream.flatMap(pVar2));
    }
}
