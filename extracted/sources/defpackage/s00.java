package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s00 {
    public final String a;
    public final String b;

    public s00(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s00)) {
            return false;
        }
        s00 s00Var = (s00) obj;
        return js3.i(this.a, s00Var.a) && js3.i(this.b, s00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bl4.w("AudioTrack(language=", this.a, ", label=", this.b, ")");
    }
}
