package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements a0 {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ y(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ a0 f(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof z ? ((z) doubleStream).a : new y(doubleStream);
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ IntStream A() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ boolean C() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ a0 a() {
        return f(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ j$.util.c0 average() {
        return j$.com.android.tools.r8.a.B(this.a.average());
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ a0 b() {
        return f(this.a.filter(null));
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ Stream boxed() {
        return Stream.VivifiedWrapper.convert(this.a.boxed());
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ a0 c() {
        return f(this.a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ a0 distinct() {
        return f(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof y) {
            obj = ((y) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ j$.util.c0 findAny() {
        return j$.com.android.tools.r8.a.B(this.a.findAny());
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ j$.util.c0 findFirst() {
        return j$.com.android.tools.r8.a.B(this.a.findFirst());
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.a0, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.i0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.h0 ? ((j$.util.h0) it).a : new j$.util.g0(it);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ a0 limit(long j) {
        return f(this.a.limit(j));
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ a0 map(DoubleUnaryOperator doubleUnaryOperator) {
        return f(this.a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return Stream.VivifiedWrapper.convert(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ j$.util.c0 max() {
        return j$.com.android.tools.r8.a.B(this.a.max());
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ j$.util.c0 min() {
        return j$.com.android.tools.r8.a.B(this.a.min());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return e.f(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ boolean p() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return e.f(this.a.parallel());
    }

    @Override // j$.util.stream.a0, j$.util.stream.BaseStream
    public final /* synthetic */ a0 parallel() {
        return f(this.a.parallel());
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ a0 peek(DoubleConsumer doubleConsumer) {
        return f(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ j$.util.c0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.com.android.tools.r8.a.B(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return e.f(this.a.sequential());
    }

    @Override // j$.util.stream.a0, j$.util.stream.BaseStream
    public final /* synthetic */ a0 sequential() {
        return f(this.a.sequential());
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ a0 skip(long j) {
        return f(this.a.skip(j));
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ a0 sorted() {
        return f(this.a.sorted());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.f1.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.a0, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.v0 spliterator() {
        return j$.util.t0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ boolean u() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return e.f(this.a.unordered());
    }

    @Override // j$.util.stream.a0
    public final /* synthetic */ j1 v() {
        return h1.f(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.a0
    public final j$.util.y summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.a0
    public final a0 d(j$.util.p pVar) {
        DoubleStream doubleStream = this.a;
        j$.util.p pVar2 = new j$.util.p(4);
        pVar2.b = pVar;
        return f(doubleStream.flatMap(pVar2));
    }
}
