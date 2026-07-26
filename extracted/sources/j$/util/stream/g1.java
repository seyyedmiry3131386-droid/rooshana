package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g1 extends a implements j1 {
    @Override // j$.util.stream.j1
    public final j$.util.e0 findAny() {
        return (j$.util.e0) H0(f0.d);
    }

    @Override // j$.util.stream.j1
    public final j$.util.e0 findFirst() {
        return (j$.util.e0) H0(f0.c);
    }

    @Override // j$.util.stream.j1
    public final j1 sorted() {
        return new d6(this, v6.q | v6.o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        H0(new m0(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        H0(new m0(longConsumer, true));
    }

    public static j$.util.b1 T0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.b1) {
            return (j$.util.b1) spliterator;
        }
        if (d8.a) {
            d8.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.a
    public final w6 L0() {
        return w6.LONG_VALUE;
    }

    @Override // j$.util.stream.a
    public final d2 J0(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return t3.e0(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final Spliterator S0(a aVar, Supplier supplier, boolean z) {
        return new k7(aVar, supplier, z);
    }

    @Override // j$.util.stream.a
    public final boolean K0(Spliterator spliterator, j5 j5Var) {
        LongConsumer n0Var;
        boolean zE;
        j$.util.b1 b1VarT0 = T0(spliterator);
        if (j5Var instanceof LongConsumer) {
            n0Var = (LongConsumer) j5Var;
        } else {
            if (d8.a) {
                d8.a(a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(j5Var);
            n0Var = new j$.util.n0(j5Var, 1);
        }
        do {
            zE = j5Var.e();
            if (zE) {
                break;
            }
        } while (b1VarT0.tryAdvance(n0Var));
        return zE;
    }

    @Override // j$.util.stream.t3
    public final v1 A0(long j, IntFunction intFunction) {
        return t3.t0(j);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.q0 iterator() {
        j$.util.b1 b1VarSpliterator = spliterator();
        Objects.requireNonNull(b1VarSpliterator);
        return new j$.util.i1(b1VarSpliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.b1 spliterator() {
        return T0(super.spliterator());
    }

    @Override // j$.util.stream.j1
    public final a0 asDoubleStream() {
        return new t(this, v6.n, 4);
    }

    @Override // j$.util.stream.j1
    public final Stream boxed() {
        return new o(this, 0, new d0(23), 2);
    }

    @Override // j$.util.stream.j1
    public final j1 e() {
        Objects.requireNonNull(null);
        return new r(this, v6.p | v6.n, 3);
    }

    @Override // j$.util.stream.j1
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new o(this, v6.p | v6.n, longFunction, 2);
    }

    @Override // j$.util.stream.j1
    public final IntStream B() {
        Objects.requireNonNull(null);
        return new q(this, v6.p | v6.n, 4);
    }

    @Override // j$.util.stream.j1
    public final a0 k() {
        Objects.requireNonNull(null);
        return new t(this, v6.p | v6.n, 5);
    }

    @Override // j$.util.stream.j1
    public final j1 d(j$.util.p pVar) {
        Objects.requireNonNull(pVar);
        return new c1(this, v6.p | v6.n | v6.t, pVar, 0);
    }

    @Override // j$.util.stream.j1
    public final j1 b() {
        Objects.requireNonNull(null);
        return new r(this, v6.t, 5);
    }

    @Override // j$.util.stream.j1
    public final j1 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new c1(this, longConsumer);
    }

    @Override // j$.util.stream.j1
    public final j1 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return t3.z0(this, 0L, j);
    }

    @Override // j$.util.stream.j1
    public final j1 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : t3.z0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.j1
    public final j1 a() {
        int i = v8.a;
        Objects.requireNonNull(null);
        return new d6(this, v8.a, 1);
    }

    @Override // j$.util.stream.j1
    public final j1 c() {
        int i = v8.a;
        Objects.requireNonNull(null);
        return new d6(this, v8.b, 2);
    }

    @Override // j$.util.stream.j1
    public final j1 distinct() {
        return ((b5) boxed()).distinct().mapToLong(new d0(20));
    }

    @Override // j$.util.stream.j1
    public final long sum() {
        return reduce(0L, new d0(28));
    }

    @Override // j$.util.stream.j1
    public final j$.util.e0 min() {
        return reduce(new d0(19));
    }

    @Override // j$.util.stream.j1
    public final j$.util.e0 max() {
        return reduce(new d0(27));
    }

    @Override // j$.util.stream.j1
    public final j$.util.c0 average() {
        long j = ((long[]) collect(new d0(24), new d0(25), new d0(26)))[0];
        return j > 0 ? new j$.util.c0(r0[1] / j) : j$.util.c0.c;
    }

    @Override // j$.util.stream.j1
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) H0(new u3(w6.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.j1
    public final j$.util.b0 summaryStatistics() {
        return (j$.util.b0) collect(new j$.time.format.a(11), new d0(18), new d0(21));
    }

    @Override // j$.util.stream.j1
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        m mVar = new m(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(mVar);
        return H0(new y3(w6.LONG_VALUE, mVar, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.j1
    public final boolean r() {
        return ((Boolean) H0(t3.y0(q1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.j1
    public final j$.util.e0 reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.e0) H0(new w3(w6.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.j1
    public final boolean x() {
        return ((Boolean) H0(t3.y0(q1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.j1
    public final boolean n() {
        return ((Boolean) H0(t3.y0(q1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.j1
    public final long[] toArray() {
        return (long[]) t3.q0((b2) I0(new d0(22))).b();
    }

    @Override // j$.util.stream.j1
    public final long count() {
        return ((Long) H0(new a4(0))).longValue();
    }
}
