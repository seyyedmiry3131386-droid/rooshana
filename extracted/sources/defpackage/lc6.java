package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lc6 implements qc6 {
    public final String a;
    public final List b;

    public lc6(String str, List list) {
        js3.p(str, "movieId");
        js3.p(list, "seasons");
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc6)) {
            return false;
        }
        lc6 lc6Var = (lc6) obj;
        return js3.i(this.a, lc6Var.a) && js3.i(this.b, lc6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateMovieSeasons(movieId=" + this.a + ", seasons=" + this.b + ")";
    }
}
