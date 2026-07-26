package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y64 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof y64) {
            return this.a == ((y64) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
