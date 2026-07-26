package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w59 {
    public static final w59 d = new w59(0, 0);
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final int b;
    public final float c;

    static {
        String str = j29.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(3, 36);
    }

    public w59(int i, int i2) {
        this(1.0f, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w59) {
            w59 w59Var = (w59) obj;
            if (this.a == w59Var.a && this.b == w59Var.b && this.c == w59Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public w59(float f2, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f2;
    }
}
