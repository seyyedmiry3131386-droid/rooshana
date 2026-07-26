package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lh8 {
    public final ab0 a;
    public final ab0 b;

    public lh8() {
        ab0 ab0Var = eq.o;
        this.a = ab0Var;
        this.b = ab0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh8)) {
            return false;
        }
        lh8 lh8Var = (lh8) obj;
        return js3.i(this.a, lh8Var.a) && js3.i(this.b, lh8Var.b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b.a) + dw1.g(this.a.a, 38347, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
    }
}
