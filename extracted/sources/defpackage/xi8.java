package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xi8 {
    public static final xi8 c = new xi8(2, false);
    public static final xi8 d = new xi8(1, true);
    public final int a;
    public final boolean b;

    public xi8(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi8)) {
            return false;
        }
        xi8 xi8Var = (xi8) obj;
        return this.a == xi8Var.a && this.b == xi8Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
