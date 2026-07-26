package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public interface a0 extends BaseStream {
    IntStream A();

    boolean C();

    a0 a();

    j$.util.c0 average();

    a0 b();

    Stream boxed();

    a0 c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    a0 d(j$.util.p pVar);

    a0 distinct();

    j$.util.c0 findAny();

    j$.util.c0 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.BaseStream
    j$.util.i0 iterator();

    a0 limit(long j);

    a0 map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.c0 max();

    j$.util.c0 min();

    boolean p();

    @Override // j$.util.stream.BaseStream
    a0 parallel();

    a0 peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.c0 reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.BaseStream
    a0 sequential();

    a0 skip(long j);

    a0 sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.v0 spliterator();

    double sum();

    j$.util.y summaryStatistics();

    double[] toArray();

    boolean u();

    j1 v();
}
