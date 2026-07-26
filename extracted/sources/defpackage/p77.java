package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p77 extends s77 {
    public final String a;

    public p77(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p77) && js3.i(this.a, ((p77) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("Intent(intent=", this.a, ")");
    }
}
