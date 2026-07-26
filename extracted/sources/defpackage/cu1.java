package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cu1 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof cu1) {
            return this.a == ((cu1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) au1.c(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) au1.c(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }
}
