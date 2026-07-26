package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class es2 {
    public final String a;
    public final String b;

    public es2(String str, String str2) {
        js3.p(str, "movieId");
        js3.p(str2, "currentEpisodeId");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es2)) {
            return false;
        }
        es2 es2Var = (es2) obj;
        return js3.i(this.a, es2Var.a) && js3.i(this.b, es2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bl4.w("RequestParams(movieId=", this.a, ", currentEpisodeId=", this.b, ")");
    }
}
