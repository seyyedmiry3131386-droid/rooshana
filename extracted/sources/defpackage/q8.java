package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q8 {
    public final String a;
    public final int b;
    public final boolean c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final am6 l;

    public q8(String str, int i, boolean z, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, am6 am6Var) {
        js3.p(str, "url");
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = num;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = am6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj;
        return js3.i(this.a, q8Var.a) && this.b == q8Var.b && this.c == q8Var.c && js3.i(this.d, q8Var.d) && js3.i(this.e, q8Var.e) && js3.i(this.f, q8Var.f) && js3.i(this.g, q8Var.g) && js3.i(this.h, q8Var.h) && js3.i(this.i, q8Var.i) && js3.i(this.j, q8Var.j) && js3.i(this.k, q8Var.k) && js3.i(this.l, q8Var.l);
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + this.b) * 31) + (this.c ? 1231 : 1237)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        am6 am6Var = this.l;
        return iHashCode9 + (am6Var != null ? am6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbB = o40.B(this.b, "AdContent(url=", this.a, ", duration=", ", skippable=");
        sbB.append(this.c);
        sbB.append(", skipDelay=");
        sbB.append(this.d);
        sbB.append(", startCallback=");
        o40.I(this.e, ", firstQuartileCallback=", this.f, ", midPointCallback=", sbB);
        o40.I(this.g, ", thirdQuartileCallback=", this.h, ", completeCallback=", sbB);
        o40.I(this.i, ", skipCallback=", this.j, ", exitCallback=", sbB);
        sbB.append(this.k);
        sbB.append(", progressCallback=");
        sbB.append(this.l);
        sbB.append(")");
        return sbB.toString();
    }
}
