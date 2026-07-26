package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f68 {
    public final long a;
    public final long b;
    public int c = 0;
    public final long d;

    public f68(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.d = j - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f68)) {
            return false;
        }
        f68 f68Var = (f68) obj;
        return this.a == f68Var.a && this.b == f68Var.b && this.c == f68Var.c;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return ((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.c;
    }

    public final String toString() {
        int i = this.c;
        StringBuilder sbS = rm7.s(this.a, "StorageInfo(deviceTotalBytes=", ", deviceFreeBytes=");
        sbS.append(this.b);
        sbS.append(", appCount=");
        sbS.append(i);
        sbS.append(")");
        return sbS.toString();
    }
}
