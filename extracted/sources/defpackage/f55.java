package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class f55 {
    public static final e55 Companion = new e55();
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final String i;

    public /* synthetic */ f55(int i, int i2, String str, String str2, boolean z, String str3, String str4, Integer num, Integer num2, String str5) {
        if (311 != (i & 311)) {
            wq2.S(i, 311, d55.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = true;
        } else {
            this.d = z;
        }
        this.e = str3;
        this.f = str4;
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = num;
        }
        if ((i & 128) == 0) {
            this.h = 0;
        } else {
            this.h = num2;
        }
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f55)) {
            return false;
        }
        f55 f55Var = (f55) obj;
        return this.a == f55Var.a && js3.i(this.b, f55Var.b) && js3.i(this.c, f55Var.c) && this.d == f55Var.d && js3.i(this.e, f55Var.e) && js3.i(this.f, f55Var.f) && js3.i(this.g, f55Var.g) && js3.i(this.h, f55Var.h) && js3.i(this.i, f55Var.i);
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int iK = rm7.k(this.e, (rm7.k(this.c, (i + (str == null ? 0 : str.hashCode())) * 31, 31) + (this.d ? 1231 : 1237)) * 31, 31);
        String str2 = this.f;
        int iHashCode = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieReviewDto(id=");
        sb.append(this.a);
        sb.append(", avatarUrl=");
        sb.append(this.b);
        sb.append(", nickname=");
        sb.append(this.c);
        sb.append(", isLike=");
        sb.append(this.d);
        sb.append(", date=");
        o40.I(this.e, ", accountKey=", this.f, ", positiveLikes=", sb);
        sb.append(this.g);
        sb.append(", negativeLikes=");
        sb.append(this.h);
        sb.append(", text=");
        return dw1.s(sb, this.i, ")");
    }
}
