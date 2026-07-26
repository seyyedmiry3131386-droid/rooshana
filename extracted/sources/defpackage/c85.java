package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class c85 {
    public static final b85 Companion = new b85();
    public static final c24[] q;
    public final List a;
    public final Boolean b;
    public final Long c;
    public final ad6 d;
    public final Boolean e;
    public final c87 f;
    public final c87 g;
    public final String h;
    public final List i;
    public final by6 j;
    public final o71 k;
    public final yc7 l;
    public final List m;
    public final String n;
    public final String o;
    public final Boolean p;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.b;
        q = new c24[]{a.b(lazyThreadSafetyMode, new ob4(21)), null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new ob4(22)), null, null, null, a.b(lazyThreadSafetyMode, new ob4(23)), null, null, null};
    }

    public /* synthetic */ c85(int i, List list, Boolean bool, Long l, ad6 ad6Var, Boolean bool2, c87 c87Var, c87 c87Var2, String str, List list2, by6 by6Var, o71 o71Var, yc7 yc7Var, List list3, String str2, String str3, Boolean bool3) {
        if (65535 != (i & 65535)) {
            wq2.S(i, 65535, a85.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = bool;
        this.c = l;
        this.d = ad6Var;
        this.e = bool2;
        this.f = c87Var;
        this.g = c87Var2;
        this.h = str;
        this.i = list2;
        this.j = by6Var;
        this.k = o71Var;
        this.l = yc7Var;
        this.m = list3;
        this.n = str2;
        this.o = str3;
        this.p = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c85)) {
            return false;
        }
        c85 c85Var = (c85) obj;
        return js3.i(this.a, c85Var.a) && js3.i(this.b, c85Var.b) && js3.i(this.c, c85Var.c) && js3.i(this.d, c85Var.d) && js3.i(this.e, c85Var.e) && js3.i(this.f, c85Var.f) && js3.i(this.g, c85Var.g) && js3.i(this.h, c85Var.h) && js3.i(this.i, c85Var.i) && js3.i(this.j, c85Var.j) && js3.i(this.k, c85Var.k) && js3.i(this.l, c85Var.l) && js3.i(this.m, c85Var.m) && js3.i(this.n, c85Var.n) && js3.i(this.o, c85Var.o) && js3.i(this.p, c85Var.p);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        ad6 ad6Var = this.d;
        int iHashCode4 = (iHashCode3 + (ad6Var == null ? 0 : ad6Var.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        c87 c87Var = this.f;
        int iHashCode6 = (iHashCode5 + (c87Var == null ? 0 : c87Var.hashCode())) * 31;
        c87 c87Var2 = this.g;
        int iHashCode7 = (iHashCode6 + (c87Var2 == null ? 0 : c87Var2.hashCode())) * 31;
        String str = this.h;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.i;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        by6 by6Var = this.j;
        int i = (iHashCode9 + (by6Var == null ? 0 : by6Var.a)) * 31;
        o71 o71Var = this.k;
        int iHashCode10 = (i + (o71Var == null ? 0 : o71Var.hashCode())) * 31;
        yc7 yc7Var = this.l;
        int iHashCode11 = (iHashCode10 + (yc7Var == null ? 0 : yc7Var.hashCode())) * 31;
        List list3 = this.m;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.n;
        int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.p;
        return iHashCode14 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "MovieUriDto(urls=" + this.a + ", hasSubtitle=" + this.b + ", openingCreditsTime=" + this.c + ", playerConfigDto=" + this.d + ", downgradeQuality=" + this.e + ", restrictionInfo=" + this.f + ", subscriptionPromotion=" + this.g + ", hintText=" + this.h + ", adInfoList=" + this.i + ", recommendationTimeDto=" + this.j + ", credits=" + this.k + ", sampleWatch=" + this.l + ", preferredMimeType=" + this.m + ", thumbnail=" + this.n + ", orientation=" + this.o + ", audioMode=" + this.p + ")";
    }
}
