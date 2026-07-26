package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zm0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public zm0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zm0)) {
            return false;
        }
        zm0 zm0Var = (zm0) obj;
        return zu0.c(this.a, zm0Var.a) && zu0.c(this.b, zm0Var.b) && zu0.c(this.c, zm0Var.c) && zu0.c(this.d, zm0Var.d);
    }

    public final int hashCode() {
        int i = zu0.i;
        return tw8.a(this.d) + t61.d(t61.d(tw8.a(this.a) * 31, 31, this.b), 31, this.c);
    }
}
