package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xi3 {
    public final wi3 a;
    public final int b;

    public xi3(wi3 wi3Var, int i) {
        this.a = wi3Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi3)) {
            return false;
        }
        xi3 xi3Var = (xi3) obj;
        return js3.i(this.a, xi3Var.a) && this.b == xi3Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return dw1.q(sb, this.b, ')');
    }
}
