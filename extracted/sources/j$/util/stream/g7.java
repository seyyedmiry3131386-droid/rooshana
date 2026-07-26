package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class g7 extends x6 implements j$.util.v0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.x(this, consumer);
    }

    @Override // j$.util.stream.x6
    public final x6 e(Spliterator spliterator) {
        return new g7(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.x6
    public final void d() {
        m6 m6Var = new m6();
        this.h = m6Var;
        Objects.requireNonNull(m6Var);
        this.e = this.b.F0(new f7(m6Var, 1));
        this.f = new j$.util.p(9, this);
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.v0) super.trySplit();
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final j$.util.e1 trySplit() {
        return (j$.util.v0) super.trySplit();
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final j$.util.v0 trySplit() {
        return (j$.util.v0) super.trySplit();
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d;
        Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            m6 m6Var = (m6) this.h;
            long j = this.g;
            int iR = m6Var.r(j);
            if (m6Var.c == 0 && iR == 0) {
                d = ((double[]) m6Var.e)[(int) j];
            } else {
                d = ((double[][]) m6Var.f)[iR][(int) (j - m6Var.d[iR])];
            }
            doubleConsumer.accept(d);
        }
        return zA;
    }

    @Override // j$.util.e1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            f7 f7Var = new f7(doubleConsumer, 0);
            this.b.E0(this.d, f7Var);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
