package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends e5 {
    public boolean b;
    public final j$.util.n0 c;
    public final /* synthetic */ c1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, j5 j5Var) {
        super(j5Var);
        this.d = c1Var;
        j5 j5Var2 = this.a;
        Objects.requireNonNull(j5Var2);
        this.c = new j$.util.n0(j5Var2, 1);
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.i5, j$.util.stream.j5, java.util.function.LongConsumer
    public final void accept(long j) throws Exception {
        j1 j1Var = (j1) ((j$.util.p) this.d.t).apply(j);
        if (j1Var != null) {
            try {
                boolean z = this.b;
                j$.util.n0 n0Var = this.c;
                if (!z) {
                    j1Var.sequential().forEach(n0Var);
                } else {
                    j$.util.b1 b1VarSpliterator = j1Var.sequential().spliterator();
                    while (!this.a.e() && b1VarSpliterator.tryAdvance((LongConsumer) n0Var)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    j1Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (j1Var != null) {
            j1Var.close();
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final boolean e() {
        this.b = true;
        return this.a.e();
    }
}
