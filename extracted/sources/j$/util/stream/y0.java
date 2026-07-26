package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y0 extends a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.d0 findAny() {
        return (j$.util.d0) H0(e0.d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.d0 findFirst() {
        return (j$.util.d0) H0(e0.c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new c6(this, v6.q | v6.o, 0);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        H0(new l0(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        H0(new l0(intConsumer, true));
    }

    public static j$.util.y0 T0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.y0) {
            return (j$.util.y0) spliterator;
        }
        if (d8.a) {
            d8.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.a
    public final w6 L0() {
        return w6.INT_VALUE;
    }

    @Override // j$.util.stream.a
    public final d2 J0(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return t3.d0(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final Spliterator S0(a aVar, Supplier supplier, boolean z) {
        return new i7(aVar, supplier, z);
    }

    @Override // j$.util.stream.a
    public final boolean K0(Spliterator spliterator, j5 j5Var) {
        IntConsumer j0Var;
        boolean zE;
        j$.util.y0 y0VarT0 = T0(spliterator);
        if (j5Var instanceof IntConsumer) {
            j0Var = (IntConsumer) j5Var;
        } else {
            if (d8.a) {
                d8.a(a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(j5Var);
            j0Var = new j$.util.j0(j5Var, 1);
        }
        do {
            zE = j5Var.e();
            if (zE) {
                break;
            }
        } while (y0VarT0.tryAdvance(j0Var));
        return zE;
    }

    @Override // j$.util.stream.t3
    public final v1 A0(long j, IntFunction intFunction) {
        return t3.s0(j);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.m0 iterator() {
        j$.util.y0 y0VarSpliterator = spliterator();
        Objects.requireNonNull(y0VarSpliterator);
        return new j$.util.h1(y0VarSpliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.y0 spliterator() {
        return T0(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final j1 asLongStream() {
        return new r(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final a0 asDoubleStream() {
        return new t(this, 0, 2);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new o(this, 0, new d0(9), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream e() {
        Objects.requireNonNull(null);
        return new q(this, v6.p | v6.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new o(this, v6.p | v6.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j1 l() {
        Objects.requireNonNull(null);
        return new r(this, v6.p | v6.n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final a0 g() {
        Objects.requireNonNull(null);
        return new t(this, v6.p | v6.n, 3);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) H0(new j4(w6.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream s(j0 j0Var) {
        Objects.requireNonNull(j0Var);
        return new s0(this, v6.p | v6.n | v6.t, j0Var, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.d0 reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.d0) H0(new w3(w6.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new q(this, v6.t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new s0(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return t3.x0(this, 0L, j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : t3.x0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i = v8.a;
        Objects.requireNonNull(null);
        return new c6(this, v8.a, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i = v8.a;
        Objects.requireNonNull(null);
        return new c6(this, v8.b, 2);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) H0(new a4(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((b5) boxed()).distinct().mapToInt(new d0(8));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new d0(13));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.d0 min() {
        return reduce(new d0(10));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.d0 max() {
        return reduce(new d0(14));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 average() {
        long j = ((long[]) collect(new d0(15), new d0(16), new d0(17)))[0];
        return j > 0 ? new j$.util.c0(r0[1] / j) : j$.util.c0.c;
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.z summaryStatistics() {
        return (j$.util.z) collect(new j$.time.format.a(10), new d0(11), new d0(12));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        m mVar = new m(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(mVar);
        return H0(new y3(w6.INT_VALUE, mVar, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean y() {
        return ((Boolean) H0(t3.w0(q1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean q() {
        return ((Boolean) H0(t3.w0(q1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean t() {
        return ((Boolean) H0(t3.w0(q1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) t3.p0((z1) I0(new d0(7))).b();
    }
}
