package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a24 extends mx4 {
    public final float b;
    public final boolean c;

    public a24(float f, boolean z) {
        this.b = f;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        a24 a24Var = obj instanceof a24 ? (a24) obj : null;
        return a24Var != null && this.b == a24Var.b && this.c == a24Var.c;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        b24 b24Var = new b24();
        b24Var.o = this.b;
        b24Var.p = this.c;
        return b24Var;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + (this.c ? 1231 : 1237);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        b24 b24Var = (b24) gx4Var;
        b24Var.o = this.b;
        b24Var.p = this.c;
    }
}
