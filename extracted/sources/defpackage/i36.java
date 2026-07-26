package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i36 extends s36 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public i36(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
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
        if (!(obj instanceof i36)) {
            return false;
        }
        i36 i36Var = (i36) obj;
        return Float.compare(this.c, i36Var.c) == 0 && Float.compare(this.d, i36Var.d) == 0 && Float.compare(this.e, i36Var.e) == 0 && this.f == i36Var.f && this.g == i36Var.g && Float.compare(this.h, i36Var.h) == 0 && Float.compare(this.i, i36Var.i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.i) + dw1.g(this.h, (((dw1.g(this.e, dw1.g(this.d, Float.floatToIntBits(this.c) * 31, 31), 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartDx=");
        sb.append(this.h);
        sb.append(", arcStartDy=");
        return t61.k(sb, this.i, ')');
    }
}
