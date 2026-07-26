package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ma8 {
    public final String a;
    public final String b;
    public final pj3 c;
    public final String d;

    public ma8(String str, String str2, pj3 pj3Var, String str3) {
        js3.p(str, "title");
        js3.p(str2, "actionText");
        js3.p(pj3Var, "items");
        js3.p(str3, "subTitle");
        this.a = str;
        this.b = str2;
        this.c = pj3Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma8)) {
            return false;
        }
        ma8 ma8Var = (ma8) obj;
        return js3.i(this.a, ma8Var.a) && js3.i(this.b, ma8Var.b) && js3.i(this.c, ma8Var.c) && js3.i(this.d, ma8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("SubscriptionInfo(title=", this.a, ", actionText=", this.b, ", items=");
        sbT.append(this.c);
        sbT.append(", subTitle=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
