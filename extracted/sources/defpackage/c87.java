package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class c87 {
    public static final b87 Companion = new b87();
    public final String a;
    public final String b;
    public final String c;
    public final z77 d;
    public final z77 e;

    public /* synthetic */ c87(int i, String str, String str2, String str3, z77 z77Var, z77 z77Var2) {
        if (31 != (i & 31)) {
            wq2.S(i, 31, a87.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z77Var;
        this.e = z77Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c87)) {
            return false;
        }
        c87 c87Var = (c87) obj;
        return js3.i(this.a, c87Var.a) && js3.i(this.b, c87Var.b) && js3.i(this.c, c87Var.c) && js3.i(this.d, c87Var.d) && js3.i(this.e, c87Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iK = rm7.k(this.c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        z77 z77Var = this.d;
        int iHashCode2 = (iK + (z77Var == null ? 0 : z77Var.hashCode())) * 31;
        z77 z77Var2 = this.e;
        return iHashCode2 + (z77Var2 != null ? z77Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("RestrictionInfoDto(iconUrl=", this.a, ", title=", this.b, ", description=");
        sbT.append(this.c);
        sbT.append(", primaryButton=");
        sbT.append(this.d);
        sbT.append(", secondaryButton=");
        sbT.append(this.e);
        sbT.append(")");
        return sbT.toString();
    }
}
