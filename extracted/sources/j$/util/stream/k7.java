package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class k7 extends x6 implements j$.util.b1 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.z(this, consumer);
    }

    @Override // j$.util.stream.x6
    public final x6 e(Spliterator spliterator) {
        return new k7(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.x6
    public final void d() {
        q6 q6Var = new q6();
        this.h = q6Var;
        Objects.requireNonNull(q6Var);
        this.e = this.b.F0(new j7(q6Var, 1));
        this.f = new j$.util.p(11, this);
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.b1) super.trySplit();
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final j$.util.b1 trySplit() {
        return (j$.util.b1) super.trySplit();
    }

    @Override // j$.util.stream.x6, j$.util.Spliterator
    public final j$.util.e1 trySplit() {
        return (j$.util.b1) super.trySplit();
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            q6 q6Var = (q6) this.h;
            long j2 = this.g;
            int iR = q6Var.r(j2);
            if (q6Var.c == 0 && iR == 0) {
                j = ((long[]) q6Var.e)[(int) j2];
            } else {
                j = ((long[][]) q6Var.f)[iR][(int) (j2 - q6Var.d[iR])];
            }
            longConsumer.accept(j);
        }
        return zA;
    }

    @Override // j$.util.e1
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            j7 j7Var = new j7(longConsumer, 0);
            this.b.E0(this.d, j7Var);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
