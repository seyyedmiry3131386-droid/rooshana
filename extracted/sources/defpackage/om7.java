package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class om7 extends mx4 {
    public final boolean b;
    public final ab5 c;
    public final um3 d;
    public final boolean e;
    public final v97 f;
    public final bp2 g;

    public om7(boolean z, ab5 ab5Var, um3 um3Var, boolean z2, v97 v97Var, bp2 bp2Var) {
        this.b = z;
        this.c = ab5Var;
        this.d = um3Var;
        this.e = z2;
        this.f = v97Var;
        this.g = bp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || om7.class != obj.getClass()) {
            return false;
        }
        om7 om7Var = (om7) obj;
        return this.b == om7Var.b && js3.i(this.c, om7Var.c) && js3.i(this.d, om7Var.d) && this.e == om7Var.e && this.f.equals(om7Var.f) && this.g == om7Var.g;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        qm7 qm7Var = new qm7(this.c, this.d, false, this.e, null, this.f, this.g);
        qm7Var.N = this.b;
        return qm7Var;
    }

    public final int hashCode() {
        int i = (this.b ? 1231 : 1237) * 31;
        ab5 ab5Var = this.c;
        int iHashCode = (i + (ab5Var != null ? ab5Var.hashCode() : 0)) * 31;
        um3 um3Var = this.d;
        return this.g.hashCode() + ((((((((iHashCode + (um3Var != null ? um3Var.hashCode() : 0)) * 31) + 1237) * 31) + (this.e ? 1231 : 1237)) * 31) + this.f.a) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        qm7 qm7Var = (qm7) gx4Var;
        boolean z = qm7Var.N;
        boolean z2 = this.b;
        if (z != z2) {
            qm7Var.N = z2;
            t17.f(qm7Var);
        }
        qm7Var.Q0(this.c, this.d, false, this.e, null, this.f, this.g);
    }
}
