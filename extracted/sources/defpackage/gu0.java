package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gu0 {
    public final float a;

    public gu0(float f) {
        this.a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean a() {
        return 0.0f > this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gu0) {
            return (a() && ((gu0) obj).a()) || this.a == ((gu0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return Float.floatToIntBits(this.a) + (Float.floatToIntBits(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.a;
    }
}
