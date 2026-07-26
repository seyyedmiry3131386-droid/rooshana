package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jl7 {
    public final ml7 a;
    public final ml7 b;

    public jl7(ml7 ml7Var, ml7 ml7Var2) {
        this.a = ml7Var;
        this.b = ml7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jl7.class == obj.getClass()) {
            jl7 jl7Var = (jl7) obj;
            if (this.a.equals(jl7Var.a) && this.b.equals(jl7Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        ml7 ml7Var = this.a;
        sb.append(ml7Var);
        ml7 ml7Var2 = this.b;
        if (ml7Var.equals(ml7Var2)) {
            str = "";
        } else {
            str = ", " + ml7Var2;
        }
        return dw1.s(sb, str, "]");
    }
}
