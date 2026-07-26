package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j24 {
    public final String a;

    public j24(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j24) {
            return this.a.equals(((j24) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dw1.s(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
