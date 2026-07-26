package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b36 extends s36 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public b36(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b36)) {
            return false;
        }
        b36 b36Var = (b36) obj;
        return Float.compare(this.c, b36Var.c) == 0 && Float.compare(this.d, b36Var.d) == 0 && Float.compare(this.e, b36Var.e) == 0 && Float.compare(this.f, b36Var.f) == 0 && Float.compare(this.g, b36Var.g) == 0 && Float.compare(this.h, b36Var.h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.h) + dw1.g(this.g, dw1.g(this.f, dw1.g(this.e, dw1.g(this.d, Float.floatToIntBits(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        sb.append(this.f);
        sb.append(", x3=");
        sb.append(this.g);
        sb.append(", y3=");
        return t61.k(sb, this.h, ')');
    }
}
