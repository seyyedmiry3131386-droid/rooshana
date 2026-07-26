package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class pa5 {
    public abstract int a();

    public abstract Object b();

    public final boolean equals(Object obj) {
        if (obj instanceof pa5) {
            pa5 pa5Var = (pa5) obj;
            if (a() == pa5Var.a() && s7.l(b(), pa5Var.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object objB = b();
        return (objB == null ? 0 : objB.hashCode()) ^ a();
    }

    public final String toString() {
        String strValueOf = String.valueOf(b());
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }
}
