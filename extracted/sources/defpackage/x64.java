package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x64 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof x64) {
            return this.a == ((x64) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "LineHeightStyle.Mode.Fixed" : i == 1 ? "LineHeightStyle.Mode.Minimum" : i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
