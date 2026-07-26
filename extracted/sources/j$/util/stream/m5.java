package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class m5 extends d5 {
    public long b;
    public long c;
    public final /* synthetic */ n5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(n5 n5Var, j5 j5Var) {
        super(j5Var);
        this.d = n5Var;
        this.b = n5Var.s;
        long j = n5Var.t;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void c(long j) {
        this.a.c(t3.X(j, this.d.s, this.c));
    }

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(i);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final boolean e() {
        return this.c == 0 || this.a.e();
    }
}
