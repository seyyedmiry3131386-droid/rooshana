package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fu1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public fu1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < 0.0f) {
            rn3.a("Left must be non-negative");
        }
        if (f2 < 0.0f) {
            rn3.a("Top must be non-negative");
        }
        if (f3 < 0.0f) {
            rn3.a("Right must be non-negative");
        }
        if (f4 >= 0.0f) {
            return;
        }
        rn3.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu1)) {
            return false;
        }
        fu1 fu1Var = (fu1) obj;
        return au1.b(this.a, fu1Var.a) && au1.b(this.b, fu1Var.b) && au1.b(this.c, fu1Var.c) && au1.b(this.d, fu1Var.d);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.d) + dw1.g(this.c, dw1.g(this.b, Float.floatToIntBits(this.a) * 31, 31), 31)) * 31) + 1231;
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) au1.c(this.a)) + ", top=" + ((Object) au1.c(this.b)) + ", end=" + ((Object) au1.c(this.c)) + ", bottom=" + ((Object) au1.c(this.d)) + ", isLayoutDirectionAware=true)";
    }
}
