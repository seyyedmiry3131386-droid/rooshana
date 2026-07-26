package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k47 implements l79 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public k47(String str, int i, String str2, String str3) {
        js3.p(str, "playId");
        js3.p(str2, "movieId");
        js3.p(str3, "reportText");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k47)) {
            return false;
        }
        k47 k47Var = (k47) obj;
        return js3.i(this.a, k47Var.a) && js3.i(this.b, k47Var.b) && this.c == k47Var.c && js3.i(this.d, k47Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((rm7.k(this.b, this.a.hashCode() * 31, 31) + this.c) * 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("ReportError(playId=", this.a, ", movieId=", this.b, ", reportId=");
        sbT.append(this.c);
        sbT.append(", reportText=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
