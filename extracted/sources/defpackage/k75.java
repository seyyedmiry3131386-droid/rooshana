package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k75 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public k75(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k75)) {
            return false;
        }
        k75 k75Var = (k75) obj;
        return js3.i(this.a, k75Var.a) && js3.i(this.b, k75Var.b) && js3.i(this.c, k75Var.c) && js3.i(this.d, k75Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return dw1.p(this.c, ", bg=", this.d, ")", rm7.t("MovieSummaryIcon(title=", this.a, ", iconUrl=", this.b, ", iconTint="));
    }
}
