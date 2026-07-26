package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mu6 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public mu6(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mu6)) {
            return false;
        }
        mu6 mu6Var = (mu6) obj;
        return zu0.c(this.a, mu6Var.a) && zu0.c(this.b, mu6Var.b) && zu0.c(this.c, mu6Var.c) && zu0.c(this.d, mu6Var.d);
    }

    public final int hashCode() {
        int i = zu0.i;
        return tw8.a(this.d) + t61.d(t61.d(tw8.a(this.a) * 31, 31, this.b), 31, this.c);
    }
}
