package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b55 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;

    public b55(int i, String str, String str2, boolean z, String str3, String str4, int i2, int i3, String str5) {
        js3.p(str2, "nickname");
        js3.p(str3, "date");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = i2;
        this.h = i3;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b55)) {
            return false;
        }
        b55 b55Var = (b55) obj;
        return (this.a == b55Var.a || this.d == b55Var.d || js3.i(this.i, b55Var.i)) ? false : true;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + (this.d ? 1231 : 1237)) * 31;
        String str = this.i;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieReview(id=");
        sb.append(this.a);
        sb.append(", avatarUrl=");
        sb.append(this.b);
        sb.append(", nickname=");
        sb.append(this.c);
        sb.append(", isLike=");
        sb.append(this.d);
        sb.append(", date=");
        o40.I(this.e, ", accountKey=", this.f, ", positiveLikes=", sb);
        o40.J(sb, this.g, ", negativeLikes=", this.h, ", text=");
        return dw1.s(sb, this.i, ")");
    }
}
