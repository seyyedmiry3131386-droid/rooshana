package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l32 {
    public final String a;
    public final int b;
    public final int c;
    public final Integer d;

    public l32(int i, int i2, Integer num, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l32)) {
            return false;
        }
        l32 l32Var = (l32) obj;
        return js3.i(this.a, l32Var.a) && this.b == l32Var.b && this.c == l32Var.c && js3.i(this.d, l32Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.b) * 31) + this.c) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbB = o40.B(this.b, "ErrorMessageData(translatedMessage=", this.a, ", messageId=", ", actionMessageId=");
        sbB.append(this.c);
        sbB.append(", drawableId=");
        sbB.append(this.d);
        sbB.append(")");
        return sbB.toString();
    }
}
