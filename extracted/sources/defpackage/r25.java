package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r25 extends u25 {
    public final Integer a;
    public final String b;

    public r25(Integer num, String str, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        this.a = num;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r25)) {
            return false;
        }
        r25 r25Var = (r25) obj;
        return js3.i(this.a, r25Var.a) && js3.i(this.b, r25Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Failure(messageRes=" + this.a + ", message=" + this.b + ")";
    }
}
