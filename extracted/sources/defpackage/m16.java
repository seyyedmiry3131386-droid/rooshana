package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m16 {
    public final ch a;
    public final int b;
    public final int c;

    public m16(ch chVar, int i, int i2) {
        this.a = chVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m16)) {
            return false;
        }
        m16 m16Var = (m16) obj;
        return this.a.equals(m16Var.a) && this.b == m16Var.b && this.c == m16Var.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return dw1.q(sb, this.c, ')');
    }
}
