package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cy7 {
    public static final cy7 c = new cy7(-1, -1);
    public final int a;
    public final int b;

    static {
        new cy7(0, 0);
    }

    public cy7(int i, int i2) {
        vy2.j((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof cy7) {
            cy7 cy7Var = (cy7) obj;
            if (this.a == cy7Var.a && this.b == cy7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
