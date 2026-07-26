package defpackage;

import ir.myket.movie.common.domain.models.EpisodeBannerType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class b32 {
    public static final a32 Companion = new a32();
    public static final c24[] k = {null, null, null, null, null, null, a.b(LazyThreadSafetyMode.b, new qq1(6)), null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final EpisodeBannerType g;
    public final String h;
    public final String i;
    public final boolean j;

    public /* synthetic */ b32(int i, String str, String str2, String str3, String str4, String str5, String str6, EpisodeBannerType episodeBannerType, String str7, String str8, boolean z) {
        if (1023 != (i & 1023)) {
            wq2.S(i, 1023, z22.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = episodeBannerType;
        this.h = str7;
        this.i = str8;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b32)) {
            return false;
        }
        b32 b32Var = (b32) obj;
        return js3.i(this.a, b32Var.a) && js3.i(this.b, b32Var.b) && js3.i(this.c, b32Var.c) && js3.i(this.e, b32Var.e);
    }

    public final int hashCode() {
        int iK = rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.e;
        return iK + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("Episode(id=", this.a, ", playId=", this.b, ", title=");
        o40.I(this.c, ", buttonText=", this.d, ", bannerUrl=", sbT);
        o40.I(this.e, ", defaultBannerUrl=", this.f, ", bannerType=", sbT);
        sbT.append(this.g);
        sbT.append(", secondaryTitle=");
        sbT.append(this.h);
        sbT.append(", analyticsName=");
        sbT.append(this.i);
        sbT.append(", isLastEpisode=");
        sbT.append(this.j);
        sbT.append(")");
        return sbT.toString();
    }

    public b32(String str, String str2, String str3, String str4, String str5, String str6, EpisodeBannerType episodeBannerType, String str7, String str8, boolean z) {
        js3.p(str, "id");
        js3.p(str2, "playId");
        js3.p(str3, "title");
        js3.p(str4, "buttonText");
        js3.p(str6, "defaultBannerUrl");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = episodeBannerType;
        this.h = str7;
        this.i = str8;
        this.j = z;
    }
}
