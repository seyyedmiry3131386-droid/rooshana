package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m8 implements x9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public m8(String str, String str2, String str3, String str4, String str5, String str6) {
        js3.p(str, "packageName");
        js3.p(str2, "title");
        js3.p(str3, "categoryName");
        js3.p(str4, "iconPath");
        js3.p(str5, "callbackUrl");
        js3.p(str6, "installCallbackUrl");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    @Override // defpackage.x9
    public final w9 a() {
        return u9.a;
    }

    @Override // defpackage.x9
    public final String b() {
        return this.b;
    }

    @Override // defpackage.x9
    public final String c() {
        return this.c;
    }

    @Override // defpackage.x9
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8)) {
            return false;
        }
        m8 m8Var = (m8) obj;
        return js3.i(this.a, m8Var.a) && js3.i(this.b, m8Var.b) && js3.i(this.c, m8Var.c) && js3.i(this.d, m8Var.d) && js3.i(this.e, m8Var.e) && js3.i(this.f, m8Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + rm7.k(this.e, rm7.k(this.d, rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("AdApplication(packageName=", this.a, ", title=", this.b, ", categoryName=");
        o40.I(this.c, ", iconPath=", this.d, ", callbackUrl=", sbT);
        return dw1.p(this.e, ", installCallbackUrl=", this.f, ")", sbT);
    }
}
