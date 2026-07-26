package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class z25 {
    public static final y25 Companion = new y25();
    public static final c24[] i = {null, null, null, a.b(LazyThreadSafetyMode.b, new ob4(19)), null, null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ z25(int i2, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7) {
        if (255 != (i2 & 255)) {
            wq2.S(i2, 255, x25.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z25)) {
            return false;
        }
        z25 z25Var = (z25) obj;
        return js3.i(this.a, z25Var.a) && js3.i(this.b, z25Var.b) && js3.i(this.c, z25Var.c) && js3.i(this.d, z25Var.d) && js3.i(this.e, z25Var.e) && js3.i(this.f, z25Var.f) && js3.i(this.g, z25Var.g) && js3.i(this.h, z25Var.h);
    }

    public final int hashCode() {
        int iK = rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31);
        List list = this.d;
        int iHashCode = (iK + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        int iK2 = rm7.k(this.f, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.g;
        int iHashCode2 = (iK2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("MovieDto(id=", this.a, ", title=", this.b, ", posterUrl=");
        sbT.append(this.c);
        sbT.append(", seasons=");
        sbT.append(this.d);
        sbT.append(", secondaryTitle=");
        o40.I(this.e, ", type=", this.f, ", refId=", sbT);
        return dw1.p(this.g, ", action=", this.h, ")", sbT);
    }
}
