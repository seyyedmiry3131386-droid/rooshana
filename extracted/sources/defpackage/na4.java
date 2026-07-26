package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class na4 {
    public static final na4 d;
    public final ja4 a;
    public final ja4 b;
    public final ja4 c;

    static {
        ia4 ia4Var = ia4.c;
        d = new na4(ia4Var, ia4Var, ia4Var);
    }

    public na4(ja4 ja4Var, ja4 ja4Var2, ja4 ja4Var3) {
        this.a = ja4Var;
        this.b = ja4Var2;
        this.c = ja4Var3;
    }

    public static na4 a(na4 na4Var, int i) {
        int i2 = i & 1;
        ja4 ja4Var = ia4.c;
        ja4 ja4Var2 = i2 != 0 ? na4Var.a : ja4Var;
        ja4 ja4Var3 = (i & 2) != 0 ? na4Var.b : ja4Var;
        if ((i & 4) != 0) {
            ja4Var = na4Var.c;
        }
        return new na4(ja4Var2, ja4Var3, ja4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na4)) {
            return false;
        }
        na4 na4Var = (na4) obj;
        return js3.i(this.a, na4Var.a) && js3.i(this.b, na4Var.b) && js3.i(this.c, na4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}
