package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ba0 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof ba0) {
            return Float.compare(this.a, ((ba0) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
