package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public gc(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        js3.p(str, "id");
        js3.p(str2, "type");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return js3.i(this.a, gcVar.a) && js3.i(this.b, gcVar.b) && js3.i(this.c, gcVar.c) && js3.i(this.d, gcVar.d) && js3.i(this.e, gcVar.e) && js3.i(this.f, gcVar.f) && js3.i(this.g, gcVar.g) && js3.i(this.h, gcVar.h);
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
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("AddaxBox(id=", this.a, ", type=", this.b, ", title=");
        o40.I(this.c, ", message=", this.d, ", iconUrl=", sbT);
        o40.I(this.e, ", actionText=", this.f, ", actionIntent=", sbT);
        return dw1.p(this.g, ", displayMode=", this.h, ")", sbT);
    }
}
