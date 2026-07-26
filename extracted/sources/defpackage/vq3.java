package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vq3 {
    public static final vq3 e = new vq3(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public vq3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final long b() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final int c() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq3)) {
            return false;
        }
        vq3 vq3Var = (vq3) obj;
        return this.a == vq3Var.a && this.b == vq3Var.b && this.c == vq3Var.c && this.d == vq3Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return dw1.q(sb, this.d, ')');
    }
}
