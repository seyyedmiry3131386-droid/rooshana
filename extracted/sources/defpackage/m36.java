package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m36 extends s36 {
    public final float c;
    public final float d;

    public m36(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m36)) {
            return false;
        }
        m36 m36Var = (m36) obj;
        return Float.compare(this.c, m36Var.c) == 0 && Float.compare(this.d, m36Var.d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return t61.k(sb, this.d, ')');
    }
}
