package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l16 {
    public final yg a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public l16(yg ygVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = ygVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final sy6 a(sy6 sy6Var) {
        return sy6Var.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = zi8.b;
            if (zi8.c(j, j2)) {
                return j2;
            }
        }
        int i = zi8.c;
        int i2 = (int) (j >> 32);
        int i3 = this.b;
        return uy6.b(i2 + i3, ((int) (j & 4294967295L)) + i3);
    }

    public final sy6 c(sy6 sy6Var) {
        float f = -this.f;
        return sy6Var.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return ok4.t(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l16)) {
            return false;
        }
        l16 l16Var = (l16) obj;
        return this.a.equals(l16Var.a) && this.b == l16Var.b && this.c == l16Var.c && this.d == l16Var.d && this.e == l16Var.e && Float.compare(this.f, l16Var.f) == 0 && Float.compare(this.g, l16Var.g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.g) + dw1.g(this.f, ((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return t61.k(sb, this.g, ')');
    }
}
