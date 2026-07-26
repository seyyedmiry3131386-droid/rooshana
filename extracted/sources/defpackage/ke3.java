package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ke3 implements jf3 {
    public final String a;
    public final Integer b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final Integer g;

    public ke3(String str, Integer num, int i, String str2, int i2) {
        str2 = (i2 & 8) != 0 ? null : str2;
        int i3 = ss6.network_error_message;
        int i4 = ss6.network_retry;
        Integer numValueOf = Integer.valueOf(zq6.network_ic_error);
        this.a = str;
        this.b = num;
        this.c = i;
        this.d = str2;
        this.e = i3;
        this.f = i4;
        this.g = numValueOf;
    }

    @Override // defpackage.jf3
    public final Integer a() {
        return this.g;
    }

    @Override // defpackage.jf3
    public final int b() {
        return this.f;
    }

    @Override // defpackage.jf3
    public final String c() {
        return this.d;
    }

    @Override // defpackage.jf3
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke3)) {
            return false;
        }
        ke3 ke3Var = (ke3) obj;
        return js3.i(this.a, ke3Var.a) && js3.i(this.b, ke3Var.b) && this.c == ke3Var.c && js3.i(this.d, ke3Var.d) && this.e == ke3Var.e && this.f == ke3Var.f && js3.i(this.g, ke3Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.c) * 31;
        String str2 = this.d;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.e) * 31) + this.f) * 31;
        Integer num2 = this.g;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpErrorData(messageCode=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", httpStatusCode=");
        sb.append(this.c);
        sb.append(", translatedMessage=");
        sb.append(this.d);
        sb.append(", messageId=");
        o40.J(sb, this.e, ", actionMessageId=", this.f, ", drawableId=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
