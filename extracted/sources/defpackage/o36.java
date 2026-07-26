package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o36 extends s36 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public o36(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o36)) {
            return false;
        }
        o36 o36Var = (o36) obj;
        return Float.compare(this.c, o36Var.c) == 0 && Float.compare(this.d, o36Var.d) == 0 && Float.compare(this.e, o36Var.e) == 0 && Float.compare(this.f, o36Var.f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f) + dw1.g(this.e, dw1.g(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        return t61.k(sb, this.f, ')');
    }
}
