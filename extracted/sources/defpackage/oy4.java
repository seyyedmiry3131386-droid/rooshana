package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oy4 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof oy4) {
            return this.a == ((oy4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.a + ')';
    }
}
