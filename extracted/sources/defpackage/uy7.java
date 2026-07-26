package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uy7 {
    public final dp2 a;
    public final sc2 b;

    public uy7(dp2 dp2Var, sc2 sc2Var) {
        this.a = dp2Var;
        this.b = sc2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy7)) {
            return false;
        }
        uy7 uy7Var = (uy7) obj;
        return js3.i(this.a, uy7Var.a) && js3.i(this.b, uy7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
