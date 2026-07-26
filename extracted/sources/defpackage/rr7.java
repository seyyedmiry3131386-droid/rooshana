package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rr7 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public rr7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr7)) {
            return false;
        }
        rr7 rr7Var = (rr7) obj;
        return js3.i(this.a, rr7Var.a) && js3.i(this.b, rr7Var.b) && js3.i(this.c, rr7Var.c) && js3.i(this.d, rr7Var.d) && js3.i(this.e, rr7Var.e) && js3.i(this.f, rr7Var.f);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.d;
        int iHashCode4 = (iHashCode3 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.e;
        int iHashCode5 = (iHashCode4 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.f;
        return iHashCode5 + (obj6 != null ? obj6.hashCode() : 0);
    }

    public final String toString() {
        return "Sextuple(first=" + this.a + ", second=" + this.b + ", third=" + this.c + ", fourth=" + this.d + ", fifth=" + this.e + ", sixth=" + this.f + ")";
    }
}
