package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sy6 {
    public static final sy6 e = new sy6(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public sy6(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long c() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final sy6 e(sy6 sy6Var) {
        return new sy6(Math.max(this.a, sy6Var.a), Math.max(this.b, sy6Var.b), Math.min(this.c, sy6Var.c), Math.min(this.d, sy6Var.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy6)) {
            return false;
        }
        sy6 sy6Var = (sy6) obj;
        return Float.compare(this.a, sy6Var.a) == 0 && Float.compare(this.b, sy6Var.b) == 0 && Float.compare(this.c, sy6Var.c) == 0 && Float.compare(this.d, sy6Var.d) == 0;
    }

    public final boolean f() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean g(sy6 sy6Var) {
        return (this.a < sy6Var.c) & (sy6Var.a < this.c) & (this.b < sy6Var.d) & (sy6Var.b < this.d);
    }

    public final sy6 h(float f, float f2) {
        return new sy6(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + dw1.g(this.c, dw1.g(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final sy6 i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new sy6(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + bt2.X(this.a) + ", " + bt2.X(this.b) + ", " + bt2.X(this.c) + ", " + bt2.X(this.d) + ')';
    }
}
