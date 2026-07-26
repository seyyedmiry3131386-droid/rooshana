package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ow8 implements Comparable {
    public final int a;

    public /* synthetic */ ow8(int i) {
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return js3.r(this.a ^ Integer.MIN_VALUE, ((ow8) obj).a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ow8) {
            return this.a == ((ow8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(((long) this.a) & 4294967295L);
    }
}
