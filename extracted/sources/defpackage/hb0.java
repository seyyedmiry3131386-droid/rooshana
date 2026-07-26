package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hb0 implements kl7 {
    public final jb0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public hb0(jb0 jb0Var, long j, long j2, long j3, long j4, long j5) {
        this.a = jb0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.kl7
    public final boolean e() {
        return true;
    }

    @Override // defpackage.kl7
    public final jl7 j(long j) {
        ml7 ml7Var = new ml7(j, ib0.a(this.a.c(j), 0L, this.c, this.d, this.e, this.f));
        return new jl7(ml7Var, ml7Var);
    }

    @Override // defpackage.kl7
    public final long l() {
        return this.b;
    }
}
