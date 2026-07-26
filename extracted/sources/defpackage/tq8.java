package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tq8 {
    public final ll a;
    public final rr5 b;

    public tq8(ll llVar, rr5 rr5Var) {
        this.a = llVar;
        this.b = rr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq8)) {
            return false;
        }
        tq8 tq8Var = (tq8) obj;
        return js3.i(this.a, tq8Var.a) && js3.i(this.b, tq8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
