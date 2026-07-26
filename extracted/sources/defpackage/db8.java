package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class db8 {
    public final String a;
    public final String b;

    public db8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db8)) {
            return false;
        }
        db8 db8Var = (db8) obj;
        return js3.i(this.a, db8Var.a) && js3.i(this.b, db8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bl4.w("SubtitleTrack(language=", this.a, ", label=", this.b, ")");
    }
}
