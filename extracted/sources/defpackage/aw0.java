package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aw0 {
    public final ja4 a;
    public final ja4 b;
    public final ja4 c;
    public final na4 d;
    public final na4 e;

    public aw0(ja4 ja4Var, ja4 ja4Var2, ja4 ja4Var3, na4 na4Var, na4 na4Var2) {
        js3.p(ja4Var, "refresh");
        js3.p(ja4Var2, "prepend");
        js3.p(ja4Var3, "append");
        js3.p(na4Var, "source");
        this.a = ja4Var;
        this.b = ja4Var2;
        this.c = ja4Var3;
        this.d = na4Var;
        this.e = na4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aw0.class != obj.getClass()) {
            return false;
        }
        aw0 aw0Var = (aw0) obj;
        return js3.i(this.a, aw0Var.a) && js3.i(this.b, aw0Var.b) && js3.i(this.c, aw0Var.c) && js3.i(this.d, aw0Var.d) && js3.i(this.e, aw0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        na4 na4Var = this.e;
        return iHashCode + (na4Var != null ? na4Var.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }
}
