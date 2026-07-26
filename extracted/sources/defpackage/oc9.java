package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class oc9 implements kl7 {
    public final jg0 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public oc9(jg0 jg0Var, int i, long j, long j2) {
        this.a = jg0Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) jg0Var.d);
        this.d = j3;
        this.e = a(j3);
    }

    public final long a(long j) {
        long j2 = j * ((long) this.b);
        long j3 = this.a.c;
        String str = j29.a;
        return j29.d0(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // defpackage.kl7
    public final boolean e() {
        return true;
    }

    @Override // defpackage.kl7
    public final jl7 j(long j) {
        jg0 jg0Var = this.a;
        long j2 = (((long) jg0Var.c) * j) / (((long) this.b) * 1000000);
        long j3 = this.d;
        long j4 = j29.j(j2, 0L, j3 - 1);
        long j5 = ((long) jg0Var.d) * j4;
        long j6 = this.c;
        long jA = a(j4);
        ml7 ml7Var = new ml7(jA, j5 + j6);
        if (jA >= j || j4 == j3 - 1) {
            return new jl7(ml7Var, ml7Var);
        }
        long j7 = j4 + 1;
        return new jl7(ml7Var, new ml7(a(j7), (((long) jg0Var.d) * j7) + j6));
    }

    @Override // defpackage.kl7
    public final long l() {
        return this.e;
    }
}
