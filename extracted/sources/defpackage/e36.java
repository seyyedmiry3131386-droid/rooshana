package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e36 extends s36 {
    public final float c;
    public final float d;

    public e36(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e36)) {
            return false;
        }
        e36 e36Var = (e36) obj;
        return Float.compare(this.c, e36Var.c) == 0 && Float.compare(this.d, e36Var.d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return t61.k(sb, this.d, ')');
    }
}
