package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fa7 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        ia7.a(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public fa7(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa7)) {
            return false;
        }
        fa7 fa7Var = (fa7) obj;
        return Float.compare(this.a, fa7Var.a) == 0 && Float.compare(this.b, fa7Var.b) == 0 && Float.compare(this.c, fa7Var.c) == 0 && Float.compare(this.d, fa7Var.d) == 0 && wq2.u(this.e, fa7Var.e) && wq2.u(this.f, fa7Var.f) && wq2.u(this.g, fa7Var.g) && wq2.u(this.h, fa7Var.h);
    }

    public final int hashCode() {
        int iG = dw1.g(this.d, dw1.g(this.c, dw1.g(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31);
        long j = this.e;
        long j2 = this.f;
        int i = (((int) (j2 ^ (j2 >>> 32))) + ((((int) (j ^ (j >>> 32))) + iG) * 31)) * 31;
        long j3 = this.g;
        int i2 = (((int) (j3 ^ (j3 >>> 32))) + i) * 31;
        long j4 = this.h;
        return ((int) (j4 ^ (j4 >>> 32))) + i2;
    }

    public final String toString() {
        String str = bt2.X(this.a) + ", " + bt2.X(this.b) + ", " + bt2.X(this.c) + ", " + bt2.X(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zU = wq2.u(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zU || !wq2.u(j2, j3) || !wq2.u(j3, j4)) {
            StringBuilder sbN = t61.n("RoundRect(rect=", str, ", topLeft=");
            sbN.append((Object) wq2.Y(j));
            sbN.append(", topRight=");
            sbN.append((Object) wq2.Y(j2));
            sbN.append(", bottomRight=");
            sbN.append((Object) wq2.Y(j3));
            sbN.append(", bottomLeft=");
            sbN.append((Object) wq2.Y(j4));
            sbN.append(')');
            return sbN.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbN2 = t61.n("RoundRect(rect=", str, ", radius=");
            sbN2.append(bt2.X(Float.intBitsToFloat(i)));
            sbN2.append(')');
            return sbN2.toString();
        }
        StringBuilder sbN3 = t61.n("RoundRect(rect=", str, ", x=");
        sbN3.append(bt2.X(Float.intBitsToFloat(i)));
        sbN3.append(", y=");
        sbN3.append(bt2.X(Float.intBitsToFloat(i2)));
        sbN3.append(')');
        return sbN3.toString();
    }
}
