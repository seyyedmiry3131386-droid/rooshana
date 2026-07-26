package j$.util.stream;

import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class g8 extends d5 {
    public final boolean b;

    public g8(c6 c6Var, j5 j5Var) {
        super(j5Var);
        this.b = true;
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i) {
        if (this.b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i);
            throw null;
        }
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final boolean e() {
        return !this.b || this.a.e();
    }
}
