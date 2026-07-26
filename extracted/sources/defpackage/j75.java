package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class j75 {
    public static final i75 Companion = new i75();
    public final String a;
    public final r75 b;
    public final n75 c;

    public /* synthetic */ j75(int i, String str, r75 r75Var, n75 n75Var) {
        if (7 != (i & 7)) {
            wq2.S(i, 7, h75.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = r75Var;
        this.c = n75Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j75)) {
            return false;
        }
        j75 j75Var = (j75) obj;
        return js3.i(this.a, j75Var.a) && js3.i(this.b, j75Var.b) && js3.i(this.c, j75Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        r75 r75Var = this.b;
        int iHashCode2 = (iHashCode + (r75Var == null ? 0 : r75Var.hashCode())) * 31;
        n75 n75Var = this.c;
        return iHashCode2 + (n75Var != null ? n75Var.hashCode() : 0);
    }

    public final String toString() {
        return "MovieSummaryDto(type=" + this.a + ", text=" + this.b + ", icon=" + this.c + ")";
    }
}
