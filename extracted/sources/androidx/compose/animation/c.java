package androidx.compose.animation;

import defpackage.gx4;
import defpackage.js3;
import defpackage.mx4;
import defpackage.oj;
import defpackage.wb5;
import defpackage.zq8;

/* JADX INFO: loaded from: classes.dex */
final class c<S> extends mx4 {
    public final zq8 b;
    public final wb5 c;
    public final oj d;

    public c(zq8 zq8Var, wb5 wb5Var, oj ojVar) {
        this.b = zq8Var;
        this.c = wb5Var;
        this.d = ojVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return js3.i(cVar.b, this.b) && cVar.c.equals(this.c);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        d dVar = new d(1);
        dVar.p = this.b;
        dVar.q = this.c;
        dVar.r = this.d;
        dVar.s = a.a;
        return dVar;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        zq8 zq8Var = this.b;
        return this.c.hashCode() + ((iHashCode + (zq8Var != null ? zq8Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        d dVar = (d) gx4Var;
        dVar.p = this.b;
        dVar.q = this.c;
        dVar.r = this.d;
    }
}
