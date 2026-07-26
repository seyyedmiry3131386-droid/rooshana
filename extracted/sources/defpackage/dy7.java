package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dy7 {
    public static final dy7 c;
    public final no1 a;
    public final no1 b;

    static {
        mo1 mo1Var = mo1.a;
        c = new dy7(mo1Var, mo1Var);
    }

    public dy7(no1 no1Var, no1 no1Var2) {
        this.a = no1Var;
        this.b = no1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy7)) {
            return false;
        }
        dy7 dy7Var = (dy7) obj;
        return js3.i(this.a, dy7Var.a) && js3.i(this.b, dy7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
