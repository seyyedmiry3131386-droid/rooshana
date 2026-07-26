package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import defpackage.gx4;
import defpackage.js3;
import defpackage.mx4;
import defpackage.qp2;
import defpackage.yu1;

/* JADX INFO: loaded from: classes.dex */
final class j<T> extends mx4 {
    public final d b;
    public final qp2 c;

    public j(d dVar, qp2 qp2Var) {
        Orientation orientation = Orientation.a;
        this.b = dVar;
        this.c = qp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!js3.i(this.b, jVar.b) || this.c != jVar.c) {
            return false;
        }
        Orientation orientation = Orientation.a;
        return true;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        Orientation orientation = Orientation.a;
        yu1 yu1Var = new yu1();
        yu1Var.o = this.b;
        yu1Var.p = this.c;
        yu1Var.q = orientation;
        return yu1Var;
    }

    public final int hashCode() {
        return Orientation.a.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        yu1 yu1Var = (yu1) gx4Var;
        yu1Var.o = this.b;
        yu1Var.p = this.c;
        yu1Var.q = Orientation.a;
    }
}
