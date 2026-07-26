package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class w4 extends f5 {
    public final /* synthetic */ int b = 0;
    public boolean c;
    public final Object d;
    public final /* synthetic */ a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(s0 s0Var, j5 j5Var) {
        super(j5Var);
        this.e = s0Var;
        j5 j5Var2 = this.a;
        Objects.requireNonNull(j5Var2);
        this.d = new j$.util.j0(j5Var2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(p pVar, j5 j5Var) {
        super(j5Var);
        this.e = pVar;
        j5 j5Var2 = this.a;
        Objects.requireNonNull(j5Var2);
        this.d = new j$.util.f0(j5Var2, 1);
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void c(long j) {
        switch (this.b) {
            case 0:
                this.a.c(-1L);
                break;
            case 1:
                this.a.c(-1L);
                break;
            default:
                this.a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) throws Exception {
        switch (this.b) {
            case 0:
                j$.util.n0 n0Var = (j$.util.n0) this.d;
                j1 j1Var = (j1) ((j$.util.p) ((c1) this.e).t).apply(obj);
                if (j1Var != null) {
                    try {
                        if (!this.c) {
                            j1Var.sequential().forEach(n0Var);
                        } else {
                            j$.util.b1 b1VarSpliterator = j1Var.sequential().spliterator();
                            while (!this.a.e() && b1VarSpliterator.tryAdvance((LongConsumer) n0Var)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            j1Var.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (j1Var != null) {
                    j1Var.close();
                    return;
                }
                return;
            case 1:
                j$.util.j0 j0Var = (j$.util.j0) this.d;
                IntStream intStream = (IntStream) ((j$.util.p) ((s0) this.e).t).apply(obj);
                if (intStream != null) {
                    try {
                        if (!this.c) {
                            intStream.sequential().forEach(j0Var);
                        } else {
                            j$.util.y0 y0VarSpliterator = intStream.sequential().spliterator();
                            while (!this.a.e() && y0VarSpliterator.tryAdvance((IntConsumer) j0Var)) {
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                    break;
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                j$.util.f0 f0Var = (j$.util.f0) this.d;
                a0 a0Var = (a0) ((j$.util.p) ((p) this.e).t).apply(obj);
                if (a0Var != null) {
                    try {
                        if (!this.c) {
                            a0Var.sequential().forEach(f0Var);
                        } else {
                            j$.util.v0 v0VarSpliterator = a0Var.sequential().spliterator();
                            while (!this.a.e() && v0VarSpliterator.tryAdvance((DoubleConsumer) f0Var)) {
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            a0Var.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                    break;
                }
                if (a0Var != null) {
                    a0Var.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final boolean e() {
        switch (this.b) {
            case 0:
                this.c = true;
                break;
            case 1:
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
        return this.a.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(c1 c1Var, j5 j5Var) {
        super(j5Var);
        this.e = c1Var;
        j5 j5Var2 = this.a;
        Objects.requireNonNull(j5Var2);
        this.d = new j$.util.n0(j5Var2, 1);
    }
}
