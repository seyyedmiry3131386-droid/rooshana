package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b03 {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public b03(String str, double d) {
        this.a = str;
        this.b = 2;
        this.c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b03)) {
            return false;
        }
        b03 b03Var = (b03) obj;
        return this.b == b03Var.b && Double.compare(this.c, b03Var.c) == 0 && Objects.equals(this.a, b03Var.a) && Objects.equals(this.d, b03Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public b03(String str, String str2, int i) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        vy2.s(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }
}
