package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hk1 {
    public final String a;
    public final String b;
    public final String c;

    public hk1(String str, String str2, String str3) {
        js3.p(str, "title");
        js3.p(str2, "avatarUrl");
        js3.p(str3, "streamerKey");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk1)) {
            return false;
        }
        hk1 hk1Var = (hk1) obj;
        return js3.i(this.a, hk1Var.a) && js3.i(this.b, hk1Var.b) && js3.i(this.c, hk1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw1.s(rm7.t("DetailStreamer(title=", this.a, ", avatarUrl=", this.b, ", streamerKey="), this.c, ")");
    }
}
