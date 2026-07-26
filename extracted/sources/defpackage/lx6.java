package defpackage;

import ir.myket.movie.common.domain.common.ItemType;

/* JADX INFO: loaded from: classes3.dex */
public final class lx6 {
    public final String a;
    public final String b;
    public final pj3 c;
    public final String d;

    public lx6(String str, String str2, pj3 pj3Var, String str3) {
        js3.p(str, "title");
        js3.p(pj3Var, "movies");
        js3.p(str3, "displayMode");
        this.a = str;
        this.b = str2;
        this.c = pj3Var;
        this.d = str3;
        ItemType itemType = ItemType.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx6)) {
            return false;
        }
        lx6 lx6Var = (lx6) obj;
        return js3.i(this.a, lx6Var.a) && js3.i(this.b, lx6Var.b) && js3.i(this.c, lx6Var.c) && js3.i(this.d, lx6Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("Recommendation(title=", this.a, ", analyticsName=", this.b, ", movies=");
        sbT.append(this.c);
        sbT.append(", displayMode=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
