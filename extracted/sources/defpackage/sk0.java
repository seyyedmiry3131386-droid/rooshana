package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sk0 {
    public final ym5 a;

    public sk0(ym5 ym5Var) {
        this.a = ym5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sk0) {
            return js3.i(this.a, ((sk0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        ym5 ym5Var = this.a;
        if (ym5Var != null) {
            return ym5Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ')';
    }
}
