package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qq0 extends mx4 {
    public final sm5 b;

    public qq0(sm5 sm5Var) {
        this.b = sm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qq0) {
            return this.b == ((qq0) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        pq0 pq0Var = new pq0();
        pq0Var.o = this.b;
        return pq0Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        pq0 pq0Var = (pq0) gx4Var;
        pq0Var.o = this.b;
        t17.f(pq0Var);
    }
}
