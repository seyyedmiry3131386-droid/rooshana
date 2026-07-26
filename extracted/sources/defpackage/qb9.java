package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qb9 extends tb9 {
    public final String a;

    public qb9(String str) {
        js3.p(str, "type");
        this.a = str;
    }

    @Override // defpackage.tb9
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb9) && js3.i(this.a, ((qb9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("Starting(type=", this.a, ")");
    }
}
