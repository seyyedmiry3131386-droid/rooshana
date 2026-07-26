package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.g;
import androidx.compose.material3.internal.c;

/* JADX INFO: loaded from: classes.dex */
public final class zu1 extends mx4 {
    public static final sl0 g = new sl0(10);
    public final c b;
    public final boolean c;
    public final boolean d;
    public final rp2 e;
    public final rp2 f;

    public zu1(c cVar, boolean z, boolean z2, rp2 rp2Var, rp2 rp2Var2) {
        Orientation orientation = Orientation.a;
        this.b = cVar;
        this.c = z;
        this.d = z2;
        this.e = rp2Var;
        this.f = rp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zu1.class != obj.getClass()) {
            return false;
        }
        zu1 zu1Var = (zu1) obj;
        if (!js3.i(this.b, zu1Var.b)) {
            return false;
        }
        Orientation orientation = Orientation.a;
        return this.c == zu1Var.c && this.d == zu1Var.d && js3.i(this.e, zu1Var.e) && js3.i(this.f, zu1Var.f);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        Orientation orientation = Orientation.a;
        g gVar = new g(g, this.c, null, orientation);
        gVar.I = this.b;
        gVar.J = orientation;
        gVar.K = this.d;
        gVar.L = this.e;
        gVar.M = this.f;
        return gVar;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + ((this.e.hashCode() + ((((((Orientation.a.hashCode() + (this.b.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 961) + (this.d ? 1231 : 1237)) * 31)) * 31)) * 31) + 1237;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        boolean z;
        boolean z2;
        g gVar = (g) gx4Var;
        Orientation orientation = Orientation.a;
        c cVar = gVar.I;
        c cVar2 = this.b;
        if (js3.i(cVar, cVar2)) {
            z = false;
        } else {
            gVar.I = cVar2;
            z = true;
        }
        if (gVar.J != orientation) {
            gVar.J = orientation;
            z2 = true;
        } else {
            z2 = z;
        }
        gVar.L = this.e;
        gVar.M = this.f;
        gVar.K = this.d;
        gVar.W0(g, this.c, null, orientation, z2);
    }
}
