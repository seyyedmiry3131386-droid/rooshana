package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wi8 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof wi8) {
            return this.a == ((wi8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}
