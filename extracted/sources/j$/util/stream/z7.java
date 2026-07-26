package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class z7 extends x6 {
    @Override // j$.util.stream.x6
    public final x6 e(Spliterator spliterator) {
        return new z7(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.x6
    public final void d() {
        t6 t6Var = new t6();
        this.h = t6Var;
        Objects.requireNonNull(t6Var);
        this.e = this.b.F0(new y7(t6Var, 0));
        this.f = new j$.util.p(12, this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        t6 t6Var = (t6) this.h;
        long j = this.g;
        if (t6Var.c != 0) {
            if (j >= t6Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= t6Var.c; i++) {
                long j2 = t6Var.d[i];
                Object[] objArr = t6Var.f[i];
                if (j < ((long) objArr.length) + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j < t6Var.b) {
            obj = t6Var.e[(int) j];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        consumer.n(obj);
        return zA;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            y7 y7Var = new y7(consumer, 1);
            this.b.E0(this.d, y7Var);
            this.i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
