package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s6 {
    public final String a;
    public final boolean b;

    public s6(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return js3.i(this.a, s6Var.a) && this.b == s6Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "RequestParams(packageName=" + this.a + ", isActive=" + this.b + ")";
    }
}
