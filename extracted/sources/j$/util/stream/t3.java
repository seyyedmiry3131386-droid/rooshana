package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t3 implements b8 {
    public static final w2 a = new w2();
    public static final u2 b = new u2();
    public static final v2 c = new v2();
    public static final t2 d = new t2();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public abstract v1 A0(long j, IntFunction intFunction);

    public abstract o4 D0();

    public abstract j5 E0(Spliterator spliterator, j5 j5Var);

    public abstract j5 F0(j5 j5Var);

    public abstract Spliterator G0(Spliterator spliterator);

    public abstract void g0(Spliterator spliterator, j5 j5Var);

    public abstract boolean h0(Spliterator spliterator, j5 j5Var);

    public abstract d2 k0(Spliterator spliterator, boolean z, IntFunction intFunction);

    public abstract long l0(Spliterator spliterator);

    @Override // j$.util.stream.b8
    public /* synthetic */ int w() {
        return 0;
    }

    public static j$.util.p r0(Function function) {
        j$.util.p pVar = new j$.util.p(5);
        pVar.b = function;
        return pVar;
    }

    public static long X(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static long a0(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static Spliterator Y(w6 w6Var, Spliterator spliterator, long j, long j2) {
        long jA0 = a0(j, j2);
        int i = s5.a[w6Var.ordinal()];
        if (i == 1) {
            return new p7(spliterator, j, jA0);
        }
        if (i == 2) {
            return new m7((j$.util.y0) spliterator, j, jA0);
        }
        if (i == 3) {
            return new n7((j$.util.b1) spliterator, j, jA0);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + w6Var);
        }
        return new l7((j$.util.v0) spliterator, j, jA0);
    }

    public static j$.util.concurrent.t B0(q1 q1Var, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(q1Var);
        return new j$.util.concurrent.t(w6.REFERENCE, q1Var, new j$.util.concurrent.t(5, q1Var, predicate));
    }

    public static x2 j0(w6 w6Var) {
        int i = f2.a[w6Var.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i == 4) {
            return d;
        }
        throw new IllegalStateException("Unknown shape " + w6Var);
    }

    public static j$.util.concurrent.t w0(q1 q1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(q1Var);
        return new j$.util.concurrent.t(w6.INT_VALUE, q1Var, new k1(q1Var, 1));
    }

    public static l5 C0(b5 b5Var, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new l5(b5Var, m0(j2), j, j2);
    }

    public static d2 W(d2 d2Var, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == d2Var.count()) {
            return d2Var;
        }
        Spliterator spliterator = d2Var.spliterator();
        long j3 = j2 - j;
        v1 v1VarZ = Z(j3, intFunction);
        v1VarZ.c(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new d0(29)); i++) {
        }
        if (j2 == d2Var.count()) {
            spliterator.forEachRemaining(v1VarZ);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(v1VarZ); i2++) {
            }
        }
        v1VarZ.end();
        return v1VarZ.build();
    }

    public static g2 f0(w6 w6Var, d2 d2Var, d2 d2Var2) {
        int i = f2.a[w6Var.ordinal()];
        if (i == 1) {
            return new p2(d2Var, d2Var2);
        }
        if (i == 2) {
            return new m2((z1) d2Var, (z1) d2Var2);
        }
        if (i == 3) {
            return new n2((b2) d2Var, (b2) d2Var2);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + w6Var);
        }
        return new l2((x1) d2Var, (x1) d2Var2);
    }

    public static j$.util.concurrent.t y0(q1 q1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(q1Var);
        return new j$.util.concurrent.t(w6.LONG_VALUE, q1Var, new k1(q1Var, 0));
    }

    public static void K() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static j$.util.concurrent.t u0(q1 q1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(q1Var);
        return new j$.util.concurrent.t(w6.DOUBLE_VALUE, q1Var, new k1(q1Var, 2));
    }

    public static void L() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static v1 Z(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new y2(j, intFunction);
        }
        return new q3();
    }

    public static void D() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void G(h5 h5Var, Integer num) {
        if (d8.a) {
            d8.a(h5Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        h5Var.accept(num.intValue());
    }

    public static void I(i5 i5Var, Long l) {
        if (d8.a) {
            d8.a(i5Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        i5Var.accept(l.longValue());
    }

    public static t1 s0(long j) {
        if (j < 0 || j >= 2147483639) {
            return new b3();
        }
        return new a3(j);
    }

    public static void E(g5 g5Var, Double d2) {
        if (d8.a) {
            d8.a(g5Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        g5Var.accept(d2.doubleValue());
    }

    public static n5 x0(y0 y0Var, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new n5(y0Var, m0(j2), j, j2);
    }

    public static u1 t0(long j) {
        if (j < 0 || j >= 2147483639) {
            return new k3();
        }
        return new j3(j);
    }

    public static Object[] M(c2 c2Var, IntFunction intFunction) {
        if (d8.a) {
            d8.a(c2Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (c2Var.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) c2Var.count());
        c2Var.k(objArr, 0);
        return objArr;
    }

    public static s1 i0(long j) {
        if (j < 0 || j >= 2147483639) {
            return new s2();
        }
        return new r2(j);
    }

    public static d2 b0(t3 t3Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jL0 = t3Var.l0(spliterator);
        if (jL0 < 0 || !spliterator.hasCharacteristics(16384)) {
            j0 j0Var = new j0();
            j0Var.a = intFunction;
            d2 d2Var = (d2) new j2(t3Var, spliterator, j0Var, new e2(7), 3).invoke();
            return z ? n0(d2Var, intFunction) : d2Var;
        }
        if (jL0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jL0);
        new o3(spliterator, t3Var, objArr).invoke();
        return new h2(objArr);
    }

    public static void R(z1 z1Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            z1Var.g((IntConsumer) consumer);
        } else {
            if (d8.a) {
                d8.a(z1Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.y0) z1Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static p5 z0(g1 g1Var, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new p5(g1Var, m0(j2), j, j2);
    }

    public static void O(z1 z1Var, Integer[] numArr, int i) {
        if (d8.a) {
            d8.a(z1Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) z1Var.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static z1 U(z1 z1Var, long j, long j2) {
        if (j == 0 && j2 == z1Var.count()) {
            return z1Var;
        }
        long j3 = j2 - j;
        j$.util.y0 y0Var = (j$.util.y0) z1Var.spliterator();
        t1 t1VarS0 = s0(j3);
        t1VarS0.c(j3);
        for (int i = 0; i < j && y0Var.tryAdvance((IntConsumer) new y1(0)); i++) {
        }
        if (j2 == z1Var.count()) {
            y0Var.forEachRemaining((IntConsumer) t1VarS0);
        } else {
            for (int i2 = 0; i2 < j3 && y0Var.tryAdvance((IntConsumer) t1VarS0); i2++) {
            }
        }
        t1VarS0.end();
        return t1VarS0.build();
    }

    public static z1 d0(t3 t3Var, Spliterator spliterator, boolean z) {
        long jL0 = t3Var.l0(spliterator);
        if (jL0 < 0 || !spliterator.hasCharacteristics(16384)) {
            z1 z1Var = (z1) new j2(t3Var, spliterator, new e2(3), new e2(4), 1).invoke();
            return z ? p0(z1Var) : z1Var;
        }
        if (jL0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jL0];
        new m3(spliterator, t3Var, iArr).invoke();
        return new z2(iArr);
    }

    public static b2 e0(t3 t3Var, Spliterator spliterator, boolean z) {
        long jL0 = t3Var.l0(spliterator);
        if (jL0 < 0 || !spliterator.hasCharacteristics(16384)) {
            b2 b2Var = (b2) new j2(t3Var, spliterator, new e2(5), new e2(6), 2).invoke();
            return z ? q0(b2Var) : b2Var;
        }
        if (jL0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jL0];
        new n3(spliterator, t3Var, jArr).invoke();
        return new i3(jArr);
    }

    public static void S(b2 b2Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            b2Var.g((LongConsumer) consumer);
        } else {
            if (d8.a) {
                d8.a(b2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.b1) b2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void P(b2 b2Var, Long[] lArr, int i) {
        if (d8.a) {
            d8.a(b2Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) b2Var.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static b2 V(b2 b2Var, long j, long j2) {
        if (j == 0 && j2 == b2Var.count()) {
            return b2Var;
        }
        long j3 = j2 - j;
        j$.util.b1 b1Var = (j$.util.b1) b2Var.spliterator();
        u1 u1VarT0 = t0(j3);
        u1VarT0.c(j3);
        for (int i = 0; i < j && b1Var.tryAdvance((LongConsumer) new a2(0)); i++) {
        }
        if (j2 == b2Var.count()) {
            b1Var.forEachRemaining((LongConsumer) u1VarT0);
        } else {
            for (int i2 = 0; i2 < j3 && b1Var.tryAdvance((LongConsumer) u1VarT0); i2++) {
            }
        }
        u1VarT0.end();
        return u1VarT0.build();
    }

    public static x1 c0(t3 t3Var, Spliterator spliterator, boolean z) {
        long jL0 = t3Var.l0(spliterator);
        if (jL0 < 0 || !spliterator.hasCharacteristics(16384)) {
            x1 x1Var = (x1) new j2(t3Var, spliterator, new e2(1), new e2(2), 0).invoke();
            return z ? o0(x1Var) : x1Var;
        }
        if (jL0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jL0];
        new l3(spliterator, t3Var, dArr).invoke();
        return new q2(dArr);
    }

    public static r5 v0(x xVar, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new r5(xVar, m0(j2), j, j2);
    }

    public static d2 n0(d2 d2Var, IntFunction intFunction) {
        if (d2Var.o() <= 0) {
            return d2Var;
        }
        long jCount = d2Var.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new s3(d2Var, objArr, 1).invoke();
        return new h2(objArr);
    }

    public static void Q(x1 x1Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            x1Var.g((DoubleConsumer) consumer);
        } else {
            if (d8.a) {
                d8.a(x1Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.v0) x1Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static z1 p0(z1 z1Var) {
        if (z1Var.o() <= 0) {
            return z1Var;
        }
        long jCount = z1Var.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new r3(z1Var, iArr, 0).invoke();
        return new z2(iArr);
    }

    public static void N(x1 x1Var, Double[] dArr, int i) {
        if (d8.a) {
            d8.a(x1Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) x1Var.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static x1 T(x1 x1Var, long j, long j2) {
        if (j == 0 && j2 == x1Var.count()) {
            return x1Var;
        }
        long j3 = j2 - j;
        j$.util.v0 v0Var = (j$.util.v0) x1Var.spliterator();
        s1 s1VarI0 = i0(j3);
        s1VarI0.c(j3);
        for (int i = 0; i < j && v0Var.tryAdvance((DoubleConsumer) new w1(0)); i++) {
        }
        if (j2 == x1Var.count()) {
            v0Var.forEachRemaining((DoubleConsumer) s1VarI0);
        } else {
            for (int i2 = 0; i2 < j3 && v0Var.tryAdvance((DoubleConsumer) s1VarI0); i2++) {
            }
        }
        s1VarI0.end();
        return s1VarI0.build();
    }

    public static b2 q0(b2 b2Var) {
        if (b2Var.o() <= 0) {
            return b2Var;
        }
        long jCount = b2Var.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new r3(b2Var, jArr, 0).invoke();
        return new i3(jArr);
    }

    public static int m0(long j) {
        return (j != -1 ? v6.u : 0) | v6.t;
    }

    public static x1 o0(x1 x1Var) {
        if (x1Var.o() <= 0) {
            return x1Var;
        }
        long jCount = x1Var.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new r3(x1Var, dArr, 0).invoke();
        return new q2(dArr);
    }

    @Override // j$.util.stream.b8
    public Object f(a aVar, Spliterator spliterator) {
        o4 o4VarD0 = D0();
        aVar.E0(spliterator, o4VarD0);
        return o4VarD0.get();
    }

    @Override // j$.util.stream.b8
    public Object j(t3 t3Var, Spliterator spliterator) {
        return ((o4) new v4(this, t3Var, spliterator).invoke()).get();
    }
}
