package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cr implements fr {
    public final kj5 a;

    public cr(kj5 kj5Var) {
        this.a = kj5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cr) && js3.i(this.a, ((cr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NavigateTo(navKey=" + this.a + ")";
    }
}
