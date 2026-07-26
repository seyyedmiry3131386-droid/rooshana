package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class za {
    public static final ya Companion = new ya();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;

    public /* synthetic */ za(int i, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        if (127 != (i & 127)) {
            wq2.S(i, 127, xa.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za)) {
            return false;
        }
        za zaVar = (za) obj;
        return js3.i(this.a, zaVar.a) && js3.i(this.b, zaVar.b) && js3.i(this.c, zaVar.c) && js3.i(this.d, zaVar.d) && js3.i(this.e, zaVar.e) && js3.i(this.f, zaVar.f) && js3.i(this.g, zaVar.g);
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
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.g;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("AdLinkInfoDto(url=", this.a, ", callToAction=", this.b, ", clickCallback=");
        o40.I(this.c, ", title=", this.d, ", subtitle=", sbT);
        o40.I(this.e, ", iconUrl=", this.f, ", chrome=", sbT);
        sbT.append(this.g);
        sbT.append(")");
        return sbT.toString();
    }
}
