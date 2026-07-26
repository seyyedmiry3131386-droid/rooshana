package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yd9 {
    public final float a;
    public final float b;

    public yd9(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd9)) {
            return false;
        }
        yd9 yd9Var = (yd9) obj;
        return Float.compare(this.a, yd9Var.a) == 0 && Float.compare(this.b, yd9Var.b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.a);
        sb.append(", y=");
        return t61.k(sb, this.b, ')');
    }
}
