package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eo7 {
    public final a38 a;

    public eo7(a38 a38Var) {
        this.a = a38Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eo7) && js3.i(this.a, ((eo7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestParams(spiXRequestData=" + this.a + ")";
    }
}
