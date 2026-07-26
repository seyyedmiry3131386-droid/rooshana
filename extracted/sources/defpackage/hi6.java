package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hi6 {
    public final int a;
    public final String b;

    public hi6(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi6)) {
            return false;
        }
        hi6 hi6Var = (hi6) obj;
        return this.a == hi6Var.a && this.b.equals(hi6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "Loading(itemId=" + this.a + ", tag=" + ((Object) this.b) + ")";
    }
}
