package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tw8 implements Comparable {
    public final long a;

    public /* synthetic */ tw8(long j) {
        this.a = j;
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return js3.s(this.a ^ Long.MIN_VALUE, ((tw8) obj).a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tw8) {
            return this.a == ((tw8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return a(this.a);
    }

    public final String toString() {
        return a77.s(10, this.a);
    }
}
