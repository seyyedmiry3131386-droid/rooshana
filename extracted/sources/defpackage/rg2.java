package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class rg2 extends mx4 {
    public final qg2 b;

    public rg2(qg2 qg2Var) {
        this.b = qg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg2) && js3.i(this.b, ((rg2) obj).b);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        tg2 tg2Var = new tg2();
        tg2Var.o = this.b;
        return tg2Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        tg2 tg2Var = (tg2) gx4Var;
        tg2Var.o.a.k(tg2Var);
        qg2 qg2Var = this.b;
        tg2Var.o = qg2Var;
        qg2Var.a.b(tg2Var);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.b + ')';
    }
}
