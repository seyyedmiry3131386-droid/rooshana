package defpackage;

import ir.myket.movie.common.domain.models.MovieType;

/* JADX INFO: loaded from: classes3.dex */
public final class b15 {
    public final gc A;
    public final hk1 B;
    public final st7 C;
    public final String a;
    public final String b;
    public final String c;
    public final pj3 d;
    public final String e;
    public final MovieType f;
    public final String g;
    public final pj3 h;
    public final String i;
    public final pj3 j;
    public final String k;
    public final String l;
    public final String m;
    public final pj3 n;
    public final cg7 o;
    public final uu4 p;
    public final String q;
    public final String r;
    public final ma8 s;
    public final pd0 t;
    public final sp8 u;
    public final pj3 v;
    public final boolean w;
    public final boolean x;
    public final j55 y;
    public final String z;

    public b15(String str, String str2, String str3, pj3 pj3Var, String str4, MovieType movieType, String str5, pj3 pj3Var2, String str6, pj3 pj3Var3, String str7, String str8, String str9, pj3 pj3Var4, cg7 cg7Var, uu4 uu4Var, String str10, String str11, ma8 ma8Var, pd0 pd0Var, sp8 sp8Var, pj3 pj3Var5, boolean z, boolean z2, j55 j55Var, String str12, gc gcVar, hk1 hk1Var, st7 st7Var) {
        js3.p(str, "id");
        js3.p(str2, "title");
        js3.p(str3, "posterUrl");
        js3.p(str11, "posterBlurUrl");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = pj3Var;
        this.e = str4;
        this.f = movieType;
        this.g = str5;
        this.h = pj3Var2;
        this.i = str6;
        this.j = pj3Var3;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = pj3Var4;
        this.o = cg7Var;
        this.p = uu4Var;
        this.q = str10;
        this.r = str11;
        this.s = ma8Var;
        this.t = pd0Var;
        this.u = sp8Var;
        this.v = pj3Var5;
        this.w = z;
        this.x = z2;
        this.y = j55Var;
        this.z = str12;
        this.A = gcVar;
        this.B = hk1Var;
        this.C = st7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b15)) {
            return false;
        }
        b15 b15Var = (b15) obj;
        return js3.i(this.a, b15Var.a) && js3.i(this.b, b15Var.b) && js3.i(this.c, b15Var.c) && js3.i(this.d, b15Var.d) && js3.i(this.e, b15Var.e) && this.f == b15Var.f && js3.i(this.g, b15Var.g) && js3.i(this.h, b15Var.h) && js3.i(this.i, b15Var.i) && js3.i(this.j, b15Var.j) && js3.i(this.k, b15Var.k) && js3.i(this.l, b15Var.l) && js3.i(this.m, b15Var.m) && js3.i(this.n, b15Var.n) && js3.i(this.o, b15Var.o) && js3.i(this.p, b15Var.p) && js3.i(this.q, b15Var.q) && js3.i(this.r, b15Var.r) && js3.i(this.s, b15Var.s) && js3.i(this.t, b15Var.t) && js3.i(this.u, b15Var.u) && js3.i(this.v, b15Var.v) && this.w == b15Var.w && this.x == b15Var.x && js3.i(this.y, b15Var.y) && js3.i(this.z, b15Var.z) && js3.i(this.A, b15Var.A) && js3.i(this.B, b15Var.B) && js3.i(this.C, b15Var.C);
    }

    public final int hashCode() {
        int iK = rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31);
        pj3 pj3Var = this.d;
        int iHashCode = (iK + (pj3Var == null ? 0 : pj3Var.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        pj3 pj3Var2 = this.h;
        int iHashCode4 = (iHashCode3 + (pj3Var2 == null ? 0 : pj3Var2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        pj3 pj3Var3 = this.j;
        int iHashCode6 = (iHashCode5 + (pj3Var3 == null ? 0 : pj3Var3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        pj3 pj3Var4 = this.n;
        int iHashCode10 = (iHashCode9 + (pj3Var4 == null ? 0 : pj3Var4.hashCode())) * 31;
        cg7 cg7Var = this.o;
        int iHashCode11 = (iHashCode10 + (cg7Var == null ? 0 : cg7Var.a.hashCode())) * 31;
        uu4 uu4Var = this.p;
        int iHashCode12 = (iHashCode11 + (uu4Var == null ? 0 : uu4Var.hashCode())) * 31;
        String str7 = this.q;
        int iK2 = rm7.k(this.r, (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
        ma8 ma8Var = this.s;
        int iHashCode13 = (iK2 + (ma8Var == null ? 0 : ma8Var.hashCode())) * 31;
        pd0 pd0Var = this.t;
        int iHashCode14 = (iHashCode13 + (pd0Var == null ? 0 : pd0Var.hashCode())) * 31;
        sp8 sp8Var = this.u;
        int iHashCode15 = (iHashCode14 + (sp8Var == null ? 0 : sp8Var.a.hashCode())) * 31;
        pj3 pj3Var5 = this.v;
        int iHashCode16 = (((((iHashCode15 + (pj3Var5 == null ? 0 : pj3Var5.hashCode())) * 31) + (this.w ? 1231 : 1237)) * 31) + (this.x ? 1231 : 1237)) * 31;
        j55 j55Var = this.y;
        int iHashCode17 = (iHashCode16 + (j55Var == null ? 0 : j55Var.hashCode())) * 31;
        String str8 = this.z;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        gc gcVar = this.A;
        int iHashCode19 = (iHashCode18 + (gcVar == null ? 0 : gcVar.hashCode())) * 31;
        hk1 hk1Var = this.B;
        int iHashCode20 = (iHashCode19 + (hk1Var == null ? 0 : hk1Var.hashCode())) * 31;
        st7 st7Var = this.C;
        return iHashCode20 + (st7Var != null ? st7Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("MovieDetail(id=", this.a, ", title=", this.b, ", posterUrl=");
        sbT.append(this.c);
        sbT.append(", seasons=");
        sbT.append(this.d);
        sbT.append(", playId=");
        sbT.append(this.e);
        sbT.append(", type=");
        sbT.append(this.f);
        sbT.append(", description=");
        sbT.append(this.g);
        sbT.append(", summaries=");
        sbT.append(this.h);
        sbT.append(", landscapePosterUrl=");
        sbT.append(this.i);
        sbT.append(", tags=");
        sbT.append(this.j);
        sbT.append(", selectedSeasonId=");
        o40.I(this.k, ", buttonText=", this.l, ", secondaryTitle=", sbT);
        sbT.append(this.m);
        sbT.append(", recommendations=");
        sbT.append(this.n);
        sbT.append(", screenshots=");
        sbT.append(this.o);
        sbT.append(", messageBox=");
        sbT.append(this.p);
        sbT.append(", buttonAction=");
        o40.I(this.q, ", posterBlurUrl=", this.r, ", subscriptionInfo=", sbT);
        sbT.append(this.s);
        sbT.append(", bookmarkInfo=");
        sbT.append(this.t);
        sbT.append(", trailer=");
        sbT.append(this.u);
        sbT.append(", casts=");
        sbT.append(this.v);
        sbT.append(", showDownloadButton=");
        t61.A(sbT, this.w, ", showTrafficHint=", this.x, ", reviewInfo=");
        sbT.append(this.y);
        sbT.append(", sampleWatchMessage=");
        sbT.append(this.z);
        sbT.append(", primaryAddax=");
        sbT.append(this.A);
        sbT.append(", streamer=");
        sbT.append(this.B);
        sbT.append(", shareModel=");
        sbT.append(this.C);
        sbT.append(")");
        return sbT.toString();
    }
}
