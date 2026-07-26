package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zj1 {
    public final long a;
    public final long b;

    public zj1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zj1) {
            zj1 zj1Var = (zj1) obj;
            return zq3.b(this.a, zj1Var.a) && this.b == zj1Var.b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return ((int) ((j2 >>> 32) ^ j2)) + i;
    }
}
