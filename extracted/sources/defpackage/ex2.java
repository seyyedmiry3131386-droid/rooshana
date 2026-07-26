package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ex2 {
    public final uf0 a;
    public final dx2 b;
    public final ch2 c;

    public ex2(uf0 uf0Var, dx2 dx2Var, ch2 ch2Var) {
        this.a = uf0Var;
        this.b = dx2Var;
        this.c = ch2Var;
        if (uf0Var.b() == 0 && uf0Var.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (uf0Var.a != 0 && uf0Var.b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean a() {
        dx2 dx2Var = dx2.d;
        dx2 dx2Var2 = this.b;
        if (js3.i(dx2Var2, dx2Var)) {
            return true;
        }
        return js3.i(dx2Var2, dx2.c) && js3.i(this.c, ch2.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ex2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        ex2 ex2Var = (ex2) obj;
        return js3.i(this.a, ex2Var.a) && js3.i(this.b, ex2Var.b) && js3.i(this.c, ex2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return ex2.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
