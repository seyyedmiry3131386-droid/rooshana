package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p3 extends CountedCompleter implements j5 {
    public final Spliterator a;
    public final t3 b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public abstract p3 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        t3.D();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        t3.K();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        t3.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
    }

    public p3(Spliterator spliterator, t3 t3Var, int i) {
        this.a = spliterator;
        this.b = t3Var;
        this.c = d.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public p3(p3 p3Var, Spliterator spliterator, long j, long j2, int i) {
        super(p3Var);
        this.a = spliterator;
        this.b = p3Var.b;
        this.c = p3Var.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        p3 p3VarA = this;
        while (spliterator.estimateSize() > p3VarA.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            p3VarA.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            p3 p3Var = p3VarA;
            p3Var.a(spliteratorTrySplit, p3VarA.d, jEstimateSize).fork();
            p3VarA = p3Var.a(spliterator, p3Var.d + jEstimateSize, p3Var.e - jEstimateSize);
        }
        p3 p3Var2 = p3VarA;
        p3Var2.b.E0(spliterator, p3Var2);
        p3Var2.propagateCompletion();
    }

    @Override // j$.util.stream.j5
    public final void c(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }
}
