package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends c5 {
    public boolean b;
    public final j$.util.f0 c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p pVar, j5 j5Var) {
        super(j5Var);
        this.d = pVar;
        j5 j5Var2 = this.a;
        Objects.requireNonNull(j5Var2);
        this.c = new j$.util.f0(j5Var2, 1);
    }

    @Override // j$.util.stream.c5, j$.util.stream.j5
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.g5, j$.util.stream.j5
    public final void accept(double d) throws Exception {
        a0 a0Var = (a0) ((j$.util.p) this.d.t).apply(d);
        if (a0Var != null) {
            try {
                boolean z = this.b;
                j$.util.f0 f0Var = this.c;
                if (!z) {
                    a0Var.sequential().forEach(f0Var);
                } else {
                    j$.util.v0 v0VarSpliterator = a0Var.sequential().spliterator();
                    while (!this.a.e() && v0VarSpliterator.tryAdvance((DoubleConsumer) f0Var)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    a0Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (a0Var != null) {
            a0Var.close();
        }
    }

    @Override // j$.util.stream.c5, j$.util.stream.j5
    public final boolean e() {
        this.b = true;
        return this.a.e();
    }
}
