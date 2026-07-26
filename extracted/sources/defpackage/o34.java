package defpackage;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
final class o34 extends mx4 {
    public final bp2 b;
    public final n34 c;
    public final Orientation d;
    public final boolean e;

    public o34(bp2 bp2Var, n34 n34Var, Orientation orientation, boolean z) {
        this.b = bp2Var;
        this.c = n34Var;
        this.d = orientation;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o34)) {
            return false;
        }
        o34 o34Var = (o34) obj;
        return this.b == o34Var.b && js3.i(this.c, o34Var.c) && this.d == o34Var.d && this.e == o34Var.e;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new q34(this.b, this.c, this.d, this.e);
    }

    public final int hashCode() {
        return ((((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31) + 1237;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        q34 q34Var = (q34) gx4Var;
        q34Var.o = this.b;
        q34Var.p = this.c;
        Orientation orientation = q34Var.q;
        Orientation orientation2 = this.d;
        if (orientation != orientation2) {
            q34Var.q = orientation2;
            t17.f(q34Var);
        }
        boolean z = q34Var.r;
        boolean z2 = this.e;
        if (z == z2) {
            return;
        }
        q34Var.r = z2;
        q34Var.C0();
        t17.f(q34Var);
    }
}
