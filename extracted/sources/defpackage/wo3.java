package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wo3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public wo3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo3)) {
            return false;
        }
        wo3 wo3Var = (wo3) obj;
        return this.a == wo3Var.a && this.b == wo3Var.b && this.c == wo3Var.c && this.d == wo3Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return dw1.q(sb, this.d, ')');
    }
}
