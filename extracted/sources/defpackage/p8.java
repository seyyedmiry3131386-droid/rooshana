package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class p8 {
    public static final o8 Companion = new o8();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ p8(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            wq2.S(i, 63, n8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        return js3.i(this.a, p8Var.a) && js3.i(this.b, p8Var.b) && js3.i(this.c, p8Var.c) && js3.i(this.d, p8Var.d) && js3.i(this.e, p8Var.e) && js3.i(this.f, p8Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + rm7.k(this.e, rm7.k(this.d, rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("AdApplicationDto(packageName=", this.a, ", title=", this.b, ", categoryName=");
        o40.I(this.c, ", iconPath=", this.d, ", callbackUrl=", sbT);
        return dw1.p(this.e, ", installCallbackUrl=", this.f, ")", sbT);
    }
}
