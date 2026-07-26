package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q25 extends u25 {
    public final long a;
    public final int b;

    public q25(int i, long j) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q25)) {
            return false;
        }
        q25 q25Var = (q25) obj;
        return this.a == q25Var.a && this.b == q25Var.b;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b;
    }

    public final String toString() {
        return "Downloading(downloadSpeed=" + this.a + ", progressPercentage=" + this.b + ")";
    }
}
