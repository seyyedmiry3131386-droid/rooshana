package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lm6 {
    public final float a;
    public final e92 b;

    public lm6(float f, e92 e92Var) {
        js3.p(e92Var, "feature");
        this.a = f;
        this.b = e92Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm6)) {
            return false;
        }
        lm6 lm6Var = (lm6) obj;
        return Float.compare(this.a, lm6Var.a) == 0 && js3.i(this.b, lm6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.a + ", feature=" + this.b + ')';
    }
}
