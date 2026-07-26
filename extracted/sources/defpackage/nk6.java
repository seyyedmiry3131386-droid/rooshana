package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nk6 {
    public final int a;

    public nk6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nk6) {
            return this.a == ((nk6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
