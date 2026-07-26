package defpackage;

import androidx.compose.ui.draw.a;

/* JADX INFO: loaded from: classes.dex */
public final class me0 extends mx4 {
    public final float b;
    public final k18 c;
    public final xr7 d;

    public me0(float f, k18 k18Var, xr7 xr7Var) {
        this.b = f;
        this.c = k18Var;
        this.d = xr7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me0)) {
            return false;
        }
        me0 me0Var = (me0) obj;
        return au1.b(this.b, me0Var.b) && this.c.equals(me0Var.c) && js3.i(this.d, me0Var.d);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new le0(this.b, this.c, this.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (Float.floatToIntBits(this.b) * 31)) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        le0 le0Var = (le0) gx4Var;
        float f = le0Var.r;
        a aVar = le0Var.u;
        float f2 = this.b;
        if (!au1.b(f, f2)) {
            le0Var.r = f2;
            aVar.C0();
        }
        k18 k18Var = le0Var.s;
        k18 k18Var2 = this.c;
        if (!js3.i(k18Var, k18Var2)) {
            le0Var.s = k18Var2;
            aVar.C0();
        }
        xr7 xr7Var = le0Var.t;
        xr7 xr7Var2 = this.d;
        if (js3.i(xr7Var, xr7Var2)) {
            return;
        }
        le0Var.t = xr7Var2;
        aVar.C0();
        t17.f(le0Var);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) au1.c(this.b)) + ", brush=" + this.c + ", shape=" + this.d + ')';
    }
}
