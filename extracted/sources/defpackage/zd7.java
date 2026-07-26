package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zd7 {
    public final float a;
    public final long b;
    public final sc2 c;

    public zd7(float f, long j, sc2 sc2Var) {
        this.a = f;
        this.b = j;
        this.c = sc2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd7)) {
            return false;
        }
        zd7 zd7Var = (zd7) obj;
        return Float.compare(this.a, zd7Var.a) == 0 && lq8.a(this.b, zd7Var.b) && js3.i(this.c, zd7Var.c);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        int i = lq8.c;
        long j = this.b;
        return this.c.hashCode() + ((((int) (j ^ (j >>> 32))) + iFloatToIntBits) * 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) lq8.d(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
