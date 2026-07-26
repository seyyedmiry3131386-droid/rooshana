package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ne8 extends a27 {
    public final String d;
    public final String e;
    public final String f;

    public ne8(String str, String str2, String str3) {
        js3.p(str2, "label");
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne8)) {
            return false;
        }
        ne8 ne8Var = (ne8) obj;
        return js3.i(this.d, ne8Var.d) && js3.i(this.e, ne8Var.e) && super.equals(obj);
    }

    public final int hashCode() {
        String str = this.d;
        return rm7.k(this.e, (str != null ? str.hashCode() : 0) * 31, 31) + super.hashCode();
    }

    public final String toString() {
        return dw1.s(rm7.t("Tag(action=", this.d, ", label=", this.e, ", analyticsName="), this.f, ")");
    }
}
