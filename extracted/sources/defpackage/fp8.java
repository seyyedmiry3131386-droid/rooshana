package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fp8 {
    public static final fp8 d = new fp8(new wn3());
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        String str = j29.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = Integer.toString(3, 36);
    }

    public fp8(wn3 wn3Var) {
        this.a = wn3Var.a;
        this.b = wn3Var.b;
        this.c = wn3Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fp8.class == obj.getClass()) {
            fp8 fp8Var = (fp8) obj;
            if (this.a == fp8Var.a && this.b == fp8Var.b && this.c == fp8Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
