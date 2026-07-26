package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends d5 {
    public boolean b;
    public final j$.util.j0 c;
    public final /* synthetic */ s0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(s0 s0Var, j5 j5Var) {
        super(j5Var);
        this.d = s0Var;
        j5 j5Var2 = this.a;
        Objects.requireNonNull(j5Var2);
        this.c = new j$.util.j0(j5Var2, 1);
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i) throws Exception {
        IntStream intStream = (IntStream) ((j0) this.d.t).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                j$.util.j0 j0Var = this.c;
                if (!z) {
                    intStream.sequential().forEach(j0Var);
                } else {
                    j$.util.y0 y0VarSpliterator = intStream.sequential().spliterator();
                    while (!this.a.e() && y0VarSpliterator.tryAdvance((IntConsumer) j0Var)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final boolean e() {
        this.b = true;
        return this.a.e();
    }
}
