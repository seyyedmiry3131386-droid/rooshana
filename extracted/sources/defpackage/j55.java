package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j55 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final pj3 e;
    public final b55 f;

    public j55(String str, String str2, String str3, String str4, pj3 pj3Var, b55 b55Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = pj3Var;
        this.f = b55Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j55)) {
            return false;
        }
        j55 j55Var = (j55) obj;
        return js3.i(this.a, j55Var.a) && js3.i(this.b, j55Var.b) && js3.i(this.c, j55Var.c) && js3.i(this.d, j55Var.d) && js3.i(this.e, j55Var.e) && js3.i(this.f, j55Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        pj3 pj3Var = this.e;
        int iHashCode5 = (iHashCode4 + (pj3Var == null ? 0 : pj3Var.hashCode())) * 31;
        b55 b55Var = this.f;
        return iHashCode5 + (b55Var != null ? b55Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("MovieReviewInfo(rating=", this.a, ", color=", this.b, ", title=");
        o40.I(this.c, ", subtitle=", this.d, ", reviews=", sbT);
        sbT.append(this.e);
        sbT.append(", userReview=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
