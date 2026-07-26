package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class tx6 {
    public static final sx6 Companion = new sx6();
    public static final c24[] k = {null, null, null, null, null, null, null, null, a.b(LazyThreadSafetyMode.b, new js5(10)), null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final xt7 j;

    public /* synthetic */ tx6(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, xt7 xt7Var) {
        if (1023 != (i & 1023)) {
            wq2.S(i, 1023, rx6.a.getDescriptor());
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
        this.i = list;
        this.j = xt7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx6)) {
            return false;
        }
        tx6 tx6Var = (tx6) obj;
        return js3.i(this.a, tx6Var.a) && js3.i(this.b, tx6Var.b) && js3.i(this.c, tx6Var.c) && js3.i(this.d, tx6Var.d) && js3.i(this.e, tx6Var.e) && js3.i(this.f, tx6Var.f) && js3.i(this.g, tx6Var.g) && js3.i(this.h, tx6Var.h) && js3.i(this.i, tx6Var.i) && js3.i(this.j, tx6Var.j);
    }

    public final int hashCode() {
        int iK = rm7.k(this.f, rm7.k(this.e, rm7.k(this.d, rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        String str = this.g;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.i;
        return this.j.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("RecommendationMovieDto(id=", this.a, ", title=", this.b, ", type=");
        o40.I(this.c, ", playId=", this.d, ", posterUrl=", sbT);
        o40.I(this.e, ", posterLandscapeUrl=", this.f, ", refId=", sbT);
        o40.I(this.g, ", secondaryTitle=", this.h, ", seasons=", sbT);
        sbT.append(this.i);
        sbT.append(", shareModel=");
        sbT.append(this.j);
        sbT.append(")");
        return sbT.toString();
    }
}
