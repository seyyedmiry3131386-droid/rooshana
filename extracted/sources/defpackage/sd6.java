package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sd6 implements vd6 {
    public final qc6 a;

    public sd6(qc6 qc6Var) {
        this.a = qc6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd6) && js3.i(this.a, ((sd6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ControllerAction(playerAction=" + this.a + ")";
    }
}
