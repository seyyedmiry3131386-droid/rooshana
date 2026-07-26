package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a37 extends e37 {
    public final String a;

    public a37(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a37) && js3.i(this.a, ((a37) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return o40.y("Follow(accountKey=", this.a, ")");
    }
}
