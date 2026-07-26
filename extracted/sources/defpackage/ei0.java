package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ei0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public ei0(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ei0)) {
            return false;
        }
        ei0 ei0Var = (ei0) obj;
        return au1.b(this.a, ei0Var.a) && au1.b(this.b, ei0Var.b) && au1.b(this.c, ei0Var.c) && au1.b(this.d, ei0Var.d) && au1.b(this.e, ei0Var.e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.e) + dw1.g(this.d, dw1.g(this.c, dw1.g(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31);
    }
}
