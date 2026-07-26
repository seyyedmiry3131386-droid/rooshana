package defpackage;

import ir.myket.movie.common.domain.models.EpisodeBannerType;

/* JADX INFO: loaded from: classes3.dex */
public final class c32 extends kf0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final EpisodeBannerType e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final iw5 i;

    public c32(String str, String str2, String str3, String str4, EpisodeBannerType episodeBannerType, boolean z, String str5, iw5 iw5Var) {
        js3.p(str, "id");
        js3.p(str2, "title");
        js3.p(episodeBannerType, "bannerType");
        js3.p(str5, "buttonText");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = episodeBannerType;
        this.f = z;
        this.g = str5;
        this.h = !z;
        this.i = iw5Var;
    }

    @Override // defpackage.kf0
    public final String a() {
        return this.a;
    }

    @Override // defpackage.kf0
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c32)) {
            return false;
        }
        c32 c32Var = (c32) obj;
        return js3.i(this.a, c32Var.a) && js3.i(this.b, c32Var.b) && js3.i(this.c, c32Var.c) && js3.i(this.d, c32Var.d) && this.e == c32Var.e && this.f == c32Var.f && js3.i(this.g, c32Var.g) && this.h == c32Var.h && this.i.equals(c32Var.i);
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.i.hashCode() + ((rm7.k(this.g, (((this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31) + (this.f ? 1231 : 1237)) * 31, 31) + (this.h ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("EpisodeBottomSheetItemData(id=", this.a, ", title=", this.b, ", subtitle=");
        o40.I(this.c, ", bannerUrl=", this.d, ", bannerType=", sbT);
        sbT.append(this.e);
        sbT.append(", isPlaying=");
        sbT.append(this.f);
        sbT.append(", buttonText=");
        sbT.append(this.g);
        sbT.append(", showArrow=");
        sbT.append(this.h);
        sbT.append(", onClick=");
        sbT.append(this.i);
        sbT.append(")");
        return sbT.toString();
    }
}
