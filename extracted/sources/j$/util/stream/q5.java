package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class q5 extends c5 {
    public long b;
    public long c;
    public final /* synthetic */ r5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(r5 r5Var, j5 j5Var) {
        super(j5Var);
        this.d = r5Var;
        this.b = r5Var.s;
        long j = r5Var.t;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.c5, j$.util.stream.j5
    public final void c(long j) {
        this.a.c(t3.X(j, this.d.s, this.c));
    }

    @Override // j$.util.stream.g5, j$.util.stream.j5
    public final void accept(double d) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(d);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // j$.util.stream.c5, j$.util.stream.j5
    public final boolean e() {
        return this.c == 0 || this.a.e();
    }
}
