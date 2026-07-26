package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jo8 {
    public final long a;
    public final long b;
    public final int c;

    public jo8(long j, int i, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo8)) {
            return false;
        }
        jo8 jo8Var = (jo8) obj;
        return this.a == jo8Var.a && this.b == jo8Var.b && this.c == jo8Var.c;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return ((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.a);
        sb.append(", ModelVersion=");
        sb.append(this.b);
        sb.append(", TopicCode=");
        return dw1.n("Topic { ", dw1.k(this.c, " }", sb));
    }
}
