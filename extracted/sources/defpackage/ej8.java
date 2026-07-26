package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ej8 {
    public final String a;
    public String b;
    public boolean c = false;
    public o16 d = null;

    public ej8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej8)) {
            return false;
        }
        ej8 ej8Var = (ej8) obj;
        return js3.i(this.a, ej8Var.a) && js3.i(this.b, ej8Var.b) && this.c == ej8Var.c && js3.i(this.d, ej8Var.d);
    }

    public final int hashCode() {
        int iK = (rm7.k(this.b, this.a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31;
        o16 o16Var = this.d;
        return iK + (o16Var == null ? 0 : o16Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.d);
        sb.append(", isShowingSubstitution=");
        return bl4.A(sb, this.c, ')');
    }
}
