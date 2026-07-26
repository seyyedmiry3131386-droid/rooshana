package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bb0 {
    public final float a;

    public bb0(float f) {
        this.a = f;
    }

    public final int a(int i, int i2) {
        return Math.round((1 + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb0) && Float.compare(this.a, ((bb0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return t61.k(new StringBuilder("Vertical(bias="), this.a, ')');
    }
}
