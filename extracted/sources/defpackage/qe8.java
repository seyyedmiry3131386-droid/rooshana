package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class qe8 {
    public static final pe8 Companion = new pe8();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ qe8(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            wq2.S(i, 7, oe8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe8)) {
            return false;
        }
        qe8 qe8Var = (qe8) obj;
        return js3.i(this.a, qe8Var.a) && js3.i(this.b, qe8Var.b) && js3.i(this.c, qe8Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iK = rm7.k(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        return iK + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return dw1.s(rm7.t("TagDto(action=", this.a, ", label=", this.b, ", analyticsName="), this.c, ")");
    }
}
