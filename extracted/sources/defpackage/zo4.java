package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class zo4 {
    public static final zo4 i = new zo4(new yo4());
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public zo4(yo4 yo4Var) {
        this.a = j29.k0(yo4Var.a);
        this.c = j29.k0(yo4Var.b);
        this.b = yo4Var.a;
        this.d = yo4Var.b;
        this.e = yo4Var.c;
        this.f = yo4Var.d;
        this.g = yo4Var.e;
        this.h = yo4Var.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo4)) {
            return false;
        }
        zo4 zo4Var = (zo4) obj;
        return this.b == zo4Var.b && this.d == zo4Var.d && this.e == zo4Var.e && this.f == zo4Var.f && this.g == zo4Var.g && this.h == zo4Var.h;
    }

    public final int hashCode() {
        long j2 = this.b;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.d;
        return ((((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
