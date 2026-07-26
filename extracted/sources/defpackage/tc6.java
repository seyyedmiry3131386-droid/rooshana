package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tc6 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public tc6(String str, int i, String str2, String str3) {
        js3.p(str2, "uri");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc6)) {
            return false;
        }
        tc6 tc6Var = (tc6) obj;
        return js3.i(this.a, tc6Var.a) && js3.i(this.b, tc6Var.b) && this.c == tc6Var.c && js3.i(this.d, tc6Var.d);
    }

    public final int hashCode() {
        int iK = (rm7.k(this.b, this.a.hashCode() * 31, 31) + this.c) * 31;
        String str = this.d;
        return iK + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("PlaybackErrorData(errorType=", this.a, ", uri=", this.b, ", httpStatus=");
        sbT.append(this.c);
        sbT.append(", message=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
