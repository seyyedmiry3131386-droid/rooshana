package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pn0 {
    public final String a;
    public final pj3 b;

    public pn0(pj3 pj3Var, String str) {
        js3.p(str, "title");
        js3.p(pj3Var, "people");
        this.a = str;
        this.b = pj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pn0) {
            return js3.i(this.a, ((pn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Cast(title=" + this.a + ", people=" + this.b + ")";
    }
}
