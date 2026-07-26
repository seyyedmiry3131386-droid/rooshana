package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jc6 implements qc6 {
    public final y97 a;

    public jc6(y97 y97Var) {
        this.a = y97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jc6) && js3.i(this.a, ((jc6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowErrorToast(error=" + this.a + ")";
    }
}
