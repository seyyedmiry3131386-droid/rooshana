package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class it7 {
    public final i61 a;
    public final i61 b;
    public final i61 c;
    public final i61 d;
    public final i61 e;
    public final i61 f;
    public final i61 g;
    public final i61 h;

    public it7() {
        ka7 ka7Var = gs7.a;
        ka7 ka7Var2 = gs7.b;
        ka7 ka7Var3 = gs7.c;
        ka7 ka7Var4 = gs7.d;
        ka7 ka7Var5 = gs7.f;
        ka7 ka7Var6 = gs7.e;
        ka7 ka7Var7 = gs7.g;
        ka7 ka7Var8 = gs7.h;
        this.a = ka7Var;
        this.b = ka7Var2;
        this.c = ka7Var3;
        this.d = ka7Var4;
        this.e = ka7Var5;
        this.f = ka7Var6;
        this.g = ka7Var7;
        this.h = ka7Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it7)) {
            return false;
        }
        it7 it7Var = (it7) obj;
        return js3.i(this.a, it7Var.a) && js3.i(this.b, it7Var.b) && js3.i(this.c, it7Var.c) && js3.i(this.d, it7Var.d) && js3.i(this.e, it7Var.e) && js3.i(this.f, it7Var.f) && js3.i(this.g, it7Var.g) && js3.i(this.h, it7Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
