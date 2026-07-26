package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class st7 {
    public final String a;
    public final String b;

    public st7(String str, String str2) {
        js3.p(str, "url");
        js3.p(str2, "title");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st7)) {
            return false;
        }
        st7 st7Var = (st7) obj;
        return js3.i(this.a, st7Var.a) && js3.i(this.b, st7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bl4.w("ShareModel(url=", this.a, ", title=", this.b, ")");
    }
}
