package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fe0 {
    public static final fe0 d;
    public final ne0 a;
    public final float b;
    public final xr7 c;

    static {
        float f = 0;
        d = new fe0(ja1.a(f, zu0.g), f, tt3.d);
    }

    public fe0(ne0 ne0Var, float f, xr7 xr7Var) {
        this.a = ne0Var;
        this.b = f;
        this.c = xr7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fe0.class != obj.getClass()) {
            return false;
        }
        fe0 fe0Var = (fe0) obj;
        return js3.i(this.a, fe0Var.a) && au1.b(this.b, fe0Var.b) && js3.i(this.c, fe0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw1.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Border(border=" + this.a + ", inset=" + ((Object) au1.c(this.b)) + ", shape=" + this.c + ')';
    }
}
