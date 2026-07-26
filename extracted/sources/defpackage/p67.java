package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p67 {
    public final int a;
    public final fj2 b;
    public final ej2 c;

    public p67(int i, fj2 fj2Var, ej2 ej2Var) {
        this.a = i;
        this.b = fj2Var;
        this.c = ej2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p67)) {
            return false;
        }
        p67 p67Var = (p67) obj;
        return this.a == p67Var.a && js3.i(this.b, p67Var.b) && this.c.equals(p67Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + (((this.a * 31) + this.b.a) * 29791);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
