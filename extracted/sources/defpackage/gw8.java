package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gw8 implements Comparable {
    public final byte a;

    public /* synthetic */ gw8(byte b) {
        this.a = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return js3.r(this.a & 255, ((gw8) obj).a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gw8) {
            return this.a == ((gw8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}
