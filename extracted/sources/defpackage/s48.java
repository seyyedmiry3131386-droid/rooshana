package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s48 extends ek2 {
    public final /* synthetic */ kl7 b;
    public final /* synthetic */ nq0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s48(nq0 nq0Var, kl7 kl7Var, kl7 kl7Var2) {
        super(kl7Var);
        this.c = nq0Var;
        this.b = kl7Var2;
    }

    @Override // defpackage.ek2, defpackage.kl7
    public final jl7 j(long j) {
        jl7 jl7VarJ = this.b.j(j);
        ml7 ml7Var = jl7VarJ.a;
        long j2 = ml7Var.a;
        long j3 = ml7Var.b;
        long j4 = this.c.b;
        ml7 ml7Var2 = new ml7(j2, j3 + j4);
        ml7 ml7Var3 = jl7VarJ.b;
        return new jl7(ml7Var2, new ml7(ml7Var3.a, ml7Var3.b + j4));
    }
}
