package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nc3 extends mx4 {
    public final ab0 b;

    public nc3(ab0 ab0Var) {
        this.b = ab0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        nc3 nc3Var = obj instanceof nc3 ? (nc3) obj : null;
        if (nc3Var == null) {
            return false;
        }
        return this.b.equals(nc3Var.b);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        oc3 oc3Var = new oc3();
        oc3Var.o = this.b;
        return oc3Var;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b.a);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((oc3) gx4Var).o = this.b;
    }
}
