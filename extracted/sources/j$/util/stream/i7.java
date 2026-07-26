package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class i7 extends x6 implements j$.util.y0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }

    @Override // j$.util.stream.x6
    public final x6 e(Spliterator spliterator) {
        return new i7(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.x6
    public final void d() {
        o6 o6Var = new o6();
        this.h = o6Var;
        Objects.requireNonNull(o6Var);
        this.e = this.b.F0(new h7(o6Var, 1));
        this.f = new j$.util.p(10, this);
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.y0) super.trySplit();
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final j$.util.e1 trySplit() {
        return (j$.util.y0) super.trySplit();
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final j$.util.y0 trySplit() {
        return (j$.util.y0) super.trySplit();
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            o6 o6Var = (o6) this.h;
            long j = this.g;
            int iR = o6Var.r(j);
            if (o6Var.c == 0 && iR == 0) {
                i = ((int[]) o6Var.e)[(int) j];
            } else {
                i = ((int[][]) o6Var.f)[iR][(int) (j - o6Var.d[iR])];
            }
            intConsumer.accept(i);
        }
        return zA;
    }

    @Override // j$.util.e1
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            h7 h7Var = new h7(intConsumer, 0);
            this.b.E0(this.d, h7Var);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
