package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yw8 implements Comparable {
    public final short a;

    public /* synthetic */ yw8(short s) {
        this.a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return js3.r(this.a & 65535, ((yw8) obj).a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yw8) {
            return this.a == ((yw8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }
}
