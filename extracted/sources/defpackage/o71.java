package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class o71 {
    public static final n71 Companion = new n71();
    public final u05 a;
    public final u05 b;

    public /* synthetic */ o71(int i, u05 u05Var, u05 u05Var2) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, m71.a.getDescriptor());
            throw null;
        }
        this.a = u05Var;
        this.b = u05Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o71)) {
            return false;
        }
        o71 o71Var = (o71) obj;
        return js3.i(this.a, o71Var.a) && js3.i(this.b, o71Var.b);
    }

    public final int hashCode() {
        u05 u05Var = this.a;
        int iHashCode = (u05Var == null ? 0 : u05Var.hashCode()) * 31;
        u05 u05Var2 = this.b;
        return iHashCode + (u05Var2 != null ? u05Var2.hashCode() : 0);
    }

    public final String toString() {
        return "CreditsDto(openingCredit=" + this.a + ", closingCredit=" + this.b + ")";
    }
}
