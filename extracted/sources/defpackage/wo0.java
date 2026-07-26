package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wo0 {
    public final cb0 a;
    public final dp2 b;
    public final sc2 c;

    public wo0(cb0 cb0Var, sc2 sc2Var, dp2 dp2Var) {
        this.a = cb0Var;
        this.b = dp2Var;
        this.c = sc2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo0)) {
            return false;
        }
        wo0 wo0Var = (wo0) obj;
        return this.a.equals(wo0Var.a) && js3.i(this.b, wo0Var.b) && js3.i(this.c, wo0Var.c);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + 1231;
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
