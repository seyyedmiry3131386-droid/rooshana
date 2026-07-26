package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class i15 {
    public static final h15 Companion = new h15();
    public static final c24[] D;
    public final jc A;
    public final kk1 B;
    public final yt7 C;
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final String i;
    public final List j;
    public final String k;
    public final String l;
    public final String m;
    public final List n;
    public final List o;
    public final zu4 p;
    public final String q;
    public final String r;
    public final pa8 s;
    public final sd0 t;
    public final vp8 u;
    public final List v;
    public final boolean w;
    public final boolean x;
    public final p55 y;
    public final String z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.b;
        D = new c24[]{null, null, null, a.b(lazyThreadSafetyMode, new ob4(13)), null, null, null, a.b(lazyThreadSafetyMode, new ob4(14)), null, a.b(lazyThreadSafetyMode, new ob4(15)), null, null, null, a.b(lazyThreadSafetyMode, new ob4(16)), a.b(lazyThreadSafetyMode, new ob4(17)), null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new ob4(18)), null, null, null, null, null, null, null};
    }

    public /* synthetic */ i15(int i, String str, String str2, String str3, List list, String str4, String str5, String str6, List list2, String str7, List list3, String str8, String str9, String str10, List list4, List list5, zu4 zu4Var, String str11, String str12, pa8 pa8Var, sd0 sd0Var, vp8 vp8Var, List list6, boolean z, boolean z2, p55 p55Var, String str13, jc jcVar, kk1 kk1Var, yt7 yt7Var) {
        if (536870911 != (i & 536870911)) {
            wq2.S(i, 536870911, g15.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = list2;
        this.i = str7;
        this.j = list3;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = list4;
        this.o = list5;
        this.p = zu4Var;
        this.q = str11;
        this.r = str12;
        this.s = pa8Var;
        this.t = sd0Var;
        this.u = vp8Var;
        this.v = list6;
        this.w = z;
        this.x = z2;
        this.y = p55Var;
        this.z = str13;
        this.A = jcVar;
        this.B = kk1Var;
        this.C = yt7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i15)) {
            return false;
        }
        i15 i15Var = (i15) obj;
        return js3.i(this.a, i15Var.a) && js3.i(this.b, i15Var.b) && js3.i(this.c, i15Var.c) && js3.i(this.d, i15Var.d) && js3.i(this.e, i15Var.e) && js3.i(this.f, i15Var.f) && js3.i(this.g, i15Var.g) && js3.i(this.h, i15Var.h) && js3.i(this.i, i15Var.i) && js3.i(this.j, i15Var.j) && js3.i(this.k, i15Var.k) && js3.i(this.l, i15Var.l) && js3.i(this.m, i15Var.m) && js3.i(this.n, i15Var.n) && js3.i(this.o, i15Var.o) && js3.i(this.p, i15Var.p) && js3.i(this.q, i15Var.q) && js3.i(this.r, i15Var.r) && js3.i(this.s, i15Var.s) && js3.i(this.t, i15Var.t) && js3.i(this.u, i15Var.u) && js3.i(this.v, i15Var.v) && this.w == i15Var.w && this.x == i15Var.x && js3.i(this.y, i15Var.y) && js3.i(this.z, i15Var.z) && js3.i(this.A, i15Var.A) && js3.i(this.B, i15Var.B) && js3.i(this.C, i15Var.C);
    }

    public final int hashCode() {
        int iK = rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31);
        List list = this.d;
        int iHashCode = (iK + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        int iK2 = rm7.k(this.f, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.g;
        int iHashCode2 = (iK2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.h;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list3 = this.j;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list4 = this.n;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.o;
        int iHashCode10 = (iHashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        zu4 zu4Var = this.p;
        int iHashCode11 = (iHashCode10 + (zu4Var == null ? 0 : zu4Var.hashCode())) * 31;
        String str7 = this.q;
        int iK3 = rm7.k(this.r, (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
        pa8 pa8Var = this.s;
        int iHashCode12 = (iK3 + (pa8Var == null ? 0 : pa8Var.hashCode())) * 31;
        sd0 sd0Var = this.t;
        int iHashCode13 = (iHashCode12 + (sd0Var == null ? 0 : sd0Var.hashCode())) * 31;
        vp8 vp8Var = this.u;
        int iHashCode14 = (iHashCode13 + (vp8Var == null ? 0 : vp8Var.hashCode())) * 31;
        List list6 = this.v;
        int iHashCode15 = (((((iHashCode14 + (list6 == null ? 0 : list6.hashCode())) * 31) + (this.w ? 1231 : 1237)) * 31) + (this.x ? 1231 : 1237)) * 31;
        p55 p55Var = this.y;
        int iHashCode16 = (iHashCode15 + (p55Var == null ? 0 : p55Var.hashCode())) * 31;
        String str8 = this.z;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        jc jcVar = this.A;
        int iHashCode18 = (iHashCode17 + (jcVar == null ? 0 : jcVar.hashCode())) * 31;
        kk1 kk1Var = this.B;
        int iHashCode19 = (iHashCode18 + (kk1Var == null ? 0 : kk1Var.hashCode())) * 31;
        yt7 yt7Var = this.C;
        return iHashCode19 + (yt7Var != null ? yt7Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("MovieDetailDto(id=", this.a, ", title=", this.b, ", posterUrl=");
        sbT.append(this.c);
        sbT.append(", seasons=");
        sbT.append(this.d);
        sbT.append(", playId=");
        o40.I(this.e, ", type=", this.f, ", description=", sbT);
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
