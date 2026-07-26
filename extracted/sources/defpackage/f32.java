package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class f32 {
    public static final e32 Companion = new e32();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ f32(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (255 != (i & 255)) {
            wq2.S(i, 255, d32.a.getDescriptor());
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
        if (!(obj instanceof f32)) {
            return false;
        }
        f32 f32Var = (f32) obj;
        return js3.i(this.a, f32Var.a) && js3.i(this.b, f32Var.b) && js3.i(this.c, f32Var.c) && js3.i(this.d, f32Var.d) && js3.i(this.e, f32Var.e) && js3.i(this.f, f32Var.f) && js3.i(this.g, f32Var.g) && js3.i(this.h, f32Var.h);
    }

    public final int hashCode() {
        int iK = rm7.k(this.d, rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31), 31);
        String str = this.e;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("EpisodeDto(id=", this.a, ", playId=", this.b, ", title=");
        o40.I(this.c, ", buttonText=", this.d, ", bannerUrl=", sbT);
        o40.I(this.e, ", bannerType=", this.f, ", secondaryTitle=", sbT);
        return dw1.p(this.g, ", analyticsName=", this.h, ")", sbT);
    }
}
