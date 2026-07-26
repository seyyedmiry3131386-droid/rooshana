package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ss5 extends ik5 {
    public final rs5 a;
    public final g64 b;

    public ss5(g64 g64Var, rs5 rs5Var) {
        js3.p(rs5Var, "callback");
        this.a = rs5Var;
        this.b = g64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss5)) {
            return false;
        }
        ss5 ss5Var = (ss5) obj;
        return js3.i(this.a, ss5Var.a) && js3.i(this.b, ss5Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g64 g64Var = this.b;
        return iHashCode + (g64Var == null ? 0 : g64Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
