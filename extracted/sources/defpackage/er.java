package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class er implements fr {
    public final kj5 a;

    public er(kr krVar) {
        js3.p(krVar, "navKey");
        this.a = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er) && js3.i(this.a, ((er) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReplaceTop(navKey=" + this.a + ")";
    }
}
