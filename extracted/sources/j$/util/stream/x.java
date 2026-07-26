package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends a implements a0 {
    @Override // j$.util.stream.a0
    public final j$.util.c0 findAny() {
        return (j$.util.c0) H0(c0.d);
    }

    @Override // j$.util.stream.a0
    public final j$.util.c0 findFirst() {
        return (j$.util.c0) H0(c0.c);
    }

    @Override // j$.util.stream.a0
    public final a0 sorted() {
        return new b6(this, v6.q | v6.o, 0);
    }

    public static j$.util.v0 T0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.v0) {
            return (j$.util.v0) spliterator;
        }
        if (d8.a) {
            d8.a(a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        H0(new k0(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        H0(new k0(doubleConsumer, true));
    }

    @Override // j$.util.stream.a
    public final w6 L0() {
        return w6.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.a
    public final d2 J0(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return t3.c0(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final Spliterator S0(a aVar, Supplier supplier, boolean z) {
        return new g7(aVar, supplier, z);
    }

    @Override // j$.util.stream.a
    public final boolean K0(Spliterator spliterator, j5 j5Var) {
        DoubleConsumer f0Var;
        boolean zE;
        j$.util.v0 v0VarT0 = T0(spliterator);
        if (j5Var instanceof DoubleConsumer) {
            f0Var = (DoubleConsumer) j5Var;
        } else {
            if (d8.a) {
                d8.a(a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(j5Var);
            f0Var = new j$.util.f0(j5Var, 1);
        }
        do {
            zE = j5Var.e();
            if (zE) {
                break;
            }
        } while (v0VarT0.tryAdvance(f0Var));
        return zE;
    }

    @Override // j$.util.stream.t3
    public final v1 A0(long j, IntFunction intFunction) {
        return t3.i0(j);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.i0 iterator() {
        j$.util.v0 v0VarSpliterator = spliterator();
        Objects.requireNonNull(v0VarSpliterator);
        return new j$.util.j1(v0VarSpliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.v0 spliterator() {
        return T0(super.spliterator());
    }

    @Override // j$.util.stream.a0
    public final Stream boxed() {
        return new o(this, 0, new j$.time.format.a(22), 0);
    }

    @Override // j$.util.stream.a0
    public final a0 map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        return new p(this, v6.p | v6.n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.a0
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new o(this, v6.p | v6.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.a0
    public final IntStream A() {
        Objects.requireNonNull(null);
        return new q(this, v6.p | v6.n, 0);
    }

    @Override // j$.util.stream.a0
    public final j1 v() {
        Objects.requireNonNull(null);
        return new r(this, v6.p | v6.n, 0);
    }

    @Override // j$.util.stream.a0
    public final a0 d(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new p(this, v6.p | v6.n | v6.t, pVar, 1);
    }

    @Override // j$.util.stream.a0
    public final a0 b() {
        Objects.requireNonNull(null);
        return new t(this, v6.t, 1);
    }

    @Override // j$.util.stream.a0
    public final a0 peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new p(this, doubleConsumer);
    }

    @Override // j$.util.stream.a0
    public final a0 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return t3.v0(this, 0L, j);
    }

    @Override // j$.util.stream.a0
    public final a0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : t3.v0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.a0
    public final a0 a() {
        int i = v8.a;
        Objects.requireNonNull(null);
        return new b6(this, v8.a, 1);
    }

    @Override // j$.util.stream.a0
    public final a0 c() {
        int i = v8.a;
        Objects.requireNonNull(null);
        return new b6(this, v8.b, 2);
    }

    @Override // j$.util.stream.a0
    public final a0 distinct() {
        return ((b5) boxed()).distinct().mapToDouble(new j$.time.format.a(23));
    }

    @Override // j$.util.stream.a0
    public final double sum() {
        double[] dArr = (double[]) collect(new j$.time.format.a(26), new j$.time.format.a(27), new j$.time.format.a(15));
        int i = i.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.a0
    public final j$.util.c0 min() {
        return reduce(new j$.time.format.a(16));
    }

    @Override // j$.util.stream.a0
    public final j$.util.c0 max() {
        return reduce(new j$.time.format.a(25));
    }

    @Override // j$.util.stream.a0
    public final j$.util.c0 average() {
        double[] dArr = (double[]) collect(new j$.time.format.a(17), new j$.time.format.a(18), new j$.time.format.a(19));
        if (dArr[2] <= 0.0d) {
            return j$.util.c0.c;
        }
        int i = i.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new j$.util.c0(d / dArr[2]);
    }

    @Override // j$.util.stream.a0
    public final j$.util.y summaryStatistics() {
        return (j$.util.y) collect(new j$.time.format.a(9), new j$.time.format.a(20), new j$.time.format.a(21));
    }

    @Override // j$.util.stream.a0
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        m mVar = new m(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(mVar);
        return H0(new y3(w6.DOUBLE_VALUE, mVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.a0
    public final boolean p() {
        return ((Boolean) H0(t3.u0(q1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.a0
    public final boolean u() {
        return ((Boolean) H0(t3.u0(q1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.a0
    public final boolean C() {
        return ((Boolean) H0(t3.u0(q1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.a0
    public final double[] toArray() {
        return (double[]) t3.o0((x1) I0(new j$.time.format.a(24))).b();
    }

    @Override // j$.util.stream.a0
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) H0(new c4(w6.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.a0
    public final j$.util.c0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.c0) H0(new w3(w6.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.a0
    public final long count() {
        return ((Long) H0(new a4(1))).longValue();
    }
}
