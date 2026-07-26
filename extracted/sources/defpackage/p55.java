package defpackage;

import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class p55 {
    public static final o55 Companion = new o55();
    public static final c24[] g = {null, null, null, null, a.b(LazyThreadSafetyMode.b, new ob4(20)), null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final f55 f;

    public /* synthetic */ p55(int i, String str, String str2, String str3, String str4, ArrayList arrayList, f55 f55Var) {
        if (63 != (i & 63)) {
            wq2.S(i, 63, n55.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = f55Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p55)) {
            return false;
        }
        p55 p55Var = (p55) obj;
        return js3.i(this.a, p55Var.a) && js3.i(this.b, p55Var.b) && js3.i(this.c, p55Var.c) && js3.i(this.d, p55Var.d) && js3.i(this.e, p55Var.e) && js3.i(this.f, p55Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ArrayList arrayList = this.e;
        int iHashCode5 = (iHashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        f55 f55Var = this.f;
        return iHashCode5 + (f55Var != null ? f55Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("MovieReviewInfoDto(rating=", this.a, ", color=", this.b, ", title=");
        o40.I(this.c, ", subtitle=", this.d, ", reviews=", sbT);
        sbT.append(this.e);
        sbT.append(", userReview=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
