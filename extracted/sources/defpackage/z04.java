package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z04 {
    public final int a;
    public final int b;
    public final boolean c;

    public z04(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z04)) {
            return false;
        }
        z04 z04Var = (z04) obj;
        return this.a == z04Var.a && this.b == z04Var.b && this.c == z04Var.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", isRtl=");
        return bl4.A(sb, this.c, ')');
    }
}
