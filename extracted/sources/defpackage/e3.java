package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e3 {
    public final String a;
    public final np2 b;

    public e3(String str, np2 np2Var) {
        this.a = str;
        this.b = np2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return js3.i(this.a, e3Var.a) && js3.i(this.b, e3Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        np2 np2Var = this.b;
        return iHashCode + (np2Var != null ? np2Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
