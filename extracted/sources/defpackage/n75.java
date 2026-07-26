package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class n75 {
    public static final m75 Companion = new m75();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ n75(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            wq2.S(i, 15, l75.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n75)) {
            return false;
        }
        n75 n75Var = (n75) obj;
        return js3.i(this.a, n75Var.a) && js3.i(this.b, n75Var.b) && js3.i(this.c, n75Var.c) && js3.i(this.d, n75Var.d);
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
        return dw1.p(this.c, ", bg=", this.d, ")", rm7.t("MovieSummaryIconDto(title=", this.a, ", iconUrl=", this.b, ", iconTint="));
    }
}
