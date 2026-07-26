package defpackage;

import androidx.compose.ui.node.h;

/* JADX INFO: loaded from: classes.dex */
final class pr5 extends mx4 {
    public final float b;
    public final float c;

    public pr5(float f, float f2, sm5 sm5Var) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        pr5 pr5Var = obj instanceof pr5 ? (pr5) obj : null;
        return pr5Var != null && au1.b(this.b, pr5Var.b) && au1.b(this.c, pr5Var.c);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        sr5 sr5Var = new sr5();
        sr5Var.o = this.b;
        sr5Var.p = this.c;
        sr5Var.q = true;
        return sr5Var;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.c) + (Float.floatToIntBits(this.b) * 31)) * 31) + 1231;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        sr5 sr5Var = (sr5) gx4Var;
        float f = sr5Var.o;
        float f2 = this.b;
        boolean zB = au1.b(f, f2);
        float f3 = this.c;
        if (!zB || !au1.b(sr5Var.p, f3) || !sr5Var.q) {
            h hVarH = y40.H(sr5Var);
            i14 i14Var = h.S;
            hVarH.r0(false);
        }
        sr5Var.o = f2;
        sr5Var.p = f3;
        sr5Var.q = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) au1.c(this.b)) + ", y=" + ((Object) au1.c(this.c)) + ", rtlAware=true)";
    }
}
