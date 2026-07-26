package defpackage;

import androidx.compose.foundation.k;

/* JADX INFO: loaded from: classes.dex */
final class yi4 extends mx4 {
    public final int b;
    public final vj3 c;
    public final float d;

    public yi4(int i, vj3 vj3Var, float f) {
        this.b = i;
        this.c = vj3Var;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi4)) {
            return false;
        }
        yi4 yi4Var = (yi4) obj;
        return this.b == yi4Var.b && js3.i(this.c, yi4Var.c) && au1.b(this.d, yi4Var.d);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new k(this.b, this.c, this.d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + ((this.c.hashCode() + ((66991 + this.b) * 31)) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        k kVar = (k) gx4Var;
        ((s08) kVar.v).setValue(this.c);
        ((s08) kVar.w).setValue(new wi4());
        int i = kVar.o;
        int i2 = this.b;
        float f = this.d;
        if (i == i2 && au1.b(kVar.p, f)) {
            return;
        }
        kVar.o = i2;
        kVar.p = f;
        kVar.F0();
    }

    public final String toString() {
        return "MarqueeModifierElement(iterations=1, animationMode=Immediately, delayMillis=1200, initialDelayMillis=" + this.b + ", spacing=" + this.c + ", velocity=" + ((Object) au1.c(this.d)) + ')';
    }
}
