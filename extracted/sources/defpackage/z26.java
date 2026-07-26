package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z26 extends s36 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public z26(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z26)) {
            return false;
        }
        z26 z26Var = (z26) obj;
        return Float.compare(this.c, z26Var.c) == 0 && Float.compare(this.d, z26Var.d) == 0 && Float.compare(this.e, z26Var.e) == 0 && this.f == z26Var.f && this.g == z26Var.g && Float.compare(this.h, z26Var.h) == 0 && Float.compare(this.i, z26Var.i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.i) + dw1.g(this.h, (((dw1.g(this.e, dw1.g(this.d, Float.floatToIntBits(this.c) * 31, 31), 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartX=");
        sb.append(this.h);
        sb.append(", arcStartY=");
        return t61.k(sb, this.i, ')');
    }
}
