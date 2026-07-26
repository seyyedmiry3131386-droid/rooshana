package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ci8 {
    public static final ci8 c = new ci8(1.0f, 0.0f);
    public final float a;
    public final float b;

    public ci8(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci8)) {
            return false;
        }
        ci8 ci8Var = (ci8) obj;
        return this.a == ci8Var.a && this.b == ci8Var.b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return t61.k(sb, this.b, ')');
    }
}
