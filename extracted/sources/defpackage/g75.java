package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g75 {
    public final String a;
    public final o75 b;
    public final k75 c;

    public g75(String str, o75 o75Var, k75 k75Var) {
        this.a = str;
        this.b = o75Var;
        this.c = k75Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g75)) {
            return false;
        }
        g75 g75Var = (g75) obj;
        return js3.i(this.a, g75Var.a) && js3.i(this.b, g75Var.b) && js3.i(this.c, g75Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        o75 o75Var = this.b;
        int iHashCode2 = (iHashCode + (o75Var == null ? 0 : o75Var.hashCode())) * 31;
        k75 k75Var = this.c;
        return iHashCode2 + (k75Var != null ? k75Var.hashCode() : 0);
    }

    public final String toString() {
        return "MovieSummary(type=" + this.a + ", text=" + this.b + ", icon=" + this.c + ")";
    }
}
