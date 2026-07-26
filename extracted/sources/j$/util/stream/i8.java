package j$.util.stream;

import java.util.function.LongPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class i8 extends e5 {
    public final boolean b;

    public i8(d6 d6Var, j5 j5Var) {
        super(j5Var);
        this.b = true;
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.i5, j$.util.stream.j5, java.util.function.LongConsumer
    public final void accept(long j) {
        if (this.b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final boolean e() {
        return !this.b || this.a.e();
    }
}
