package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ne0 {
    public final float a;
    public final k18 b;

    public ne0(float f, k18 k18Var) {
        this.a = f;
        this.b = k18Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne0)) {
            return false;
        }
        ne0 ne0Var = (ne0) obj;
        return au1.b(this.a, ne0Var.a) && this.b.equals(ne0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) au1.c(this.a)) + ", brush=" + this.b + ')';
    }
}
