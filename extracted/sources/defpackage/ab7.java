package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ab7 {
    public float a = 0.0f;
    public boolean b = true;
    public ok4 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab7)) {
            return false;
        }
        ab7 ab7Var = (ab7) obj;
        return Float.compare(this.a, ab7Var.a) == 0 && this.b == ab7Var.b && js3.i(this.c, ab7Var.c);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.a) * 31) + (this.b ? 1231 : 1237)) * 31;
        ok4 ok4Var = this.c;
        return (iFloatToIntBits + (ok4Var == null ? 0 : ok4Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
