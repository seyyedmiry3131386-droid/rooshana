package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class zu4 {
    public static final yu4 Companion = new yu4();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ zu4(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            wq2.S(i, 7, xu4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu4)) {
            return false;
        }
        zu4 zu4Var = (zu4) obj;
        return js3.i(this.a, zu4Var.a) && js3.i(this.b, zu4Var.b) && js3.i(this.c, zu4Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return dw1.s(rm7.t("MessageBoxDto(text=", this.a, ", iconUrl=", this.b, ", lineColor="), this.c, ")");
    }
}
