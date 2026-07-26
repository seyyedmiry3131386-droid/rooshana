package androidx.compose.ui.draw;

import androidx.compose.ui.node.m;
import defpackage.au1;
import defpackage.bl4;
import defpackage.gx4;
import defpackage.js3;
import defpackage.mx4;
import defpackage.rm7;
import defpackage.t61;
import defpackage.tw8;
import defpackage.xr7;
import defpackage.y40;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends mx4 {
    public final float b;
    public final xr7 c;
    public final boolean d;
    public final long e;
    public final long f;

    public d(float f, xr7 xr7Var, boolean z, long j, long j2) {
        this.b = f;
        this.c = xr7Var;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return au1.b(this.b, dVar.b) && js3.i(this.c, dVar.c) && this.d == dVar.d && zu0.c(this.e, dVar.e) && zu0.c(this.f, dVar.f);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new androidx.compose.ui.graphics.b(new ShadowGraphicsLayerElement$createBlock$1(this));
    }

    public final int hashCode() {
        int iJ = (rm7.j(this.c, Float.floatToIntBits(this.b) * 31, 31) + (this.d ? 1231 : 1237)) * 31;
        int i = zu0.i;
        return tw8.a(this.f) + t61.d(iJ, 31, this.e);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        m mVar;
        androidx.compose.ui.graphics.b bVar = (androidx.compose.ui.graphics.b) gx4Var;
        ShadowGraphicsLayerElement$createBlock$1 shadowGraphicsLayerElement$createBlock$1 = new ShadowGraphicsLayerElement$createBlock$1(this);
        bVar.o = shadowGraphicsLayerElement$createBlock$1;
        if (bVar.a.n && (mVar = y40.E(bVar, 2).r) != null) {
            mVar.h1(shadowGraphicsLayerElement$createBlock$1, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) au1.c(this.b));
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(", clip=");
        sb.append(this.d);
        sb.append(", ambientColor=");
        bl4.F(this.e, ", spotColor=", sb);
        sb.append((Object) zu0.i(this.f));
        sb.append(')');
        return sb.toString();
    }
}
