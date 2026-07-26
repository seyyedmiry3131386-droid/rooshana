package androidx.compose.animation;

import defpackage.bp2;
import defpackage.gx4;
import defpackage.j22;
import defpackage.j52;
import defpackage.jr8;
import defpackage.js3;
import defpackage.k22;
import defpackage.mx4;
import defpackage.zq8;

/* JADX INFO: loaded from: classes.dex */
final class i extends mx4 {
    public final jr8 b;
    public final zq8 c;
    public final zq8 d;
    public final zq8 e;
    public final k22 f;
    public final j52 g;
    public final bp2 h;
    public final j22 i;

    public i(jr8 jr8Var, zq8 zq8Var, zq8 zq8Var2, zq8 zq8Var3, k22 k22Var, j52 j52Var, bp2 bp2Var, j22 j22Var) {
        this.b = jr8Var;
        this.c = zq8Var;
        this.d = zq8Var2;
        this.e = zq8Var3;
        this.f = k22Var;
        this.g = j52Var;
        this.h = bp2Var;
        this.i = j22Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return js3.i(iVar.b, this.b) && js3.i(iVar.c, this.c) && js3.i(iVar.d, this.d) && js3.i(iVar.e, this.e) && js3.i(iVar.f, this.f) && js3.i(iVar.g, this.g) && iVar.h == this.h && js3.i(iVar.i, this.i);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new k(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        zq8 zq8Var = this.c;
        int iHashCode2 = (iHashCode + (zq8Var != null ? zq8Var.hashCode() : 0)) * 31;
        zq8 zq8Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (zq8Var2 != null ? zq8Var2.hashCode() : 0)) * 31;
        zq8 zq8Var3 = this.e;
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.a.hashCode() + ((this.f.a.hashCode() + ((iHashCode3 + (zq8Var3 != null ? zq8Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        k kVar = (k) gx4Var;
        kVar.p = this.b;
        kVar.q = this.c;
        kVar.r = this.d;
        kVar.s = this.e;
        kVar.t = this.f;
        kVar.u = this.g;
        kVar.v = this.h;
        kVar.w = this.i;
    }
}
