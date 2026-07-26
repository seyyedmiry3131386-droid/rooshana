package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j82 {
    public final sc2 a;

    public j82(sc2 sc2Var) {
        this.a = sc2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j82) {
            return Float.compare(0.0f, 0.0f) == 0 && js3.i(this.a, ((j82) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Float.floatToIntBits(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}
