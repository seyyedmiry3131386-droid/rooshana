package androidx.compose.foundation.layout;

import defpackage.au1;
import defpackage.dp2;
import defpackage.dw1;
import defpackage.gx4;
import defpackage.ky7;
import defpackage.mx4;

/* JADX INFO: loaded from: classes.dex */
final class a extends mx4 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final dp2 g;

    public a(float f, float f2, float f3, float f4, boolean z, dp2 dp2Var) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        this.g = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return au1.b(this.b, aVar.b) && au1.b(this.c, aVar.c) && au1.b(this.d, aVar.d) && au1.b(this.e, aVar.e) && this.f == aVar.f;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        ky7 ky7Var = new ky7();
        ky7Var.o = this.b;
        ky7Var.p = this.c;
        ky7Var.q = this.d;
        ky7Var.r = this.e;
        ky7Var.s = this.f;
        return ky7Var;
    }

    public final int hashCode() {
        return dw1.g(this.e, dw1.g(this.d, dw1.g(this.c, Float.floatToIntBits(this.b) * 31, 31), 31), 31) + (this.f ? 1231 : 1237);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ky7 ky7Var = (ky7) gx4Var;
        ky7Var.o = this.b;
        ky7Var.p = this.c;
        ky7Var.q = this.d;
        ky7Var.r = this.e;
        ky7Var.s = this.f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(float f, float f2, float f3, float f4, boolean z, dp2 dp2Var, int i) {
        dp2 dp2Var2;
        boolean z2;
        float f5;
        f = (i & 1) != 0 ? Float.NaN : f;
        f2 = (i & 2) != 0 ? Float.NaN : f2;
        f3 = (i & 4) != 0 ? Float.NaN : f3;
        if ((i & 8) != 0) {
            dp2Var2 = dp2Var;
            z2 = z;
            f5 = Float.NaN;
        } else {
            dp2Var2 = dp2Var;
            z2 = z;
            f5 = f4;
        }
        this(f, f2, f3, f5, z2, dp2Var2);
    }
}
