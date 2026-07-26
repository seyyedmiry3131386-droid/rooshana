package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xm7 {
    public final wm7 a;
    public final wm7 b;
    public final boolean c;

    public xm7(wm7 wm7Var, wm7 wm7Var2, boolean z) {
        this.a = wm7Var;
        this.b = wm7Var2;
        this.c = z;
    }

    public static xm7 a(xm7 xm7Var, wm7 wm7Var, wm7 wm7Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            wm7Var = xm7Var.a;
        }
        if ((i & 2) != 0) {
            wm7Var2 = xm7Var.b;
        }
        xm7Var.getClass();
        return new xm7(wm7Var, wm7Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm7)) {
            return false;
        }
        xm7 xm7Var = (xm7) obj;
        return js3.i(this.a, xm7Var.a) && js3.i(this.b, xm7Var.b) && this.c == xm7Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return bl4.A(sb, this.c, ')');
    }
}
