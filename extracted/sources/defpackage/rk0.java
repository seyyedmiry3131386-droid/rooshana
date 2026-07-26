package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rk0 {
    public final ym5 a;

    public rk0(ym5 ym5Var) {
        this.a = ym5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk0) && js3.i(this.a, ((rk0) obj).a);
    }

    public final int hashCode() {
        ym5 ym5Var = this.a;
        if (ym5Var != null) {
            return ym5Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.a + ')';
    }
}
