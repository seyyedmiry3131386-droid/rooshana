package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q10 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof q10) {
            return this.a == ((q10) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AutoClearFocusBehavior(value=" + this.a + ')';
    }
}
