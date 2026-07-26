package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ht7 {
    public final i61 a;
    public final i61 b;
    public final i61 c;
    public final i61 d;
    public final i61 e;

    public ht7() {
        ka7 ka7Var = fs7.a;
        ka7 ka7Var2 = fs7.b;
        ka7 ka7Var3 = fs7.c;
        ka7 ka7Var4 = fs7.d;
        ka7 ka7Var5 = fs7.e;
        this.a = ka7Var;
        this.b = ka7Var2;
        this.c = ka7Var3;
        this.d = ka7Var4;
        this.e = ka7Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht7)) {
            return false;
        }
        ht7 ht7Var = (ht7) obj;
        return js3.i(this.a, ht7Var.a) && js3.i(this.b, ht7Var.b) && js3.i(this.c, ht7Var.c) && js3.i(this.d, ht7Var.d) && js3.i(this.e, ht7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }
}
