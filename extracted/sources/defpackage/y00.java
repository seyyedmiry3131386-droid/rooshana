package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class y00 {
    public static final x00 Companion = new x00();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public /* synthetic */ y00(int i, String str, String str2, String str3, boolean z) {
        if (15 != (i & 15)) {
            wq2.S(i, 15, w00.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return js3.i(this.a, y00Var.a) && js3.i(this.b, y00Var.b) && js3.i(this.c, y00Var.c) && this.d == y00Var.d;
    }

    public final int hashCode() {
        return rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("AuthDataDto(token=", this.a, ", accountId=", this.b, ", accountKey=");
        sbT.append(this.c);
        sbT.append(", isUserLoggedIn=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
