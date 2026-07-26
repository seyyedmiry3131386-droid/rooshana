package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p9 implements s9 {
    public final t9 a;
    public final x9 b;

    public p9(t9 t9Var, x9 x9Var) {
        js3.p(t9Var, "adEndCard");
        this.a = t9Var;
        this.b = x9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9)) {
            return false;
        }
        p9 p9Var = (p9) obj;
        return js3.i(this.a, p9Var.a) && js3.i(this.b, p9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdEndCardScreen(adEndCard=" + this.a + ", adEndCardData=" + this.b + ")";
    }
}
