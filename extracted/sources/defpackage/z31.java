package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z31 {
    public final bp2 a;
    public final om0 b;

    public z31(bp2 bp2Var, om0 om0Var) {
        this.a = bp2Var;
        this.b = om0Var;
    }

    public final String toString() {
        String strY;
        om0 om0Var = this.b;
        b71 b71Var = (b71) om0Var.e.r0(b71.c);
        String str = b71Var != null ? b71Var.b : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        js3.q(16);
        String string = Integer.toString(iHashCode, 16);
        js3.o(string, "toString(...)");
        sb.append(string);
        if (str == null || (strY = o40.y("[", str, "](")) == null) {
            strY = "(";
        }
        sb.append(strY);
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(om0Var);
        sb.append(')');
        return sb.toString();
    }
}
