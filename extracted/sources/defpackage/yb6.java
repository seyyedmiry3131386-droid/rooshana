package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yb6 implements qc6 {
    public final xf6 a;

    public yb6(xf6 xf6Var) {
        this.a = xf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb6) && js3.i(this.a, ((yb6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestPlayer(playerRequestData=" + this.a + ")";
    }
}
