package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kr2 {
    public final int a;
    public final ja9 b;

    public kr2(int i, ja9 ja9Var) {
        js3.p(ja9Var, "hint");
        this.a = i;
        this.b = ja9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr2)) {
            return false;
        }
        kr2 kr2Var = (kr2) obj;
        return this.a == kr2Var.a && js3.i(this.b, kr2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}
