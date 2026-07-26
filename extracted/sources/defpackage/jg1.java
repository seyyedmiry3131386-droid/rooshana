package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class jg1 implements kl7 {
    public final /* synthetic */ kg1 a;

    public jg1(kg1 kg1Var) {
        this.a = kg1Var;
    }

    @Override // defpackage.kl7
    public final boolean e() {
        return true;
    }

    @Override // defpackage.kl7
    public final jl7 j(long j) {
        kg1 kg1Var = this.a;
        long j2 = (((long) kg1Var.d.i) * j) / 1000000;
        long j3 = kg1Var.b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = kg1Var.c;
        ml7 ml7Var = new ml7(j, j29.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(kg1Var.f)).longValue() + j3) - 30000, kg1Var.b, j4 - 1));
        return new jl7(ml7Var, ml7Var);
    }

    @Override // defpackage.kl7
    public final long l() {
        kg1 kg1Var = this.a;
        return (kg1Var.f * 1000000) / ((long) kg1Var.d.i);
    }
}
