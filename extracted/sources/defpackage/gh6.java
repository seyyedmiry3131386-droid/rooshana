package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gh6 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof gh6) {
            return this.a == ((gh6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}
