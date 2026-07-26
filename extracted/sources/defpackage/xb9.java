package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xb9 extends dc9 {
    public final String a;

    public xb9(String str) {
        js3.p(str, "connectedTime");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xb9) && js3.i(this.a, ((xb9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("Active(connectedTime=", this.a, ")");
    }
}
