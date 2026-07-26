package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cc6 implements dc6 {
    public final long a;

    public cc6(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc6) && this.a == ((cc6) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "SeekToPosition(positionMs=" + this.a + ")";
    }
}
