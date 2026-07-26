package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hg {
    public final float a;
    public final float b;

    public hg(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg)) {
            return false;
        }
        hg hgVar = (hg) obj;
        return Float.compare(this.a, hgVar.a) == 0 && Float.compare(this.b, hgVar.b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.a);
        sb.append(", velocityCoefficient=");
        return t61.k(sb, this.b, ')');
    }
}
