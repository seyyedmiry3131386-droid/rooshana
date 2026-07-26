package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zy5 extends az5 {
    public final na4 a;
    public final na4 b;

    public zy5(na4 na4Var, na4 na4Var2) {
        this.a = na4Var;
        this.b = na4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy5)) {
            return false;
        }
        zy5 zy5Var = (zy5) obj;
        return js3.i(this.a, zy5Var.a) && js3.i(this.b, zy5Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        na4 na4Var = this.b;
        return iHashCode + (na4Var == null ? 0 : na4Var.hashCode());
    }

    public final String toString() {
        String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ";
        na4 na4Var = this.b;
        if (na4Var != null) {
            str = str + "|   mediatorLoadStates: " + na4Var + '\n';
        }
        return g88.P(str + "|)");
    }
}
