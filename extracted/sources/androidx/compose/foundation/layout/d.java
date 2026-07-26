package androidx.compose.foundation.layout;

import defpackage.gx4;
import defpackage.js3;
import defpackage.mx4;
import defpackage.og9;
import defpackage.qp2;

/* JADX INFO: loaded from: classes.dex */
final class d extends mx4 {
    public final Direction b;
    public final qp2 c;
    public final Object d;

    public d(Direction direction, qp2 qp2Var, Object obj) {
        this.b = direction;
        this.c = qp2Var;
        this.d = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.b == dVar.b && js3.i(this.d, dVar.d);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        og9 og9Var = new og9();
        og9Var.o = this.b;
        og9Var.p = this.c;
        return og9Var;
    }

    public final int hashCode() {
        return this.d.hashCode() + (((this.b.hashCode() * 31) + 1237) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        og9 og9Var = (og9) gx4Var;
        og9Var.o = this.b;
        og9Var.p = this.c;
    }
}
