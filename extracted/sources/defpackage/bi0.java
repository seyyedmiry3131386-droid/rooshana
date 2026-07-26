package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bi0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bi0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final bi0 a(long j, long j2, long j3, long j4) {
        if (j == 16) {
            j = this.a;
        }
        return new bi0(j, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bi0)) {
            return false;
        }
        bi0 bi0Var = (bi0) obj;
        return zu0.c(this.a, bi0Var.a) && zu0.c(this.b, bi0Var.b) && zu0.c(this.c, bi0Var.c) && zu0.c(this.d, bi0Var.d);
    }

    public final int hashCode() {
        int i = zu0.i;
        return tw8.a(this.d) + t61.d(t61.d(tw8.a(this.a) * 31, 31, this.b), 31, this.c);
    }
}
