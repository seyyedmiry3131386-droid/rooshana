package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ux6 {
    public final pj3 a;

    public ux6(pj3 pj3Var) {
        js3.p(pj3Var, "movies");
        this.a = pj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ux6) && js3.i(this.a, ((ux6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RecommendationMovieList(movies=" + this.a + ")";
    }
}
