package defpackage;

import androidx.compose.foundation.c;
import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
final class vg7 extends mx4 {
    public final bh7 b;
    public final Orientation c;
    public final boolean d;
    public final qe1 e;
    public final ab5 f;
    public final boolean g;
    public final c h;

    public vg7(qe1 qe1Var, ab5 ab5Var, bh7 bh7Var, c cVar, Orientation orientation, boolean z, boolean z2) {
        this.b = bh7Var;
        this.c = orientation;
        this.d = z;
        this.e = qe1Var;
        this.f = ab5Var;
        this.g = z2;
        this.h = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vg7.class != obj.getClass()) {
            return false;
        }
        vg7 vg7Var = (vg7) obj;
        return js3.i(this.b, vg7Var.b) && this.c == vg7Var.c && this.d == vg7Var.d && js3.i(this.e, vg7Var.e) && js3.i(this.f, vg7Var.f) && this.g == vg7Var.g && js3.i(this.h, vg7Var.h);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        wg7 wg7Var = new wg7();
        wg7Var.q = this.b;
        wg7Var.r = this.c;
        wg7Var.s = this.d;
        wg7Var.t = this.e;
        wg7Var.u = this.f;
        wg7Var.v = this.g;
        wg7Var.w = this.h;
        return wg7Var;
    }

    public final int hashCode() {
        int iHashCode = (((((this.c.hashCode() + (this.b.hashCode() * 31)) * 31) + (this.d ? 1231 : 1237)) * 31) + 1237) * 31;
        qe1 qe1Var = this.e;
        int iHashCode2 = (iHashCode + (qe1Var != null ? qe1Var.hashCode() : 0)) * 31;
        ab5 ab5Var = this.f;
        int iHashCode3 = (((iHashCode2 + (ab5Var != null ? ab5Var.hashCode() : 0)) * 961) + (this.g ? 1231 : 1237)) * 31;
        c cVar = this.h;
        return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((wg7) gx4Var).H0(this.e, this.f, this.b, this.h, this.c, this.g, this.d);
    }
}
