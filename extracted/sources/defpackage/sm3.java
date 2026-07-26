package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class sm3 extends mx4 {
    public final ab5 b;
    public final um3 c;

    public sm3(ab5 ab5Var, um3 um3Var) {
        this.b = ab5Var;
        this.c = um3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm3)) {
            return false;
        }
        sm3 sm3Var = (sm3) obj;
        return js3.i(this.b, sm3Var.b) && js3.i(this.c, sm3Var.c);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        ri1 ri1VarA = this.c.a(this.b);
        tm3 tm3Var = new tm3();
        tm3Var.q = ri1VarA;
        tm3Var.C0(ri1VarA);
        return tm3Var;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        tm3 tm3Var = (tm3) gx4Var;
        ri1 ri1VarA = this.c.a(this.b);
        tm3Var.D0(tm3Var.q);
        tm3Var.q = ri1VarA;
        tm3Var.C0(ri1VarA);
    }
}
