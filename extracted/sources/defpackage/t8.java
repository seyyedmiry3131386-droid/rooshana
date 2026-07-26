package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class t8 {
    public static final s8 Companion = new s8();
    public final String a;
    public final int b;
    public final Boolean c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final dm6 l;

    public /* synthetic */ t8(int i, String str, int i2, Boolean bool, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, dm6 dm6Var) {
        if (4095 != (i & 4095)) {
            wq2.S(i, 4095, r8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = bool;
        this.d = num;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = dm6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return js3.i(this.a, t8Var.a) && this.b == t8Var.b && js3.i(this.c, t8Var.c) && js3.i(this.d, t8Var.d) && js3.i(this.e, t8Var.e) && js3.i(this.f, t8Var.f) && js3.i(this.g, t8Var.g) && js3.i(this.h, t8Var.h) && js3.i(this.i, t8Var.i) && js3.i(this.j, t8Var.j) && js3.i(this.k, t8Var.k) && js3.i(this.l, t8Var.l);
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        Boolean bool = this.c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        dm6 dm6Var = this.l;
        return iHashCode10 + (dm6Var != null ? dm6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbB = o40.B(this.b, "AdContentDto(url=", this.a, ", duration=", ", skippable=");
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
