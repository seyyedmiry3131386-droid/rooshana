package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public interface j1 extends BaseStream {
    IntStream B();

    j1 a();

    a0 asDoubleStream();

    j$.util.c0 average();

    j1 b();

    Stream boxed();

    j1 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    j1 d(j$.util.p pVar);

    j1 distinct();

    j1 e();

    j$.util.e0 findAny();

    j$.util.e0 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.BaseStream
    j$.util.q0 iterator();

    a0 k();

    j1 limit(long j);

    Stream mapToObj(LongFunction longFunction);

    j$.util.e0 max();

    j$.util.e0 min();

    boolean n();

    @Override // j$.util.stream.BaseStream
    j1 parallel();

    j1 peek(LongConsumer longConsumer);

    boolean r();

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.e0 reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.BaseStream
    j1 sequential();

    j1 skip(long j);

    j1 sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.b1 spliterator();

    long sum();

    j$.util.b0 summaryStatistics();

    long[] toArray();

    boolean x();
}
