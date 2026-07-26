package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wl1 {
    public static final wl1 e = new vl1(0).b();
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        String str = j29.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
    }

    public wl1(vl1 vl1Var) {
        this.a = vl1Var.b;
        this.b = vl1Var.c;
        this.c = vl1Var.d;
        this.d = (String) vl1Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl1)) {
            return false;
        }
        wl1 wl1Var = (wl1) obj;
        return this.a == wl1Var.a && this.b == wl1Var.b && this.c == wl1Var.c && Objects.equals(this.d, wl1Var.d);
    }

    public final int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }
}
