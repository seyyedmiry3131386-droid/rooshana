package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cp6 {
    public final jp4 a;
    public final long b;
    public final long c;

    public cp6(jp4 jp4Var, long j, long j2) {
        this.a = jp4Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp6)) {
            return false;
        }
        cp6 cp6Var = (cp6) obj;
        return this.b == cp6Var.b && this.a.equals(cp6Var.a) && this.c == cp6Var.c;
    }

    public final int hashCode() {
        long j = this.b;
        int iHashCode = (this.a.hashCode() + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        long j2 = this.c;
        return iHashCode + ((int) ((j2 >>> 32) ^ j2));
    }
}
