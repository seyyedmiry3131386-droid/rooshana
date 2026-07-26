package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rb9 extends tb9 {
    public final String a;

    public rb9(String str) {
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
        return (obj instanceof rb9) && js3.i(this.a, ((rb9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("Stopped(type=", this.a, ")");
    }
}
