package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sb9 extends tb9 {
    public final String a;

    public sb9(String str) {
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
        return (obj instanceof sb9) && js3.i(this.a, ((sb9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("Stopping(type=", this.a, ")");
    }
}
