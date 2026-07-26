package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p36 extends s36 {
    public final float c;
    public final float d;

    public p36(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p36)) {
            return false;
        }
        p36 p36Var = (p36) obj;
        return Float.compare(this.c, p36Var.c) == 0 && Float.compare(this.d, p36Var.d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return t61.k(sb, this.d, ')');
    }
}
