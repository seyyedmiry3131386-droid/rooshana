package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nm3 implements kl7 {
    public final ce4 a;
    public final ce4 b;
    public long c;

    public nm3(long j, long[] jArr, long[] jArr2) {
        vy2.j(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new ce4(length);
            this.b = new ce4(length);
        } else {
            int i = length + 1;
            ce4 ce4Var = new ce4(i);
            this.a = ce4Var;
            ce4 ce4Var2 = new ce4(i);
            this.b = ce4Var2;
            ce4Var.a(0L);
            ce4Var2.a(0L);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.kl7
    public final boolean e() {
        return this.b.b > 0;
    }

    @Override // defpackage.kl7
    public final jl7 j(long j) {
        ce4 ce4Var = this.b;
        if (ce4Var.b == 0) {
            ml7 ml7Var = ml7.c;
            return new jl7(ml7Var, ml7Var);
        }
        int iB = j29.b(ce4Var, j);
        long jD = ce4Var.d(iB);
        ce4 ce4Var2 = this.a;
        ml7 ml7Var2 = new ml7(jD, ce4Var2.d(iB));
        if (jD == j || iB == ce4Var.b - 1) {
            return new jl7(ml7Var2, ml7Var2);
        }
        int i = iB + 1;
        return new jl7(ml7Var2, new ml7(ce4Var.d(i), ce4Var2.d(i)));
    }

    @Override // defpackage.kl7
    public final long l() {
        return this.c;
    }
}
