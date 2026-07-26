package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yd2 {
    public final float a;
    public final float b;
    public final long c;

    public yd2(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd2)) {
            return false;
        }
        yd2 yd2Var = (yd2) obj;
        return Float.compare(this.a, yd2Var.a) == 0 && Float.compare(this.b, yd2Var.b) == 0 && this.c == yd2Var.c;
    }

    public final int hashCode() {
        int iG = dw1.g(this.b, Float.floatToIntBits(this.a) * 31, 31);
        long j = this.c;
        return iG + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}
