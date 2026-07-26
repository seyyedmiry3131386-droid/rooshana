package defpackage;

import androidx.compose.ui.state.ToggleableState;

/* JADX INFO: loaded from: classes.dex */
final class ks8 extends mx4 {
    public final ToggleableState b;
    public final ab5 c;
    public final boolean d;
    public final v97 e;
    public final bp2 f;

    public ks8(ToggleableState toggleableState, ab5 ab5Var, boolean z, v97 v97Var, bp2 bp2Var) {
        this.b = toggleableState;
        this.c = ab5Var;
        this.d = z;
        this.e = v97Var;
        this.f = bp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ks8.class != obj.getClass()) {
            return false;
        }
        ks8 ks8Var = (ks8) obj;
        return this.b == ks8Var.b && js3.i(this.c, ks8Var.c) && this.d == ks8Var.d && this.e.equals(ks8Var.e) && this.f == ks8Var.f;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        ls8 ls8Var = new ls8(this.c, null, false, this.d, null, this.e, this.f);
        ls8Var.N = this.b;
        return ls8Var;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        ab5 ab5Var = this.c;
        return this.f.hashCode() + ((((((((iHashCode + (ab5Var != null ? ab5Var.hashCode() : 0)) * 961) + 1237) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e.a) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ls8 ls8Var = (ls8) gx4Var;
        ToggleableState toggleableState = ls8Var.N;
        ToggleableState toggleableState2 = this.b;
        if (toggleableState != toggleableState2) {
            ls8Var.N = toggleableState2;
            t17.f(ls8Var);
        }
        ls8Var.Q0(this.c, null, false, this.d, null, this.e, this.f);
    }
}
