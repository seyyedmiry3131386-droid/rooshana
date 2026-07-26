package defpackage;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
final class n24 extends mx4 {
    public final r34 b;
    public final qm5 c;
    public final Orientation d;

    public n24(r34 r34Var, qm5 qm5Var, Orientation orientation) {
        this.b = r34Var;
        this.c = qm5Var;
        this.d = orientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n24)) {
            return false;
        }
        n24 n24Var = (n24) obj;
        return js3.i(this.b, n24Var.b) && js3.i(this.c, n24Var.c) && this.d == n24Var.d;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        q24 q24Var = new q24();
        q24Var.o = this.b;
        q24Var.p = this.c;
        q24Var.q = this.d;
        return q24Var;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.c.hashCode() + (this.b.hashCode() * 31)) * 31) + 1237) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        q24 q24Var = (q24) gx4Var;
        q24Var.o = this.b;
        q24Var.p = this.c;
        q24Var.q = this.d;
    }
}
