package androidx.compose.foundation.gestures;

import defpackage.ab5;
import defpackage.bh7;
import defpackage.gx4;
import defpackage.js3;
import defpackage.mx4;

/* JADX INFO: loaded from: classes.dex */
final class k extends mx4 {
    public final bh7 b;
    public final Orientation c;
    public final boolean d;
    public final boolean e;
    public final ab5 f;

    public k(bh7 bh7Var, Orientation orientation, boolean z, boolean z2, ab5 ab5Var) {
        this.b = bh7Var;
        this.c = orientation;
        this.d = z;
        this.e = z2;
        this.f = ab5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return js3.i(this.b, kVar.b) && this.c == kVar.c && this.d == kVar.d && this.e == kVar.e && js3.i(this.f, kVar.f);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new n(null, this.f, this.b, null, this.c, this.d, this.e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.c.hashCode() + (this.b.hashCode() * 31)) * 961) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 961;
        ab5 ab5Var = this.f;
        return (iHashCode + (ab5Var != null ? ab5Var.hashCode() : 0)) * 31;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((n) gx4Var).X0(null, this.f, this.b, null, this.c, this.d, this.e);
    }
}
