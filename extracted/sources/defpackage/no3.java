package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class no3 {
    public static final no3 e = new no3(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public no3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static no3 a(no3 no3Var, no3 no3Var2) {
        return c(Math.max(no3Var.a, no3Var2.a), Math.max(no3Var.b, no3Var2.b), Math.max(no3Var.c, no3Var2.c), Math.max(no3Var.d, no3Var2.d));
    }

    public static no3 b(no3 no3Var, no3 no3Var2) {
        return c(Math.min(no3Var.a, no3Var2.a), Math.min(no3Var.b, no3Var2.b), Math.min(no3Var.c, no3Var2.c), Math.min(no3Var.d, no3Var2.d));
    }

    public static no3 c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new no3(i, i2, i3, i4);
    }

    public static no3 d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return te.G(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || no3.class != obj.getClass()) {
            return false;
        }
        no3 no3Var = (no3) obj;
        return this.d == no3Var.d && this.a == no3Var.a && this.c == no3Var.c && this.b == no3Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return dw1.q(sb, this.d, '}');
    }
}
