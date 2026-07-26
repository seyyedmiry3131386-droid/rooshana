package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class yc7 {
    public static final xc7 Companion = new xc7();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final z77 e;

    public /* synthetic */ yc7(int i, String str, String str2, String str3, String str4, z77 z77Var) {
        if (31 != (i & 31)) {
            wq2.S(i, 31, wc7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z77Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc7)) {
            return false;
        }
        yc7 yc7Var = (yc7) obj;
        return js3.i(this.a, yc7Var.a) && js3.i(this.b, yc7Var.b) && js3.i(this.c, yc7Var.c) && js3.i(this.d, yc7Var.d) && js3.i(this.e, yc7Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        z77 z77Var = this.e;
        return iHashCode4 + (z77Var != null ? z77Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("SampleWatchDto(boxTitle=", this.a, ", hint=", this.b, ", dialogTitle=");
        o40.I(this.c, ", dialogDescription=", this.d, ", primaryButton=", sbT);
        sbT.append(this.e);
        sbT.append(")");
        return sbT.toString();
    }
}
