package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yu8 implements to6 {
    public final String a;

    public yu8(ps0 ps0Var) {
        this.a = ax3.a(ps0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && yu8.class == obj.getClass() && js3.i(this.a, ((yu8) obj).a);
    }

    @Override // defpackage.to6
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
