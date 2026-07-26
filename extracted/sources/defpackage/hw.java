package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class hw extends mx4 {
    public final float b;
    public final dp2 c;

    public hw(float f, dp2 dp2Var) {
        this.b = f;
        this.c = dp2Var;
        if (f > 0.0f) {
            return;
        }
        pn3.a("aspectRatio " + f + " must be > 0");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        hw hwVar = obj instanceof hw ? (hw) obj : null;
        if (hwVar == null || this.b != hwVar.b) {
            return false;
        }
        ((hw) obj).getClass();
        return true;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        kw kwVar = new kw();
        kwVar.o = this.b;
        return kwVar;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + 1237;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((kw) gx4Var).o = this.b;
    }
}
