package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g72 {
    public final Object a;
    public final int b;

    public g72(int i, ev4 ev4Var) {
        this.a = ev4Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g72)) {
            return false;
        }
        g72 g72Var = (g72) obj;
        return this.a == g72Var.a && this.b == g72Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
