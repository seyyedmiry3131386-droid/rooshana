package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lo1 implements no1 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof lo1) {
            return this.a == ((lo1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Pixels(px=" + this.a + ')';
    }
}
