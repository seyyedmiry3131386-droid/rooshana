package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class si2 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof si2) {
            return this.a == ((si2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}
