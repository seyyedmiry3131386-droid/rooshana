package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class du1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public du1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du1)) {
            return false;
        }
        du1 du1Var = (du1) obj;
        return au1.b(this.a, du1Var.a) && au1.b(this.b, du1Var.b) && au1.b(this.c, du1Var.c) && au1.b(this.d, du1Var.d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + dw1.g(this.c, dw1.g(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "DpRect(left=" + ((Object) au1.c(this.a)) + ", top=" + ((Object) au1.c(this.b)) + ", right=" + ((Object) au1.c(this.c)) + ", bottom=" + ((Object) au1.c(this.d)) + ')';
    }
}
