package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ec6 implements qc6 {
    public final String a;

    public ec6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec6) && js3.i(this.a, ((ec6) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return o40.y("SendCallbackUrl(callbackUrl=", this.a, ")");
    }
}
