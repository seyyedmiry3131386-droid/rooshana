package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class vy5 extends mx4 {
    public final wy5 b;

    public vy5(wy5 wy5Var, sm5 sm5Var) {
        this.b = wy5Var;
    }

    public final boolean equals(Object obj) {
        vy5 vy5Var = obj instanceof vy5 ? (vy5) obj : null;
        if (vy5Var == null) {
            return false;
        }
        return js3.i(this.b, vy5Var.b);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        xy5 xy5Var = new xy5();
        xy5Var.o = this.b;
        return xy5Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((xy5) gx4Var).o = this.b;
    }
}
