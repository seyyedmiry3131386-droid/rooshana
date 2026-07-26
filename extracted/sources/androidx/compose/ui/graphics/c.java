package androidx.compose.ui.graphics;

import androidx.compose.ui.node.m;
import defpackage.bl4;
import defpackage.dp2;
import defpackage.dw1;
import defpackage.gx4;
import defpackage.js3;
import defpackage.lq8;
import defpackage.mx4;
import defpackage.o87;
import defpackage.rm7;
import defpackage.t61;
import defpackage.tw8;
import defpackage.tx8;
import defpackage.xr7;
import defpackage.y40;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
final class c extends mx4 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final xr7 g;
    public final boolean h;
    public final long i;
    public final long j;

    public c(float f, float f2, float f3, float f4, long j, xr7 xr7Var, boolean z, long j2, long j3) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j;
        this.g = xr7Var;
        this.h = z;
        this.i = j2;
        this.j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.b, cVar.b) == 0 && Float.compare(this.c, cVar.c) == 0 && Float.compare(this.d, cVar.d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.e, cVar.e) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && lq8.a(this.f, cVar.f) && js3.i(this.g, cVar.g) && this.h == cVar.h && zu0.c(this.i, cVar.i) && zu0.c(this.j, cVar.j);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        final e eVar = new e();
        eVar.o = this.b;
        eVar.p = this.c;
        eVar.q = this.d;
        eVar.r = this.e;
        eVar.s = 8.0f;
        eVar.t = this.f;
        eVar.u = this.g;
        eVar.v = this.h;
        eVar.w = this.i;
        eVar.x = this.j;
        eVar.y = 3;
        eVar.z = new dp2() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                o87 o87Var = (o87) obj;
                e eVar2 = eVar;
                o87Var.i(eVar2.o);
                o87Var.j(eVar2.p);
                o87Var.b(eVar2.q);
                o87Var.k(eVar2.r);
                o87Var.h(0.0f);
                float f = eVar2.s;
                if (o87Var.i != f) {
                    o87Var.a |= 2048;
                    o87Var.i = f;
                }
                o87Var.n(eVar2.t);
                o87Var.l(eVar2.u);
                o87Var.e(eVar2.v);
                o87Var.g(null);
                o87Var.c(eVar2.w);
                o87Var.m(eVar2.x);
                o87Var.f(0);
                int i = eVar2.y;
                if (o87Var.r != i) {
                    o87Var.a |= 524288;
                    o87Var.r = i;
                }
                return tx8.a;
            }
        };
        return eVar;
    }

    public final int hashCode() {
        int iG = dw1.g(8.0f, dw1.g(0.0f, dw1.g(0.0f, dw1.g(0.0f, dw1.g(this.e, dw1.g(0.0f, dw1.g(0.0f, dw1.g(this.d, dw1.g(this.c, Float.floatToIntBits(this.b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = lq8.c;
        long j = this.f;
        int iJ = (rm7.j(this.g, (((int) (j ^ (j >>> 32))) + iG) * 31, 31) + (this.h ? 1231 : 1237)) * 961;
        int i2 = zu0.i;
        return (((tw8.a(this.j) + t61.d(iJ, 31, this.i)) * 961) + 3) * 31;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        m mVar;
        e eVar = (e) gx4Var;
        eVar.o = this.b;
        eVar.p = this.c;
        eVar.q = this.d;
        eVar.r = this.e;
        eVar.s = 8.0f;
        eVar.t = this.f;
        eVar.u = this.g;
        eVar.v = this.h;
        eVar.w = this.i;
        eVar.x = this.j;
        eVar.y = 3;
        dp2 dp2Var = eVar.z;
        if (eVar.a.n && (mVar = y40.E(eVar, 2).r) != null) {
            mVar.h1(dp2Var, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.b);
        sb.append(", scaleY=");
        sb.append(this.c);
        sb.append(", alpha=");
        sb.append(this.d);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.e);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) lq8.d(this.f));
        sb.append(", shape=");
        sb.append(this.g);
        sb.append(", clip=");
        sb.append(this.h);
        sb.append(", renderEffect=null, ambientShadowColor=");
        bl4.F(this.i, ", spotShadowColor=", sb);
        sb.append((Object) zu0.i(this.j));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) y40.L(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
