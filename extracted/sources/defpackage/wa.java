package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wa implements x9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public wa(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        js3.p(str, "url");
        js3.p(str2, "callToAction");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
    }

    @Override // defpackage.x9
    public final w9 a() {
        return new v9(this.b);
    }

    @Override // defpackage.x9
    public final String b() {
        return this.d;
    }

    @Override // defpackage.x9
    public final String c() {
        return this.e;
    }

    @Override // defpackage.x9
    public final String d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa)) {
            return false;
        }
        wa waVar = (wa) obj;
        return js3.i(this.a, waVar.a) && js3.i(this.b, waVar.b) && js3.i(this.c, waVar.c) && js3.i(this.d, waVar.d) && js3.i(this.e, waVar.e) && js3.i(this.f, waVar.f) && this.g == waVar.g;
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("AdLinkInfo(url=", this.a, ", callToAction=", this.b, ", clickCallback=");
        o40.I(this.c, ", title=", this.d, ", subtitle=", sbT);
        o40.I(this.e, ", iconUrl=", this.f, ", chrome=", sbT);
        return t61.l(sbT, this.g, ")");
    }
}
