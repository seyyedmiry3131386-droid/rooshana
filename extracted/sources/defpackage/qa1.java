package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qa1 {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa1)) {
            return false;
        }
        qa1 qa1Var = (qa1) obj;
        return this.a == qa1Var.a && Float.compare(this.b, qa1Var.b) == 0;
    }

    public final int hashCode() {
        long j = this.a;
        return Float.floatToIntBits(this.b) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.a);
        sb.append(", dataPoint=");
        return t61.k(sb, this.b, ')');
    }
}
