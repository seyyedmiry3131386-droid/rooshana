package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i32 implements jf3 {
    public final String a;
    public final Integer b;
    public final int c;
    public final int d;
    public final Integer e;

    public i32(int i, int i2, Integer num, String str) {
        i = (i2 & 8) != 0 ? ss6.network_error_message : i;
        int i3 = ss6.network_retry;
        Integer numValueOf = Integer.valueOf(zq6.network_ic_error);
        this.a = str;
        this.b = num;
        this.c = i;
        this.d = i3;
        this.e = numValueOf;
    }

    @Override // defpackage.jf3
    public final Integer a() {
        return this.e;
    }

    @Override // defpackage.jf3
    public final int b() {
        return this.d;
    }

    @Override // defpackage.jf3
    public final String c() {
        return null;
    }

    @Override // defpackage.jf3
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i32)) {
            return false;
        }
        i32 i32Var = (i32) obj;
        return this.a.equals(i32Var.a) && this.b.equals(i32Var.b) && this.c == i32Var.c && this.d == i32Var.d && this.e.equals(i32Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((((((this.b.hashCode() + (this.a.hashCode() * 31)) * 961) + this.c) * 31) + this.d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorData(messageCode=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", translatedMessage=null, messageId=");
        o40.J(sb, this.c, ", actionMessageId=", this.d, ", drawableId=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
