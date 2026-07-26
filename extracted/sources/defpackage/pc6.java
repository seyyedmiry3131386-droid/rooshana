package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pc6 implements qc6 {
    public final long a;

    public pc6(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc6) && this.a == ((pc6) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "UpdateTotalDurationTime(totalDurationTime=" + this.a + ")";
    }
}
