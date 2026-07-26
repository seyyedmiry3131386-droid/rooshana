package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class sa8 {
    public static final ra8 Companion = new ra8();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ sa8(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (255 != (i & 255)) {
            wq2.S(i, 255, qa8.a.getDescriptor());
            throw null;
        }
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
        if (!(obj instanceof sa8)) {
            return false;
        }
        sa8 sa8Var = (sa8) obj;
        return js3.i(this.a, sa8Var.a) && js3.i(this.b, sa8Var.b) && js3.i(this.c, sa8Var.c) && js3.i(this.d, sa8Var.d) && js3.i(this.e, sa8Var.e) && js3.i(this.f, sa8Var.f) && js3.i(this.g, sa8Var.g) && js3.i(this.h, sa8Var.h);
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iK2 = rm7.k(this.d, (iK + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        int iHashCode = (iK2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("SubscriptionItemDto(title=", this.a, ", actionText=", this.b, ", subTitle=");
        o40.I(this.c, ", action=", this.d, ", selectedIcon=", sbT);
        o40.I(this.e, ", deselectedIcon=", this.f, ", imageType=", sbT);
        return dw1.p(this.g, ", id=", this.h, ")", sbT);
    }
}
