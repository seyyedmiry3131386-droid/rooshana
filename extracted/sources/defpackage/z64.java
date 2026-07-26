package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z64 {
    public static final z64 d = new z64(w64.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public z64(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z64)) {
            return false;
        }
        z64 z64Var = (z64) obj;
        float f = z64Var.a;
        float f2 = w64.b;
        return Float.compare(this.a, f) == 0 && this.b == z64Var.b && this.c == z64Var.c;
    }

    public final int hashCode() {
        float f = w64.b;
        return (((Float.floatToIntBits(this.a) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) w64.b(this.a));
        sb.append(", trim=");
        String str = "Invalid";
        int i = this.b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
