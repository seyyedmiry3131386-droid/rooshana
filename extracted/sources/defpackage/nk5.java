package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nk5 extends ok5 {
    public final ck5 a;
    public final int b;

    public nk5(ck5 ck5Var, int i) {
        js3.p(ck5Var, "latestEvent");
        this.a = ck5Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nk5.class != obj.getClass()) {
            return false;
        }
        nk5 nk5Var = (nk5) obj;
        return this.b == nk5Var.b && js3.i(this.a, nk5Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
        sb.append(this.a);
        sb.append(", direction=");
        return dw1.q(sb, this.b, ')');
    }
}
