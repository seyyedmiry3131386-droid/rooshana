package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fo3 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof fo3) {
            return this.a == ((fo3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
