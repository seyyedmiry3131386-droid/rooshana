package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nv0 {
    public final String a;
    public final long b;
    public final int c;

    public nv0(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nv0 nv0Var = (nv0) obj;
        if (this.c == nv0Var.c && js3.i(this.a, nv0Var.a)) {
            return gv0.a(this.b, nv0Var.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, nv0 nv0Var);

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = gv0.e;
        long j = this.b;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) gv0.b(this.b)) + ')';
    }
}
