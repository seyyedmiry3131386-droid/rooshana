package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d36 extends s36 {
    public final float c;
    public final float d;

    public d36(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d36)) {
            return false;
        }
        d36 d36Var = (d36) obj;
        return Float.compare(this.c, d36Var.c) == 0 && Float.compare(this.d, d36Var.d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return t61.k(sb, this.d, ')');
    }
}
