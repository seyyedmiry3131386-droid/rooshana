package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xw5 extends rq4 {
    public final fa7 p;
    public final eh q;

    public xw5(fa7 fa7Var) {
        eh ehVarA;
        this.p = fa7Var;
        if (ia7.j(fa7Var)) {
            ehVarA = null;
        } else {
            ehVarA = gh.a();
            bl4.j(ehVarA, fa7Var);
        }
        this.q = ehVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xw5) {
            return js3.i(this.p, ((xw5) obj).p);
        }
        return false;
    }

    public final int hashCode() {
        return this.p.hashCode();
    }

    @Override // defpackage.rq4
    public final sy6 y() {
        fa7 fa7Var = this.p;
        return new sy6(fa7Var.a, fa7Var.b, fa7Var.c, fa7Var.d);
    }
}
