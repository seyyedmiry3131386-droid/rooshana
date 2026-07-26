package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class da6 {
    public final aa6 a;
    public final w96 b;

    public da6(aa6 aa6Var, w96 w96Var) {
        this.a = aa6Var;
        this.b = w96Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da6)) {
            return false;
        }
        da6 da6Var = (da6) obj;
        return js3.i(this.b, da6Var.b) && js3.i(this.a, da6Var.a);
    }

    public final int hashCode() {
        aa6 aa6Var = this.a;
        int iHashCode = (aa6Var != null ? aa6Var.hashCode() : 0) * 31;
        w96 w96Var = this.b;
        return iHashCode + (w96Var != null ? w96Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public da6() {
        this(null, new w96());
    }
}
