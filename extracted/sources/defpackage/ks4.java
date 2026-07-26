package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ks4 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public ks4(Object obj) {
        this(-1L, obj);
    }

    public final ks4 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new ks4(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks4)) {
            return false;
        }
        ks4 ks4Var = (ks4) obj;
        return this.a.equals(ks4Var.a) && this.b == ks4Var.b && this.c == ks4Var.c && this.d == ks4Var.d && this.e == ks4Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public ks4(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public ks4(int i, long j, Object obj) {
        this(obj, -1, -1, j, i);
    }

    public ks4(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
