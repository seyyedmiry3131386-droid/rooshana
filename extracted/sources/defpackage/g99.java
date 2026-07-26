package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g99 implements m99 {
    public final l32 a;

    public g99(l32 l32Var) {
        js3.p(l32Var, "error");
        this.a = l32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g99) && js3.i(this.a, ((g99) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Fail(error=" + this.a + ")";
    }
}
