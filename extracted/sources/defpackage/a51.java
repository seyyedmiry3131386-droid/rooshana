package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a51 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public a51(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a51)) {
            return false;
        }
        a51 a51Var = (a51) obj;
        return zu0.c(this.a, a51Var.a) && zu0.c(this.b, a51Var.b) && zu0.c(this.c, a51Var.c) && zu0.c(this.d, a51Var.d) && zu0.c(this.e, a51Var.e);
    }

    public final int hashCode() {
        int i = zu0.i;
        return tw8.a(this.e) + t61.d(t61.d(t61.d(tw8.a(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        bl4.F(this.a, ", textColor=", sb);
        bl4.F(this.b, ", iconColor=", sb);
        bl4.F(this.c, ", disabledTextColor=", sb);
        bl4.F(this.d, ", disabledIconColor=", sb);
        sb.append((Object) zu0.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
