package androidx.tv.material3;

import defpackage.dp2;
import defpackage.fe0;
import defpackage.gx4;
import defpackage.jc8;
import defpackage.js3;
import defpackage.mx4;
import defpackage.xr7;

/* JADX INFO: loaded from: classes.dex */
final class h extends mx4 {
    public final xr7 b;
    public final fe0 c;
    public final dp2 d;

    public h(xr7 xr7Var, fe0 fe0Var, dp2 dp2Var) {
        this.b = xr7Var;
        this.c = fe0Var;
        this.d = dp2Var;
    }

    public final boolean equals(Object obj) {
        h hVar = obj instanceof h ? (h) obj : null;
        return hVar != null && js3.i(this.b, hVar.b) && js3.i(this.c, hVar.c);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        jc8 jc8Var = new jc8();
        jc8Var.o = this.b;
        jc8Var.p = this.c;
        return jc8Var;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        jc8 jc8Var = (jc8) gx4Var;
        jc8Var.o = this.b;
        jc8Var.p = this.c;
    }
}
