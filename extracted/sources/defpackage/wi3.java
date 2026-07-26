package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wi3 {
    public static int k;
    public static final av l = new av(29);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final s39 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public wi3(String str, float f, float f2, float f3, float f4, s39 s39Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = s39Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi3)) {
            return false;
        }
        wi3 wi3Var = (wi3) obj;
        return js3.i(this.a, wi3Var.a) && au1.b(this.b, wi3Var.b) && au1.b(this.c, wi3Var.c) && this.d == wi3Var.d && this.e == wi3Var.e && this.f.equals(wi3Var.f) && zu0.c(this.g, wi3Var.g) && this.h == wi3Var.h && this.i == wi3Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + dw1.g(this.e, dw1.g(this.d, dw1.g(this.c, dw1.g(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = zu0.i;
        return ((t61.d(iHashCode, 31, this.g) + this.h) * 31) + (this.i ? 1231 : 1237);
    }
}
