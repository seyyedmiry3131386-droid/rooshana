package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class am6 {
    public final String a;
    public final int b;

    public am6(String str, int i) {
        js3.p(str, "url");
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am6)) {
            return false;
        }
        am6 am6Var = (am6) obj;
        return js3.i(this.a, am6Var.a) && this.b == am6Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ProgressCallback(url=" + this.a + ", second=" + this.b + ")";
    }
}
