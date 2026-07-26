package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class x30 implements kl7 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ x30(int i, long j, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.kl7
    public final boolean e() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.kl7
    public final jl7 j(long j) {
        switch (this.a) {
            case 0:
                y30 y30Var = (y30) this.c;
                jl7 jl7VarB = y30Var.i[0].b(j);
                int i = 1;
                while (true) {
                    er0[] er0VarArr = y30Var.i;
                    if (i >= er0VarArr.length) {
                        return jl7VarB;
                    }
                    jl7 jl7VarB2 = er0VarArr[i].b(j);
                    if (jl7VarB2.a.b < jl7VarB.a.b) {
                        jl7VarB = jl7VarB2;
                    }
                    i++;
                }
                break;
            case 1:
                ud2 ud2Var = (ud2) this.c;
                vy2.t(ud2Var.k);
                qq4 qq4Var = ud2Var.k;
                long[] jArr = (long[]) qq4Var.a;
                long[] jArr2 = (long[]) qq4Var.b;
                int iE = j29.e(jArr, j29.j((((long) ud2Var.e) * j) / 1000000, 0L, ud2Var.j - 1), false);
                long j2 = iE == -1 ? 0L : jArr[iE];
                long j3 = iE != -1 ? jArr2[iE] : 0L;
                int i2 = ud2Var.e;
                long j4 = (j2 * 1000000) / ((long) i2);
                long j5 = this.b;
                ml7 ml7Var = new ml7(j4, j3 + j5);
                if (j4 == j || iE == jArr.length - 1) {
                    return new jl7(ml7Var, ml7Var);
                }
                int i3 = iE + 1;
                return new jl7(ml7Var, new ml7((jArr[i3] * 1000000) / ((long) i2), j5 + jArr2[i3]));
            default:
                return (jl7) this.c;
        }
    }

    @Override // defpackage.kl7
    public final long l() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((ud2) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x30(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public x30(long j, long j2) {
        this.a = 2;
        this.b = j;
        ml7 ml7Var = j2 == 0 ? ml7.c : new ml7(0L, j2);
        this.c = new jl7(ml7Var, ml7Var);
    }
}
