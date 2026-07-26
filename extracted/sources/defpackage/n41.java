package defpackage;

import coil3.compose.AsyncImagePainter;
import coil3.compose.a;
import coil3.compose.b;

/* JADX INFO: loaded from: classes.dex */
public final class n41 extends mx4 {
    public final pi3 b;
    public final hi3 c;
    public final ww d;
    public final dp2 e;
    public final qd f;
    public final q41 g;
    public final tc0 h;
    public final a i;

    public n41(pi3 pi3Var, hi3 hi3Var, ww wwVar, dp2 dp2Var, qd qdVar, q41 q41Var, tc0 tc0Var, a aVar) {
        this.b = pi3Var;
        this.c = hi3Var;
        this.d = wwVar;
        this.e = dp2Var;
        this.f = qdVar;
        this.g = q41Var;
        this.h = tc0Var;
        this.i = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n41)) {
            return false;
        }
        n41 n41Var = (n41) obj;
        return this.b.equals(n41Var.b) && this.c.equals(n41Var.c) && js3.i(this.d, n41Var.d) && js3.i(this.e, n41Var.e) && js3.i(this.f, n41Var.f) && js3.i(this.g, n41Var.g) && Float.compare(1.0f, 1.0f) == 0 && js3.i(this.h, n41Var.h) && js3.i(this.i, n41Var.i);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        ww wwVar = this.d;
        hi3 hi3Var = this.c;
        pi3 pi3Var = this.b;
        xw xwVar = new xw(hi3Var, pi3Var, wwVar);
        AsyncImagePainter asyncImagePainter = new AsyncImagePainter(xwVar);
        asyncImagePainter.m = this.e;
        asyncImagePainter.n = this.g;
        asyncImagePainter.o = 1;
        asyncImagePainter.p = this.i;
        asyncImagePainter.m(xwVar);
        my7 my7Var = pi3Var.p;
        return new o41(asyncImagePainter, this.f, this.g, this.h, my7Var instanceof b ? (b) my7Var : null);
    }

    public final int hashCode() {
        int iG = dw1.g(1.0f, (this.g.hashCode() + ((this.f.hashCode() + ((((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 961) + 1) * 31)) * 31)) * 31, 31);
        tc0 tc0Var = this.h;
        int iHashCode = (((iG + (tc0Var == null ? 0 : tc0Var.hashCode())) * 31) + 1231) * 31;
        a aVar = this.i;
        return (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        o41 o41Var = (o41) gx4Var;
        long jH = o41Var.u.h();
        b bVar = o41Var.t;
        ww wwVar = this.d;
        hi3 hi3Var = this.c;
        pi3 pi3Var = this.b;
        xw xwVar = new xw(hi3Var, pi3Var, wwVar);
        AsyncImagePainter asyncImagePainter = o41Var.u;
        asyncImagePainter.m = this.e;
        q41 q41Var = this.g;
        asyncImagePainter.n = q41Var;
        asyncImagePainter.o = 1;
        asyncImagePainter.p = this.i;
        asyncImagePainter.m(xwVar);
        boolean zB = ey7.b(jH, asyncImagePainter.h());
        o41Var.o = this.f;
        my7 my7Var = pi3Var.p;
        o41Var.t = my7Var instanceof b ? (b) my7Var : null;
        o41Var.p = q41Var;
        o41Var.q = 1.0f;
        o41Var.r = this.h;
        o41Var.s = true;
        boolean zI = js3.i(bVar, o41Var.t);
        if (!zB || !zI) {
            zk8.J(o41Var);
        }
        rf0.z(o41Var);
    }

    public final String toString() {
        return "ContentPainterElement(request=" + this.b + ", imageLoader=" + this.c + ", modelEqualityDelegate=" + this.d + ", transform=" + this.e + ", onState=null, filterQuality=Low, alignment=" + this.f + ", contentScale=" + this.g + ", alpha=1.0, colorFilter=" + this.h + ", clipToBounds=true, previewHandler=" + this.i + ", contentDescription=null)";
    }
}
