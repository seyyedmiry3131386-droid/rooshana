package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ub implements vb {
    public final pj3 a;
    public final String b;

    public ub(pj3 pj3Var, String str) {
        js3.p(str, "moviePosterUrl");
        this.a = pj3Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub)) {
            return false;
        }
        ub ubVar = (ub) obj;
        return js3.i(this.a, ubVar.a) && js3.i(this.b, ubVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowAd(movieAdList=" + this.a + ", moviePosterUrl=" + this.b + ")";
    }
}
