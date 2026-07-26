package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ww {
    public static final ww a = new ww();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof pi3) || !(obj2 instanceof pi3)) {
            return js3.i(obj, obj2);
        }
        pi3 pi3Var = (pi3) obj;
        pi3 pi3Var2 = (pi3) obj2;
        return js3.i(pi3Var.a, pi3Var2.a) && pi3Var.b.equals(pi3Var2.b) && js3.i(pi3Var.d, pi3Var2.d) && pi3Var.e.equals(pi3Var2.e) && js3.i(pi3Var.p, pi3Var2.p) && pi3Var.q == pi3Var2.q && pi3Var.r == pi3Var2.r;
    }

    public final int b(Object obj) {
        if (!(obj instanceof pi3)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        pi3 pi3Var = (pi3) obj;
        int iHashCode = (pi3Var.b.hashCode() + (pi3Var.a.hashCode() * 31)) * 31;
        String str = pi3Var.d;
        return pi3Var.r.hashCode() + ((pi3Var.q.hashCode() + ((pi3Var.p.hashCode() + ((pi3Var.e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
