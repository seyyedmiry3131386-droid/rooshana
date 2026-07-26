package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ha8 {
    public final Object a;
    public final fa8 b;
    public volatile boolean c = true;

    public ha8(Object obj, fa8 fa8Var) {
        this.a = obj;
        this.b = fa8Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ha8) {
            ha8 ha8Var = (ha8) obj;
            if (this.a == ha8Var.a && this.b.equals(ha8Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.d.hashCode() + this.a.hashCode();
    }
}
