package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t49 extends mx4 {
    public final bb0 b;

    public t49(bb0 bb0Var) {
        this.b = bb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        t49 t49Var = obj instanceof t49 ? (t49) obj : null;
        if (t49Var == null) {
            return false;
        }
        return this.b.equals(t49Var.b);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        u49 u49Var = new u49();
        u49Var.o = this.b;
        return u49Var;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b.a);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((u49) gx4Var).o = this.b;
    }
}
