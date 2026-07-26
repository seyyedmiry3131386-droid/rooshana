package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vj1 {
    public final so6 a;
    public final int b;
    public final int c;

    public vj1(int i, int i2, Class cls) {
        this(so6.a(cls), i, i2);
    }

    public static vj1 a(Class cls) {
        return new vj1(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vj1)) {
            return false;
        }
        vj1 vj1Var = (vj1) obj;
        return this.a.equals(vj1Var.a) && this.b == vj1Var.b && this.c == vj1Var.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(rm7.n(i2, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return dw1.s(sb, str, "}");
    }

    public vj1(so6 so6Var, int i, int i2) {
        this.a = so6Var;
        this.b = i;
        this.c = i2;
    }
}
