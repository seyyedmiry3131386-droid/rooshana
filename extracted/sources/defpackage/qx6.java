package defpackage;

import ir.myket.movie.common.domain.models.MovieType;
import ir.myket.player.domain.models.ShareModel;

/* JADX INFO: loaded from: classes3.dex */
public final class qx6 {
    public final String a;
    public final String b;
    public final MovieType c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final pj3 i;
    public final ShareModel j;

    public qx6(String str, String str2, MovieType movieType, String str3, String str4, String str5, String str6, String str7, pj3 pj3Var, ShareModel shareModel) {
        js3.p(str, "movieId");
        js3.p(str2, "title");
        js3.p(str3, "playId");
        js3.p(str4, "posterUrl");
        js3.p(str5, "posterLandscapeUrl");
        this.a = str;
        this.b = str2;
        this.c = movieType;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = pj3Var;
        this.j = shareModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx6)) {
            return false;
        }
        qx6 qx6Var = (qx6) obj;
        return js3.i(this.a, qx6Var.a) && js3.i(this.b, qx6Var.b) && this.c == qx6Var.c && js3.i(this.d, qx6Var.d) && js3.i(this.e, qx6Var.e) && js3.i(this.f, qx6Var.f) && js3.i(this.g, qx6Var.g) && js3.i(this.h, qx6Var.h) && js3.i(this.i, qx6Var.i) && js3.i(this.j, qx6Var.j);
    }

    public final int hashCode() {
        int iK = rm7.k(this.f, rm7.k(this.e, rm7.k(this.d, (this.c.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31), 31);
        String str = this.g;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        pj3 pj3Var = this.i;
        return this.j.hashCode() + ((iHashCode2 + (pj3Var != null ? pj3Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("RecommendationMovie(movieId=", this.a, ", title=", this.b, ", type=");
        sbT.append(this.c);
        sbT.append(", playId=");
        sbT.append(this.d);
        sbT.append(", posterUrl=");
        o40.I(this.e, ", posterLandscapeUrl=", this.f, ", refId=", sbT);
        o40.I(this.g, ", secondaryTitle=", this.h, ", seasons=", sbT);
        sbT.append(this.i);
        sbT.append(", shareModel=");
        sbT.append(this.j);
        sbT.append(")");
        return sbT.toString();
    }
}
