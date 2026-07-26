package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l36 extends s36 {
    public final float c;
    public final float d;

    public l36(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l36)) {
            return false;
        }
        l36 l36Var = (l36) obj;
        return Float.compare(this.c, l36Var.c) == 0 && Float.compare(this.d, l36Var.d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return t61.k(sb, this.d, ')');
    }
}
