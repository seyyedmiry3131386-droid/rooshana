package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fj4 {
    public final String a;
    public final uq3 b;

    public fj4(String str, uq3 uq3Var) {
        this.a = str;
        this.b = uq3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj4)) {
            return false;
        }
        fj4 fj4Var = (fj4) obj;
        return js3.i(this.a, fj4Var.a) && js3.i(this.b, fj4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
