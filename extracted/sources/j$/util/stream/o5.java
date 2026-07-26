package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class o5 extends e5 {
    public long b;
    public long c;
    public final /* synthetic */ p5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(p5 p5Var, j5 j5Var) {
        super(j5Var);
        this.d = p5Var;
        this.b = p5Var.s;
        long j = p5Var.t;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void c(long j) {
        this.a.c(t3.X(j, this.d.s, this.c));
    }

    @Override // j$.util.stream.i5, j$.util.stream.j5, java.util.function.LongConsumer
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 == 0) {
            long j3 = this.c;
            if (j3 > 0) {
                this.c = j3 - 1;
                this.a.accept(j);
                return;
            }
            return;
        }
        this.b = j2 - 1;
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final boolean e() {
        return this.c == 0 || this.a.e();
    }
}
