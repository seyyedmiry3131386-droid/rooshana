package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iz4 {
    public final long a;
    public final long b;
    public final boolean c;

    public iz4(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final iz4 a(iz4 iz4Var) {
        return new iz4(nr5.g(this.a, iz4Var.a), Math.max(this.b, iz4Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz4)) {
            return false;
        }
        iz4 iz4Var = (iz4) obj;
        return nr5.c(this.a, iz4Var.a) && this.b == iz4Var.b && this.c == iz4Var.c;
    }

    public final int hashCode() {
        int iE = nr5.e(this.a) * 31;
        long j = this.b;
        return ((iE + ((int) (j ^ (j >>> 32)))) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) nr5.i(this.a));
        sb.append(", timeMillis=");
        sb.append(this.b);
        sb.append(", shouldApplyImmediately=");
        return bl4.A(sb, this.c, ')');
    }
}
