package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zm5 extends cn5 {
    public final y97 a;

    public zm5(y97 y97Var) {
        this.a = y97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm5) && js3.i(this.a, ((zm5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Fail(networkError=" + this.a + ")";
    }
}
