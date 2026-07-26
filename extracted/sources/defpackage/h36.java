package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h36 extends s36 {
    public final float c;
    public final float d;

    public h36(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h36)) {
            return false;
        }
        h36 h36Var = (h36) obj;
        return Float.compare(this.c, h36Var.c) == 0 && Float.compare(this.d, h36Var.d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return t61.k(sb, this.d, ')');
    }
}
