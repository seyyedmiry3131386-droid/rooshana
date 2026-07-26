package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t9 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public t9(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj;
        return js3.i(this.a, t9Var.a) && this.b == t9Var.b && js3.i(this.c, t9Var.c) && js3.i(this.d, t9Var.d) && js3.i(this.e, t9Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbB = o40.B(this.b, "AdEndCard(backgroundUrl=", this.a, ", duration=", ", viewCallback=");
        o40.I(this.c, ", clickCallback=", this.d, ", dismissCallback=", sbB);
        return dw1.s(sbB, this.e, ")");
    }
}
