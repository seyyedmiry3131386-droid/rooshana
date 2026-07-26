package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ck5 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public ck5(float f, float f2, float f3, int i, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ck5.class == obj.getClass()) {
            ck5 ck5Var = (ck5) obj;
            return this.c == ck5Var.c && this.d == ck5Var.d && this.b == ck5Var.b && this.a == ck5Var.a && this.e == ck5Var.e;
        }
        return false;
    }

    public final int hashCode() {
        int iG = (dw1.g(this.b, dw1.g(this.d, Float.floatToIntBits(this.c) * 31, 31), 31) + this.a) * 31;
        long j = this.e;
        return iG + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
