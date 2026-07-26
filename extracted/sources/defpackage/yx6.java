package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yx6 {
    public final ft3 a;
    public final String b;
    public final String c;

    public yx6(ft3 ft3Var, String str, String str2) {
        js3.p(ft3Var, "isInRecommendationTime");
        js3.p(str, "movieId");
        this.a = ft3Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx6)) {
            return false;
        }
        yx6 yx6Var = (yx6) obj;
        return js3.i(this.a, yx6Var.a) && js3.i(this.b, yx6Var.b) && js3.i(this.c, yx6Var.c);
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iK + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendationState(isInRecommendationTime=");
        sb.append(this.a);
        sb.append(", movieId=");
        sb.append(this.b);
        sb.append(", lastEpisodeId=");
        return dw1.s(sb, this.c, ")");
    }

    public /* synthetic */ yx6(String str, int i) {
        this(et3.a, (i & 2) != 0 ? "" : str, null);
    }
}
