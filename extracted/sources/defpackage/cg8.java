package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cg8 extends mx4 {
    public final qp2 b;

    public cg8(qp2 qp2Var) {
        this.b = qp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cg8) {
            return this.b == ((cg8) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new eg8(this.b);
    }

    public final int hashCode() {
        qp2 qp2Var = this.b;
        if (qp2Var != null) {
            return qp2Var.hashCode();
        }
        return 0;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((eg8) gx4Var).q = this.b;
    }
}
